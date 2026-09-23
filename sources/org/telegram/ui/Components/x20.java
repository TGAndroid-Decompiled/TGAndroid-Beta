package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class x20 implements Runnable {
    public final y20 f29875a;

    public x20(y20 y20Var) {
        this.f29875a = y20Var;
    }

    @Override
    public final void run() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isMicMute()) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.participants.f(sharedInstance.getSelfId());
            if (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || ChatObject.canManageCalls(sharedInstance.getChat())) {
                y20 y20Var = this.f29875a;
                AndroidUtilities.runOnUIThread(y20Var.f30142f, 90L);
                try {
                    y20Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                y20Var.f30141c = true;
            }
        }
    }
}
