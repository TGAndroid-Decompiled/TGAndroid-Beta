package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class d91 implements org.telegram.ui.Components.xn {
    public final TLRPC.TL_forumTopic f45031a;
    public final v91 f45032b;

    public d91(v91 v91Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f45032b = v91Var;
        this.f45031a = tL_forumTopic;
    }

    @Override
    public final void L() {
        int i7;
        v91 v91Var = this.f45032b;
        i7 = ((org.telegram.ui.ActionBar.f2) v91Var).currentAccount;
        SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(i7).f24749d7;
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j3 = v91Var.f50629a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f45031a;
        sb2.append(org.telegram.messenger.dt.v(-j3, tL_forumTopic.f27004id, false));
        boolean z9 = sharedPreferences.getBoolean(sb2.toString(), true);
        boolean z10 = !z9 ? 1 : 0;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("sound_enabled_" + org.telegram.messenger.dt.v(-j3, tL_forumTopic.f27004id, false), z10).apply();
        v91Var.finishPreviewFragment();
        if (org.telegram.ui.Components.hc.a(v91Var)) {
            org.telegram.ui.Components.hc.S(z9 ? 1 : 0, v91Var, v91Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void R(int i7) {
        v91 v91Var = this.f45032b;
        long j3 = v91Var.f50629a;
        v91Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.f45031a;
        if (i7 == 0) {
            if (v91Var.getMessagesController().r2(-j3, tL_forumTopic.f27004id, null)) {
                v91Var.getNotificationsController().G(-j3, tL_forumTopic.f27004id, false);
            }
            if (org.telegram.ui.Components.hc.a(v91Var)) {
                org.telegram.ui.Components.hc.z(v91Var, 4, i7, v91Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        v91Var.getNotificationsController().H(-j3, i7, tL_forumTopic.f27004id);
        if (org.telegram.ui.Components.hc.a(v91Var)) {
            org.telegram.ui.Components.hc.z(v91Var, 5, i7, v91Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void dismiss() {
        this.f45032b.finishPreviewFragment();
    }

    @Override
    public final void p() {
        int i7;
        int i10;
        v91 v91Var = this.f45032b;
        v91Var.finishPreviewFragment();
        org.telegram.messenger.qp messagesController = v91Var.getMessagesController();
        long j3 = v91Var.f50629a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f45031a;
        boolean r22 = messagesController.r2(-j3, tL_forumTopic.f27004id, null);
        v91Var.getNotificationsController().G(-j3, tL_forumTopic.f27004id, !r22);
        if (org.telegram.ui.Components.hc.a(v91Var)) {
            if (!r22) {
                i7 = 3;
            } else {
                i7 = 4;
            }
            if (!r22) {
                i10 = Integer.MAX_VALUE;
            } else {
                i10 = 0;
            }
            org.telegram.ui.Components.hc.z(v91Var, i7, i10, v91Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void y() {
        this.f45032b.finishPreviewFragment();
        org.telegram.messenger.g0.i3(new by0(19, this, this.f45031a), 500L);
    }

    @Override
    public final void n() {
    }
}
