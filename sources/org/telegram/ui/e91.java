package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class e91 implements org.telegram.ui.Components.xn {
    public final TLRPC.TL_forumTopic f45244a;
    public final w91 f45245b;

    public e91(w91 w91Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f45245b = w91Var;
        this.f45244a = tL_forumTopic;
    }

    @Override
    public final void L() {
        int i7;
        w91 w91Var = this.f45245b;
        i7 = ((org.telegram.ui.ActionBar.f2) w91Var).currentAccount;
        SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(i7).f24764d7;
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j3 = w91Var.f50992a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f45244a;
        sb2.append(org.telegram.messenger.dt.v(-j3, tL_forumTopic.f27008id, false));
        boolean z9 = sharedPreferences.getBoolean(sb2.toString(), true);
        boolean z10 = !z9 ? 1 : 0;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("sound_enabled_" + org.telegram.messenger.dt.v(-j3, tL_forumTopic.f27008id, false), z10).apply();
        w91Var.finishPreviewFragment();
        if (org.telegram.ui.Components.hc.a(w91Var)) {
            org.telegram.ui.Components.hc.S(z9 ? 1 : 0, w91Var, w91Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void R(int i7) {
        w91 w91Var = this.f45245b;
        long j3 = w91Var.f50992a;
        w91Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.f45244a;
        if (i7 == 0) {
            if (w91Var.getMessagesController().r2(-j3, tL_forumTopic.f27008id, null)) {
                w91Var.getNotificationsController().G(-j3, tL_forumTopic.f27008id, false);
            }
            if (org.telegram.ui.Components.hc.a(w91Var)) {
                org.telegram.ui.Components.hc.z(w91Var, 4, i7, w91Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        w91Var.getNotificationsController().H(-j3, i7, tL_forumTopic.f27008id);
        if (org.telegram.ui.Components.hc.a(w91Var)) {
            org.telegram.ui.Components.hc.z(w91Var, 5, i7, w91Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void dismiss() {
        this.f45245b.finishPreviewFragment();
    }

    @Override
    public final void p() {
        int i7;
        int i10;
        w91 w91Var = this.f45245b;
        w91Var.finishPreviewFragment();
        org.telegram.messenger.qp messagesController = w91Var.getMessagesController();
        long j3 = w91Var.f50992a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f45244a;
        boolean r22 = messagesController.r2(-j3, tL_forumTopic.f27008id, null);
        w91Var.getNotificationsController().G(-j3, tL_forumTopic.f27008id, !r22);
        if (org.telegram.ui.Components.hc.a(w91Var)) {
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
            org.telegram.ui.Components.hc.z(w91Var, i7, i10, w91Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void y() {
        this.f45245b.finishPreviewFragment();
        org.telegram.messenger.g0.i3(new by0(19, this, this.f45244a), 500L);
    }

    @Override
    public final void n() {
    }
}
