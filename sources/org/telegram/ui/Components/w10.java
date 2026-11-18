package org.telegram.ui.Components;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class w10 implements Runnable {
    public final x10 f41520a;

    public w10(x10 x10Var) {
        this.f41520a = x10Var;
    }

    @Override
    public final void run() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isMicMute()) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.d.f(sharedInstance.getSelfId());
            if (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || org.telegram.messenger.v3.w(14, sharedInstance.getChat())) {
                x10 x10Var = this.f41520a;
                org.telegram.messenger.g0.h3(x10Var.f41862f, 90L);
                try {
                    x10Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                x10Var.f41860c = true;
            }
        }
    }
}
