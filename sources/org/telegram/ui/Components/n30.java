package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class n30 implements Runnable {
    public final o30 f29028a;

    public n30(o30 o30Var) {
        this.f29028a = o30Var;
    }

    @Override
    public final void run() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isMicMute()) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.participants.f(sharedInstance.getSelfId());
            if (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || ChatObject.canManageCalls(sharedInstance.getChat())) {
                o30 o30Var = this.f29028a;
                AndroidUtilities.runOnUIThread(o30Var.f29377f, 90L);
                try {
                    o30Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                o30Var.f29375c = true;
            }
        }
    }
}
