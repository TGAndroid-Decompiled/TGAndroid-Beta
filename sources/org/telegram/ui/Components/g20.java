package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class g20 implements Runnable {
    public final h20 f28631a;

    public g20(h20 h20Var) {
        this.f28631a = h20Var;
    }

    @Override
    public final void run() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isMicMute()) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.participants.f(sharedInstance.getSelfId());
            if (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || ChatObject.canManageCalls(sharedInstance.getChat())) {
                h20 h20Var = this.f28631a;
                AndroidUtilities.runOnUIThread(h20Var.f28953f, 90L);
                try {
                    h20Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                h20Var.f28951c = true;
            }
        }
    }
}
