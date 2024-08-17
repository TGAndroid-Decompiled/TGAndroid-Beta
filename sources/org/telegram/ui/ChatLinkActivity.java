package org.telegram.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatFull;
import org.telegram.tgnet.TLRPC$TL_channels_setDiscussionGroup;
import org.telegram.tgnet.TLRPC$TL_chatAdminRights;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_inputChannelEmpty;
import org.telegram.tgnet.TLRPC$TL_messages_stickerSet;
import org.telegram.tgnet.TLRPC$messages_Chats;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.ManageChatTextCell;
import org.telegram.ui.Cells.ManageChatUserCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.ChatLinkActivity;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.EmptyTextProgressView;
import org.telegram.ui.Components.JoinToSendSettingsView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LoadingStickerDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.GroupCreateFinalActivity;

public class ChatLinkActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private int chatEndRow;
    private int chatStartRow;
    private boolean chatsLoaded;
    private int createChatRow;
    private TLRPC$Chat currentChat;
    private long currentChatId;
    private int detailRow;
    private EmptyTextProgressView emptyView;
    private int helpRow;
    private TLRPC$ChatFull info;
    private boolean isChannel;
    private int joinToSendRow;
    private JoinToSendSettingsView joinToSendSettings;
    private RecyclerListView listView;
    private ListAdapter listViewAdapter;
    private boolean loadingChats;
    private int removeChatRow;
    private int rowCount;
    private SearchAdapter searchAdapter;
    private ActionBarMenuItem searchItem;
    private boolean searchWas;
    private boolean searching;
    private TLRPC$Chat waitingForFullChat;
    private AlertDialog waitingForFullChatProgressAlert;
    private ArrayList<TLRPC$Chat> chats = new ArrayList<>();
    private boolean joinToSendProgress = false;
    private boolean joinRequestProgress = false;

    private static class EmptyView extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
        private int currentAccount;
        private LoadingStickerDrawable drawable;
        private BackupImageView stickerView;

        public EmptyView(Context context) {
            super(context);
            this.currentAccount = UserConfig.selectedAccount;
            setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
            setOrientation(1);
            this.stickerView = new BackupImageView(context);
            LoadingStickerDrawable loadingStickerDrawable = new LoadingStickerDrawable(this.stickerView, "M476.1,397.4c25.8-47.2,0.3-105.9-50.9-120c-2.5-6.9-7.8-12.7-15-16.4l0.4-229.4c0-12.3-10-22.4-22.4-22.4H128.5c-12.3,0-22.4,10-22.4,22.4l-0.4,229.8v0c0,6.7,2.9,12.6,7.6,16.7c-51.6,15.9-79.2,77.2-48.1,116.4c-8.7,11.7-13.4,27.5-14,47.2c-1.7,34.5,21.6,45.8,55.9,45.8c52.3,0,99.1,4.6,105.1-36.2c16.5,0.9,7.1-37.3-6.5-53.3c18.4-22.4,18.3-52.9,4.9-78.2c-0.7-5.3-3.8-9.8-8.1-12.6c-1.5-2-1.6-2-2.1-2.7c0.2-1,1.2-11.8-3.4-20.9h138.5c-4.8,8.8-4.7,17-2.9,22.1c-5.3,4.8-6.8,12.3-5.2,17c-11.4,24.9-10,53.8,4.3,77.5c-6.8,9.7-11.2,21.7-12.6,31.6c-0.2-0.2-0.4-0.3-0.6-0.5c0.8-3.3,0.4-6.4-1.3-7.8c9.3-12.1-4.5-29.2-17-21.7c-3.8-2.8-10.6-3.2-18.1-0.5c-2.4-10.6-21.1-10.6-28.6-1c-1.3,0.3-2.9,0.8-4.5,1.9c-5.2-0.9-10.9,0.1-14.1,4.4c-6.9,3-9.5,10.4-7.8,17c-0.9,1.8-1.1,4-0.8,6.3c-1.6,1.2-2.3,3.1-2,4.9c0.1,0.6,10.4,56.6,11.2,62c0.3,1.8,1.5,3.2,3.1,3.9c8.7,3.4,12,3.8,30.1,9.4c2.7,0.8,2.4,0.8,6.7-0.1c16.4-3.5,30.2-8.9,30.8-9.2c1.6-0.6,2.7-2,3.1-3.7c0.1-0.4,6.8-36.5,10-53.2c0.9,4.2,3.3,7.3,7.4,7.5c1.2,7.8,4.4,14.5,9.5,19.9c16.4,17.3,44.9,15.7,64.9,16.1c38.3,0.8,74.5,1.5,84.4-24.4C488.9,453.5,491.3,421.3,476.1,397.4z", AndroidUtilities.dp(104.0f), AndroidUtilities.dp(104.0f));
            this.drawable = loadingStickerDrawable;
            this.stickerView.setImageDrawable(loadingStickerDrawable);
            addView(this.stickerView, LayoutHelper.createLinear(104, 104, 49, 0, 2, 0, 0));
        }

        private void setSticker() {
            TLRPC$TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(this.currentAccount).getStickerSetByName("tg_placeholders_android");
            if (stickerSetByName == null) {
                stickerSetByName = MediaDataController.getInstance(this.currentAccount).getStickerSetByEmojiOrName("tg_placeholders_android");
            }
            TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = stickerSetByName;
            if (tLRPC$TL_messages_stickerSet != null && tLRPC$TL_messages_stickerSet.documents.size() >= 3) {
                this.stickerView.setImage(ImageLocation.getForDocument(tLRPC$TL_messages_stickerSet.documents.get(2)), "104_104", "tgs", this.drawable, tLRPC$TL_messages_stickerSet);
            } else {
                MediaDataController.getInstance(this.currentAccount).loadStickersByEmojiOrName("tg_placeholders_android", false, tLRPC$TL_messages_stickerSet == null);
                this.stickerView.setImageDrawable(this.drawable);
            }
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            setSticker();
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.diceStickersDidLoad);
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.diceStickersDidLoad);
        }

        @Override
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            if (i == NotificationCenter.diceStickersDidLoad && "tg_placeholders_android".equals((String) objArr[0])) {
                setSticker();
            }
        }
    }

    public ChatLinkActivity(long j) {
        boolean z = false;
        this.currentChatId = j;
        TLRPC$Chat chat = getMessagesController().getChat(Long.valueOf(j));
        this.currentChat = chat;
        if (ChatObject.isChannel(chat) && !this.currentChat.megagroup) {
            z = true;
        }
        this.isChannel = z;
    }

    private void updateRows() {
        TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights;
        TLRPC$Chat chat = getMessagesController().getChat(Long.valueOf(this.currentChatId));
        this.currentChat = chat;
        if (chat == null) {
            return;
        }
        this.createChatRow = -1;
        this.chatStartRow = -1;
        this.chatEndRow = -1;
        this.removeChatRow = -1;
        this.detailRow = -1;
        this.joinToSendRow = -1;
        this.rowCount = 1;
        this.helpRow = 0;
        if (this.isChannel) {
            if (this.info.linked_chat_id == 0) {
                this.rowCount = 2;
                this.createChatRow = 1;
            }
            int i = this.rowCount;
            this.chatStartRow = i;
            int size = i + this.chats.size();
            this.rowCount = size;
            this.chatEndRow = size;
            if (this.info.linked_chat_id != 0) {
                this.rowCount = size + 1;
                this.createChatRow = size;
            }
        } else {
            this.chatStartRow = 1;
            int size2 = this.chats.size();
            int i2 = size2 + 1;
            this.chatEndRow = i2;
            this.rowCount = size2 + 2;
            this.createChatRow = i2;
        }
        int i3 = this.rowCount;
        this.rowCount = i3 + 1;
        this.detailRow = i3;
        if (!this.isChannel || (this.chats.size() > 0 && this.info.linked_chat_id != 0)) {
            TLRPC$Chat tLRPC$Chat = this.isChannel ? this.chats.get(0) : this.currentChat;
            if (tLRPC$Chat != null && ((!ChatObject.isPublic(tLRPC$Chat) || this.isChannel) && (tLRPC$Chat.creator || ((tLRPC$TL_chatAdminRights = tLRPC$Chat.admin_rights) != null && tLRPC$TL_chatAdminRights.ban_users)))) {
                int i4 = this.rowCount;
                this.rowCount = i4 + 1;
                this.joinToSendRow = i4;
            }
        }
        ListAdapter listAdapter = this.listViewAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
        ActionBarMenuItem actionBarMenuItem = this.searchItem;
        if (actionBarMenuItem != null) {
            actionBarMenuItem.setVisibility(this.chats.size() <= 10 ? 8 : 0);
        }
    }

    @Override
    public boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        loadChats();
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        JoinToSendSettingsView joinToSendSettingsView;
        TLRPC$Chat chat;
        TLRPC$Chat tLRPC$Chat = null;
        if (i == NotificationCenter.chatInfoDidLoad) {
            TLRPC$ChatFull tLRPC$ChatFull = (TLRPC$ChatFull) objArr[0];
            long j = tLRPC$ChatFull.id;
            if (j == this.currentChatId) {
                this.info = tLRPC$ChatFull;
                loadChats();
                updateRows();
                return;
            }
            TLRPC$Chat tLRPC$Chat2 = this.waitingForFullChat;
            if (tLRPC$Chat2 == null || tLRPC$Chat2.id != j) {
                return;
            }
            try {
                this.waitingForFullChatProgressAlert.dismiss();
            } catch (Throwable unused) {
            }
            this.waitingForFullChatProgressAlert = null;
            showLinkAlert(this.waitingForFullChat, false);
            this.waitingForFullChat = null;
            return;
        }
        if (i != NotificationCenter.updateInterfaces || (((Integer) objArr[0]).intValue() & MessagesController.UPDATE_MASK_CHAT) == 0 || this.currentChat == null) {
            return;
        }
        TLRPC$Chat chat2 = getMessagesController().getChat(Long.valueOf(this.currentChat.id));
        if (chat2 != null) {
            this.currentChat = chat2;
        }
        if (this.chats.size() > 0 && (chat = getMessagesController().getChat(Long.valueOf(this.chats.get(0).id))) != null) {
            this.chats.set(0, chat);
        }
        if (!this.isChannel) {
            tLRPC$Chat = this.currentChat;
        } else if (this.chats.size() > 0) {
            tLRPC$Chat = this.chats.get(0);
        }
        if (tLRPC$Chat == null || (joinToSendSettingsView = this.joinToSendSettings) == null) {
            return;
        }
        if (!this.joinRequestProgress) {
            joinToSendSettingsView.lambda$new$3(tLRPC$Chat.join_request);
        }
        if (this.joinToSendProgress) {
            return;
        }
        this.joinToSendSettings.setJoinToSend(tLRPC$Chat.join_to_send);
    }

    @Override
    public View createView(Context context) {
        this.searching = false;
        this.searchWas = false;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString("Discussion", R.string.Discussion));
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    ChatLinkActivity.this.lambda$onBackPressed$308();
                }
            }
        });
        ActionBarMenuItem actionBarMenuItemSearchListener = this.actionBar.createMenu().addItem(0, R.drawable.ic_ab_search).setIsSearchField(true).setActionBarMenuItemSearchListener(new ActionBarMenuItem.ActionBarMenuItemSearchListener() {
            @Override
            public void onSearchExpand() {
                ChatLinkActivity.this.searching = true;
                ChatLinkActivity.this.emptyView.setShowAtCenter(true);
            }

            @Override
            public void onSearchCollapse() {
                ChatLinkActivity.this.searchAdapter.searchDialogs(null);
                ChatLinkActivity.this.searching = false;
                ChatLinkActivity.this.searchWas = false;
                ChatLinkActivity.this.listView.setAdapter(ChatLinkActivity.this.listViewAdapter);
                ChatLinkActivity.this.listViewAdapter.notifyDataSetChanged();
                ChatLinkActivity.this.listView.setFastScrollVisible(true);
                ChatLinkActivity.this.listView.setVerticalScrollBarEnabled(false);
                ChatLinkActivity.this.emptyView.setShowAtCenter(false);
                View view = ChatLinkActivity.this.fragmentView;
                int i = Theme.key_windowBackgroundGray;
                view.setBackgroundColor(Theme.getColor(i));
                ChatLinkActivity.this.fragmentView.setTag(Integer.valueOf(i));
                ChatLinkActivity.this.emptyView.showProgress();
            }

            @Override
            public void onTextChanged(EditText editText) {
                if (ChatLinkActivity.this.searchAdapter == null) {
                    return;
                }
                String obj = editText.getText().toString();
                if (obj.length() != 0) {
                    ChatLinkActivity.this.searchWas = true;
                    if (ChatLinkActivity.this.listView != null && ChatLinkActivity.this.listView.getAdapter() != ChatLinkActivity.this.searchAdapter) {
                        ChatLinkActivity.this.listView.setAdapter(ChatLinkActivity.this.searchAdapter);
                        View view = ChatLinkActivity.this.fragmentView;
                        int i = Theme.key_windowBackgroundWhite;
                        view.setBackgroundColor(Theme.getColor(i));
                        ChatLinkActivity.this.fragmentView.setTag(Integer.valueOf(i));
                        ChatLinkActivity.this.searchAdapter.notifyDataSetChanged();
                        ChatLinkActivity.this.listView.setFastScrollVisible(false);
                        ChatLinkActivity.this.listView.setVerticalScrollBarEnabled(true);
                        ChatLinkActivity.this.emptyView.showProgress();
                    }
                }
                ChatLinkActivity.this.searchAdapter.searchDialogs(obj);
            }
        });
        this.searchItem = actionBarMenuItemSearchListener;
        actionBarMenuItemSearchListener.setSearchFieldHint(LocaleController.getString("Search", R.string.Search));
        this.searchAdapter = new SearchAdapter(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        int i = Theme.key_windowBackgroundGray;
        frameLayout.setBackgroundColor(Theme.getColor(i));
        this.fragmentView.setTag(Integer.valueOf(i));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        EmptyTextProgressView emptyTextProgressView = new EmptyTextProgressView(context);
        this.emptyView = emptyTextProgressView;
        emptyTextProgressView.showProgress();
        this.emptyView.setText(LocaleController.getString("NoResult", R.string.NoResult));
        frameLayout2.addView(this.emptyView, LayoutHelper.createFrame(-1, -1.0f));
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.setEmptyView(this.emptyView);
        this.listView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        RecyclerListView recyclerListView2 = this.listView;
        ListAdapter listAdapter = new ListAdapter(context);
        this.listViewAdapter = listAdapter;
        recyclerListView2.setAdapter(listAdapter);
        this.listView.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        frameLayout2.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i2) {
                ChatLinkActivity.this.lambda$createView$6(view, i2);
            }
        });
        updateRows();
        return this.fragmentView;
    }

    public void lambda$createView$6(View view, int i) {
        TLRPC$Chat tLRPC$Chat;
        String string;
        String formatString;
        if (getParentActivity() == null) {
            return;
        }
        RecyclerView.Adapter adapter = this.listView.getAdapter();
        SearchAdapter searchAdapter = this.searchAdapter;
        if (adapter == searchAdapter) {
            tLRPC$Chat = searchAdapter.getItem(i);
        } else {
            int i2 = this.chatStartRow;
            tLRPC$Chat = (i < i2 || i >= this.chatEndRow) ? null : this.chats.get(i - i2);
        }
        if (tLRPC$Chat != null) {
            if (this.isChannel && this.info.linked_chat_id == 0) {
                showLinkAlert(tLRPC$Chat, true);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", tLRPC$Chat.id);
            presentFragment(new ChatActivity(bundle));
            return;
        }
        if (i == this.createChatRow) {
            if (this.isChannel && this.info.linked_chat_id == 0) {
                Bundle bundle2 = new Bundle();
                bundle2.putLongArray("result", new long[]{getUserConfig().getClientUserId()});
                bundle2.putInt("chatType", 4);
                TLRPC$Chat tLRPC$Chat2 = this.currentChat;
                if (tLRPC$Chat2 != null) {
                    bundle2.putString("title", LocaleController.formatString("GroupCreateDiscussionDefaultName", R.string.GroupCreateDiscussionDefaultName, tLRPC$Chat2.title));
                }
                GroupCreateFinalActivity groupCreateFinalActivity = new GroupCreateFinalActivity(bundle2);
                groupCreateFinalActivity.setDelegate(new GroupCreateFinalActivity.GroupCreateFinalActivityDelegate() {
                    @Override
                    public void didFailChatCreation() {
                    }

                    @Override
                    public void didStartChatCreation() {
                    }

                    @Override
                    public void didFinishChatCreation(GroupCreateFinalActivity groupCreateFinalActivity2, long j) {
                        ChatLinkActivity chatLinkActivity = ChatLinkActivity.this;
                        chatLinkActivity.linkChat(chatLinkActivity.getMessagesController().getChat(Long.valueOf(j)), groupCreateFinalActivity2);
                    }
                });
                presentFragment(groupCreateFinalActivity);
                return;
            }
            if (this.chats.isEmpty()) {
                return;
            }
            TLRPC$Chat tLRPC$Chat3 = this.chats.get(0);
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
            if (this.isChannel) {
                string = LocaleController.getString("DiscussionUnlinkGroup", R.string.DiscussionUnlinkGroup);
                formatString = LocaleController.formatString("DiscussionUnlinkChannelAlert", R.string.DiscussionUnlinkChannelAlert, tLRPC$Chat3.title);
            } else {
                string = LocaleController.getString("DiscussionUnlink", R.string.DiscussionUnlinkChannel);
                formatString = LocaleController.formatString("DiscussionUnlinkGroupAlert", R.string.DiscussionUnlinkGroupAlert, tLRPC$Chat3.title);
            }
            builder.setTitle(string);
            builder.setMessage(AndroidUtilities.replaceTags(formatString));
            builder.setPositiveButton(LocaleController.getString("DiscussionUnlink", R.string.DiscussionUnlink), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    ChatLinkActivity.this.lambda$createView$5(dialogInterface, i3);
                }
            });
            builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
            AlertDialog create = builder.create();
            showDialog(create);
            TextView textView = (TextView) create.getButton(-1);
            if (textView != null) {
                textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
            }
        }
    }

    public void lambda$createView$5(DialogInterface dialogInterface, int i) {
        if (this.isChannel && this.info.linked_chat_id == 0) {
            return;
        }
        final AlertDialog[] alertDialogArr = {new AlertDialog(getParentActivity(), 3)};
        TLRPC$TL_channels_setDiscussionGroup tLRPC$TL_channels_setDiscussionGroup = new TLRPC$TL_channels_setDiscussionGroup();
        if (this.isChannel) {
            tLRPC$TL_channels_setDiscussionGroup.broadcast = MessagesController.getInputChannel(this.currentChat);
            tLRPC$TL_channels_setDiscussionGroup.group = new TLRPC$TL_inputChannelEmpty();
        } else {
            tLRPC$TL_channels_setDiscussionGroup.broadcast = new TLRPC$TL_inputChannelEmpty();
            tLRPC$TL_channels_setDiscussionGroup.group = MessagesController.getInputChannel(this.currentChat);
        }
        final int sendRequest = getConnectionsManager().sendRequest(tLRPC$TL_channels_setDiscussionGroup, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                ChatLinkActivity.this.lambda$createView$2(alertDialogArr, tLObject, tLRPC$TL_error);
            }
        });
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatLinkActivity.this.lambda$createView$4(alertDialogArr, sendRequest);
            }
        }, 500L);
    }

    public void lambda$createView$2(final AlertDialog[] alertDialogArr, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatLinkActivity.this.lambda$createView$1(alertDialogArr);
            }
        });
    }

    public void lambda$createView$1(AlertDialog[] alertDialogArr) {
        try {
            alertDialogArr[0].dismiss();
        } catch (Throwable unused) {
        }
        alertDialogArr[0] = null;
        this.info.linked_chat_id = 0L;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
        int i = NotificationCenter.chatInfoDidLoad;
        Boolean bool = Boolean.FALSE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i, this.info, 0, bool, bool);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatLinkActivity.this.lambda$createView$0();
            }
        }, 1000L);
        if (this.isChannel) {
            return;
        }
        lambda$onBackPressed$308();
    }

    public void lambda$createView$0() {
        getMessagesController().loadFullChat(this.currentChatId, 0, true);
    }

    public void lambda$createView$4(AlertDialog[] alertDialogArr, final int i) {
        AlertDialog alertDialog = alertDialogArr[0];
        if (alertDialog == null) {
            return;
        }
        alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public final void onCancel(DialogInterface dialogInterface) {
                ChatLinkActivity.this.lambda$createView$3(i, dialogInterface);
            }
        });
        showDialog(alertDialogArr[0]);
    }

    public void lambda$createView$3(int i, DialogInterface dialogInterface) {
        ConnectionsManager.getInstance(this.currentAccount).cancelRequest(i, true);
    }

    private void showLinkAlert(final TLRPC$Chat tLRPC$Chat, boolean z) {
        String formatString;
        final TLRPC$ChatFull chatFull = getMessagesController().getChatFull(tLRPC$Chat.id);
        if (chatFull == null) {
            if (z) {
                getMessagesController().loadFullChat(tLRPC$Chat.id, 0, true);
                this.waitingForFullChat = tLRPC$Chat;
                this.waitingForFullChatProgressAlert = new AlertDialog(getParentActivity(), 3);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ChatLinkActivity.this.lambda$showLinkAlert$8();
                    }
                }, 500L);
                return;
            }
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        TextView textView = new TextView(getParentActivity());
        textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack));
        textView.setTextSize(1, 16.0f);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        if (!ChatObject.isPublic(tLRPC$Chat)) {
            formatString = LocaleController.formatString("DiscussionLinkGroupPublicPrivateAlert", R.string.DiscussionLinkGroupPublicPrivateAlert, tLRPC$Chat.title, this.currentChat.title);
        } else if (!ChatObject.isPublic(this.currentChat)) {
            formatString = LocaleController.formatString("DiscussionLinkGroupPrivateAlert", R.string.DiscussionLinkGroupPrivateAlert, tLRPC$Chat.title, this.currentChat.title);
        } else {
            formatString = LocaleController.formatString("DiscussionLinkGroupPublicAlert", R.string.DiscussionLinkGroupPublicAlert, tLRPC$Chat.title, this.currentChat.title);
        }
        if (chatFull.hidden_prehistory) {
            formatString = formatString + "\n\n" + LocaleController.getString("DiscussionLinkGroupAlertHistory", R.string.DiscussionLinkGroupAlertHistory);
        }
        textView.setText(AndroidUtilities.replaceTags(formatString));
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        builder.setView(frameLayout);
        AvatarDrawable avatarDrawable = new AvatarDrawable();
        avatarDrawable.setTextSize(AndroidUtilities.dp(12.0f));
        BackupImageView backupImageView = new BackupImageView(getParentActivity());
        backupImageView.setRoundRadius(AndroidUtilities.dp(20.0f));
        frameLayout.addView(backupImageView, LayoutHelper.createFrame(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        TextView textView2 = new TextView(getParentActivity());
        textView2.setTextColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem));
        textView2.setTextSize(1, 20.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setText(tLRPC$Chat.title);
        boolean z2 = LocaleController.isRTL;
        frameLayout.addView(textView2, LayoutHelper.createFrame(-1, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 21 : 76, 11.0f, z2 ? 76 : 21, 0.0f));
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
        avatarDrawable.setInfo(this.currentAccount, tLRPC$Chat);
        backupImageView.setForUserOrChat(tLRPC$Chat, avatarDrawable);
        builder.setPositiveButton(LocaleController.getString("DiscussionLinkGroup", R.string.DiscussionLinkGroup), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                ChatLinkActivity.this.lambda$showLinkAlert$9(chatFull, tLRPC$Chat, dialogInterface, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
        showDialog(builder.create());
    }

    public void lambda$showLinkAlert$8() {
        AlertDialog alertDialog = this.waitingForFullChatProgressAlert;
        if (alertDialog == null) {
            return;
        }
        alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public final void onCancel(DialogInterface dialogInterface) {
                ChatLinkActivity.this.lambda$showLinkAlert$7(dialogInterface);
            }
        });
        showDialog(this.waitingForFullChatProgressAlert);
    }

    public void lambda$showLinkAlert$7(DialogInterface dialogInterface) {
        this.waitingForFullChat = null;
    }

    public void lambda$showLinkAlert$9(TLRPC$ChatFull tLRPC$ChatFull, TLRPC$Chat tLRPC$Chat, DialogInterface dialogInterface, int i) {
        if (tLRPC$ChatFull.hidden_prehistory) {
            getMessagesController().toggleChannelInvitesHistory(tLRPC$Chat.id, false);
        }
        linkChat(tLRPC$Chat, null);
    }

    public void linkChat(final TLRPC$Chat tLRPC$Chat, final BaseFragment baseFragment) {
        if (tLRPC$Chat == null) {
            return;
        }
        if (!ChatObject.isChannel(tLRPC$Chat)) {
            getMessagesController().convertToMegaGroup(getParentActivity(), tLRPC$Chat.id, this, new MessagesStorage.LongCallback() {
                @Override
                public final void run(long j) {
                    ChatLinkActivity.this.lambda$linkChat$10(baseFragment, j);
                }
            });
            return;
        }
        final AlertDialog[] alertDialogArr = {baseFragment != null ? null : new AlertDialog(getParentActivity(), 3)};
        TLRPC$TL_channels_setDiscussionGroup tLRPC$TL_channels_setDiscussionGroup = new TLRPC$TL_channels_setDiscussionGroup();
        tLRPC$TL_channels_setDiscussionGroup.broadcast = MessagesController.getInputChannel(this.currentChat);
        tLRPC$TL_channels_setDiscussionGroup.group = MessagesController.getInputChannel(tLRPC$Chat);
        final int sendRequest = getConnectionsManager().sendRequest(tLRPC$TL_channels_setDiscussionGroup, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                ChatLinkActivity.this.lambda$linkChat$13(alertDialogArr, tLRPC$Chat, baseFragment, tLObject, tLRPC$TL_error);
            }
        }, 64);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatLinkActivity.this.lambda$linkChat$15(alertDialogArr, sendRequest);
            }
        }, 500L);
    }

    public void lambda$linkChat$10(BaseFragment baseFragment, long j) {
        if (j != 0) {
            getMessagesController().toggleChannelInvitesHistory(j, false);
            linkChat(getMessagesController().getChat(Long.valueOf(j)), baseFragment);
        }
    }

    public void lambda$linkChat$13(final AlertDialog[] alertDialogArr, final TLRPC$Chat tLRPC$Chat, final BaseFragment baseFragment, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatLinkActivity.this.lambda$linkChat$12(alertDialogArr, tLRPC$Chat, baseFragment);
            }
        });
    }

    public void lambda$linkChat$12(AlertDialog[] alertDialogArr, TLRPC$Chat tLRPC$Chat, BaseFragment baseFragment) {
        AlertDialog alertDialog = alertDialogArr[0];
        if (alertDialog != null) {
            try {
                alertDialog.dismiss();
            } catch (Throwable unused) {
            }
            alertDialogArr[0] = null;
        }
        this.info.linked_chat_id = tLRPC$Chat.id;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
        int i = NotificationCenter.chatInfoDidLoad;
        Boolean bool = Boolean.FALSE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i, this.info, 0, bool, bool);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatLinkActivity.this.lambda$linkChat$11();
            }
        }, 1000L);
        if (baseFragment != null) {
            removeSelfFromStack();
            baseFragment.lambda$onBackPressed$308();
        } else {
            lambda$onBackPressed$308();
        }
    }

    public void lambda$linkChat$11() {
        getMessagesController().loadFullChat(this.currentChatId, 0, true);
    }

    public void lambda$linkChat$15(AlertDialog[] alertDialogArr, final int i) {
        AlertDialog alertDialog = alertDialogArr[0];
        if (alertDialog == null) {
            return;
        }
        alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public final void onCancel(DialogInterface dialogInterface) {
                ChatLinkActivity.this.lambda$linkChat$14(i, dialogInterface);
            }
        });
        showDialog(alertDialogArr[0]);
    }

    public void lambda$linkChat$14(int i, DialogInterface dialogInterface) {
        ConnectionsManager.getInstance(this.currentAccount).cancelRequest(i, true);
    }

    public void setInfo(TLRPC$ChatFull tLRPC$ChatFull) {
        this.info = tLRPC$ChatFull;
    }

    private void loadChats() {
        if (this.info.linked_chat_id != 0) {
            this.chats.clear();
            TLRPC$Chat chat = getMessagesController().getChat(Long.valueOf(this.info.linked_chat_id));
            if (chat != null) {
                this.chats.add(chat);
            }
            ActionBarMenuItem actionBarMenuItem = this.searchItem;
            if (actionBarMenuItem != null) {
                actionBarMenuItem.setVisibility(8);
            }
        }
        if (!this.loadingChats && this.isChannel && this.info.linked_chat_id == 0) {
            this.loadingChats = true;
            getConnectionsManager().sendRequest(new TLObject() {
                @Override
                public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
                    return TLRPC$messages_Chats.TLdeserialize(abstractSerializedData, i, z);
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                    abstractSerializedData.writeInt32(-170208392);
                }
            }, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    ChatLinkActivity.this.lambda$loadChats$17(tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$loadChats$17(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatLinkActivity.this.lambda$loadChats$16(tLObject);
            }
        });
    }

    public void lambda$loadChats$16(TLObject tLObject) {
        if (tLObject instanceof TLRPC$messages_Chats) {
            TLRPC$messages_Chats tLRPC$messages_Chats = (TLRPC$messages_Chats) tLObject;
            getMessagesController().putChats(tLRPC$messages_Chats.chats, false);
            ArrayList<TLRPC$Chat> arrayList = tLRPC$messages_Chats.chats;
            this.chats = arrayList;
            Iterator<TLRPC$Chat> it = arrayList.iterator();
            while (it.hasNext()) {
                if (ChatObject.isForum(it.next())) {
                    it.remove();
                }
            }
        }
        this.loadingChats = false;
        this.chatsLoaded = true;
        updateRows();
    }

    @Override
    public void onResume() {
        super.onResume();
        ListAdapter listAdapter = this.listViewAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
    }

    public class HintInnerCell extends FrameLayout {
        private EmptyView emptyView;
        private TextView messageTextView;

        public HintInnerCell(Context context) {
            super(context);
            EmptyView emptyView = new EmptyView(context);
            this.emptyView = emptyView;
            addView(emptyView, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            this.messageTextView = textView;
            textView.setTextColor(Theme.getColor(Theme.key_chats_message));
            this.messageTextView.setTextSize(1, 14.0f);
            this.messageTextView.setGravity(17);
            if (ChatLinkActivity.this.isChannel) {
                if (ChatLinkActivity.this.info != null && ChatLinkActivity.this.info.linked_chat_id != 0) {
                    TLRPC$Chat chat = ChatLinkActivity.this.getMessagesController().getChat(Long.valueOf(ChatLinkActivity.this.info.linked_chat_id));
                    if (chat != null) {
                        this.messageTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("DiscussionChannelGroupSetHelp2", R.string.DiscussionChannelGroupSetHelp2, chat.title)));
                    }
                } else {
                    this.messageTextView.setText(LocaleController.getString("DiscussionChannelHelp3", R.string.DiscussionChannelHelp3));
                }
            } else {
                TLRPC$Chat chat2 = ChatLinkActivity.this.getMessagesController().getChat(Long.valueOf(ChatLinkActivity.this.info.linked_chat_id));
                if (chat2 != null) {
                    this.messageTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("DiscussionGroupHelp", R.string.DiscussionGroupHelp, chat2.title)));
                }
            }
            addView(this.messageTextView, LayoutHelper.createFrame(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
        }
    }

    public class SearchAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;
        private ArrayList<TLRPC$Chat> searchResult = new ArrayList<>();
        private ArrayList<CharSequence> searchResultNames = new ArrayList<>();
        private Runnable searchRunnable;

        @Override
        public int getItemViewType(int i) {
            return 0;
        }

        public SearchAdapter(Context context) {
            this.mContext = context;
        }

        public void searchDialogs(final String str) {
            if (this.searchRunnable != null) {
                Utilities.searchQueue.cancelRunnable(this.searchRunnable);
                this.searchRunnable = null;
            }
            if (TextUtils.isEmpty(str)) {
                this.searchResult.clear();
                this.searchResultNames.clear();
                notifyDataSetChanged();
            } else {
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                Runnable runnable = new Runnable() {
                    @Override
                    public final void run() {
                        ChatLinkActivity.SearchAdapter.this.lambda$searchDialogs$0(str);
                    }
                };
                this.searchRunnable = runnable;
                dispatchQueue.postRunnable(runnable, 300L);
            }
        }

        public void lambda$searchDialogs$0(final String str) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ChatLinkActivity.SearchAdapter.this.lambda$processSearch$2(str);
                }
            });
        }

        public void lambda$processSearch$2(final String str) {
            this.searchRunnable = null;
            final ArrayList arrayList = new ArrayList(ChatLinkActivity.this.chats);
            Utilities.searchQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    ChatLinkActivity.SearchAdapter.this.lambda$processSearch$1(str, arrayList);
                }
            });
        }

        public void lambda$processSearch$1(java.lang.String r19, java.util.ArrayList r20) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ChatLinkActivity.SearchAdapter.lambda$processSearch$1(java.lang.String, java.util.ArrayList):void");
        }

        private void updateSearchResults(final ArrayList<TLRPC$Chat> arrayList, final ArrayList<CharSequence> arrayList2) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ChatLinkActivity.SearchAdapter.this.lambda$updateSearchResults$3(arrayList, arrayList2);
                }
            });
        }

        public void lambda$updateSearchResults$3(ArrayList arrayList, ArrayList arrayList2) {
            if (ChatLinkActivity.this.searching) {
                this.searchResult = arrayList;
                this.searchResultNames = arrayList2;
                if (ChatLinkActivity.this.listView.getAdapter() == ChatLinkActivity.this.searchAdapter) {
                    ChatLinkActivity.this.emptyView.showTextView();
                }
                notifyDataSetChanged();
            }
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() != 1;
        }

        @Override
        public int getItemCount() {
            return this.searchResult.size();
        }

        @Override
        public void notifyDataSetChanged() {
            super.notifyDataSetChanged();
        }

        public TLRPC$Chat getItem(int i) {
            return this.searchResult.get(i);
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            ManageChatUserCell manageChatUserCell = new ManageChatUserCell(this.mContext, 6, 2, false);
            manageChatUserCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
            return new RecyclerListView.Holder(manageChatUserCell);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            TLRPC$Chat tLRPC$Chat = this.searchResult.get(i);
            String publicUsername = ChatObject.getPublicUsername(tLRPC$Chat);
            CharSequence charSequence = this.searchResultNames.get(i);
            CharSequence charSequence2 = null;
            if (charSequence != null && !TextUtils.isEmpty(publicUsername)) {
                if (charSequence.toString().startsWith("@" + publicUsername)) {
                    charSequence2 = charSequence;
                    charSequence = null;
                }
            }
            ManageChatUserCell manageChatUserCell = (ManageChatUserCell) viewHolder.itemView;
            manageChatUserCell.setTag(Integer.valueOf(i));
            manageChatUserCell.setData(tLRPC$Chat, charSequence, charSequence2, false);
        }

        @Override
        public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            if (view instanceof ManageChatUserCell) {
                ((ManageChatUserCell) view).recycle();
            }
        }
    }

    public class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            return itemViewType == 0 || itemViewType == 2;
        }

        @Override
        public int getItemCount() {
            if (!ChatLinkActivity.this.loadingChats || ChatLinkActivity.this.chatsLoaded) {
                return ChatLinkActivity.this.rowCount;
            }
            return 0;
        }

        public class AnonymousClass1 extends JoinToSendSettingsView {
            final TLRPC$Chat val$chat;

            AnonymousClass1(Context context, TLRPC$Chat tLRPC$Chat, TLRPC$Chat tLRPC$Chat2) {
                super(context, tLRPC$Chat);
                this.val$chat = tLRPC$Chat2;
            }

            private void migrateIfNeeded(Runnable runnable, final Runnable runnable2) {
                if (!ChatObject.isChannel(ChatLinkActivity.this.currentChat)) {
                    ChatLinkActivity.this.getMessagesController().convertToMegaGroup(ChatLinkActivity.this.getParentActivity(), this.val$chat.id, ChatLinkActivity.this, new MessagesStorage.LongCallback() {
                        @Override
                        public final void run(long j) {
                            ChatLinkActivity.ListAdapter.AnonymousClass1.this.lambda$migrateIfNeeded$0(runnable2, j);
                        }
                    }, runnable);
                } else {
                    runnable2.run();
                }
            }

            public void lambda$migrateIfNeeded$0(Runnable runnable, long j) {
                if (j != 0) {
                    if (ChatLinkActivity.this.isChannel) {
                        ChatLinkActivity.this.chats.set(0, ChatLinkActivity.this.getMessagesController().getChat(Long.valueOf(j)));
                    } else {
                        ChatLinkActivity.this.currentChatId = j;
                        ChatLinkActivity chatLinkActivity = ChatLinkActivity.this;
                        chatLinkActivity.currentChat = chatLinkActivity.getMessagesController().getChat(Long.valueOf(j));
                    }
                    runnable.run();
                }
            }

            @Override
            public boolean onJoinRequestToggle(final boolean z, final Runnable runnable) {
                if (ChatLinkActivity.this.joinRequestProgress) {
                    return false;
                }
                ChatLinkActivity.this.joinRequestProgress = true;
                Runnable overrideCancel = overrideCancel(runnable);
                final TLRPC$Chat tLRPC$Chat = this.val$chat;
                migrateIfNeeded(overrideCancel, new Runnable() {
                    @Override
                    public final void run() {
                        ChatLinkActivity.ListAdapter.AnonymousClass1.this.lambda$onJoinRequestToggle$3(tLRPC$Chat, z, runnable);
                    }
                });
                return true;
            }

            public void lambda$onJoinRequestToggle$3(TLRPC$Chat tLRPC$Chat, boolean z, final Runnable runnable) {
                tLRPC$Chat.join_request = z;
                ChatLinkActivity.this.getMessagesController().toggleChatJoinRequest(tLRPC$Chat.id, z, new Runnable() {
                    @Override
                    public final void run() {
                        ChatLinkActivity.ListAdapter.AnonymousClass1.this.lambda$onJoinRequestToggle$1();
                    }
                }, new Runnable() {
                    @Override
                    public final void run() {
                        ChatLinkActivity.ListAdapter.AnonymousClass1.this.lambda$onJoinRequestToggle$2(runnable);
                    }
                });
            }

            public void lambda$onJoinRequestToggle$1() {
                ChatLinkActivity.this.joinRequestProgress = false;
            }

            public void lambda$onJoinRequestToggle$2(Runnable runnable) {
                ChatLinkActivity.this.joinRequestProgress = false;
                runnable.run();
            }

            private Runnable overrideCancel(final Runnable runnable) {
                return new Runnable() {
                    @Override
                    public final void run() {
                        ChatLinkActivity.ListAdapter.AnonymousClass1.this.lambda$overrideCancel$4(runnable);
                    }
                };
            }

            public void lambda$overrideCancel$4(Runnable runnable) {
                ChatLinkActivity.this.joinToSendProgress = false;
                ChatLinkActivity.this.joinRequestProgress = false;
                runnable.run();
            }

            @Override
            public boolean onJoinToSendToggle(final boolean z, final Runnable runnable) {
                if (ChatLinkActivity.this.joinToSendProgress) {
                    return false;
                }
                ChatLinkActivity.this.joinToSendProgress = true;
                Runnable overrideCancel = overrideCancel(runnable);
                final TLRPC$Chat tLRPC$Chat = this.val$chat;
                migrateIfNeeded(overrideCancel, new Runnable() {
                    @Override
                    public final void run() {
                        ChatLinkActivity.ListAdapter.AnonymousClass1.this.lambda$onJoinToSendToggle$9(tLRPC$Chat, z, runnable);
                    }
                });
                return true;
            }

            public void lambda$onJoinToSendToggle$9(final TLRPC$Chat tLRPC$Chat, final boolean z, final Runnable runnable) {
                tLRPC$Chat.join_to_send = z;
                ChatLinkActivity.this.getMessagesController().toggleChatJoinToSend(tLRPC$Chat.id, z, new Runnable() {
                    @Override
                    public final void run() {
                        ChatLinkActivity.ListAdapter.AnonymousClass1.this.lambda$onJoinToSendToggle$7(z, tLRPC$Chat);
                    }
                }, new Runnable() {
                    @Override
                    public final void run() {
                        ChatLinkActivity.ListAdapter.AnonymousClass1.this.lambda$onJoinToSendToggle$8(runnable);
                    }
                });
            }

            public void lambda$onJoinToSendToggle$7(boolean z, final TLRPC$Chat tLRPC$Chat) {
                ChatLinkActivity.this.joinToSendProgress = false;
                if (z || !tLRPC$Chat.join_request) {
                    return;
                }
                tLRPC$Chat.join_request = false;
                ChatLinkActivity.this.joinRequestProgress = true;
                ChatLinkActivity.this.getMessagesController().toggleChatJoinRequest(tLRPC$Chat.id, false, new Runnable() {
                    @Override
                    public final void run() {
                        ChatLinkActivity.ListAdapter.AnonymousClass1.this.lambda$onJoinToSendToggle$5();
                    }
                }, new Runnable() {
                    @Override
                    public final void run() {
                        ChatLinkActivity.ListAdapter.AnonymousClass1.this.lambda$onJoinToSendToggle$6(tLRPC$Chat);
                    }
                });
            }

            public void lambda$onJoinToSendToggle$5() {
                ChatLinkActivity.this.joinRequestProgress = false;
            }

            public void lambda$onJoinToSendToggle$6(TLRPC$Chat tLRPC$Chat) {
                tLRPC$Chat.join_request = true;
                this.isJoinRequest = true;
                this.joinRequestCell.setChecked(true);
            }

            public void lambda$onJoinToSendToggle$8(Runnable runnable) {
                ChatLinkActivity.this.joinToSendProgress = false;
                runnable.run();
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            if (i == 0) {
                ManageChatUserCell manageChatUserCell = new ManageChatUserCell(this.mContext, 6, 2, false);
                manageChatUserCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                view = manageChatUserCell;
            } else if (i == 1) {
                view = new TextInfoPrivacyCell(this.mContext);
                view.setBackgroundDrawable(Theme.getThemedDrawableByKey(this.mContext, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
            } else if (i == 2) {
                view = new ManageChatTextCell(this.mContext);
                view.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
            } else if (i == 4) {
                TLRPC$Chat tLRPC$Chat = ChatLinkActivity.this.isChannel ? (TLRPC$Chat) ChatLinkActivity.this.chats.get(0) : ChatLinkActivity.this.currentChat;
                view = ChatLinkActivity.this.joinToSendSettings = new AnonymousClass1(this.mContext, tLRPC$Chat, tLRPC$Chat);
            } else {
                view = new HintInnerCell(this.mContext);
            }
            return new RecyclerListView.Holder(view);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            String str;
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 0) {
                ManageChatUserCell manageChatUserCell = (ManageChatUserCell) viewHolder.itemView;
                manageChatUserCell.setTag(Integer.valueOf(i));
                TLRPC$Chat tLRPC$Chat = (TLRPC$Chat) ChatLinkActivity.this.chats.get(i - ChatLinkActivity.this.chatStartRow);
                String publicUsername = ChatObject.getPublicUsername(tLRPC$Chat);
                if (TextUtils.isEmpty(publicUsername)) {
                    str = null;
                } else {
                    str = "@" + publicUsername;
                }
                manageChatUserCell.setData(tLRPC$Chat, null, str, (i == ChatLinkActivity.this.chatEndRow - 1 && ChatLinkActivity.this.info.linked_chat_id == 0) ? false : true);
                return;
            }
            if (itemViewType == 1) {
                TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                if (i == ChatLinkActivity.this.detailRow) {
                    if (ChatLinkActivity.this.isChannel) {
                        textInfoPrivacyCell.setText(LocaleController.getString("DiscussionChannelHelp2", R.string.DiscussionChannelHelp2));
                        return;
                    } else {
                        textInfoPrivacyCell.setText(LocaleController.getString("DiscussionGroupHelp2", R.string.DiscussionGroupHelp2));
                        return;
                    }
                }
                return;
            }
            if (itemViewType != 2) {
                return;
            }
            ManageChatTextCell manageChatTextCell = (ManageChatTextCell) viewHolder.itemView;
            if (!ChatLinkActivity.this.isChannel) {
                int i2 = Theme.key_text_RedRegular;
                manageChatTextCell.setColors(i2, i2);
                manageChatTextCell.setText(LocaleController.getString("DiscussionUnlinkChannel", R.string.DiscussionUnlinkChannel), null, R.drawable.msg_remove, false);
            } else if (ChatLinkActivity.this.info.linked_chat_id != 0) {
                int i3 = Theme.key_text_RedRegular;
                manageChatTextCell.setColors(i3, i3);
                manageChatTextCell.setText(LocaleController.getString("DiscussionUnlinkGroup", R.string.DiscussionUnlinkGroup), null, R.drawable.msg_remove, false);
            } else {
                manageChatTextCell.setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
                manageChatTextCell.setText(LocaleController.getString("DiscussionCreateGroup", R.string.DiscussionCreateGroup), null, R.drawable.msg_groups, true);
            }
        }

        @Override
        public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            if (view instanceof ManageChatUserCell) {
                ((ManageChatUserCell) view).recycle();
            }
        }

        @Override
        public int getItemViewType(int i) {
            if (i == ChatLinkActivity.this.helpRow) {
                return 3;
            }
            if (i == ChatLinkActivity.this.createChatRow || i == ChatLinkActivity.this.removeChatRow) {
                return 2;
            }
            if (i < ChatLinkActivity.this.chatStartRow || i >= ChatLinkActivity.this.chatEndRow) {
                return i == ChatLinkActivity.this.joinToSendRow ? 4 : 1;
            }
            return 0;
        }
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                ChatLinkActivity.this.lambda$getThemeDescriptions$18();
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        };
        int i = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{ManageChatUserCell.class, ManageChatTextCell.class}, null, null, null, i));
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND | ThemeDescription.FLAG_CHECKTAG, null, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND | ThemeDescription.FLAG_CHECKTAG, null, null, null, null, i));
        ActionBar actionBar = this.actionBar;
        int i2 = ThemeDescription.FLAG_BACKGROUND;
        int i3 = Theme.key_actionBarDefault;
        arrayList.add(new ThemeDescription(actionBar, i2, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{TextInfoPrivacyCell.class}, null, null, null, Theme.key_windowBackgroundGrayShadow));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayText4));
        int i4 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, new String[]{"nameTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, new String[]{"statusColor"}, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, Theme.key_windowBackgroundWhiteGrayText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, new String[]{"statusOnlineColor"}, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, Theme.key_windowBackgroundWhiteBlueText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, null, Theme.avatarDrawables, null, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundPink));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HintInnerCell.class}, new String[]{"messageTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_chats_message));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKTAG, new Class[]{ManageChatTextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKTAG, new Class[]{ManageChatTextCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayIcon));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKTAG, new Class[]{ManageChatTextCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlueButton));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKTAG, new Class[]{ManageChatTextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlueIcon));
        return arrayList;
    }

    public void lambda$getThemeDescriptions$18() {
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView != null) {
            int childCount = recyclerListView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.listView.getChildAt(i);
                if (childAt instanceof ManageChatUserCell) {
                    ((ManageChatUserCell) childAt).update(0);
                }
            }
        }
    }
}
