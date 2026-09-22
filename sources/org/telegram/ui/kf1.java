package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class kf1 implements org.telegram.ui.Components.oo {
    public final TLRPC.TL_forumTopic f35141a;
    public final eg1 f35142b;

    public kf1(eg1 eg1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f35142b = eg1Var;
        this.f35141a = tL_forumTopic;
    }

    @Override
    public final void dismiss() {
        this.f35142b.finishPreviewFragment();
    }

    @Override
    public final void n() {
        int i10;
        int i11;
        eg1 eg1Var = this.f35142b;
        eg1Var.finishPreviewFragment();
        MessagesController messagesController = eg1Var.getMessagesController();
        long j3 = eg1Var.f33291a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f35141a;
        boolean isDialogMuted = messagesController.isDialogMuted(-j3, tL_forumTopic.f18161id);
        eg1Var.getNotificationsController().muteDialog(-j3, tL_forumTopic.f18161id, !isDialogMuted);
        if (org.telegram.ui.Components.vc.a(eg1Var)) {
            if (!isDialogMuted) {
                i10 = 3;
            } else {
                i10 = 4;
            }
            if (!isDialogMuted) {
                i11 = Integer.MAX_VALUE;
            } else {
                i11 = 0;
            }
            org.telegram.ui.Components.vc.z(eg1Var, i10, i11, eg1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void o() {
        this.f35142b.finishPreviewFragment();
        AndroidUtilities.runOnUIThread(new pb1(6, this, this.f35141a), 500L);
    }

    @Override
    public final void r() {
        int i10;
        eg1 eg1Var = this.f35142b;
        i10 = ((org.telegram.ui.ActionBar.n2) eg1Var).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j3 = eg1Var.f33291a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f35141a;
        boolean z10 = notificationsSettings.getBoolean(org.telegram.messenger.y0.i(-j3, tL_forumTopic.f18161id, sb2), true);
        boolean z11 = !z10 ? 1 : 0;
        notificationsSettings.edit().putBoolean(org.telegram.messenger.y0.i(-j3, tL_forumTopic.f18161id, new StringBuilder("sound_enabled_")), z11).apply();
        eg1Var.finishPreviewFragment();
        if (org.telegram.ui.Components.vc.a(eg1Var)) {
            org.telegram.ui.Components.vc.S(z10 ? 1 : 0, eg1Var, eg1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void t(int i10) {
        eg1 eg1Var = this.f35142b;
        long j3 = eg1Var.f33291a;
        eg1Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.f35141a;
        if (i10 == 0) {
            if (eg1Var.getMessagesController().isDialogMuted(-j3, tL_forumTopic.f18161id)) {
                eg1Var.getNotificationsController().muteDialog(-j3, tL_forumTopic.f18161id, false);
            }
            if (org.telegram.ui.Components.vc.a(eg1Var)) {
                org.telegram.ui.Components.vc.z(eg1Var, 4, i10, eg1Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        eg1Var.getNotificationsController().muteUntil(-j3, tL_forumTopic.f18161id, i10);
        if (org.telegram.ui.Components.vc.a(eg1Var)) {
            org.telegram.ui.Components.vc.z(eg1Var, 5, i10, eg1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void l() {
    }
}
