package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class y20 implements Runnable {
    public final z20 f30546a;

    public y20(z20 z20Var) {
        this.f30546a = z20Var;
    }

    @Override
    public final void run() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isMicMute()) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.participants.f(sharedInstance.getSelfId());
            if (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || ChatObject.canManageCalls(sharedInstance.getChat())) {
                z20 z20Var = this.f30546a;
                AndroidUtilities.runOnUIThread(z20Var.f30774f, 90L);
                try {
                    z20Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                z20Var.f30773c = true;
            }
        }
    }
}
