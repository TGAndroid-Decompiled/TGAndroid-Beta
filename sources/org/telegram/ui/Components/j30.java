package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class j30 implements Runnable {
    public final k30 f26177a;

    public j30(k30 k30Var) {
        this.f26177a = k30Var;
    }

    @Override
    public final void run() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isMicMute()) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.participants.f(sharedInstance.getSelfId());
            if (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || ChatObject.canManageCalls(sharedInstance.getChat())) {
                k30 k30Var = this.f26177a;
                AndroidUtilities.runOnUIThread(k30Var.f26571f, 90L);
                try {
                    k30Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                k30Var.f26570c = true;
            }
        }
    }
}
