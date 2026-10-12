package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class q30 implements Runnable {
    public final r30 f29655a;

    public q30(r30 r30Var) {
        this.f29655a = r30Var;
    }

    @Override
    public final void run() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isMicMute()) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.participants.f(sharedInstance.getSelfId());
            if (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || ChatObject.canManageCalls(sharedInstance.getChat())) {
                r30 r30Var = this.f29655a;
                AndroidUtilities.runOnUIThread(r30Var.f30028f, 90L);
                try {
                    r30Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                r30Var.f30026c = true;
            }
        }
    }
}
