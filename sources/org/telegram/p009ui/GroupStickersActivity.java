package org.telegram.p009ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C1072R;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.p009ui.ActionBar.ActionBarMenuItem;
import org.telegram.p009ui.ActionBar.BaseFragment;
import org.telegram.p009ui.ActionBar.C1133ActionBar;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.ActionBar.ThemeDescription;
import org.telegram.p009ui.Cells.HeaderCell;
import org.telegram.p009ui.Cells.ShadowSectionCell;
import org.telegram.p009ui.Cells.StickerSetCell;
import org.telegram.p009ui.Cells.TextInfoPrivacyCell;
import org.telegram.p009ui.Cells.TextSettingsCell;
import org.telegram.p009ui.Components.FlickerLoadingView;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.RecyclerListView;
import org.telegram.p009ui.Components.StickerEmptyView;
import org.telegram.p009ui.Components.StickersAlert;
import org.telegram.p009ui.Components.URLSpanNoUnderline;
import org.telegram.p009ui.Components.VerticalPositionAutoAnimator;
import org.telegram.p009ui.GroupStickersActivity;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$ChatFull;
import org.telegram.tgnet.TLRPC$StickerSet;
import org.telegram.tgnet.TLRPC$StickerSetCovered;
import org.telegram.tgnet.TLRPC$TL_channels_setStickers;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_inputStickerSetEmpty;
import org.telegram.tgnet.TLRPC$TL_inputStickerSetID;
import org.telegram.tgnet.TLRPC$TL_inputStickerSetShortName;
import org.telegram.tgnet.TLRPC$TL_messages_foundStickerSets;
import org.telegram.tgnet.TLRPC$TL_messages_searchStickerSets;
import org.telegram.tgnet.TLRPC$TL_messages_stickerSet;

