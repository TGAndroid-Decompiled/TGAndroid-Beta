package org.telegram.ui.Components;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class z10 implements Runnable {
    public final a20 f42582a;

    public z10(a20 a20Var) {
        this.f42582a = a20Var;
    }

    @Override
    public final void run() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isMicMute()) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.d.f(sharedInstance.getSelfId());
            if (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || org.telegram.messenger.v3.w(14, sharedInstance.getChat())) {
                a20 a20Var = this.f42582a;
                org.telegram.messenger.g0.h3(a20Var.f33244f, 90L);
                try {
                    a20Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                a20Var.f33242c = true;
            }
        }
    }
}
