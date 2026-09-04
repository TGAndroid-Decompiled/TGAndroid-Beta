package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class w20 implements Runnable {
    public final x20 f32089a;

    public w20(x20 x20Var) {
        this.f32089a = x20Var;
    }

    @Override
    public final void run() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isMicMute()) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.participants.f(sharedInstance.getSelfId());
            if (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || ChatObject.canManageCalls(sharedInstance.getChat())) {
                x20 x20Var = this.f32089a;
                AndroidUtilities.runOnUIThread(x20Var.f32416f, 90L);
                try {
                    x20Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                x20Var.f32414c = true;
            }
        }
    }
}
