package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class w20 implements Runnable {
    public final x20 f32116a;

    public w20(x20 x20Var) {
        this.f32116a = x20Var;
    }

    @Override
    public final void run() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isMicMute()) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.participants.f(sharedInstance.getSelfId());
            if (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || ChatObject.canManageCalls(sharedInstance.getChat())) {
                x20 x20Var = this.f32116a;
                AndroidUtilities.runOnUIThread(x20Var.f32443f, 90L);
                try {
                    x20Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                x20Var.f32441c = true;
            }
        }
    }
}
