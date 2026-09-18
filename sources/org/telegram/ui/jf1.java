package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class jf1 implements org.telegram.ui.Components.oo {
    public final TLRPC.TL_forumTopic f34867a;
    public final dg1 f34868b;

    public jf1(dg1 dg1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f34868b = dg1Var;
        this.f34867a = tL_forumTopic;
    }

    @Override
    public final void dismiss() {
        this.f34868b.finishPreviewFragment();
    }

    @Override
    public final void n() {
        int i10;
        int i11;
        dg1 dg1Var = this.f34868b;
        dg1Var.finishPreviewFragment();
        MessagesController messagesController = dg1Var.getMessagesController();
        long j3 = dg1Var.f32970a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f34867a;
        boolean isDialogMuted = messagesController.isDialogMuted(-j3, tL_forumTopic.f18348id);
        dg1Var.getNotificationsController().muteDialog(-j3, tL_forumTopic.f18348id, !isDialogMuted);
        if (org.telegram.ui.Components.xc.a(dg1Var)) {
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
            org.telegram.ui.Components.xc.z(dg1Var, i10, i11, dg1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void o() {
        this.f34868b.finishPreviewFragment();
        AndroidUtilities.runOnUIThread(new x81(10, this, this.f34867a), 500L);
    }

    @Override
    public final void r() {
        int i10;
        dg1 dg1Var = this.f34868b;
        i10 = ((org.telegram.ui.ActionBar.n2) dg1Var).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j3 = dg1Var.f32970a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f34867a;
        boolean z10 = notificationsSettings.getBoolean(org.telegram.messenger.q.j(-j3, tL_forumTopic.f18348id, sb2), true);
        boolean z11 = !z10 ? 1 : 0;
        notificationsSettings.edit().putBoolean(org.telegram.messenger.q.j(-j3, tL_forumTopic.f18348id, new StringBuilder("sound_enabled_")), z11).apply();
        dg1Var.finishPreviewFragment();
        if (org.telegram.ui.Components.xc.a(dg1Var)) {
            org.telegram.ui.Components.xc.S(z10 ? 1 : 0, dg1Var, dg1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void u(int i10) {
        dg1 dg1Var = this.f34868b;
        long j3 = dg1Var.f32970a;
        dg1Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.f34867a;
        if (i10 == 0) {
            if (dg1Var.getMessagesController().isDialogMuted(-j3, tL_forumTopic.f18348id)) {
                dg1Var.getNotificationsController().muteDialog(-j3, tL_forumTopic.f18348id, false);
            }
            if (org.telegram.ui.Components.xc.a(dg1Var)) {
                org.telegram.ui.Components.xc.z(dg1Var, 4, i10, dg1Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        dg1Var.getNotificationsController().muteUntil(-j3, tL_forumTopic.f18348id, i10);
        if (org.telegram.ui.Components.xc.a(dg1Var)) {
            org.telegram.ui.Components.xc.z(dg1Var, 5, i10, dg1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void m() {
    }
}
