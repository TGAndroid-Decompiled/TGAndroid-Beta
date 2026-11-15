package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class b91 implements org.telegram.ui.Components.ho {
    public final TLRPC.TL_forumTopic f45651a;
    public final u91 f45652b;

    public b91(u91 u91Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f45652b = u91Var;
        this.f45651a = tL_forumTopic;
    }

    @Override
    public final void F() {
        this.f45652b.finishPreviewFragment();
        org.telegram.messenger.g0.i3(new fy0(16, this, this.f45651a), 500L);
    }

    @Override
    public final void J() {
        int i7;
        u91 u91Var = this.f45652b;
        i7 = ((org.telegram.ui.ActionBar.e2) u91Var).currentAccount;
        SharedPreferences sharedPreferences = org.telegram.messenger.np.s1(i7).f25273e7;
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j3 = u91Var.f51835a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f45651a;
        sb2.append(org.telegram.messenger.at.v(-j3, tL_forumTopic.f28103id, false));
        boolean z10 = sharedPreferences.getBoolean(sb2.toString(), true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("sound_enabled_" + org.telegram.messenger.at.v(-j3, tL_forumTopic.f28103id, false), z11).apply();
        u91Var.finishPreviewFragment();
        if (org.telegram.ui.Components.cc.a(u91Var)) {
            org.telegram.ui.Components.cc.S(z10 ? 1 : 0, u91Var, u91Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void R(int i7) {
        u91 u91Var = this.f45652b;
        long j3 = u91Var.f51835a;
        u91Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.f45651a;
        if (i7 == 0) {
            if (u91Var.getMessagesController().r2(-j3, tL_forumTopic.f28103id, null)) {
                u91Var.getNotificationsController().G(-j3, tL_forumTopic.f28103id, false);
            }
            if (org.telegram.ui.Components.cc.a(u91Var)) {
                org.telegram.ui.Components.cc.z(u91Var, 4, i7, u91Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        u91Var.getNotificationsController().H(-j3, i7, tL_forumTopic.f28103id);
        if (org.telegram.ui.Components.cc.a(u91Var)) {
            org.telegram.ui.Components.cc.z(u91Var, 5, i7, u91Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void dismiss() {
        this.f45652b.finishPreviewFragment();
    }

    @Override
    public final void u() {
        int i7;
        int i10;
        u91 u91Var = this.f45652b;
        u91Var.finishPreviewFragment();
        org.telegram.messenger.np messagesController = u91Var.getMessagesController();
        long j3 = u91Var.f51835a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f45651a;
        boolean r22 = messagesController.r2(-j3, tL_forumTopic.f28103id, null);
        u91Var.getNotificationsController().G(-j3, tL_forumTopic.f28103id, !r22);
        if (org.telegram.ui.Components.cc.a(u91Var)) {
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
            org.telegram.ui.Components.cc.z(u91Var, i7, i10, u91Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void t() {
    }
}
