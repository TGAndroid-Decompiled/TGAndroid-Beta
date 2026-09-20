package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class lf1 implements org.telegram.ui.Components.oo {
    public final TLRPC.TL_forumTopic f35435a;
    public final fg1 f35436b;

    public lf1(fg1 fg1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f35436b = fg1Var;
        this.f35435a = tL_forumTopic;
    }

    @Override
    public final void dismiss() {
        this.f35436b.finishPreviewFragment();
    }

    @Override
    public final void n() {
        int i10;
        int i11;
        fg1 fg1Var = this.f35436b;
        fg1Var.finishPreviewFragment();
        MessagesController messagesController = fg1Var.getMessagesController();
        long j3 = fg1Var.f33596a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f35435a;
        boolean isDialogMuted = messagesController.isDialogMuted(-j3, tL_forumTopic.f18380id);
        fg1Var.getNotificationsController().muteDialog(-j3, tL_forumTopic.f18380id, !isDialogMuted);
        if (org.telegram.ui.Components.xc.a(fg1Var)) {
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
            org.telegram.ui.Components.xc.z(fg1Var, i10, i11, fg1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void o() {
        this.f35436b.finishPreviewFragment();
        AndroidUtilities.runOnUIThread(new w81(12, this, this.f35435a), 500L);
    }

    @Override
    public final void r() {
        int i10;
        fg1 fg1Var = this.f35436b;
        i10 = ((org.telegram.ui.ActionBar.n2) fg1Var).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j3 = fg1Var.f33596a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f35435a;
        boolean z10 = notificationsSettings.getBoolean(org.telegram.messenger.l0.h(-j3, tL_forumTopic.f18380id, sb2), true);
        boolean z11 = !z10 ? 1 : 0;
        notificationsSettings.edit().putBoolean(org.telegram.messenger.l0.h(-j3, tL_forumTopic.f18380id, new StringBuilder("sound_enabled_")), z11).apply();
        fg1Var.finishPreviewFragment();
        if (org.telegram.ui.Components.xc.a(fg1Var)) {
            org.telegram.ui.Components.xc.S(z10 ? 1 : 0, fg1Var, fg1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void u(int i10) {
        fg1 fg1Var = this.f35436b;
        long j3 = fg1Var.f33596a;
        fg1Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.f35435a;
        if (i10 == 0) {
            if (fg1Var.getMessagesController().isDialogMuted(-j3, tL_forumTopic.f18380id)) {
                fg1Var.getNotificationsController().muteDialog(-j3, tL_forumTopic.f18380id, false);
            }
            if (org.telegram.ui.Components.xc.a(fg1Var)) {
                org.telegram.ui.Components.xc.z(fg1Var, 4, i10, fg1Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        fg1Var.getNotificationsController().muteUntil(-j3, tL_forumTopic.f18380id, i10);
        if (org.telegram.ui.Components.xc.a(fg1Var)) {
            org.telegram.ui.Components.xc.z(fg1Var, 5, i10, fg1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void m() {
    }
}
