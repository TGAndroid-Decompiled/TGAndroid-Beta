package org.telegram.ui.Components;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class m10 implements Runnable {
    public final n10 f35841a;

    public m10(n10 n10Var) {
        this.f35841a = n10Var;
    }

    @Override
    public final void run() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isMicMute()) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.d.f(sharedInstance.getSelfId());
            if (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || org.telegram.messenger.t3.w(14, sharedInstance.getChat())) {
                n10 n10Var = this.f35841a;
                org.telegram.messenger.g0.i3(n10Var.f36188f, 90L);
                try {
                    n10Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                n10Var.f36186c = true;
            }
        }
    }
}