public class GroupStickersActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private long chatId;
    private FrameLayout emptyFrameView;
    private StickerEmptyView emptyView;
    private int headerRow;
    private TLRPC$ChatFull info;
    private int infoRow;
    private LinearLayoutManager layoutManager;
    private ListAdapter listAdapter;
    private RecyclerListView listView;
    private FlickerLoadingView loadingView;
    private boolean removeStickerSet;
    private int rowCount;
    private SearchAdapter searchAdapter;
    private ActionBarMenuItem searchItem;
    private boolean searching;
    private TLRPC$TL_messages_stickerSet selectedStickerSet;
    private int selectedStickerSetIndex = -1;
    private int stickersEndRow;
    private int stickersStartRow;

    public GroupStickersActivity(long j) {
        this.chatId = j;
    }

    @Override
    public boolean onFragmentCreate() {
        super.onFragmentCreate();
        MediaDataController.getInstance(this.currentAccount).checkStickers(0);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.groupStickersDidLoad);
        updateRows();
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        if (this.selectedStickerSet != null || this.removeStickerSet) {
            saveStickerSet();
        }
    }

    @Override
    public View createView(Context context) {
        this.actionBar.setBackButtonImage(C1072R.C1073drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString("GroupStickers", C1072R.string.GroupStickers));
        this.actionBar.setActionBarMenuOnItemClick(new C1133ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    GroupStickersActivity.this.finishFragment();
                }
            }
        });
        ActionBarMenuItem addItem = this.actionBar.createMenu().addItem(0, C1072R.C1073drawable.ic_ab_search);
        this.searchItem = addItem;
        addItem.setIsSearchField(true).setActionBarMenuItemSearchListener(new ActionBarMenuItem.ActionBarMenuItemSearchListener() {
            @Override
            public void onSearchExpand() {
            }

            @Override
            public void onSearchCollapse() {
                if (GroupStickersActivity.this.searching) {
                    GroupStickersActivity.this.searchAdapter.onSearchStickers(null);
                    GroupStickersActivity.this.searching = false;
                    GroupStickersActivity.this.listView.setAdapter(GroupStickersActivity.this.listAdapter);
                }
            }

            @Override
            public void onTextChanged(EditText editText) {
                String obj = editText.getText().toString();
                GroupStickersActivity.this.searchAdapter.onSearchStickers(obj);
                boolean z = !TextUtils.isEmpty(obj);
                if (z != GroupStickersActivity.this.searching) {
                    GroupStickersActivity.this.searching = z;
                    if (GroupStickersActivity.this.listView != null) {
                        GroupStickersActivity.this.listView.setAdapter(GroupStickersActivity.this.searching ? GroupStickersActivity.this.searchAdapter : GroupStickersActivity.this.listAdapter);
                    }
                }
            }
        });
        this.searchItem.setSearchFieldHint(LocaleController.getString(C1072R.string.Search));
        this.listAdapter = new ListAdapter(context);
        this.searchAdapter = new SearchAdapter(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        FrameLayout frameLayout2 = frameLayout;
        frameLayout2.setBackgroundColor(Theme.getColor("windowBackgroundGray"));
        this.listView = new RecyclerListView(context);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(true);
        this.listView.setItemAnimator(defaultItemAnimator);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        this.layoutManager = linearLayoutManager;
        linearLayoutManager.setOrientation(1);
        this.listView.setLayoutManager(this.layoutManager);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.emptyFrameView = frameLayout3;
        frameLayout3.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context, getResourceProvider());
        this.loadingView = flickerLoadingView;
        flickerLoadingView.setViewType(19);
        this.loadingView.setIsSingleCell(true);
        this.loadingView.setItemsCount((int) Math.ceil(AndroidUtilities.displaySize.y / AndroidUtilities.dpf2(58.0f)));
        this.emptyFrameView.addView(this.loadingView, LayoutHelper.createFrame(-1, -1.0f));
        StickerEmptyView stickerEmptyView = new StickerEmptyView(context, this.loadingView, 1);
        this.emptyView = stickerEmptyView;
        VerticalPositionAutoAnimator.attach(stickerEmptyView);
        this.emptyFrameView.addView(this.emptyView);
        frameLayout2.addView(this.emptyFrameView);
        this.emptyFrameView.setVisibility(8);
        this.listView.setEmptyView(this.emptyFrameView);
        frameLayout2.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.listView.setAdapter(this.listAdapter);
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i) {
                GroupStickersActivity.this.lambda$createView$0(view, i);
            }
        });
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                if (i == 1) {
                    AndroidUtilities.hideKeyboard(GroupStickersActivity.this.getParentActivity().getCurrentFocus());
                }
            }
        });
        return this.fragmentView;
    }

    public void lambda$createView$0(View view, int i) {
        if (getParentActivity() == null) {
            return;
        }
        if (!this.searching) {
            if (i < this.stickersStartRow || i >= this.stickersEndRow) {
                return;
            }
            onStickerSetClicked(view, MediaDataController.getInstance(this.currentAccount).getStickerSets(0).get(i - this.stickersStartRow), false);
        } else if (i > this.searchAdapter.searchEntries.size()) {
            onStickerSetClicked(view, (TLRPC$TL_messages_stickerSet) this.searchAdapter.localSearchEntries.get((i - this.searchAdapter.searchEntries.size()) - 1), false);
        } else if (i != this.searchAdapter.searchEntries.size()) {
            onStickerSetClicked(view, (TLRPC$TL_messages_stickerSet) this.searchAdapter.searchEntries.get(i), true);
        }
    }

    private void onStickerSetClicked(View view, final TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet, boolean z) {
        TLRPC$TL_inputStickerSetShortName tLRPC$TL_inputStickerSetShortName;
        if (z) {
            TLRPC$TL_inputStickerSetShortName tLRPC$TL_inputStickerSetShortName2 = new TLRPC$TL_inputStickerSetShortName();
            tLRPC$TL_inputStickerSetShortName2.short_name = tLRPC$TL_messages_stickerSet.set.short_name;
            tLRPC$TL_inputStickerSetShortName = tLRPC$TL_inputStickerSetShortName2;
        } else {
            tLRPC$TL_inputStickerSetShortName = null;
        }
        StickersAlert stickersAlert = new StickersAlert(getParentActivity(), this, tLRPC$TL_inputStickerSetShortName, !z ? tLRPC$TL_messages_stickerSet : null, (StickersAlert.StickersAlertDelegate) null);
        final boolean isChecked = ((StickerSetCell) view).isChecked();
        stickersAlert.setCustomButtonDelegate(new StickersAlert.StickersAlertCustomButtonDelegate() {
            @Override
            public String getCustomButtonTextColorKey() {
                return isChecked ? "dialogTextRed" : "featuredStickers_buttonText";
            }

            @Override
            public String getCustomButtonRippleColorKey() {
                if (isChecked) {
                    return null;
                }
                return "featuredStickers_addButtonPressed";
            }

            @Override
            public String getCustomButtonColorKey() {
                if (isChecked) {
                    return null;
                }
                return "featuredStickers_addButton";
            }

            @Override
            public String getCustomButtonText() {
                return LocaleController.getString(isChecked ? C1072R.string.RemoveGroupStickerSet : C1072R.string.SetAsGroupStickerSet);
            }

            @Override
            public boolean onCustomButtonPressed() {
                boolean z2;
                boolean z3;
                int findFirstVisibleItemPosition = GroupStickersActivity.this.layoutManager.findFirstVisibleItemPosition();
                RecyclerListView.Holder holder = (RecyclerListView.Holder) GroupStickersActivity.this.listView.findViewHolderForAdapterPosition(findFirstVisibleItemPosition);
                int top = holder != null ? holder.itemView.getTop() : ConnectionsManager.DEFAULT_DATACENTER_ID;
                int i = GroupStickersActivity.this.selectedStickerSetIndex;
                if (isChecked) {
                    GroupStickersActivity.this.selectedStickerSet = null;
                    GroupStickersActivity.this.removeStickerSet = true;
                } else {
                    GroupStickersActivity.this.selectedStickerSet = tLRPC$TL_messages_stickerSet;
                    GroupStickersActivity.this.removeStickerSet = false;
                }
                GroupStickersActivity.this.updateSelectedStickerSetIndex();
                if (i != -1) {
                    if (!GroupStickersActivity.this.searching) {
                        for (int i2 = 0; i2 < GroupStickersActivity.this.listView.getChildCount(); i2++) {
                            View childAt = GroupStickersActivity.this.listView.getChildAt(i2);
                            if (GroupStickersActivity.this.listView.getChildViewHolder(childAt).getAdapterPosition() == GroupStickersActivity.this.stickersStartRow + i) {
                                ((StickerSetCell) childAt).setChecked(false, true);
                                z3 = true;
                                break;
                            }
                        }
                    }
                    z3 = false;
                    if (!z3) {
                        GroupStickersActivity.this.listAdapter.notifyItemChanged(i);
                    }
                }
                if (GroupStickersActivity.this.selectedStickerSetIndex != -1) {
                    if (!GroupStickersActivity.this.searching) {
                        for (int i3 = 0; i3 < GroupStickersActivity.this.listView.getChildCount(); i3++) {
                            View childAt2 = GroupStickersActivity.this.listView.getChildAt(i3);
                            if (GroupStickersActivity.this.listView.getChildViewHolder(childAt2).getAdapterPosition() == GroupStickersActivity.this.stickersStartRow + GroupStickersActivity.this.selectedStickerSetIndex) {
                                ((StickerSetCell) childAt2).setChecked(true, true);
                                z2 = true;
                                break;
                            }
                        }
                    }
                    z2 = false;
                    if (!z2) {
                        GroupStickersActivity.this.listAdapter.notifyItemChanged(GroupStickersActivity.this.selectedStickerSetIndex);
                    }
                }
                if (top != Integer.MAX_VALUE) {
                    GroupStickersActivity.this.layoutManager.scrollToPositionWithOffset(findFirstVisibleItemPosition + 1, top);
                }
                if (GroupStickersActivity.this.searching) {
                    GroupStickersActivity.this.searchItem.setSearchFieldText("", false);
                    ((BaseFragment) GroupStickersActivity.this).actionBar.closeSearchField(true);
                }
                return true;
            }
        });
        stickersAlert.show();
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC$StickerSet tLRPC$StickerSet;
        if (i == NotificationCenter.stickersDidLoad) {
            if (((Integer) objArr[0]).intValue() == 0) {
                updateRows();
            }
        } else if (i == NotificationCenter.chatInfoDidLoad) {
            TLRPC$ChatFull tLRPC$ChatFull = (TLRPC$ChatFull) objArr[0];
            if (tLRPC$ChatFull.f858id == this.chatId) {
                if (this.info == null && tLRPC$ChatFull.stickerset != null) {
                    this.selectedStickerSet = MediaDataController.getInstance(this.currentAccount).getGroupStickerSetById(tLRPC$ChatFull.stickerset);
                }
                this.info = tLRPC$ChatFull;
                updateRows();
            }
        } else if (i == NotificationCenter.groupStickersDidLoad) {
            long longValue = ((Long) objArr[0]).longValue();
            TLRPC$ChatFull tLRPC$ChatFull2 = this.info;
            if (tLRPC$ChatFull2 == null || (tLRPC$StickerSet = tLRPC$ChatFull2.stickerset) == null || tLRPC$StickerSet.f890id != longValue) {
                return;
            }
            updateRows();
        }
    }

    public void setInfo(TLRPC$ChatFull tLRPC$ChatFull) {
        this.info = tLRPC$ChatFull;
        if (tLRPC$ChatFull == null || tLRPC$ChatFull.stickerset == null) {
            return;
        }
        this.selectedStickerSet = MediaDataController.getInstance(this.currentAccount).getGroupStickerSetById(this.info.stickerset);
    }

    private void saveStickerSet() {
        TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet;
        TLRPC$ChatFull tLRPC$ChatFull = this.info;
        if (tLRPC$ChatFull != null) {
            TLRPC$StickerSet tLRPC$StickerSet = tLRPC$ChatFull.stickerset;
            if (tLRPC$StickerSet == null || (tLRPC$TL_messages_stickerSet = this.selectedStickerSet) == null || tLRPC$TL_messages_stickerSet.set.f890id != tLRPC$StickerSet.f890id) {
                if (tLRPC$StickerSet == null && this.selectedStickerSet == null) {
                    return;
                }
                TLRPC$TL_channels_setStickers tLRPC$TL_channels_setStickers = new TLRPC$TL_channels_setStickers();
                tLRPC$TL_channels_setStickers.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(this.chatId);
                if (this.removeStickerSet) {
                    tLRPC$TL_channels_setStickers.stickerset = new TLRPC$TL_inputStickerSetEmpty();
                } else {
                    SharedPreferences.Editor edit = MessagesController.getEmojiSettings(this.currentAccount).edit();
                    edit.remove("group_hide_stickers_" + this.info.f858id).apply();
                    TLRPC$TL_inputStickerSetID tLRPC$TL_inputStickerSetID = new TLRPC$TL_inputStickerSetID();
                    tLRPC$TL_channels_setStickers.stickerset = tLRPC$TL_inputStickerSetID;
                    TLRPC$StickerSet tLRPC$StickerSet2 = this.selectedStickerSet.set;
                    tLRPC$TL_inputStickerSetID.f880id = tLRPC$StickerSet2.f890id;
                    tLRPC$TL_inputStickerSetID.access_hash = tLRPC$StickerSet2.access_hash;
                }
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_channels_setStickers, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        GroupStickersActivity.this.lambda$saveStickerSet$2(tLObject, tLRPC$TL_error);
                    }
                });
            }
        }
    }

    public void lambda$saveStickerSet$2(TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                GroupStickersActivity.this.lambda$saveStickerSet$1(tLRPC$TL_error);
            }
        });
    }

    public void lambda$saveStickerSet$1(TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = this.selectedStickerSet;
            if (tLRPC$TL_messages_stickerSet == null) {
                this.info.stickerset = null;
            } else {
                this.info.stickerset = tLRPC$TL_messages_stickerSet.set;
                MediaDataController.getInstance(this.currentAccount).putGroupStickerSet(this.selectedStickerSet);
            }
            updateSelectedStickerSetIndex();
            TLRPC$ChatFull tLRPC$ChatFull = this.info;
            if (tLRPC$ChatFull.stickerset == null) {
                tLRPC$ChatFull.flags |= 256;
            } else {
                tLRPC$ChatFull.flags &= -257;
            }
            MessagesStorage.getInstance(this.currentAccount).updateChatInfo(this.info, false);
            NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.chatInfoDidLoad, this.info, 0, Boolean.TRUE, Boolean.FALSE);
            finishFragment();
        } else if (getParentActivity() != null) {
            Toast.makeText(getParentActivity(), LocaleController.getString("ErrorOccurred", C1072R.string.ErrorOccurred) + "\n" + tLRPC$TL_error.text, 0).show();
        }
    }

    public void updateSelectedStickerSetIndex() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.GroupStickersActivity.updateSelectedStickerSetIndex():void");
    }

    @SuppressLint({"NotifyDataSetChanged"})
    private void updateRows() {
        this.rowCount = 0;
        ArrayList<TLRPC$TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(this.currentAccount).getStickerSets(0);
        if (!stickerSets.isEmpty()) {
            int i = this.rowCount;
            int i2 = i + 1;
            this.rowCount = i2;
            this.headerRow = i;
            this.stickersStartRow = i2;
            this.stickersEndRow = i2 + stickerSets.size();
            this.rowCount += stickerSets.size();
        } else {
            this.headerRow = -1;
            this.stickersStartRow = -1;
            this.stickersEndRow = -1;
        }
        int i3 = this.rowCount;
        this.rowCount = i3 + 1;
        this.infoRow = i3;
        updateSelectedStickerSetIndex();
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
    }

    public class SearchAdapter extends RecyclerListView.SelectionAdapter {
        private Runnable lastCallback;
        private String lastQuery;
        private Context mContext;
        private int reqId;
        private List<TLRPC$TL_messages_stickerSet> searchEntries = new ArrayList();
        private List<TLRPC$TL_messages_stickerSet> localSearchEntries = new ArrayList();

        public SearchAdapter(Context context) {
            GroupStickersActivity.this = r1;
            this.mContext = context;
            setHasStableIds(true);
        }

        @Override
        public long getItemId(int i) {
            if (getItemViewType(i) == 0) {
                List<TLRPC$TL_messages_stickerSet> list = i > this.searchEntries.size() ? this.localSearchEntries : this.searchEntries;
                if (i > this.searchEntries.size()) {
                    i = (i - this.searchEntries.size()) - 1;
                }
                return list.get(i).set.f890id;
            }
            return -1L;
        }

        @SuppressLint({"NotifyDataSetChanged"})
        public void onSearchStickers(final String str) {
            if (this.reqId != 0) {
                GroupStickersActivity.this.getConnectionsManager().cancelRequest(this.reqId, true);
                this.reqId = 0;
            }
            Runnable runnable = this.lastCallback;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.lastCallback = null;
            }
            this.lastQuery = null;
            int itemCount = getItemCount();
            if (itemCount > 0) {
                this.searchEntries.clear();
                this.localSearchEntries.clear();
                notifyItemRangeRemoved(0, itemCount);
            }
            if (TextUtils.isEmpty(str)) {
                GroupStickersActivity.this.emptyView.setVisibility(8);
                GroupStickersActivity.this.emptyView.showProgress(false, true);
                return;
            }
            if (GroupStickersActivity.this.emptyView.getVisibility() != 0) {
                GroupStickersActivity.this.emptyView.setVisibility(0);
                GroupStickersActivity.this.emptyView.showProgress(true, false);
            } else {
                GroupStickersActivity.this.emptyView.showProgress(true, true);
            }
            Runnable runnable2 = new Runnable() {
                @Override
                public final void run() {
                    GroupStickersActivity.SearchAdapter.this.lambda$onSearchStickers$2(str);
                }
            };
            this.lastCallback = runnable2;
            AndroidUtilities.runOnUIThread(runnable2, 300L);
        }

        public void lambda$onSearchStickers$2(final String str) {
            this.lastQuery = str;
            final TLRPC$TL_messages_searchStickerSets tLRPC$TL_messages_searchStickerSets = new TLRPC$TL_messages_searchStickerSets();
            tLRPC$TL_messages_searchStickerSets.f963q = str;
            this.reqId = GroupStickersActivity.this.getConnectionsManager().sendRequest(tLRPC$TL_messages_searchStickerSets, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    GroupStickersActivity.SearchAdapter.this.lambda$onSearchStickers$1(tLRPC$TL_messages_searchStickerSets, str, tLObject, tLRPC$TL_error);
                }
            }, 66);
        }

        public void lambda$onSearchStickers$1(TLRPC$TL_messages_searchStickerSets tLRPC$TL_messages_searchStickerSets, final String str, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            if (Objects.equals(this.lastQuery, tLRPC$TL_messages_searchStickerSets.f963q) && (tLObject instanceof TLRPC$TL_messages_foundStickerSets)) {
                final ArrayList arrayList = new ArrayList();
                Iterator<TLRPC$StickerSetCovered> it = ((TLRPC$TL_messages_foundStickerSets) tLObject).sets.iterator();
                while (it.hasNext()) {
                    TLRPC$StickerSetCovered next = it.next();
                    TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = new TLRPC$TL_messages_stickerSet();
                    tLRPC$TL_messages_stickerSet.set = next.set;
                    tLRPC$TL_messages_stickerSet.documents = next.covers;
                    arrayList.add(tLRPC$TL_messages_stickerSet);
                }
                String trim = str.toLowerCase(Locale.ROOT).trim();
                final ArrayList arrayList2 = new ArrayList();
                Iterator<TLRPC$TL_messages_stickerSet> it2 = MediaDataController.getInstance(((BaseFragment) GroupStickersActivity.this).currentAccount).getStickerSets(0).iterator();
                while (it2.hasNext()) {
                    TLRPC$TL_messages_stickerSet next2 = it2.next();
                    String str2 = next2.set.short_name;
                    Locale locale = Locale.ROOT;
                    if (str2.toLowerCase(locale).contains(trim) || next2.set.title.toLowerCase(locale).contains(trim)) {
                        arrayList2.add(next2);
                    }
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        GroupStickersActivity.SearchAdapter.this.lambda$onSearchStickers$0(arrayList, arrayList2, str);
                    }
                });
            }
        }

        public void lambda$onSearchStickers$0(List list, List list2, String str) {
            this.searchEntries = list;
            this.localSearchEntries = list2;
            notifyDataSetChanged();
            GroupStickersActivity.this.emptyView.title.setVisibility(8);
            GroupStickersActivity.this.emptyView.subtitle.setText(LocaleController.formatString(C1072R.string.ChooseStickerNoResultsFound, str));
            GroupStickersActivity.this.emptyView.showProgress(false, true);
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            StickerSetCell stickerSetCell;
            if (i == 0) {
                StickerSetCell stickerSetCell2 = new StickerSetCell(this.mContext, 3);
                stickerSetCell2.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                stickerSetCell = stickerSetCell2;
            } else {
                HeaderCell headerCell = new HeaderCell(this.mContext, "windowBackgroundWhiteGrayText4", 21, 0, 0, false, GroupStickersActivity.this.getResourceProvider());
                headerCell.setBackground(Theme.getThemedDrawable(this.mContext, C1072R.C1073drawable.greydivider_bottom, "windowBackgroundGrayShadow"));
                headerCell.setText(LocaleController.getString(C1072R.string.ChooseStickerMyStickerSets));
                stickerSetCell = headerCell;
            }
            stickerSetCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(stickerSetCell);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (getItemViewType(i) != 0) {
                return;
            }
            boolean z = i > this.searchEntries.size();
            List<TLRPC$TL_messages_stickerSet> list = z ? this.localSearchEntries : this.searchEntries;
            if (z) {
                i = (i - this.searchEntries.size()) - 1;
            }
            StickerSetCell stickerSetCell = (StickerSetCell) viewHolder.itemView;
            TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = list.get(i);
            stickerSetCell.setStickersSet(tLRPC$TL_messages_stickerSet, i != list.size() - 1, !z);
            String str = this.lastQuery;
            stickerSetCell.setSearchQuery(tLRPC$TL_messages_stickerSet, str != null ? str.toLowerCase(Locale.ROOT) : "", GroupStickersActivity.this.getResourceProvider());
            stickerSetCell.setChecked(tLRPC$TL_messages_stickerSet.set.f890id == (GroupStickersActivity.this.selectedStickerSet != null ? GroupStickersActivity.this.selectedStickerSet.set.f890id : (GroupStickersActivity.this.info == null || GroupStickersActivity.this.info.stickerset == null) ? 0L : GroupStickersActivity.this.info.stickerset.f890id), false);
        }

        @Override
        public int getItemViewType(int i) {
            return this.searchEntries.size() == i ? 1 : 0;
        }

        @Override
        public int getItemCount() {
            return this.searchEntries.size() + this.localSearchEntries.size() + (!this.localSearchEntries.isEmpty() ? 1 : 0);
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return getItemViewType(viewHolder.getAdapterPosition()) == 0;
        }
    }

    public class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;

        public ListAdapter(Context context) {
            GroupStickersActivity.this = r1;
            this.mContext = context;
        }

        @Override
        public int getItemCount() {
            return GroupStickersActivity.this.rowCount;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 0) {
                ArrayList<TLRPC$TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(((BaseFragment) GroupStickersActivity.this).currentAccount).getStickerSets(0);
                int i2 = i - GroupStickersActivity.this.stickersStartRow;
                StickerSetCell stickerSetCell = (StickerSetCell) viewHolder.itemView;
                TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = stickerSets.get(i2);
                stickerSetCell.setStickersSet(stickerSets.get(i2), i2 != stickerSets.size() - 1);
                stickerSetCell.setChecked(tLRPC$TL_messages_stickerSet.set.f890id == (GroupStickersActivity.this.selectedStickerSet != null ? GroupStickersActivity.this.selectedStickerSet.set.f890id : (GroupStickersActivity.this.info == null || GroupStickersActivity.this.info.stickerset == null) ? 0L : GroupStickersActivity.this.info.stickerset.f890id), false);
            } else if (itemViewType != 1) {
                if (itemViewType != 4) {
                    return;
                }
                ((HeaderCell) viewHolder.itemView).setText(LocaleController.getString(C1072R.string.ChooseStickerSetHeader));
            } else if (i == GroupStickersActivity.this.infoRow) {
                String string = LocaleController.getString("ChooseStickerSetMy", C1072R.string.ChooseStickerSetMy);
                int indexOf = string.indexOf("@stickers");
                if (indexOf != -1) {
                    try {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                        spannableStringBuilder.setSpan(new URLSpanNoUnderline("@stickers") {
                            @Override
                            public void onClick(View view) {
                                MessagesController.getInstance(((BaseFragment) GroupStickersActivity.this).currentAccount).openByUserName("stickers", GroupStickersActivity.this, 1);
                            }
                        }, indexOf, indexOf + 9, 18);
                        ((TextInfoPrivacyCell) viewHolder.itemView).setText(spannableStringBuilder);
                        return;
                    } catch (Exception e) {
                        FileLog.m31e(e);
                        ((TextInfoPrivacyCell) viewHolder.itemView).setText(string);
                        return;
                    }
                }
                ((TextInfoPrivacyCell) viewHolder.itemView).setText(string);
            }
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 0;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View stickerSetCell;
            if (i == 0) {
                stickerSetCell = new StickerSetCell(this.mContext, 3);
                stickerSetCell.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
            } else if (i == 1) {
                stickerSetCell = new TextInfoPrivacyCell(this.mContext);
                stickerSetCell.setBackground(Theme.getThemedDrawable(this.mContext, C1072R.C1073drawable.greydivider_bottom, "windowBackgroundGrayShadow"));
            } else {
                stickerSetCell = new HeaderCell(this.mContext);
                stickerSetCell.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
            }
            stickerSetCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(stickerSetCell);
        }

        @Override
        public int getItemViewType(int i) {
            if (i < GroupStickersActivity.this.stickersStartRow || i >= GroupStickersActivity.this.stickersEndRow) {
                if (i == GroupStickersActivity.this.headerRow) {
                    return 4;
                }
                return i == GroupStickersActivity.this.infoRow ? 1 : 0;
            }
            return 0;
        }
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{StickerSetCell.class, TextSettingsCell.class}, null, null, null, "windowBackgroundWhite"));
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "windowBackgroundGray"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "actionBarDefault"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, "actionBarDefault"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, "actionBarDefaultIcon"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, "actionBarDefaultTitle"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, "actionBarDefaultSelector"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, "listSelectorSDK21"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, "divider"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{TextInfoPrivacyCell.class}, null, null, null, "windowBackgroundGrayShadow"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText4"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LINKCOLOR, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteLinkText"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteValueText"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{ShadowSectionCell.class}, null, null, null, "windowBackgroundGrayShadow"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{StickerSetCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{StickerSetCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText2"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_USEBACKGROUNDDRAWABLE | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, new Class[]{StickerSetCell.class}, new String[]{"optionsButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "stickers_menuSelector"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{StickerSetCell.class}, new String[]{"optionsButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "stickers_menu"));
        return arrayList;
    }
}
