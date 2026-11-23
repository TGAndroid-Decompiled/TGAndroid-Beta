package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class d91 implements org.telegram.ui.Components.no {
    public final TLRPC.TL_forumTopic f47016a;
    public final w91 f47017b;

    public d91(w91 w91Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f47017b = w91Var;
        this.f47016a = tL_forumTopic;
    }

    @Override
    public final void J() {
        int i7;
        w91 w91Var = this.f47017b;
        i7 = ((org.telegram.ui.ActionBar.g2) w91Var).currentAccount;
        SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(i7).f25753g7;
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j3 = w91Var.f53216a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f47016a;
        sb2.append(org.telegram.messenger.xs.v(-j3, tL_forumTopic.f28544id, false));
        boolean z10 = sharedPreferences.getBoolean(sb2.toString(), true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("sound_enabled_" + org.telegram.messenger.xs.v(-j3, tL_forumTopic.f28544id, false), z11).apply();
        w91Var.finishPreviewFragment();
        if (org.telegram.ui.Components.kc.a(w91Var)) {
            org.telegram.ui.Components.kc.S(z10 ? 1 : 0, w91Var, w91Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void Q(int i7) {
        w91 w91Var = this.f47017b;
        long j3 = w91Var.f53216a;
        w91Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.f47016a;
        if (i7 == 0) {
            if (w91Var.getMessagesController().u2(-j3, tL_forumTopic.f28544id, null)) {
                w91Var.getNotificationsController().G(-j3, tL_forumTopic.f28544id, false);
            }
            if (org.telegram.ui.Components.kc.a(w91Var)) {
                org.telegram.ui.Components.kc.z(w91Var, 4, i7, w91Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        w91Var.getNotificationsController().H(-j3, i7, tL_forumTopic.f28544id);
        if (org.telegram.ui.Components.kc.a(w91Var)) {
            org.telegram.ui.Components.kc.z(w91Var, 5, i7, w91Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void dismiss() {
        this.f47017b.finishPreviewFragment();
    }

    @Override
    public final void v() {
        int i7;
        int i10;
        w91 w91Var = this.f47017b;
        w91Var.finishPreviewFragment();
        org.telegram.messenger.mp messagesController = w91Var.getMessagesController();
        long j3 = w91Var.f53216a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f47016a;
        boolean u22 = messagesController.u2(-j3, tL_forumTopic.f28544id, null);
        w91Var.getNotificationsController().G(-j3, tL_forumTopic.f28544id, !u22);
        if (org.telegram.ui.Components.kc.a(w91Var)) {
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
            org.telegram.ui.Components.kc.z(w91Var, i7, i10, w91Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void y() {
        this.f47017b.finishPreviewFragment();
        org.telegram.messenger.g0.h3(new iy0(17, this, this.f47016a), 500L);
    }

    @Override
    public final void u() {
    }
}
