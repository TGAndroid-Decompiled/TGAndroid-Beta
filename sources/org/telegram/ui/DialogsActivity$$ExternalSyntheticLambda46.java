package org.telegram.ui;

import com.google.android.exoplayer2.util.Log;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Stars.StarsController;

public final class DialogsActivity$$ExternalSyntheticLambda46 implements Runnable {
    public final int $r8$classId = 1;
    public final Object f$0;
    public final long f$1;
    public final long f$2;
    public final boolean f$3;
    public final Object f$4;

    public DialogsActivity$$ExternalSyntheticLambda46(MessagesStorage messagesStorage, long j, boolean z, TLRPC.InputPeer inputPeer, long j2) {
        this.f$0 = messagesStorage;
        this.f$1 = j;
        this.f$3 = z;
        this.f$4 = inputPeer;
        this.f$2 = j2;
    }

    @Override
    public final void run() {
        TLRPC.PeerSettings peerSettings;
        Object obj = this.f$4;
        Object obj2 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                ((DialogsActivity) obj2).lambda$didSelectResult$134(this.f$1, this.f$2, this.f$3, (TopicsFragment) obj);
                break;
            case 1:
                ((MessagesStorage) obj2).lambda$loadPendingTasks$15(this.f$1, this.f$3, (TLRPC.InputPeer) obj, this.f$2);
                break;
            default:
                StarsController starsController = (StarsController) obj2;
                starsController.getClass();
                if (((TLObject) obj) instanceof TLRPC.TL_boolTrue) {
                    long j = this.f$1;
                    long j2 = this.f$2;
                    int i = starsController.currentAccount;
                    if (j == 0) {
                        TLRPC.UserFull userFull = MessagesController.getInstance(i).getUserFull(j2);
                        if (userFull != null && (peerSettings = userFull.settings) != null) {
                            peerSettings.flags &= -16385;
                            peerSettings.charge_paid_message_stars = 0L;
                        }
                        MessagesController.getNotificationsSettings(i).edit().putLong(Log.m(j2, "dialog_bar_paying_"), 0L).apply();
                        MessagesController.getInstance(i).loadPeerSettings(MessagesController.getInstance(i).getUser(Long.valueOf(j2)), MessagesController.getInstance(i).getChat(Long.valueOf(-j2)), true);
                        ContactsController.getInstance(i).loadPrivacySettings(true);
                        NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesFeeUpdated, Long.valueOf(j2));
                    } else {
                        long j3 = -j;
                        TopicsController topicsController = MessagesController.getInstance(i).getTopicsController();
                        TLRPC.TL_forumTopic tL_forumTopicFindTopic = topicsController.findTopic(j3, j2);
                        if (tL_forumTopicFindTopic != null) {
                            tL_forumTopicFindTopic.nopaid_messages_exception = this.f$3;
                            topicsController.saveTopics(j3);
                            NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesFeeUpdated, Long.valueOf(j2));
                        }
                    }
                }
                break;
        }
    }

    public DialogsActivity$$ExternalSyntheticLambda46(DialogsActivity dialogsActivity, long j, long j2, boolean z, TopicsFragment topicsFragment) {
        this.f$0 = dialogsActivity;
        this.f$1 = j;
        this.f$2 = j2;
        this.f$3 = z;
        this.f$4 = topicsFragment;
    }

    public DialogsActivity$$ExternalSyntheticLambda46(StarsController starsController, TLObject tLObject, long j, long j2, boolean z) {
        this.f$0 = starsController;
        this.f$4 = tLObject;
        this.f$1 = j;
        this.f$2 = j2;
        this.f$3 = z;
    }
}
