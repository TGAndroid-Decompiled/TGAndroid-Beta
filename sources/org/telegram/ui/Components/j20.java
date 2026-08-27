package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;

public final class j20 implements Runnable {

    public final k20 f29563a;

    public j20(k20 k20Var) {
        this.f29563a = k20Var;
    }

    @Override
    public final void run() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || !sharedInstance.isMicMute()) {
            return;
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.participants.f(sharedInstance.getSelfId());
        if (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || ChatObject.canManageCalls(sharedInstance.getChat())) {
            k20 k20Var = this.f29563a;
            AndroidUtilities.runOnUIThread(k20Var.f29904f, 90L);
            try {
                k20Var.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            k20Var.f29902c = true;
        }
    }
}
