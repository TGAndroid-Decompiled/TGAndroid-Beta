package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class lf1 implements org.telegram.ui.Components.ep {
    public final TLRPC.TL_forumTopic f39611a;
    public final fg1 f39612b;

    public lf1(fg1 fg1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f39612b = fg1Var;
        this.f39611a = tL_forumTopic;
    }

    @Override
    public final void dismiss() {
        this.f39612b.finishPreviewFragment();
    }

    @Override
    public final void o() {
        int i10;
        int i11;
        fg1 fg1Var = this.f39612b;
        fg1Var.finishPreviewFragment();
        MessagesController messagesController = fg1Var.getMessagesController();
        long j3 = fg1Var.f37602a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f39611a;
        boolean isDialogMuted = messagesController.isDialogMuted(-j3, tL_forumTopic.f20094id);
        fg1Var.getNotificationsController().muteDialog(-j3, tL_forumTopic.f20094id, !isDialogMuted);
        if (org.telegram.ui.Components.ad.a(fg1Var)) {
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
            org.telegram.ui.Components.ad.z(fg1Var, i10, i11, fg1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void p() {
        this.f39612b.finishPreviewFragment();
        AndroidUtilities.runOnUIThread(new n31(20, this, this.f39611a), 500L);
    }

    @Override
    public final void s() {
        int i10;
        fg1 fg1Var = this.f39612b;
        i10 = ((org.telegram.ui.ActionBar.n2) fg1Var).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j3 = fg1Var.f37602a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f39611a;
        boolean z10 = notificationsSettings.getBoolean(org.telegram.messenger.q.i(-j3, tL_forumTopic.f20094id, sb2), true);
        boolean z11 = !z10 ? 1 : 0;
        notificationsSettings.edit().putBoolean(org.telegram.messenger.q.i(-j3, tL_forumTopic.f20094id, new StringBuilder("sound_enabled_")), z11).apply();
        fg1Var.finishPreviewFragment();
        if (org.telegram.ui.Components.ad.a(fg1Var)) {
            org.telegram.ui.Components.ad.S(z10 ? 1 : 0, fg1Var, fg1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void x(int i10) {
        fg1 fg1Var = this.f39612b;
        long j3 = fg1Var.f37602a;
        fg1Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.f39611a;
        if (i10 == 0) {
            if (fg1Var.getMessagesController().isDialogMuted(-j3, tL_forumTopic.f20094id)) {
                fg1Var.getNotificationsController().muteDialog(-j3, tL_forumTopic.f20094id, false);
            }
            if (org.telegram.ui.Components.ad.a(fg1Var)) {
                org.telegram.ui.Components.ad.z(fg1Var, 4, i10, fg1Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        fg1Var.getNotificationsController().muteUntil(-j3, tL_forumTopic.f20094id, i10);
        if (org.telegram.ui.Components.ad.a(fg1Var)) {
            org.telegram.ui.Components.ad.z(fg1Var, 5, i10, fg1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void m() {
    }
}
