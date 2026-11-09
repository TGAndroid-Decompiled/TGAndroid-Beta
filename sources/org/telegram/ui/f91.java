package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class f91 implements org.telegram.ui.Components.xn {
    public final TLRPC.TL_forumTopic f45670a;
    public final y91 f45671b;

    public f91(y91 y91Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f45671b = y91Var;
        this.f45670a = tL_forumTopic;
    }

    @Override
    public final void L() {
        int i7;
        y91 y91Var = this.f45671b;
        i7 = ((org.telegram.ui.ActionBar.f2) y91Var).currentAccount;
        SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(i7).f24764d7;
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j3 = y91Var.f52013a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f45670a;
        sb2.append(org.telegram.messenger.dt.v(-j3, tL_forumTopic.f27008id, false));
        boolean z9 = sharedPreferences.getBoolean(sb2.toString(), true);
        boolean z10 = !z9 ? 1 : 0;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("sound_enabled_" + org.telegram.messenger.dt.v(-j3, tL_forumTopic.f27008id, false), z10).apply();
        y91Var.finishPreviewFragment();
        if (org.telegram.ui.Components.hc.a(y91Var)) {
            org.telegram.ui.Components.hc.S(z9 ? 1 : 0, y91Var, y91Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void R(int i7) {
        y91 y91Var = this.f45671b;
        long j3 = y91Var.f52013a;
        y91Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.f45670a;
        if (i7 == 0) {
            if (y91Var.getMessagesController().r2(-j3, tL_forumTopic.f27008id, null)) {
                y91Var.getNotificationsController().G(-j3, tL_forumTopic.f27008id, false);
            }
            if (org.telegram.ui.Components.hc.a(y91Var)) {
                org.telegram.ui.Components.hc.z(y91Var, 4, i7, y91Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        y91Var.getNotificationsController().H(-j3, i7, tL_forumTopic.f27008id);
        if (org.telegram.ui.Components.hc.a(y91Var)) {
            org.telegram.ui.Components.hc.z(y91Var, 5, i7, y91Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void dismiss() {
        this.f45671b.finishPreviewFragment();
    }

    @Override
    public final void p() {
        int i7;
        int i10;
        y91 y91Var = this.f45671b;
        y91Var.finishPreviewFragment();
        org.telegram.messenger.qp messagesController = y91Var.getMessagesController();
        long j3 = y91Var.f52013a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f45670a;
        boolean r22 = messagesController.r2(-j3, tL_forumTopic.f27008id, null);
        y91Var.getNotificationsController().G(-j3, tL_forumTopic.f27008id, !r22);
        if (org.telegram.ui.Components.hc.a(y91Var)) {
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
            org.telegram.ui.Components.hc.z(y91Var, i7, i10, y91Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void y() {
        this.f45671b.finishPreviewFragment();
        org.telegram.messenger.g0.i3(new ax0(20, this, this.f45670a), 500L);
    }

    @Override
    public final void n() {
    }
}
