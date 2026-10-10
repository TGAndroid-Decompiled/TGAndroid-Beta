package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class o30 implements Runnable {
    public final p30 f29334a;

    public o30(p30 p30Var) {
        this.f29334a = p30Var;
    }

    @Override
    public final void run() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isMicMute()) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.participants.f(sharedInstance.getSelfId());
            if (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || ChatObject.canManageCalls(sharedInstance.getChat())) {
                p30 p30Var = this.f29334a;
                AndroidUtilities.runOnUIThread(p30Var.f29687f, 90L);
                try {
                    p30Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                p30Var.f29685c = true;
            }
        }
    }
}
