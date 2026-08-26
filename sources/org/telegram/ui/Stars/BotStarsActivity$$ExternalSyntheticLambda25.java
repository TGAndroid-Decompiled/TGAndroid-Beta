package org.telegram.ui.Stars;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.TopicsTabsView;
import org.telegram.ui.LinkManager$$ExternalSyntheticLambda3;
import org.telegram.ui.TwoStepVerificationActivity;

public final class BotStarsActivity$$ExternalSyntheticLambda25 implements Runnable {
    public final int $r8$classId = 1;
    public final NotificationCenter.NotificationCenterDelegate f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final boolean f$4;
    public final long f$5;
    public final TLObject f$6;

    public BotStarsActivity$$ExternalSyntheticLambda25(TopicsTabsView topicsTabsView, boolean z, ActionBarMenuSubItem actionBarMenuSubItem, ItemOptions itemOptions, long j, TLRPC.User user, TLRPC.Chat chat) {
        this.f$0 = topicsTabsView;
        this.f$4 = z;
        this.f$1 = actionBarMenuSubItem;
        this.f$2 = itemOptions;
        this.f$5 = j;
        this.f$3 = user;
        this.f$6 = chat;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((BotStarsActivity) this.f$0).lambda$initWithdraw$23((TLRPC.TL_error) this.f$1, (TwoStepVerificationActivity) this.f$2, (Activity) this.f$3, this.f$4, this.f$5, this.f$6);
                break;
            default:
                final TopicsTabsView topicsTabsView = (TopicsTabsView) this.f$0;
                topicsTabsView.getClass();
                boolean z = this.f$4;
                final boolean z2 = !z;
                ActionBarMenuSubItem actionBarMenuSubItem = (ActionBarMenuSubItem) this.f$1;
                actionBarMenuSubItem.setVisibility(0);
                actionBarMenuSubItem.setText(LocaleController.getString(!z ? R.string.UnbanUserMonoforum : R.string.BanUserMonoforum));
                final ItemOptions itemOptions = (ItemOptions) this.f$2;
                final TLRPC.User user = (TLRPC.User) this.f$3;
                final TLRPC.Chat chat = (TLRPC.Chat) this.f$6;
                final long j = this.f$5;
                actionBarMenuSubItem.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        TopicsTabsView topicsTabsView2 = topicsTabsView;
                        topicsTabsView2.getClass();
                        itemOptions.dismiss();
                        TLRPC.User user2 = user;
                        boolean z3 = z2;
                        int i = topicsTabsView2.currentAccount;
                        if (!z3) {
                            MessagesController.getInstance(i).deleteParticipantFromChat(j, user2, (TLRPC.Chat) null, false, false);
                            return;
                        }
                        TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
                        tL_channels_editBanned.participant = MessagesController.getInputPeer(user2);
                        tL_channels_editBanned.channel = MessagesController.getInputChannel(chat);
                        tL_channels_editBanned.banned_rights = new TLRPC.TL_chatBannedRights();
                        ConnectionsManager.getInstance(i).sendRequest(tL_channels_editBanned, new LinkManager$$ExternalSyntheticLambda3(topicsTabsView2, 4));
                    }
                });
                break;
        }
    }

    public BotStarsActivity$$ExternalSyntheticLambda25(BotStarsActivity botStarsActivity, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z, long j, TLObject tLObject) {
        this.f$0 = botStarsActivity;
        this.f$1 = tL_error;
        this.f$2 = twoStepVerificationActivity;
        this.f$3 = activity;
        this.f$4 = z;
        this.f$5 = j;
        this.f$6 = tLObject;
    }
}
