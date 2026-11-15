package org.telegram.ui.Components;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class p10 implements Runnable {
    public final q10 f38144a;

    public p10(q10 q10Var) {
        this.f38144a = q10Var;
    }

    @Override
    public final void run() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isMicMute()) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.d.f(sharedInstance.getSelfId());
            if (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || org.telegram.messenger.t3.w(14, sharedInstance.getChat())) {
                q10 q10Var = this.f38144a;
                org.telegram.messenger.g0.i3(q10Var.f38468f, 90L);
                try {
                    q10Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                q10Var.f38466c = true;
            }
        }
    }
}
