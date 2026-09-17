package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class lf1 implements org.telegram.ui.Components.oo {
    public final TLRPC.TL_forumTopic f35538a;
    public final fg1 f35539b;

    public lf1(fg1 fg1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f35539b = fg1Var;
        this.f35538a = tL_forumTopic;
    }

    @Override
    public final void dismiss() {
        this.f35539b.finishPreviewFragment();
    }

    @Override
    public final void n() {
        int i10;
        int i11;
        fg1 fg1Var = this.f35539b;
        fg1Var.finishPreviewFragment();
        MessagesController messagesController = fg1Var.getMessagesController();
        long j3 = fg1Var.f33636a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f35538a;
        boolean isDialogMuted = messagesController.isDialogMuted(-j3, tL_forumTopic.f18173id);
        fg1Var.getNotificationsController().muteDialog(-j3, tL_forumTopic.f18173id, !isDialogMuted);
        if (org.telegram.ui.Components.vc.a(fg1Var)) {
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
            org.telegram.ui.Components.vc.z(fg1Var, i10, i11, fg1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void o() {
        this.f35539b.finishPreviewFragment();
        AndroidUtilities.runOnUIThread(new qb1(6, this, this.f35538a), 500L);
    }

    @Override
    public final void r() {
        int i10;
        fg1 fg1Var = this.f35539b;
        i10 = ((org.telegram.ui.ActionBar.o2) fg1Var).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j3 = fg1Var.f33636a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f35538a;
        boolean z10 = notificationsSettings.getBoolean(org.telegram.messenger.w1.i(-j3, tL_forumTopic.f18173id, sb2), true);
        boolean z11 = !z10 ? 1 : 0;
        notificationsSettings.edit().putBoolean(org.telegram.messenger.w1.i(-j3, tL_forumTopic.f18173id, new StringBuilder("sound_enabled_")), z11).apply();
        fg1Var.finishPreviewFragment();
        if (org.telegram.ui.Components.vc.a(fg1Var)) {
            org.telegram.ui.Components.vc.S(z10 ? 1 : 0, fg1Var, fg1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void t(int i10) {
        fg1 fg1Var = this.f35539b;
        long j3 = fg1Var.f33636a;
        fg1Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.f35538a;
        if (i10 == 0) {
            if (fg1Var.getMessagesController().isDialogMuted(-j3, tL_forumTopic.f18173id)) {
                fg1Var.getNotificationsController().muteDialog(-j3, tL_forumTopic.f18173id, false);
            }
            if (org.telegram.ui.Components.vc.a(fg1Var)) {
                org.telegram.ui.Components.vc.z(fg1Var, 4, i10, fg1Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        fg1Var.getNotificationsController().muteUntil(-j3, tL_forumTopic.f18173id, i10);
        if (org.telegram.ui.Components.vc.a(fg1Var)) {
            org.telegram.ui.Components.vc.z(fg1Var, 5, i10, fg1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void l() {
    }
}
