package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.voip.VoIPHelper;

public final class LaunchActivity$14$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final LaunchActivity.AnonymousClass14 f$0;
    public final AccountInstance f$1;
    public final long f$2;
    public final BaseFragment f$3;

    public LaunchActivity$14$$ExternalSyntheticLambda1(LaunchActivity.AnonymousClass14 anonymousClass14, AccountInstance accountInstance, long j, BaseFragment baseFragment, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass14;
        this.f$1 = accountInstance;
        this.f$2 = j;
        this.f$3 = baseFragment;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                AndroidUtilities.runOnUIThread(new LaunchActivity$14$$ExternalSyntheticLambda1(this.f$0, this.f$1, this.f$2, this.f$3, 1));
                break;
            default:
                LaunchActivity.AnonymousClass14 anonymousClass14 = this.f$0;
                anonymousClass14.getClass();
                AccountInstance accountInstance = this.f$1;
                MessagesController messagesController = accountInstance.getMessagesController();
                long j = this.f$2;
                long j2 = -j;
                ChatObject.Call groupCall = messagesController.getGroupCall(j2, false);
                TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(j2));
                accountInstance.getMessagesController().getInputPeer(j);
                VoIPHelper.startCall(chat, null, false, Boolean.valueOf(groupCall == null || !groupCall.call.rtmp_stream), LaunchActivity.this, this.f$3, accountInstance);
                break;
        }
    }
}
