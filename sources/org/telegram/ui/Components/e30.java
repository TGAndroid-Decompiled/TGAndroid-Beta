package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class e30 implements Runnable {
    public final f30 f25707a;

    public e30(f30 f30Var) {
        this.f25707a = f30Var;
    }

    @Override
    public final void run() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isMicMute()) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.participants.f(sharedInstance.getSelfId());
            if (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || ChatObject.canManageCalls(sharedInstance.getChat())) {
                f30 f30Var = this.f25707a;
                AndroidUtilities.runOnUIThread(f30Var.f26067f, 90L);
                try {
                    f30Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                f30Var.f26066c = true;
            }
        }
    }
}
