package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class z20 implements Runnable {
    public final a30 f33738a;

    public z20(a30 a30Var) {
        this.f33738a = a30Var;
    }

    @Override
    public final void run() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isMicMute()) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.participants.f(sharedInstance.getSelfId());
            if (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || ChatObject.canManageCalls(sharedInstance.getChat())) {
                a30 a30Var = this.f33738a;
                AndroidUtilities.runOnUIThread(a30Var.f25149f, 90L);
                try {
                    a30Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                a30Var.f25147c = true;
            }
        }
    }
}
