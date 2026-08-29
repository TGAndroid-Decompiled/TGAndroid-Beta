package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class s20 implements Runnable {
    public final t20 f32462a;

    public s20(t20 t20Var) {
        this.f32462a = t20Var;
    }

    @Override
    public final void run() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isMicMute()) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.participants.f(sharedInstance.getSelfId());
            if (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || ChatObject.canManageCalls(sharedInstance.getChat())) {
                t20 t20Var = this.f32462a;
                AndroidUtilities.runOnUIThread(t20Var.f32827f, 90L);
                try {
                    t20Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                t20Var.f32825c = true;
            }
        }
    }
}
