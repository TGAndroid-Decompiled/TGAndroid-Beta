package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class c30 implements Runnable {
    public final d30 f25165a;

    public c30(d30 d30Var) {
        this.f25165a = d30Var;
    }

    @Override
    public final void run() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isMicMute()) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.participants.f(sharedInstance.getSelfId());
            if (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || ChatObject.canManageCalls(sharedInstance.getChat())) {
                d30 d30Var = this.f25165a;
                AndroidUtilities.runOnUIThread(d30Var.f25536f, 90L);
                try {
                    d30Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                d30Var.f25535c = true;
            }
        }
    }
}
