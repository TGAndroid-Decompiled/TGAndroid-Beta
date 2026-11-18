package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class f91 implements org.telegram.ui.Components.oo {
    public final TLRPC.TL_forumTopic f47577a;
    public final y91 f47578b;

    public f91(y91 y91Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f47578b = y91Var;
        this.f47577a = tL_forumTopic;
    }

    @Override
    public final void B(int i7) {
        y91 y91Var = this.f47578b;
        long j3 = y91Var.f54050a;
        y91Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.f47577a;
        if (i7 == 0) {
            if (y91Var.getMessagesController().u2(-j3, tL_forumTopic.f28455id, null)) {
                y91Var.getNotificationsController().G(-j3, tL_forumTopic.f28455id, false);
            }
            if (org.telegram.ui.Components.lc.a(y91Var)) {
                org.telegram.ui.Components.lc.z(y91Var, 4, i7, y91Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        y91Var.getNotificationsController().H(-j3, i7, tL_forumTopic.f28455id);
        if (org.telegram.ui.Components.lc.a(y91Var)) {
            org.telegram.ui.Components.lc.z(y91Var, 5, i7, y91Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void dismiss() {
        this.f47578b.finishPreviewFragment();
    }

    @Override
    public final void s() {
        int i7;
        int i10;
        y91 y91Var = this.f47578b;
        y91Var.finishPreviewFragment();
        org.telegram.messenger.mp messagesController = y91Var.getMessagesController();
        long j3 = y91Var.f54050a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f47577a;
        boolean u22 = messagesController.u2(-j3, tL_forumTopic.f28455id, null);
        y91Var.getNotificationsController().G(-j3, tL_forumTopic.f28455id, !u22);
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
        this.f47578b.finishPreviewFragment();
        org.telegram.messenger.g0.h3(new b31(11, this, this.f47577a), 500L);
    }

    @Override
    public final void w() {
        int i7;
        y91 y91Var = this.f47578b;
        i7 = ((org.telegram.ui.ActionBar.h2) y91Var).currentAccount;
        SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(i7).f25658g7;
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j3 = y91Var.f54050a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f47577a;
        sb2.append(org.telegram.messenger.xs.v(-j3, tL_forumTopic.f28455id, false));
        boolean z10 = sharedPreferences.getBoolean(sb2.toString(), true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("sound_enabled_" + org.telegram.messenger.xs.v(-j3, tL_forumTopic.f28455id, false), z11).apply();
        y91Var.finishPreviewFragment();
        if (org.telegram.ui.Components.lc.a(y91Var)) {
            org.telegram.ui.Components.lc.S(z10 ? 1 : 0, y91Var, y91Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void p() {
    }
}
