package org.telegram.ui.Components;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class l10 implements Runnable {
    public final m10 f35485a;

    public l10(m10 m10Var) {
        this.f35485a = m10Var;
    }

    @Override
    public final void run() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isMicMute()) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.d.f(sharedInstance.getSelfId());
            if (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || org.telegram.messenger.t3.w(14, sharedInstance.getChat())) {
                m10 m10Var = this.f35485a;
                org.telegram.messenger.g0.i3(m10Var.f35791f, 90L);
                try {
                    m10Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                m10Var.f35789c = true;
            }
        }
    }
}
