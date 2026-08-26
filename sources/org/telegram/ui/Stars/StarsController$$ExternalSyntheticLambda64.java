package org.telegram.ui.Stars;

import com.google.android.exoplayer2.util.Log;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class StarsController$$ExternalSyntheticLambda64 implements Runnable {
    public final int $r8$classId = 1;
    public final Object f$0;
    public final TLObject f$1;
    public final long f$2;
    public final long f$3;
    public final boolean f$4;

    public StarsController$$ExternalSyntheticLambda64(MessagesStorage messagesStorage, long j, boolean z, TLRPC.InputPeer inputPeer, long j2) {
        this.f$0 = messagesStorage;
        this.f$2 = j;
        this.f$4 = z;
        this.f$1 = inputPeer;
        this.f$3 = j2;
    }

    @Override
    public final void run() {
        TLRPC.PeerSettings peerSettings;
        TLObject tLObject = this.f$1;
        Object obj = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                StarsController starsController = (StarsController) obj;
                starsController.getClass();
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    long j = this.f$2;
                    long j2 = this.f$3;
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
                            tL_forumTopicFindTopic.nopaid_messages_exception = this.f$4;
                            topicsController.saveTopics(j3);
                            NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesFeeUpdated, Long.valueOf(j2));
                        }
                    }
                }
                break;
            default:
                ((MessagesStorage) obj).lambda$loadPendingTasks$15(this.f$2, this.f$4, (TLRPC.InputPeer) tLObject, this.f$3);
                break;
        }
    }

    public StarsController$$ExternalSyntheticLambda64(StarsController starsController, TLObject tLObject, long j, long j2, boolean z) {
        this.f$0 = starsController;
        this.f$1 = tLObject;
        this.f$2 = j;
        this.f$3 = j2;
        this.f$4 = z;
    }
}
