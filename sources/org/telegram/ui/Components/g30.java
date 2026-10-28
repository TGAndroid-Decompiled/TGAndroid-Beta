package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class g30 implements Runnable {
    public final h30 f28368a;

    public g30(h30 h30Var) {
        this.f28368a = h30Var;
    }

    @Override
    public final void run() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isMicMute()) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.participants.f(sharedInstance.getSelfId());
            if (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || ChatObject.canManageCalls(sharedInstance.getChat())) {
                h30 h30Var = this.f28368a;
                AndroidUtilities.runOnUIThread(h30Var.f28845f, 90L);
                try {
                    h30Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                h30Var.f28844c = true;
            }
        }
    }
}
