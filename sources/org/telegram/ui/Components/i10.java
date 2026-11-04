package org.telegram.ui.Components;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class i10 implements Runnable {
    public final j10 f34566a;

    public i10(j10 j10Var) {
        this.f34566a = j10Var;
    }

    @Override
    public final void run() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isMicMute()) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.d.f(sharedInstance.getSelfId());
            if (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || org.telegram.messenger.t3.w(14, sharedInstance.getChat())) {
                j10 j10Var = this.f34566a;
                org.telegram.messenger.g0.i3(j10Var.f34914f, 90L);
                try {
                    j10Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                j10Var.f34912c = true;
            }
        }
    }
}
