package org.telegram.ui.Components;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class x10 implements Runnable {
    public final y10 f41806a;

    public x10(y10 y10Var) {
        this.f41806a = y10Var;
    }

    @Override
    public final void run() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isMicMute()) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.d.f(sharedInstance.getSelfId());
            if (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || org.telegram.messenger.v3.w(14, sharedInstance.getChat())) {
                y10 y10Var = this.f41806a;
                org.telegram.messenger.g0.h3(y10Var.f42292f, 90L);
                try {
                    y10Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                y10Var.f42290c = true;
            }
        }
    }
}
