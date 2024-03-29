package org.telegram.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
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
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$ChatFull;
import org.telegram.tgnet.TLRPC$StickerSet;
import org.telegram.tgnet.TLRPC$StickerSetCovered;
import org.telegram.tgnet.TLRPC$TL_channels_setEmojiStickers;
import org.telegram.tgnet.TLRPC$TL_channels_setStickers;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_inputStickerSetEmpty;
import org.telegram.tgnet.TLRPC$TL_inputStickerSetID;
import org.telegram.tgnet.TLRPC$TL_inputStickerSetShortName;
import org.telegram.tgnet.TLRPC$TL_messages_foundStickerSets;
import org.telegram.tgnet.TLRPC$TL_messages_getStickerSet;
import org.telegram.tgnet.TLRPC$TL_messages_searchEmojiStickerSets;
import org.telegram.tgnet.TLRPC$TL_messages_searchStickerSets;
import org.telegram.tgnet.TLRPC$TL_messages_stickerSet;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.StickerSetCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.StickerEmptyView;
import org.telegram.ui.Components.StickersAlert;
import org.telegram.ui.Components.URLSpanNoUnderline;
import org.telegram.ui.Components.VerticalPositionAutoAnimator;
import org.telegram.ui.GroupStickersActivity;
public class GroupStickersActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private AddEmojiCell addEmojiCell;
    private int addEmojiPackHintRow;
    private int addEmojiPackRow;
    private int addEmojiPackTitleRow;
    private final long chatId;
    private int currentEmojiPackRow;
    private FrameLayout emptyFrameView;
    private StickerEmptyView emptyView;
    private int headerRow;
    private TLRPC$ChatFull info;
    private int infoRow;
    private boolean isEmoji;
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

    public GroupStickersActivity(long j, boolean z) {
        this.chatId = j;
        this.isEmoji = z;
    }

    @Override
    public boolean onFragmentCreate() {
        super.onFragmentCreate();
        MediaDataController.getInstance(this.currentAccount).checkStickers(getStickerSetType());
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
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(this.isEmoji ? R.string.GroupEmojiPack : R.string.GroupStickers));
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    GroupStickersActivity.this.finishFragment();
                }
            }
        });
        ActionBarMenuItem addItem = this.actionBar.createMenu().addItem(0, R.drawable.ic_ab_search);
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
        this.searchItem.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.listAdapter = new ListAdapter(context);
        this.searchAdapter = new SearchAdapter(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        FrameLayout frameLayout2 = frameLayout;
        frameLayout2.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
        this.listView = new RecyclerListView(context);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setDurations(200L);
        defaultItemAnimator.setSupportsChangeAnimations(true);
        this.listView.setItemAnimator(defaultItemAnimator);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        this.layoutManager = linearLayoutManager;
        linearLayoutManager.setOrientation(1);
        this.listView.setLayoutManager(this.layoutManager);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.emptyFrameView = frameLayout3;
        frameLayout3.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
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
            if (i >= this.stickersStartRow && i < this.stickersEndRow) {
                onStickerSetClicked(((StickerSetCell) view).isChecked(), MediaDataController.getInstance(this.currentAccount).getStickerSets(getStickerSetType()).get(i - this.stickersStartRow), false);
            }
            if (i == this.currentEmojiPackRow) {
                onStickerSetClicked(true, this.selectedStickerSet, false);
            }
        } else if (i > this.searchAdapter.searchEntries.size()) {
            onStickerSetClicked(((StickerSetCell) view).isChecked(), (TLRPC$TL_messages_stickerSet) this.searchAdapter.localSearchEntries.get((i - this.searchAdapter.searchEntries.size()) - 1), false);
        } else if (i != this.searchAdapter.searchEntries.size()) {
            onStickerSetClicked(((StickerSetCell) view).isChecked(), (TLRPC$TL_messages_stickerSet) this.searchAdapter.searchEntries.get(i), true);
        }
    }

    private void onStickerSetClicked(boolean z, TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet, boolean z2) {
        TLRPC$TL_inputStickerSetShortName tLRPC$TL_inputStickerSetShortName;
        if (z2) {
            TLRPC$TL_inputStickerSetShortName tLRPC$TL_inputStickerSetShortName2 = new TLRPC$TL_inputStickerSetShortName();
            tLRPC$TL_inputStickerSetShortName2.short_name = tLRPC$TL_messages_stickerSet.set.short_name;
            tLRPC$TL_inputStickerSetShortName = tLRPC$TL_inputStickerSetShortName2;
        } else {
            tLRPC$TL_inputStickerSetShortName = null;
        }
        StickersAlert stickersAlert = new StickersAlert(getParentActivity(), this, tLRPC$TL_inputStickerSetShortName, !z2 ? tLRPC$TL_messages_stickerSet : null, (StickersAlert.StickersAlertDelegate) null);
        stickersAlert.setCustomButtonDelegate(new AnonymousClass4(z, tLRPC$TL_messages_stickerSet));
        AndroidUtilities.hideKeyboard(getParentActivity().getCurrentFocus());
        stickersAlert.show();
    }

    public class AnonymousClass4 implements StickersAlert.StickersAlertCustomButtonDelegate {
        final boolean val$isSelected;
        final TLRPC$TL_messages_stickerSet val$stickerSet;

        AnonymousClass4(boolean z, TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet) {
            this.val$isSelected = z;
            this.val$stickerSet = tLRPC$TL_messages_stickerSet;
        }

        @Override
        public int getCustomButtonTextColorKey() {
            return this.val$isSelected ? Theme.key_text_RedBold : Theme.key_featuredStickers_buttonText;
        }

        @Override
        public int getCustomButtonRippleColorKey() {
            if (this.val$isSelected) {
                return -1;
            }
            return Theme.key_featuredStickers_addButtonPressed;
        }

        @Override
        public int getCustomButtonColorKey() {
            if (this.val$isSelected) {
                return -1;
            }
            return Theme.key_featuredStickers_addButton;
        }

        @Override
        public String getCustomButtonText() {
            if (GroupStickersActivity.this.isEmoji) {
                return LocaleController.getString(this.val$isSelected ? R.string.RemoveGroupEmojiPackSet : R.string.SetAsGroupEmojiPackSet);
            }
            return LocaleController.getString(this.val$isSelected ? R.string.RemoveGroupStickerSet : R.string.SetAsGroupStickerSet);
        }

        @Override
        public boolean onCustomButtonPressed() {
            boolean z;
            boolean z2;
            int findFirstVisibleItemPosition = GroupStickersActivity.this.layoutManager.findFirstVisibleItemPosition();
            RecyclerListView.Holder holder = (RecyclerListView.Holder) GroupStickersActivity.this.listView.findViewHolderForAdapterPosition(findFirstVisibleItemPosition);
            int top = holder != null ? holder.itemView.getTop() : ConnectionsManager.DEFAULT_DATACENTER_ID;
            int i = GroupStickersActivity.this.selectedStickerSetIndex;
            if (this.val$isSelected) {
                GroupStickersActivity.this.selectedStickerSet = null;
                GroupStickersActivity.this.removeStickerSet = true;
            } else {
                GroupStickersActivity.this.selectedStickerSet = this.val$stickerSet;
                GroupStickersActivity.this.removeStickerSet = false;
            }
            if (GroupStickersActivity.this.isEmoji) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        GroupStickersActivity.AnonymousClass4.this.lambda$onCustomButtonPressed$0();
                    }
                }, 350L);
            }
            GroupStickersActivity.this.updateSelectedStickerSetIndex();
            GroupStickersActivity groupStickersActivity = GroupStickersActivity.this;
            groupStickersActivity.updateCurrentPackVisibility(groupStickersActivity.selectedStickerSet, true);
            if (i != -1) {
                if (!GroupStickersActivity.this.searching) {
                    for (int i2 = 0; i2 < GroupStickersActivity.this.listView.getChildCount(); i2++) {
                        View childAt = GroupStickersActivity.this.listView.getChildAt(i2);
                        if (GroupStickersActivity.this.listView.getChildViewHolder(childAt).getAdapterPosition() == GroupStickersActivity.this.stickersStartRow + i) {
                            ((StickerSetCell) childAt).setChecked(false, true);
                            z2 = true;
                            break;
                        }
                    }
                }
                z2 = false;
                if (!z2) {
                    GroupStickersActivity.this.listAdapter.notifyItemChanged(i);
                }
            }
            if (GroupStickersActivity.this.selectedStickerSetIndex != -1) {
                if (!GroupStickersActivity.this.searching) {
                    for (int i3 = 0; i3 < GroupStickersActivity.this.listView.getChildCount(); i3++) {
                        View childAt2 = GroupStickersActivity.this.listView.getChildAt(i3);
                        if (GroupStickersActivity.this.listView.getChildViewHolder(childAt2).getAdapterPosition() == GroupStickersActivity.this.stickersStartRow + GroupStickersActivity.this.selectedStickerSetIndex) {
                            ((StickerSetCell) childAt2).setChecked(true, true);
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                if (!z) {
                    GroupStickersActivity.this.listAdapter.notifyItemChanged(GroupStickersActivity.this.selectedStickerSetIndex);
                }
            }
            if (top != Integer.MAX_VALUE && !GroupStickersActivity.this.isEmoji) {
                GroupStickersActivity.this.layoutManager.scrollToPositionWithOffset(findFirstVisibleItemPosition + 1, top);
            }
            if (GroupStickersActivity.this.searching) {
                GroupStickersActivity.this.searchItem.setSearchFieldText("", false);
                ((BaseFragment) GroupStickersActivity.this).actionBar.closeSearchField(true);
            }
            return true;
        }

        public void lambda$onCustomButtonPressed$0() {
            BulletinFactory.of(GroupStickersActivity.this).createSimpleBulletin(R.raw.done, LocaleController.getString(R.string.GroupsEmojiPackUpdated)).show();
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.stickersDidLoad) {
            if (((Integer) objArr[0]).intValue() == getStickerSetType()) {
                updateRows();
            }
        } else if (i == NotificationCenter.chatInfoDidLoad) {
            TLRPC$ChatFull tLRPC$ChatFull = (TLRPC$ChatFull) objArr[0];
            if (tLRPC$ChatFull.id == this.chatId) {
                if (this.info == null && getStickerSet(tLRPC$ChatFull) != null) {
                    this.selectedStickerSet = MediaDataController.getInstance(this.currentAccount).getGroupStickerSetById(getStickerSet(tLRPC$ChatFull));
                }
                this.info = tLRPC$ChatFull;
                updateRows();
            }
        } else if (i == NotificationCenter.groupStickersDidLoad) {
            long longValue = ((Long) objArr[0]).longValue();
            if (getStickerSet(this.info) == null || getStickerSet(this.info).id != longValue) {
                return;
            }
            updateRows();
        }
    }

    public TLRPC$StickerSet getStickerSet(TLRPC$ChatFull tLRPC$ChatFull) {
        if (tLRPC$ChatFull == null) {
            return null;
        }
        if (this.isEmoji) {
            return tLRPC$ChatFull.emojiset;
        }
        return tLRPC$ChatFull.stickerset;
    }

    public void setInfo(TLRPC$ChatFull tLRPC$ChatFull) {
        this.info = tLRPC$ChatFull;
        if (getStickerSet(tLRPC$ChatFull) != null) {
            this.selectedStickerSet = MediaDataController.getInstance(this.currentAccount).getGroupStickerSetById(getStickerSet(this.info));
        }
    }

    private void setStickerSet(TLRPC$StickerSet tLRPC$StickerSet) {
        if (this.isEmoji) {
            this.info.emojiset = tLRPC$StickerSet;
        } else {
            this.info.stickerset = tLRPC$StickerSet;
        }
    }

    private void saveStickerSet() {
        TLRPC$TL_channels_setStickers tLRPC$TL_channels_setStickers;
        TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet;
        TLRPC$ChatFull tLRPC$ChatFull = this.info;
        if (tLRPC$ChatFull != null) {
            if (getStickerSet(tLRPC$ChatFull) == null || (tLRPC$TL_messages_stickerSet = this.selectedStickerSet) == null || tLRPC$TL_messages_stickerSet.set.id != getStickerSet(this.info).id) {
                if (getStickerSet(this.info) == null && this.selectedStickerSet == null) {
                    return;
                }
                if (this.isEmoji) {
                    TLRPC$TL_channels_setEmojiStickers tLRPC$TL_channels_setEmojiStickers = new TLRPC$TL_channels_setEmojiStickers();
                    tLRPC$TL_channels_setEmojiStickers.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(this.chatId);
                    if (this.removeStickerSet) {
                        tLRPC$TL_channels_setEmojiStickers.stickerset = new TLRPC$TL_inputStickerSetEmpty();
                        tLRPC$TL_channels_setStickers = tLRPC$TL_channels_setEmojiStickers;
                    } else {
                        TLRPC$TL_inputStickerSetID tLRPC$TL_inputStickerSetID = new TLRPC$TL_inputStickerSetID();
                        tLRPC$TL_channels_setEmojiStickers.stickerset = tLRPC$TL_inputStickerSetID;
                        TLRPC$StickerSet tLRPC$StickerSet = this.selectedStickerSet.set;
                        tLRPC$TL_inputStickerSetID.id = tLRPC$StickerSet.id;
                        tLRPC$TL_inputStickerSetID.access_hash = tLRPC$StickerSet.access_hash;
                        tLRPC$TL_channels_setStickers = tLRPC$TL_channels_setEmojiStickers;
                    }
                } else {
                    TLRPC$TL_channels_setStickers tLRPC$TL_channels_setStickers2 = new TLRPC$TL_channels_setStickers();
                    tLRPC$TL_channels_setStickers2.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(this.chatId);
                    if (this.removeStickerSet) {
                        tLRPC$TL_channels_setStickers2.stickerset = new TLRPC$TL_inputStickerSetEmpty();
                        tLRPC$TL_channels_setStickers = tLRPC$TL_channels_setStickers2;
                    } else {
                        SharedPreferences.Editor edit = MessagesController.getEmojiSettings(this.currentAccount).edit();
                        edit.remove("group_hide_stickers_" + this.info.id).apply();
                        TLRPC$TL_inputStickerSetID tLRPC$TL_inputStickerSetID2 = new TLRPC$TL_inputStickerSetID();
                        tLRPC$TL_channels_setStickers2.stickerset = tLRPC$TL_inputStickerSetID2;
                        TLRPC$StickerSet tLRPC$StickerSet2 = this.selectedStickerSet.set;
                        tLRPC$TL_inputStickerSetID2.id = tLRPC$StickerSet2.id;
                        tLRPC$TL_inputStickerSetID2.access_hash = tLRPC$StickerSet2.access_hash;
                        tLRPC$TL_channels_setStickers = tLRPC$TL_channels_setStickers2;
                    }
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
                setStickerSet(null);
            } else {
                setStickerSet(tLRPC$TL_messages_stickerSet.set);
                MediaDataController.getInstance(this.currentAccount).putGroupStickerSet(this.selectedStickerSet);
            }
            updateSelectedStickerSetIndex();
            if (this.isEmoji) {
                TLRPC$ChatFull tLRPC$ChatFull = this.info;
                if (tLRPC$ChatFull.emojiset != null) {
                    tLRPC$ChatFull.flags2 |= 1024;
                } else {
                    tLRPC$ChatFull.flags2 &= -1025;
                }
            } else {
                TLRPC$ChatFull tLRPC$ChatFull2 = this.info;
                if (tLRPC$ChatFull2.stickerset == null) {
                    tLRPC$ChatFull2.flags |= LiteMode.FLAG_CHAT_BLUR;
                } else {
                    tLRPC$ChatFull2.flags &= -257;
                }
            }
            MessagesStorage.getInstance(this.currentAccount).updateChatInfo(this.info, false);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatInfoDidLoad, this.info, 0, Boolean.TRUE, Boolean.FALSE);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupPackUpdated, Long.valueOf(this.info.id), Boolean.valueOf(this.isEmoji));
            finishFragment();
        } else if (getParentActivity() != null) {
            Toast.makeText(getParentActivity(), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tLRPC$TL_error.text, 0).show();
        }
    }

    public int getStickerSetType() {
        return this.isEmoji ? 5 : 0;
    }

    public void updateSelectedStickerSetIndex() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.GroupStickersActivity.updateSelectedStickerSetIndex():void");
    }

    private void updateRows() {
        updateRows(true);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    private void updateRows(boolean z) {
        ListAdapter listAdapter;
        this.addEmojiPackTitleRow = -1;
        this.addEmojiPackRow = -1;
        this.currentEmojiPackRow = -1;
        this.addEmojiPackHintRow = -1;
        this.rowCount = 0;
        if (this.isEmoji) {
            int i = 0 + 1;
            this.rowCount = i;
            this.addEmojiPackTitleRow = 0;
            int i2 = i + 1;
            this.rowCount = i2;
            this.addEmojiPackRow = i;
            if (this.selectedStickerSet != null) {
                this.rowCount = i2 + 1;
                this.currentEmojiPackRow = i2;
            }
            int i3 = this.rowCount;
            this.rowCount = i3 + 1;
            this.addEmojiPackHintRow = i3;
        }
        ArrayList<TLRPC$TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(this.currentAccount).getStickerSets(getStickerSetType());
        if (!stickerSets.isEmpty()) {
            int i4 = this.rowCount;
            int i5 = i4 + 1;
            this.rowCount = i5;
            this.headerRow = i4;
            this.stickersStartRow = i5;
            this.stickersEndRow = i5 + stickerSets.size();
            this.rowCount += stickerSets.size();
        } else {
            this.headerRow = -1;
            this.stickersStartRow = -1;
            this.stickersEndRow = -1;
        }
        int i6 = this.rowCount;
        this.rowCount = i6 + 1;
        this.infoRow = i6;
        updateSelectedStickerSetIndex();
        if (!z || (listAdapter = this.listAdapter) == null) {
            return;
        }
        listAdapter.notifyDataSetChanged();
    }

    public class SearchAdapter extends RecyclerListView.SelectionAdapter {
        private Runnable lastCallback;
        private String lastQuery;
        private Context mContext;
        private int reqId;
        private List<TLRPC$TL_messages_stickerSet> searchEntries = new ArrayList();
        private List<TLRPC$TL_messages_stickerSet> localSearchEntries = new ArrayList();

        public SearchAdapter(Context context) {
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
                return list.get(i).set.id;
            }
            return -1L;
        }

        private void changeBackgroundColor(String str) {
            if (GroupStickersActivity.this.isEmoji) {
                if (!TextUtils.isEmpty(str)) {
                    GroupStickersActivity.this.listView.setBackgroundColor(GroupStickersActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                } else {
                    GroupStickersActivity.this.listView.setBackground(null);
                }
            }
        }

        @SuppressLint({"NotifyDataSetChanged"})
        public void onSearchStickers(final String str) {
            changeBackgroundColor(str);
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
            TLRPC$TL_messages_searchStickerSets tLRPC$TL_messages_searchStickerSets;
            this.lastQuery = str;
            if (GroupStickersActivity.this.isEmoji) {
                TLRPC$TL_messages_searchEmojiStickerSets tLRPC$TL_messages_searchEmojiStickerSets = new TLRPC$TL_messages_searchEmojiStickerSets();
                tLRPC$TL_messages_searchEmojiStickerSets.q = str;
                tLRPC$TL_messages_searchStickerSets = tLRPC$TL_messages_searchEmojiStickerSets;
            } else {
                TLRPC$TL_messages_searchStickerSets tLRPC$TL_messages_searchStickerSets2 = new TLRPC$TL_messages_searchStickerSets();
                tLRPC$TL_messages_searchStickerSets2.q = str;
                tLRPC$TL_messages_searchStickerSets = tLRPC$TL_messages_searchStickerSets2;
            }
            this.reqId = GroupStickersActivity.this.getConnectionsManager().sendRequest(tLRPC$TL_messages_searchStickerSets, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    GroupStickersActivity.SearchAdapter.this.lambda$onSearchStickers$1(str, str, tLObject, tLRPC$TL_error);
                }
            }, 66);
        }

        public void lambda$onSearchStickers$1(String str, final String str2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            if (Objects.equals(this.lastQuery, str) && (tLObject instanceof TLRPC$TL_messages_foundStickerSets)) {
                final ArrayList arrayList = new ArrayList();
                Iterator<TLRPC$StickerSetCovered> it = ((TLRPC$TL_messages_foundStickerSets) tLObject).sets.iterator();
                while (it.hasNext()) {
                    TLRPC$StickerSetCovered next = it.next();
                    TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = new TLRPC$TL_messages_stickerSet();
                    tLRPC$TL_messages_stickerSet.set = next.set;
                    tLRPC$TL_messages_stickerSet.documents = next.covers;
                    if (!GroupStickersActivity.this.isEmoji || tLRPC$TL_messages_stickerSet.set.emojis) {
                        arrayList.add(tLRPC$TL_messages_stickerSet);
                    }
                }
                String trim = str2.toLowerCase(Locale.ROOT).trim();
                final ArrayList arrayList2 = new ArrayList();
                Iterator<TLRPC$TL_messages_stickerSet> it2 = MediaDataController.getInstance(((BaseFragment) GroupStickersActivity.this).currentAccount).getStickerSets(GroupStickersActivity.this.getStickerSetType()).iterator();
                while (it2.hasNext()) {
                    TLRPC$TL_messages_stickerSet next2 = it2.next();
                    String str3 = next2.set.short_name;
                    Locale locale = Locale.ROOT;
                    if (str3.toLowerCase(locale).contains(trim) || next2.set.title.toLowerCase(locale).contains(trim)) {
                        arrayList2.add(next2);
                    }
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        GroupStickersActivity.SearchAdapter.this.lambda$onSearchStickers$0(arrayList, arrayList2, str2);
                    }
                });
            }
        }

        public void lambda$onSearchStickers$0(List list, List list2, String str) {
            this.searchEntries = list;
            this.localSearchEntries = list2;
            notifyDataSetChanged();
            GroupStickersActivity.this.emptyView.title.setVisibility(8);
            GroupStickersActivity.this.emptyView.subtitle.setText(LocaleController.formatString(R.string.ChooseStickerNoResultsFound, str));
            GroupStickersActivity.this.emptyView.showProgress(false, true);
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            StickerSetCell stickerSetCell;
            if (i == 0) {
                StickerSetCell stickerSetCell2 = new StickerSetCell(this.mContext, 3);
                stickerSetCell2.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                stickerSetCell = stickerSetCell2;
            } else {
                HeaderCell headerCell = new HeaderCell(this.mContext, Theme.key_windowBackgroundWhiteGrayText4, 21, 0, 0, false, GroupStickersActivity.this.getResourceProvider());
                CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(GroupStickersActivity.this.getThemedColor(Theme.key_windowBackgroundGray)), Theme.getThemedDrawableByKey(this.mContext, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                combinedDrawable.setFullsize(true);
                headerCell.setBackground(combinedDrawable);
                headerCell.setText(LocaleController.getString(GroupStickersActivity.this.isEmoji ? R.string.ChooseStickerMyEmojiPacks : R.string.ChooseStickerMyStickerSets));
                stickerSetCell = headerCell;
            }
            stickerSetCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(stickerSetCell);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            long j;
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
            if (GroupStickersActivity.this.selectedStickerSet != null) {
                j = GroupStickersActivity.this.selectedStickerSet.set.id;
            } else {
                GroupStickersActivity groupStickersActivity = GroupStickersActivity.this;
                if (groupStickersActivity.getStickerSet(groupStickersActivity.info) != null) {
                    GroupStickersActivity groupStickersActivity2 = GroupStickersActivity.this;
                    j = groupStickersActivity2.getStickerSet(groupStickersActivity2.info).id;
                } else {
                    j = 0;
                }
            }
            stickerSetCell.setChecked(tLRPC$TL_messages_stickerSet.set.id == j, false);
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
        private final Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public int getItemCount() {
            return GroupStickersActivity.this.rowCount;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            long j;
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 0) {
                StickerSetCell stickerSetCell = (StickerSetCell) viewHolder.itemView;
                if (i != GroupStickersActivity.this.currentEmojiPackRow) {
                    ArrayList<TLRPC$TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(((BaseFragment) GroupStickersActivity.this).currentAccount).getStickerSets(GroupStickersActivity.this.getStickerSetType());
                    int i2 = i - GroupStickersActivity.this.stickersStartRow;
                    TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = stickerSets.get(i2);
                    stickerSetCell.setStickersSet(stickerSets.get(i2), i2 != stickerSets.size() - 1);
                    stickerSetCell.setDeleteAction(null);
                    if (GroupStickersActivity.this.selectedStickerSet != null) {
                        j = GroupStickersActivity.this.selectedStickerSet.set.id;
                    } else {
                        GroupStickersActivity groupStickersActivity = GroupStickersActivity.this;
                        if (groupStickersActivity.getStickerSet(groupStickersActivity.info) != null) {
                            GroupStickersActivity groupStickersActivity2 = GroupStickersActivity.this;
                            j = groupStickersActivity2.getStickerSet(groupStickersActivity2.info).id;
                        } else {
                            j = 0;
                        }
                    }
                    stickerSetCell.setChecked(tLRPC$TL_messages_stickerSet.set.id == j, false);
                    return;
                }
                stickerSetCell.setChecked(false, false);
                stickerSetCell.setStickersSet(GroupStickersActivity.this.selectedStickerSet, false);
                stickerSetCell.setDeleteAction(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        GroupStickersActivity.ListAdapter.this.lambda$onBindViewHolder$0(view);
                    }
                });
            } else if (itemViewType != 1) {
                if (itemViewType != 4) {
                    if (itemViewType != 5) {
                        return;
                    }
                    ((AddEmojiCell) viewHolder.itemView).bind(GroupStickersActivity.this.currentEmojiPackRow > 0, GroupStickersActivity.this.selectedStickerSet);
                } else if (i == GroupStickersActivity.this.addEmojiPackTitleRow) {
                    ((HeaderCell) viewHolder.itemView).setText(LocaleController.getString(R.string.AddEmojiPackHeader));
                } else {
                    ((HeaderCell) viewHolder.itemView).setText(LocaleController.getString(GroupStickersActivity.this.isEmoji ? R.string.ChooseEmojiPackHeader : R.string.ChooseStickerSetHeader));
                }
            } else if (i == GroupStickersActivity.this.infoRow) {
                String string = LocaleController.getString(GroupStickersActivity.this.isEmoji ? R.string.ChooseEmojiPackMy : R.string.ChooseStickerSetMy);
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
                        FileLog.e(e);
                        ((TextInfoPrivacyCell) viewHolder.itemView).setText(string);
                        return;
                    }
                }
                ((TextInfoPrivacyCell) viewHolder.itemView).setText(string);
            } else if (i == GroupStickersActivity.this.addEmojiPackHintRow) {
                ((TextInfoPrivacyCell) viewHolder.itemView).setText(LocaleController.getString(R.string.AddGroupEmojiPackHint));
            }
        }

        public void lambda$onBindViewHolder$0(View view) {
            GroupStickersActivity.this.selectSetAfterSearch(null);
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
                stickerSetCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
            } else if (i == 1) {
                stickerSetCell = new TextInfoPrivacyCell(this.mContext);
                stickerSetCell.setBackground(Theme.getThemedDrawableByKey(this.mContext, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
            } else if (i == 5) {
                GroupStickersActivity.this.addEmojiCell = new AddEmojiCell(this.mContext);
                stickerSetCell = GroupStickersActivity.this.addEmojiCell;
            } else {
                stickerSetCell = new HeaderCell(this.mContext);
                stickerSetCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
            }
            stickerSetCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(stickerSetCell);
        }

        @Override
        public int getItemViewType(int i) {
            if ((i < GroupStickersActivity.this.stickersStartRow || i >= GroupStickersActivity.this.stickersEndRow) && i != GroupStickersActivity.this.currentEmojiPackRow) {
                if (i == GroupStickersActivity.this.headerRow || i == GroupStickersActivity.this.addEmojiPackTitleRow) {
                    return 4;
                }
                if (i == GroupStickersActivity.this.infoRow || i == GroupStickersActivity.this.addEmojiPackHintRow) {
                    return 1;
                }
                return i == GroupStickersActivity.this.addEmojiPackRow ? 5 : 0;
            }
            return 0;
        }
    }

    public void updateCurrentPackVisibility(TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet, boolean z) {
        if (this.isEmoji) {
            if (tLRPC$TL_messages_stickerSet != null) {
                boolean z2 = this.currentEmojiPackRow == -1;
                this.selectedStickerSet = tLRPC$TL_messages_stickerSet;
                updateRows(false);
                if (z2) {
                    this.listAdapter.notifyItemInserted(this.currentEmojiPackRow);
                } else {
                    this.listAdapter.notifyItemChanged(this.currentEmojiPackRow);
                }
                if (z) {
                    this.listAdapter.notifyItemChanged(this.addEmojiPackRow);
                }
                this.addEmojiCell.setNeedDivider(true);
                return;
            }
            int i = this.currentEmojiPackRow;
            boolean z3 = i > 0;
            this.selectedStickerSet = null;
            if (z3) {
                this.listAdapter.notifyItemRemoved(i);
                if (z) {
                    this.listAdapter.notifyItemChanged(this.addEmojiPackRow);
                }
            }
            updateRows(false);
            this.addEmojiCell.setNeedDivider(false);
        }
    }

    public void selectSetAfterSearch(TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet) {
        boolean z;
        int i = this.selectedStickerSetIndex;
        boolean z2 = false;
        if (tLRPC$TL_messages_stickerSet == null) {
            if (this.selectedStickerSet != null) {
                BulletinFactory.of(this).createSimpleBulletin(R.raw.done, LocaleController.getString(R.string.GroupsEmojiPackUpdated)).show();
            }
            this.selectedStickerSet = null;
            this.removeStickerSet = true;
        } else {
            this.selectedStickerSet = tLRPC$TL_messages_stickerSet;
            this.removeStickerSet = false;
            BulletinFactory.of(this).createSimpleBulletin(R.raw.done, LocaleController.getString(R.string.GroupsEmojiPackUpdated)).show();
        }
        updateSelectedStickerSetIndex();
        updateCurrentPackVisibility(this.selectedStickerSet, false);
        if (i != -1) {
            if (!this.searching) {
                for (int i2 = 0; i2 < this.listView.getChildCount(); i2++) {
                    View childAt = this.listView.getChildAt(i2);
                    if (this.listView.getChildViewHolder(childAt).getAdapterPosition() == this.stickersStartRow + i) {
                        ((StickerSetCell) childAt).setChecked(false, true);
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (!z) {
                this.listAdapter.notifyItemChanged(this.stickersStartRow + i);
            }
        }
        if (this.selectedStickerSetIndex != -1) {
            if (!this.searching) {
                int i3 = 0;
                while (true) {
                    if (i3 >= this.listView.getChildCount()) {
                        break;
                    }
                    View childAt2 = this.listView.getChildAt(i3);
                    if (this.listView.getChildViewHolder(childAt2).getAdapterPosition() == this.stickersStartRow + this.selectedStickerSetIndex) {
                        ((StickerSetCell) childAt2).setChecked(true, true);
                        z2 = true;
                        break;
                    }
                    i3++;
                }
            }
            if (z2) {
                return;
            }
            this.listAdapter.notifyItemChanged(this.stickersStartRow + this.selectedStickerSetIndex);
        }
    }

    public class AddEmojiCell extends LinearLayout {
        private final EditTextCaption editText;
        private Runnable lastCallback;
        private String lastQuery;
        private boolean needDivider;
        private int reqId;
        private final TextWatcher textWatcher;

        public class AnonymousClass1 implements TextWatcher {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            AnonymousClass1() {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                final String trim = editable.toString().trim();
                if (AddEmojiCell.this.reqId != 0) {
                    GroupStickersActivity.this.getConnectionsManager().cancelRequest(AddEmojiCell.this.reqId, true);
                    AddEmojiCell.this.reqId = 0;
                }
                if (AddEmojiCell.this.lastCallback != null) {
                    AndroidUtilities.cancelRunOnUIThread(AddEmojiCell.this.lastCallback);
                }
                AddEmojiCell.this.lastQuery = null;
                if (trim.isEmpty()) {
                    GroupStickersActivity.this.selectSetAfterSearch(null);
                    return;
                }
                AndroidUtilities.runOnUIThread(AddEmojiCell.this.lastCallback = new Runnable() {
                    @Override
                    public final void run() {
                        GroupStickersActivity.AddEmojiCell.AnonymousClass1.this.lambda$afterTextChanged$2(trim);
                    }
                }, 300L);
            }

            public void lambda$afterTextChanged$2(final String str) {
                AddEmojiCell.this.lastQuery = str;
                TLRPC$TL_messages_getStickerSet tLRPC$TL_messages_getStickerSet = new TLRPC$TL_messages_getStickerSet();
                TLRPC$TL_inputStickerSetShortName tLRPC$TL_inputStickerSetShortName = new TLRPC$TL_inputStickerSetShortName();
                tLRPC$TL_messages_getStickerSet.stickerset = tLRPC$TL_inputStickerSetShortName;
                tLRPC$TL_inputStickerSetShortName.short_name = str;
                AddEmojiCell addEmojiCell = AddEmojiCell.this;
                addEmojiCell.reqId = GroupStickersActivity.this.getConnectionsManager().sendRequest(tLRPC$TL_messages_getStickerSet, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        GroupStickersActivity.AddEmojiCell.AnonymousClass1.this.lambda$afterTextChanged$1(str, tLObject, tLRPC$TL_error);
                    }
                }, 66);
            }

            public void lambda$afterTextChanged$1(String str, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                if (Objects.equals(AddEmojiCell.this.lastQuery, str)) {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            GroupStickersActivity.AddEmojiCell.AnonymousClass1.this.lambda$afterTextChanged$0(tLObject);
                        }
                    });
                }
            }

            public void lambda$afterTextChanged$0(TLObject tLObject) {
                if (tLObject != null) {
                    GroupStickersActivity.this.selectSetAfterSearch((TLRPC$TL_messages_stickerSet) tLObject);
                } else {
                    GroupStickersActivity.this.selectSetAfterSearch(null);
                }
            }
        }

        public AddEmojiCell(Context context) {
            super(context);
            this.textWatcher = new AnonymousClass1();
            TextView textView = new TextView(context);
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack));
            textView.setText("t.me/addemoji/");
            EditTextCaption editTextCaption = new EditTextCaption(context, null);
            this.editText = editTextCaption;
            editTextCaption.setLines(1);
            editTextCaption.setSingleLine(true);
            editTextCaption.setInputType(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM);
            editTextCaption.setTextSize(1, 16.0f);
            editTextCaption.setTextColor(Theme.getColor(Theme.key_chat_messagePanelText));
            editTextCaption.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkOut));
            editTextCaption.setHighlightColor(Theme.getColor(Theme.key_chat_inTextSelectionHighlight));
            int i = Theme.key_chat_messagePanelHint;
            editTextCaption.setHintColor(Theme.getColor(i));
            editTextCaption.setHintTextColor(Theme.getColor(i));
            editTextCaption.setCursorColor(Theme.getColor(Theme.key_chat_messagePanelCursor));
            editTextCaption.setHandlesColor(Theme.getColor(Theme.key_chat_TextSelectionCursor));
            editTextCaption.setBackground(null);
            editTextCaption.setHint(LocaleController.getString(R.string.AddEmojiPackLinkHint));
            addView(textView, LayoutHelper.createLinear(-2, -2, 16, 20, 0, 0, 0));
            addView(editTextCaption, LayoutHelper.createLinear(-1, -2, 16, -4, 0, 0, 0));
            setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
            setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f));
            setWillNotDraw(false);
        }

        public void setNeedDivider(boolean z) {
            this.needDivider = z;
            invalidate();
        }

        public void bind(boolean z, TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet) {
            this.needDivider = z;
            this.editText.removeTextChangedListener(this.textWatcher);
            if (tLRPC$TL_messages_stickerSet == null) {
                this.editText.setText("");
            } else {
                String str = tLRPC$TL_messages_stickerSet.set.short_name;
                this.editText.setText(str);
                this.editText.setSelection(str.length());
            }
            this.editText.addTextChangedListener(this.textWatcher);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.needDivider) {
                canvas.drawLine(AndroidUtilities.dp(20.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, Theme.dividerPaint);
            }
        }
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{StickerSetCell.class, TextSettingsCell.class}, null, null, null, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, Theme.key_windowBackgroundGray));
        ActionBar actionBar = this.actionBar;
        int i = ThemeDescription.FLAG_BACKGROUND;
        int i2 = Theme.key_actionBarDefault;
        arrayList.add(new ThemeDescription(actionBar, i, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        int i3 = Theme.key_windowBackgroundGrayShadow;
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{TextInfoPrivacyCell.class}, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayText4));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LINKCOLOR, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteLinkText));
        int i4 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteValueText));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{ShadowSectionCell.class}, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{StickerSetCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{StickerSetCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayText2));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_USEBACKGROUNDDRAWABLE | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, new Class[]{StickerSetCell.class}, new String[]{"optionsButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_stickers_menuSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{StickerSetCell.class}, new String[]{"optionsButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_stickers_menu));
        return arrayList;
    }
}
