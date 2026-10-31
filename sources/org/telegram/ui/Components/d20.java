package org.telegram.ui.Components;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class d20 implements Runnable {
    public final e20 f25263a;

    public d20(e20 e20Var) {
        this.f25263a = e20Var;
    }

    @Override
    public final void run() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isMicMute()) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.d.f(sharedInstance.getSelfId());
            if (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || org.telegram.messenger.w3.w(14, sharedInstance.getChat())) {
                e20 e20Var = this.f25263a;
                org.telegram.messenger.i0.h3(e20Var.f25626f, 90L);
                try {
                    e20Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                e20Var.f25625c = true;
            }
        }
    }
}
