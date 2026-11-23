package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class f91 implements org.telegram.ui.Components.qo {
    public final TLRPC.TL_forumTopic f47611a;
    public final y91 f47612b;

    public f91(y91 y91Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f47612b = y91Var;
        this.f47611a = tL_forumTopic;
    }

    @Override
    public final void B(int i7) {
        y91 y91Var = this.f47612b;
        long j3 = y91Var.f54075a;
        y91Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.f47611a;
        if (i7 == 0) {
            if (y91Var.getMessagesController().u2(-j3, tL_forumTopic.f28450id, null)) {
                y91Var.getNotificationsController().G(-j3, tL_forumTopic.f28450id, false);
            }
            if (org.telegram.ui.Components.lc.a(y91Var)) {
                org.telegram.ui.Components.lc.z(y91Var, 4, i7, y91Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        y91Var.getNotificationsController().H(-j3, i7, tL_forumTopic.f28450id);
        if (org.telegram.ui.Components.lc.a(y91Var)) {
            org.telegram.ui.Components.lc.z(y91Var, 5, i7, y91Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void dismiss() {
        this.f47612b.finishPreviewFragment();
    }

    @Override
    public final void s() {
        int i7;
        int i10;
        y91 y91Var = this.f47612b;
        y91Var.finishPreviewFragment();
        org.telegram.messenger.np messagesController = y91Var.getMessagesController();
        long j3 = y91Var.f54075a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f47611a;
        boolean u22 = messagesController.u2(-j3, tL_forumTopic.f28450id, null);
        y91Var.getNotificationsController().G(-j3, tL_forumTopic.f28450id, !u22);
        if (org.telegram.ui.Components.lc.a(y91Var)) {
            if (!u22) {
                i7 = 3;
            } else {
                i7 = 4;
            }
            if (!u22) {
                i10 = Integer.MAX_VALUE;
            } else {
                i10 = 0;
            }
            org.telegram.ui.Components.lc.z(y91Var, i7, i10, y91Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void u() {
        this.f47612b.finishPreviewFragment();
        org.telegram.messenger.g0.h3(new b31(11, this, this.f47611a), 500L);
    }

    @Override
    public final void w() {
        int i7;
        y91 y91Var = this.f47612b;
        i7 = ((org.telegram.ui.ActionBar.g2) y91Var).currentAccount;
        SharedPreferences sharedPreferences = org.telegram.messenger.np.u1(i7).f25821g7;
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j3 = y91Var.f54075a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f47611a;
        sb2.append(org.telegram.messenger.ys.v(-j3, tL_forumTopic.f28450id, false));
        boolean z10 = sharedPreferences.getBoolean(sb2.toString(), true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("sound_enabled_" + org.telegram.messenger.ys.v(-j3, tL_forumTopic.f28450id, false), z11).apply();
        y91Var.finishPreviewFragment();
        if (org.telegram.ui.Components.lc.a(y91Var)) {
            org.telegram.ui.Components.lc.S(z10 ? 1 : 0, y91Var, y91Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void p() {
    }
}
