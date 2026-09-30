package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class a30 implements Runnable {
    public final b30 f22548a;

    public a30(b30 b30Var) {
        this.f22548a = b30Var;
    }

    @Override
    public final void run() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isMicMute()) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.participants.f(sharedInstance.getSelfId());
            if (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || ChatObject.canManageCalls(sharedInstance.getChat())) {
                b30 b30Var = this.f22548a;
                AndroidUtilities.runOnUIThread(b30Var.f22803f, 90L);
                try {
                    b30Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                b30Var.f22802c = true;
            }
        }
    }
}
