package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class g91 implements org.telegram.ui.Components.wn {
    public final TLRPC.TL_forumTopic f46051a;
    public final z91 f46052b;

    public g91(z91 z91Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f46052b = z91Var;
        this.f46051a = tL_forumTopic;
    }

    @Override
    public final void L() {
        int i7;
        z91 z91Var = this.f46052b;
        i7 = ((org.telegram.ui.ActionBar.f2) z91Var).currentAccount;
        SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(i7).f24768d7;
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j3 = z91Var.f52343a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f46051a;
        sb2.append(org.telegram.messenger.dt.v(-j3, tL_forumTopic.f27012id, false));
        boolean z9 = sharedPreferences.getBoolean(sb2.toString(), true);
        boolean z10 = !z9 ? 1 : 0;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("sound_enabled_" + org.telegram.messenger.dt.v(-j3, tL_forumTopic.f27012id, false), z10).apply();
        z91Var.finishPreviewFragment();
        if (org.telegram.ui.Components.gc.a(z91Var)) {
            org.telegram.ui.Components.gc.S(z9 ? 1 : 0, z91Var, z91Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void R(int i7) {
        z91 z91Var = this.f46052b;
        long j3 = z91Var.f52343a;
        z91Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.f46051a;
        if (i7 == 0) {
            if (z91Var.getMessagesController().r2(-j3, tL_forumTopic.f27012id, null)) {
                z91Var.getNotificationsController().G(-j3, tL_forumTopic.f27012id, false);
            }
            if (org.telegram.ui.Components.gc.a(z91Var)) {
                org.telegram.ui.Components.gc.z(z91Var, 4, i7, z91Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        z91Var.getNotificationsController().H(-j3, i7, tL_forumTopic.f27012id);
        if (org.telegram.ui.Components.gc.a(z91Var)) {
            org.telegram.ui.Components.gc.z(z91Var, 5, i7, z91Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void dismiss() {
        this.f46052b.finishPreviewFragment();
    }

    @Override
    public final void p() {
        int i7;
        int i10;
        z91 z91Var = this.f46052b;
        z91Var.finishPreviewFragment();
        org.telegram.messenger.qp messagesController = z91Var.getMessagesController();
        long j3 = z91Var.f52343a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f46051a;
        boolean r22 = messagesController.r2(-j3, tL_forumTopic.f27012id, null);
        z91Var.getNotificationsController().G(-j3, tL_forumTopic.f27012id, !r22);
        if (org.telegram.ui.Components.gc.a(z91Var)) {
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
            org.telegram.ui.Components.gc.z(z91Var, i7, i10, z91Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void y() {
        this.f46052b.finishPreviewFragment();
        org.telegram.messenger.g0.i3(new rw0(21, this, this.f46051a), 500L);
    }

    @Override
    public final void n() {
    }
}
