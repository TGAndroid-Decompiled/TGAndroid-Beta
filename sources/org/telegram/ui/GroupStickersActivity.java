package org.telegram.ui;

import android.content.Context;
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
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
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
    private TLRPC.ChatFull info;
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
    private TLRPC.TL_messages_stickerSet selectedStickerSet;
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
        ActionBarMenuItem actionBarMenuItemAddItem = this.actionBar.createMenu().addItem(0, R.drawable.outline_header_search);
        this.searchItem = actionBarMenuItemAddItem;
        actionBarMenuItemAddItem.setIsSearchField(true).setActionBarMenuItemSearchListener(new ActionBarMenuItem.ActionBarMenuItemSearchListener() {
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
                String string = editText.getText().toString();
                GroupStickersActivity.this.searchAdapter.onSearchStickers(string);
                boolean z = !TextUtils.isEmpty(string);
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
        frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
        this.listView = new RecyclerListView(context);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setDurations(200L);
        defaultItemAnimator.setSupportsChangeAnimations(true);
        this.listView.setItemAnimator(defaultItemAnimator);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        this.layoutManager = linearLayoutManager;
        linearLayoutManager.setOrientation(1);
        this.listView.setLayoutManager(this.layoutManager);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.emptyFrameView = frameLayout2;
        frameLayout2.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
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
        frameLayout.addView(this.emptyFrameView);
        this.emptyFrameView.setVisibility(8);
        this.listView.setEmptyView(this.emptyFrameView);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.listView.setAdapter(this.listAdapter);
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i) {
                GroupStickersActivity.$r8$lambda$MmkaKFZ2sdDrs4ISPg6phql4hvU(this.f$0, view, i);
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

    public static void $r8$lambda$MmkaKFZ2sdDrs4ISPg6phql4hvU(GroupStickersActivity groupStickersActivity, View view, int i) {
        if (groupStickersActivity.getParentActivity() == null) {
            return;
        }
        if (!groupStickersActivity.searching) {
            if (i >= groupStickersActivity.stickersStartRow && i < groupStickersActivity.stickersEndRow) {
                groupStickersActivity.onStickerSetClicked(((StickerSetCell) view).isChecked(), MediaDataController.getInstance(groupStickersActivity.currentAccount).getStickerSets(groupStickersActivity.getStickerSetType()).get(i - groupStickersActivity.stickersStartRow), false);
            }
            if (i == groupStickersActivity.currentEmojiPackRow) {
                groupStickersActivity.onStickerSetClicked(true, groupStickersActivity.selectedStickerSet, false);
                return;
            }
            return;
        }
        if (i > groupStickersActivity.searchAdapter.searchEntries.size()) {
            groupStickersActivity.onStickerSetClicked(((StickerSetCell) view).isChecked(), (TLRPC.TL_messages_stickerSet) groupStickersActivity.searchAdapter.localSearchEntries.get((i - groupStickersActivity.searchAdapter.searchEntries.size()) - 1), false);
        } else if (i != groupStickersActivity.searchAdapter.searchEntries.size()) {
            groupStickersActivity.onStickerSetClicked(((StickerSetCell) view).isChecked(), (TLRPC.TL_messages_stickerSet) groupStickersActivity.searchAdapter.searchEntries.get(i), true);
        }
    }

    private void onStickerSetClicked(boolean z, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z2) {
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName;
        if (z2) {
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName2.short_name = tL_messages_stickerSet.set.short_name;
            tL_inputStickerSetShortName = tL_inputStickerSetShortName2;
        } else {
            tL_inputStickerSetShortName = null;
        }
        StickersAlert stickersAlert = new StickersAlert(getParentActivity(), this, tL_inputStickerSetShortName, !z2 ? tL_messages_stickerSet : null, null, false);
        stickersAlert.setCustomButtonDelegate(new AnonymousClass4(z, tL_messages_stickerSet));
        AndroidUtilities.hideKeyboard(getParentActivity().getCurrentFocus());
        stickersAlert.show();
    }

    class AnonymousClass4 implements StickersAlert.StickersAlertCustomButtonDelegate {
        final boolean val$isSelected;
        final TLRPC.TL_messages_stickerSet val$stickerSet;

        AnonymousClass4(boolean z, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
            this.val$isSelected = z;
            this.val$stickerSet = tL_messages_stickerSet;
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
            int iFindFirstVisibleItemPosition = GroupStickersActivity.this.layoutManager.findFirstVisibleItemPosition();
            RecyclerListView.Holder holder = (RecyclerListView.Holder) GroupStickersActivity.this.listView.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition);
            int top = holder != null ? holder.itemView.getTop() : Integer.MAX_VALUE;
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
                        BulletinFactory.of(GroupStickersActivity.this).createSimpleBulletin(R.raw.done, LocaleController.getString(R.string.GroupsEmojiPackUpdated)).show();
                    }
                }, 350L);
            }
            GroupStickersActivity.this.updateSelectedStickerSetIndex();
            GroupStickersActivity groupStickersActivity = GroupStickersActivity.this;
            groupStickersActivity.updateCurrentPackVisibility(groupStickersActivity.selectedStickerSet, true);
            if (i != -1) {
                if (!GroupStickersActivity.this.searching) {
                    int i2 = 0;
                    while (true) {
                        if (i2 < GroupStickersActivity.this.listView.getChildCount()) {
                            View childAt = GroupStickersActivity.this.listView.getChildAt(i2);
                            if (GroupStickersActivity.this.listView.getChildViewHolder(childAt).getAdapterPosition() == GroupStickersActivity.this.stickersStartRow + i) {
                                ((StickerSetCell) childAt).setChecked(false, true);
                                break;
                            }
                            i2++;
                        } else {
                            GroupStickersActivity.this.listAdapter.notifyItemChanged(i);
                            break;
                        }
                    }
                } else {
                    GroupStickersActivity.this.listAdapter.notifyItemChanged(i);
                    break;
                }
            }
            if (GroupStickersActivity.this.selectedStickerSetIndex != -1) {
                if (!GroupStickersActivity.this.searching) {
                    int i3 = 0;
                    while (true) {
                        if (i3 < GroupStickersActivity.this.listView.getChildCount()) {
                            View childAt2 = GroupStickersActivity.this.listView.getChildAt(i3);
                            if (GroupStickersActivity.this.listView.getChildViewHolder(childAt2).getAdapterPosition() == GroupStickersActivity.this.stickersStartRow + GroupStickersActivity.this.selectedStickerSetIndex) {
                                ((StickerSetCell) childAt2).setChecked(true, true);
                                break;
                            }
                            i3++;
                        } else {
                            GroupStickersActivity.this.listAdapter.notifyItemChanged(GroupStickersActivity.this.selectedStickerSetIndex);
                            break;
                        }
                    }
                } else {
                    GroupStickersActivity.this.listAdapter.notifyItemChanged(GroupStickersActivity.this.selectedStickerSetIndex);
                    break;
                }
            }
            if (top != Integer.MAX_VALUE && !GroupStickersActivity.this.isEmoji) {
                GroupStickersActivity.this.layoutManager.scrollToPositionWithOffset(iFindFirstVisibleItemPosition + 1, top);
            }
            if (GroupStickersActivity.this.searching) {
                GroupStickersActivity.this.searchItem.setSearchFieldText("", false);
                ((BaseFragment) GroupStickersActivity.this).actionBar.closeSearchField(true);
            }
            return true;
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.stickersDidLoad) {
            if (((Integer) objArr[0]).intValue() == getStickerSetType()) {
                updateRows();
                return;
            }
            return;
        }
        if (i == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.chatId) {
                if (this.info == null && getStickerSet(chatFull) != null) {
                    this.selectedStickerSet = MediaDataController.getInstance(this.currentAccount).getGroupStickerSetById(getStickerSet(chatFull));
                }
                this.info = chatFull;
                updateRows();
                return;
            }
            return;
        }
        if (i == NotificationCenter.groupStickersDidLoad) {
            long jLongValue = ((Long) objArr[0]).longValue();
            if (getStickerSet(this.info) == null || getStickerSet(this.info).id != jLongValue) {
                return;
            }
            updateRows();
        }
    }

    public TLRPC.StickerSet getStickerSet(TLRPC.ChatFull chatFull) {
        if (chatFull == null) {
            return null;
        }
        if (this.isEmoji) {
            return chatFull.emojiset;
        }
        return chatFull.stickerset;
    }

    public void setInfo(TLRPC.ChatFull chatFull) {
        this.info = chatFull;
        if (getStickerSet(chatFull) != null) {
            this.selectedStickerSet = MediaDataController.getInstance(this.currentAccount).getGroupStickerSetById(getStickerSet(this.info));
        }
    }

    private void setStickerSet(TLRPC.StickerSet stickerSet) {
        if (this.isEmoji) {
            this.info.emojiset = stickerSet;
        } else {
            this.info.stickerset = stickerSet;
        }
    }

    private void saveStickerSet() {
        TLObject tLObject;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.ChatFull chatFull = this.info;
        if (chatFull != null) {
            if (getStickerSet(chatFull) == null || (tL_messages_stickerSet = this.selectedStickerSet) == null || tL_messages_stickerSet.set.id != getStickerSet(this.info).id) {
                if (getStickerSet(this.info) == null && this.selectedStickerSet == null) {
                    return;
                }
                if (this.isEmoji) {
                    TLRPC.TL_channels_setEmojiStickers tL_channels_setEmojiStickers = new TLRPC.TL_channels_setEmojiStickers();
                    tL_channels_setEmojiStickers.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(this.chatId);
                    if (this.removeStickerSet) {
                        tL_channels_setEmojiStickers.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                        tLObject = tL_channels_setEmojiStickers;
                    } else {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_channels_setEmojiStickers.stickerset = tL_inputStickerSetID;
                        TLRPC.StickerSet stickerSet = this.selectedStickerSet.set;
                        tL_inputStickerSetID.id = stickerSet.id;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        tLObject = tL_channels_setEmojiStickers;
                    }
                } else {
                    TLRPC.TL_channels_setStickers tL_channels_setStickers = new TLRPC.TL_channels_setStickers();
                    tL_channels_setStickers.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(this.chatId);
                    if (this.removeStickerSet) {
                        tL_channels_setStickers.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                        tLObject = tL_channels_setStickers;
                    } else {
                        MessagesController.getEmojiSettings(this.currentAccount).edit().remove("group_hide_stickers_" + this.info.id).apply();
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        tL_channels_setStickers.stickerset = tL_inputStickerSetID2;
                        TLRPC.StickerSet stickerSet2 = this.selectedStickerSet.set;
                        tL_inputStickerSetID2.id = stickerSet2.id;
                        tL_inputStickerSetID2.access_hash = stickerSet2.access_hash;
                        tLObject = tL_channels_setStickers;
                    }
                }
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLObject, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                        GroupStickersActivity.$r8$lambda$2fw_XdZNX7uEep1Bk1wVf2mXBSU(this.f$0, tLObject2, tL_error);
                    }
                });
            }
        }
    }

    public static void $r8$lambda$2fw_XdZNX7uEep1Bk1wVf2mXBSU(final GroupStickersActivity groupStickersActivity, TLObject tLObject, final TLRPC.TL_error tL_error) {
        groupStickersActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                GroupStickersActivity.m3318$r8$lambda$dA7c7Oi6RZ6l4chYed3Wx_q760(this.f$0, tL_error);
            }
        });
    }

    public static void m3318$r8$lambda$dA7c7Oi6RZ6l4chYed3Wx_q760(GroupStickersActivity groupStickersActivity, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = groupStickersActivity.selectedStickerSet;
            if (tL_messages_stickerSet == null) {
                groupStickersActivity.setStickerSet(null);
            } else {
                groupStickersActivity.setStickerSet(tL_messages_stickerSet.set);
                MediaDataController.getInstance(groupStickersActivity.currentAccount).putGroupStickerSet(groupStickersActivity.selectedStickerSet);
            }
            groupStickersActivity.updateSelectedStickerSetIndex();
            if (groupStickersActivity.isEmoji) {
                TLRPC.ChatFull chatFull = groupStickersActivity.info;
                if (chatFull.emojiset != null) {
                    chatFull.flags2 |= 1024;
                } else {
                    chatFull.flags2 &= -1025;
                }
            } else {
                TLRPC.ChatFull chatFull2 = groupStickersActivity.info;
                if (chatFull2.stickerset == null) {
                    chatFull2.flags |= 256;
                } else {
                    chatFull2.flags &= -257;
                }
            }
            MessagesStorage.getInstance(groupStickersActivity.currentAccount).updateChatInfo(groupStickersActivity.info, false);
            NotificationCenter.getInstance(groupStickersActivity.currentAccount).postNotificationName(NotificationCenter.chatInfoDidLoad, groupStickersActivity.info, 0, Boolean.TRUE, Boolean.FALSE);
            NotificationCenter.getInstance(groupStickersActivity.currentAccount).postNotificationName(NotificationCenter.groupPackUpdated, Long.valueOf(groupStickersActivity.info.id), Boolean.valueOf(groupStickersActivity.isEmoji));
            groupStickersActivity.finishFragment();
            return;
        }
        if (groupStickersActivity.getParentActivity() != null) {
            Toast.makeText(groupStickersActivity.getParentActivity(), LocaleController.getString(R.string.ErrorOccurred) + "\n" + tL_error.text, 0).show();
        }
    }

    public int getStickerSetType() {
        return this.isEmoji ? 5 : 0;
    }

    public void updateSelectedStickerSetIndex() {
        long j;
        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(this.currentAccount).getStickerSets(getStickerSetType());
        this.selectedStickerSetIndex = -1;
        if (this.removeStickerSet) {
            j = 0;
        } else {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.selectedStickerSet;
            if (tL_messages_stickerSet != null) {
                j = tL_messages_stickerSet.set.id;
            } else if (getStickerSet(this.info) != null) {
                j = getStickerSet(this.info).id;
            } else {
                j = 0;
            }
        }
        if (j != 0) {
            for (int i = 0; i < stickerSets.size(); i++) {
                if (stickerSets.get(i).set.id == j) {
                    this.selectedStickerSetIndex = i;
                    return;
                }
            }
        }
    }

    private void updateRows() {
        updateRows(true);
    }

    private void updateRows(boolean z) {
        ListAdapter listAdapter;
        this.addEmojiPackTitleRow = -1;
        this.addEmojiPackRow = -1;
        this.currentEmojiPackRow = -1;
        this.addEmojiPackHintRow = -1;
        this.rowCount = 0;
        if (this.isEmoji) {
            this.addEmojiPackTitleRow = 0;
            this.rowCount = 2;
            this.addEmojiPackRow = 1;
            if (this.selectedStickerSet != null) {
                this.rowCount = 3;
                this.currentEmojiPackRow = 2;
            }
            int i = this.rowCount;
            this.rowCount = i + 1;
            this.addEmojiPackHintRow = i;
        }
        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(this.currentAccount).getStickerSets(getStickerSetType());
        if (!stickerSets.isEmpty()) {
            int i2 = this.rowCount;
            int i3 = i2 + 1;
            this.rowCount = i3;
            this.headerRow = i2;
            this.stickersStartRow = i3;
            this.stickersEndRow = i3 + stickerSets.size();
            this.rowCount += stickerSets.size();
        } else {
            this.headerRow = -1;
            this.stickersStartRow = -1;
            this.stickersEndRow = -1;
        }
        int i4 = this.rowCount;
        this.rowCount = i4 + 1;
        this.infoRow = i4;
        updateSelectedStickerSetIndex();
        if (!z || (listAdapter = this.listAdapter) == null) {
            return;
        }
        listAdapter.notifyDataSetChanged();
    }

    class SearchAdapter extends RecyclerListView.SelectionAdapter {
        private Runnable lastCallback;
        private String lastQuery;
        private Context mContext;
        private int reqId;
        private List searchEntries = new ArrayList();
        private List localSearchEntries = new ArrayList();

        public SearchAdapter(Context context) {
            this.mContext = context;
            setHasStableIds(true);
        }

        @Override
        public long getItemId(int i) {
            if (getItemViewType(i) != 0) {
                return -1L;
            }
            List list = i > this.searchEntries.size() ? this.localSearchEntries : this.searchEntries;
            if (i > this.searchEntries.size()) {
                i = (i - this.searchEntries.size()) - 1;
            }
            return ((TLRPC.TL_messages_stickerSet) list.get(i)).set.id;
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
                    GroupStickersActivity.SearchAdapter.m3321$r8$lambda$cRNFcbOsDPM2Vcgk3y1oxA9NdM(this.f$0, str);
                }
            };
            this.lastCallback = runnable2;
            AndroidUtilities.runOnUIThread(runnable2, 300L);
        }

        public static void m3321$r8$lambda$cRNFcbOsDPM2Vcgk3y1oxA9NdM(final SearchAdapter searchAdapter, final String str) {
            TLObject tLObject;
            searchAdapter.lastQuery = str;
            if (GroupStickersActivity.this.isEmoji) {
                TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                tL_messages_searchEmojiStickerSets.q = str;
                tLObject = tL_messages_searchEmojiStickerSets;
            } else {
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = new TLRPC.TL_messages_searchStickerSets();
                tL_messages_searchStickerSets.q = str;
                tLObject = tL_messages_searchStickerSets;
            }
            searchAdapter.reqId = GroupStickersActivity.this.getConnectionsManager().sendRequest(tLObject, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                    GroupStickersActivity.SearchAdapter.$r8$lambda$dMnLHfmZ_pGkja8vanYPSyommPs(this.f$0, str, str, tLObject2, tL_error);
                }
            }, 66);
        }

        public static void $r8$lambda$dMnLHfmZ_pGkja8vanYPSyommPs(final SearchAdapter searchAdapter, String str, final String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
            if (Objects.equals(searchAdapter.lastQuery, str) && (tLObject instanceof TLRPC.TL_messages_foundStickerSets)) {
                final ArrayList arrayList = new ArrayList();
                ArrayList<TLRPC.StickerSetCovered> arrayList2 = ((TLRPC.TL_messages_foundStickerSets) tLObject).sets;
                int size = arrayList2.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    TLRPC.StickerSetCovered stickerSetCovered = arrayList2.get(i2);
                    i2++;
                    TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = new TLRPC.TL_messages_stickerSet();
                    tL_messages_stickerSet.set = stickerSetCovered2.set;
                    tL_messages_stickerSet.documents = stickerSetCovered2.covers;
                    if (!GroupStickersActivity.this.isEmoji || tL_messages_stickerSet.set.emojis) {
                        arrayList.add(tL_messages_stickerSet);
                    }
                }
                String strTrim = str2.toLowerCase(Locale.ROOT).trim();
                final ArrayList arrayList3 = new ArrayList();
                ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(((BaseFragment) GroupStickersActivity.this).currentAccount).getStickerSets(GroupStickersActivity.this.getStickerSetType());
                int size2 = stickerSets.size();
                while (i < size2) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets.get(i);
                    i++;
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = tL_messages_stickerSet2;
                    String str3 = tL_messages_stickerSet3.set.short_name;
                    Locale locale = Locale.ROOT;
                    if (str3.toLowerCase(locale).contains(strTrim) || tL_messages_stickerSet3.set.title.toLowerCase(locale).contains(strTrim)) {
                        arrayList3.add(tL_messages_stickerSet3);
                    }
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        GroupStickersActivity.SearchAdapter.$r8$lambda$NR5KaRrWmTGMlyvJ1LfG49AzhJg(this.f$0, arrayList, arrayList3, str2);
                    }
                });
            }
        }

        public static void $r8$lambda$NR5KaRrWmTGMlyvJ1LfG49AzhJg(SearchAdapter searchAdapter, List list, List list2, String str) {
            searchAdapter.searchEntries = list;
            searchAdapter.localSearchEntries = list2;
            searchAdapter.notifyDataSetChanged();
            GroupStickersActivity.this.emptyView.title.setVisibility(8);
            GroupStickersActivity.this.emptyView.subtitle.setText(LocaleController.formatString(R.string.ChooseStickerNoResultsFound, str));
            GroupStickersActivity.this.emptyView.showProgress(false, true);
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            if (i == 0) {
                StickerSetCell stickerSetCell = new StickerSetCell(this.mContext, 3);
                stickerSetCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                view = stickerSetCell;
            } else {
                HeaderCell headerCell = new HeaderCell(this.mContext, Theme.key_windowBackgroundWhiteGrayText4, 21, 0, 0, false, GroupStickersActivity.this.getResourceProvider());
                CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(GroupStickersActivity.this.getThemedColor(Theme.key_windowBackgroundGray)), Theme.getThemedDrawableByKey(this.mContext, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                combinedDrawable.setFullsize(true);
                headerCell.setBackground(combinedDrawable);
                headerCell.setText(LocaleController.getString(GroupStickersActivity.this.isEmoji ? R.string.ChooseStickerMyEmojiPacks : R.string.ChooseStickerMyStickerSets));
                view = headerCell;
            }
            view.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(view);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            long j;
            if (getItemViewType(i) != 0) {
                return;
            }
            boolean z = i > this.searchEntries.size();
            List list = z ? this.localSearchEntries : this.searchEntries;
            if (z) {
                i = (i - this.searchEntries.size()) - 1;
            }
            StickerSetCell stickerSetCell = (StickerSetCell) viewHolder.itemView;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) list.get(i);
            stickerSetCell.setStickersSet(tL_messages_stickerSet, i != list.size() - 1, !z);
            String str = this.lastQuery;
            stickerSetCell.setSearchQuery(tL_messages_stickerSet, str != null ? str.toLowerCase(Locale.ROOT) : "", GroupStickersActivity.this.getResourceProvider());
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
            stickerSetCell.setChecked(tL_messages_stickerSet.set.id == j, false);
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

    class ListAdapter extends RecyclerListView.SelectionAdapter {
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
                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(((BaseFragment) GroupStickersActivity.this).currentAccount).getStickerSets(GroupStickersActivity.this.getStickerSetType());
                    int i2 = i - GroupStickersActivity.this.stickersStartRow;
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i2);
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
                    stickerSetCell.setChecked(tL_messages_stickerSet.set.id == j, false);
                    return;
                }
                stickerSetCell.setChecked(false, false);
                stickerSetCell.setStickersSet(GroupStickersActivity.this.selectedStickerSet, false);
                stickerSetCell.setDeleteAction(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        GroupStickersActivity.this.selectSetAfterSearch(null);
                    }
                });
                return;
            }
            if (itemViewType != 1) {
                if (itemViewType != 4) {
                    if (itemViewType != 5) {
                        return;
                    }
                    ((AddEmojiCell) viewHolder.itemView).bind(GroupStickersActivity.this.currentEmojiPackRow > 0, GroupStickersActivity.this.selectedStickerSet);
                    return;
                } else if (i == GroupStickersActivity.this.addEmojiPackTitleRow) {
                    ((HeaderCell) viewHolder.itemView).setText(LocaleController.getString(R.string.AddEmojiPackHeader));
                    return;
                } else {
                    ((HeaderCell) viewHolder.itemView).setText(LocaleController.getString(GroupStickersActivity.this.isEmoji ? R.string.ChooseEmojiPackHeader : R.string.ChooseStickerSetHeader));
                    return;
                }
            }
            if (i == GroupStickersActivity.this.infoRow) {
                String string = LocaleController.getString(GroupStickersActivity.this.isEmoji ? R.string.ChooseEmojiPackMy : R.string.ChooseStickerSetMy);
                String str = "@stickers";
                int iIndexOf = string.indexOf("@stickers");
                if (iIndexOf != -1) {
                    try {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                        spannableStringBuilder.setSpan(new URLSpanNoUnderline(str) {
                            @Override
                            public void onClick(View view) {
                                MessagesController.getInstance(((BaseFragment) GroupStickersActivity.this).currentAccount).openByUserName("stickers", GroupStickersActivity.this, 1);
                            }
                        }, iIndexOf, iIndexOf + 9, 18);
                        ((TextInfoPrivacyCell) viewHolder.itemView).setText(spannableStringBuilder);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        ((TextInfoPrivacyCell) viewHolder.itemView).setText(string);
                        return;
                    }
                }
                ((TextInfoPrivacyCell) viewHolder.itemView).setText(string);
                return;
            }
            if (i == GroupStickersActivity.this.addEmojiPackHintRow) {
                ((TextInfoPrivacyCell) viewHolder.itemView).setText(LocaleController.getString(R.string.AddGroupEmojiPackHint));
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
                stickerSetCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
            } else if (i == 1) {
                stickerSetCell = new TextInfoPrivacyCell(this.mContext);
                stickerSetCell.setBackground(Theme.getThemedDrawableByKey(this.mContext, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
            } else if (i == 5) {
                GroupStickersActivity.this.addEmojiCell = GroupStickersActivity.this.new AddEmojiCell(this.mContext);
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
            if ((i >= GroupStickersActivity.this.stickersStartRow && i < GroupStickersActivity.this.stickersEndRow) || i == GroupStickersActivity.this.currentEmojiPackRow) {
                return 0;
            }
            if (i == GroupStickersActivity.this.headerRow || i == GroupStickersActivity.this.addEmojiPackTitleRow) {
                return 4;
            }
            if (i == GroupStickersActivity.this.infoRow || i == GroupStickersActivity.this.addEmojiPackHintRow) {
                return 1;
            }
            return i == GroupStickersActivity.this.addEmojiPackRow ? 5 : 0;
        }
    }

    public void updateCurrentPackVisibility(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z) {
        if (this.isEmoji) {
            if (tL_messages_stickerSet != null) {
                boolean z2 = this.currentEmojiPackRow == -1;
                this.selectedStickerSet = tL_messages_stickerSet;
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

    public void selectSetAfterSearch(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i = this.selectedStickerSetIndex;
        if (tL_messages_stickerSet == null) {
            if (this.selectedStickerSet != null) {
                BulletinFactory.of(this).createSimpleBulletin(R.raw.done, LocaleController.getString(R.string.GroupsEmojiPackUpdated)).show();
            }
            this.selectedStickerSet = null;
            this.removeStickerSet = true;
        } else {
            this.selectedStickerSet = tL_messages_stickerSet;
            this.removeStickerSet = false;
            BulletinFactory.of(this).createSimpleBulletin(R.raw.done, LocaleController.getString(R.string.GroupsEmojiPackUpdated)).show();
        }
        updateSelectedStickerSetIndex();
        updateCurrentPackVisibility(this.selectedStickerSet, false);
        if (i != -1) {
            if (this.searching) {
                this.listAdapter.notifyItemChanged(this.stickersStartRow + i);
                break;
            }
            int i2 = 0;
            while (true) {
                if (i2 < this.listView.getChildCount()) {
                    View childAt = this.listView.getChildAt(i2);
                    if (this.listView.getChildViewHolder(childAt).getAdapterPosition() == this.stickersStartRow + i) {
                        ((StickerSetCell) childAt).setChecked(false, true);
                        break;
                    }
                    i2++;
                } else {
                    this.listAdapter.notifyItemChanged(this.stickersStartRow + i);
                    break;
                }
            }
        }
        if (this.selectedStickerSetIndex != -1) {
            if (!this.searching) {
                for (int i3 = 0; i3 < this.listView.getChildCount(); i3++) {
                    View childAt2 = this.listView.getChildAt(i3);
                    if (this.listView.getChildViewHolder(childAt2).getAdapterPosition() == this.stickersStartRow + this.selectedStickerSetIndex) {
                        ((StickerSetCell) childAt2).setChecked(true, true);
                        return;
                    }
                }
            }
            this.listAdapter.notifyItemChanged(this.stickersStartRow + this.selectedStickerSetIndex);
        }
    }

    class AddEmojiCell extends LinearLayout {
        private final EditTextCaption editText;
        private Runnable lastCallback;
        private String lastQuery;
        private boolean needDivider;
        private int reqId;
        private final TextWatcher textWatcher;

        class AnonymousClass1 implements TextWatcher {
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
                final String strTrim = editable.toString().trim();
                if (AddEmojiCell.this.reqId != 0) {
                    GroupStickersActivity.this.getConnectionsManager().cancelRequest(AddEmojiCell.this.reqId, true);
                    AddEmojiCell.this.reqId = 0;
                }
                if (AddEmojiCell.this.lastCallback != null) {
                    AndroidUtilities.cancelRunOnUIThread(AddEmojiCell.this.lastCallback);
                }
                AddEmojiCell.this.lastQuery = null;
                if (strTrim.isEmpty()) {
                    GroupStickersActivity.this.selectSetAfterSearch(null);
                } else {
                    AndroidUtilities.runOnUIThread(AddEmojiCell.this.lastCallback = new Runnable() {
                        @Override
                        public final void run() {
                            GroupStickersActivity.AddEmojiCell.AnonymousClass1.m3320$r8$lambda$r6CbCvKbARSWJA89Vs65wo_g0(this.f$0, strTrim);
                        }
                    }, 300L);
                }
            }

            public static void m3320$r8$lambda$r6CbCvKbARSWJA89Vs65wo_g0(final AnonymousClass1 anonymousClass1, final String str) {
                AddEmojiCell.this.lastQuery = str;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str;
                AddEmojiCell addEmojiCell = AddEmojiCell.this;
                addEmojiCell.reqId = GroupStickersActivity.this.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        GroupStickersActivity.AddEmojiCell.AnonymousClass1.$r8$lambda$KcLHoWo6SSNdCI1CZInlqgqqkzs(this.f$0, str, tLObject, tL_error);
                    }
                }, 66);
            }

            public static void $r8$lambda$KcLHoWo6SSNdCI1CZInlqgqqkzs(final AnonymousClass1 anonymousClass1, String str, final TLObject tLObject, TLRPC.TL_error tL_error) {
                if (Objects.equals(AddEmojiCell.this.lastQuery, str)) {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            GroupStickersActivity.AddEmojiCell.AnonymousClass1.m3319$r8$lambda$nfOWBzuYBsikzi_TanKpdTIpyU(this.f$0, tLObject);
                        }
                    });
                }
            }

            public static void m3319$r8$lambda$nfOWBzuYBsikzi_TanKpdTIpyU(AnonymousClass1 anonymousClass1, TLObject tLObject) {
                if (tLObject != null) {
                    GroupStickersActivity.this.selectSetAfterSearch((TLRPC.TL_messages_stickerSet) tLObject);
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
            editTextCaption.setInputType(16384);
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

        public void bind(boolean z, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
            this.needDivider = z;
            this.editText.removeTextChangedListener(this.textWatcher);
            if (tL_messages_stickerSet == null) {
                this.editText.setText("");
            } else {
                String str = tL_messages_stickerSet.set.short_name;
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
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
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
