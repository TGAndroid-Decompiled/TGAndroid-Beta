package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzku;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.TextBlockCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Components.EmptyTextProgressView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;

public final class GroupInviteActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public final long chatId;
    public int copyLinkRow;
    public EmptyTextProgressView emptyView;
    public TLRPC.TL_chatInviteExported invite;
    public int linkInfoRow;
    public ListAdapter listAdapter;
    public RecyclerListView listView;
    public boolean loading;
    public int revokeLinkRow;
    public int rowCount;
    public int shadowRow;
    public int shareLinkRow;

    public final class ListAdapter extends RecyclerListView.SelectionAdapter {
        public final Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public final int getItemCount() {
            GroupInviteActivity groupInviteActivity = GroupInviteActivity.this;
            if (groupInviteActivity.loading) {
                return 0;
            }
            return groupInviteActivity.rowCount;
        }

        @Override
        public final int getItemViewType(int i) {
            GroupInviteActivity groupInviteActivity = GroupInviteActivity.this;
            if (i == groupInviteActivity.copyLinkRow || i == groupInviteActivity.shareLinkRow || i == groupInviteActivity.revokeLinkRow) {
                return 0;
            }
            if (i == groupInviteActivity.shadowRow || i == groupInviteActivity.linkInfoRow) {
                return 1;
            }
            return i == 0 ? 2 : 0;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int adapterPosition = viewHolder.getAdapterPosition();
            GroupInviteActivity groupInviteActivity = GroupInviteActivity.this;
            return adapterPosition == groupInviteActivity.revokeLinkRow || adapterPosition == groupInviteActivity.copyLinkRow || adapterPosition == groupInviteActivity.shareLinkRow || adapterPosition == 0;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int i2 = viewHolder.mItemViewType;
            GroupInviteActivity groupInviteActivity = GroupInviteActivity.this;
            View view = viewHolder.itemView;
            if (i2 == 0) {
                TextSettingsCell textSettingsCell = (TextSettingsCell) view;
                if (i == groupInviteActivity.copyLinkRow) {
                    textSettingsCell.setText(LocaleController.getString(R.string.CopyLink), true);
                    return;
                } else if (i == groupInviteActivity.shareLinkRow) {
                    textSettingsCell.setText(LocaleController.getString(R.string.ShareLink), false);
                    return;
                } else {
                    if (i == groupInviteActivity.revokeLinkRow) {
                        textSettingsCell.setText(LocaleController.getString(R.string.RevokeLink), true);
                        return;
                    }
                    return;
                }
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    return;
                }
                TextBlockCell textBlockCell = (TextBlockCell) view;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = groupInviteActivity.invite;
                textBlockCell.textView.setText(tL_chatInviteExported != null ? tL_chatInviteExported.link : "error");
                textBlockCell.setWillNotDraw(true);
                return;
            }
            TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) view;
            int i3 = groupInviteActivity.shadowRow;
            Context context = this.mContext;
            if (i == i3) {
                textInfoPrivacyCell.setText("");
                textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
            } else if (i == groupInviteActivity.linkInfoRow) {
                TLRPC.Chat chat = groupInviteActivity.getMessagesController().getChat(Long.valueOf(groupInviteActivity.chatId));
                if (!ChatObject.isChannel(chat) || chat.megagroup) {
                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.LinkInfo));
                } else {
                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.ChannelLinkInfo));
                }
                textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View textSettingsCell;
            Context context = this.mContext;
            if (i == 0) {
                textSettingsCell = new TextSettingsCell(context, 0, null);
                textSettingsCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
            } else if (i != 1) {
                textSettingsCell = new TextBlockCell(context);
                textSettingsCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
            } else {
                textSettingsCell = new TextInfoPrivacyCell(context, 24, null);
            }
            return new RecyclerListView.Holder(textSettingsCell);
        }
    }

    public GroupInviteActivity(long j) {
        super(null);
        this.chatId = j;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.InviteLink));
        this.actionBar.setActionBarMenuOnItemClick(new LoginActivity.AnonymousClass1(this, 23));
        this.listAdapter = new ListAdapter(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        EmptyTextProgressView emptyTextProgressView = new EmptyTextProgressView(context, null);
        this.emptyView = emptyTextProgressView;
        emptyTextProgressView.showProgress();
        frameLayout.addView(this.emptyView, LayoutHelper.createFrame(-1, -1, 51));
        RecyclerListView recyclerListView = new RecyclerListView(context, null);
        this.listView = recyclerListView;
        zzku.m(recyclerListView);
        this.listView.setEmptyView(this.emptyView);
        this.listView.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1, 51));
        this.listView.setAdapter(this.listAdapter);
        this.listView.setOnItemClickListener(new PhotoViewer$$ExternalSyntheticLambda61(this, 15));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            int iIntValue = ((Integer) objArr[1]).intValue();
            long j = chatFull.id;
            long j2 = this.chatId;
            if (j == j2 && iIntValue == this.classGuid) {
                TLRPC.TL_chatInviteExported exportedInvite = getMessagesController().getExportedInvite(j2);
                this.invite = exportedInvite;
                if (exportedInvite == null) {
                    generateLink$1(false);
                    return;
                }
                this.loading = false;
                ListAdapter listAdapter = this.listAdapter;
                if (listAdapter != null) {
                    listAdapter.mObservable.notifyChanged();
                }
            }
        }
    }

    public final void generateLink$1(boolean z) {
        this.loading = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.peer = getMessagesController().getInputPeer(-this.chatId);
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_exportChatInvite, new CallLogActivity$$ExternalSyntheticLambda31(7, this, z)), this.classGuid);
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.mObservable.notifyChanged();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ThemeDescription(this.listView, 16, new Class[]{TextSettingsCell.class, TextBlockCell.class}, null, null, null, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(this.fragmentView, 1, null, null, null, null, Theme.key_windowBackgroundGray));
        ActionBar actionBar = this.actionBar;
        int i = Theme.key_actionBarDefault;
        arrayList.add(new ThemeDescription(actionBar, 1, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.listView, 32768, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.listView, 4096, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.emptyView, 2048, null, null, null, null, Theme.key_progressCircle));
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 32, new Class[]{TextInfoPrivacyCell.class}, null, null, null, Theme.key_windowBackgroundGrayShadow));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText4));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextBlockCell.class}, new String[]{"textView"}, null, null, -1, null, i2));
        return arrayList;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        getMessagesController().loadFullChat(this.chatId, this.classGuid, true);
        this.loading = true;
        this.linkInfoRow = 1;
        this.copyLinkRow = 2;
        this.revokeLinkRow = 3;
        this.shareLinkRow = 4;
        this.rowCount = 6;
        this.shadowRow = 5;
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
    }

    @Override
    public final void onResume() {
        super.onResume();
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.mObservable.notifyChanged();
        }
    }
}
