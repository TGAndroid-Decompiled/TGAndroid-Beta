package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class b70 extends org.telegram.ui.cn {
    public boolean f32121td;
    public final boolean f32122ud;
    public final long f32123vd;
    public final c70 f32124wd;

    public b70(c70 c70Var, Bundle bundle, boolean z9, long j3) {
        super(bundle);
        this.f32124wd = c70Var;
        this.f32122ud = z9;
        this.f32123vd = j3;
        this.f32121td = false;
    }

    public static void Gd(b70 b70Var, long j3, TLRPC.Chat chat) {
        boolean z9;
        if (!org.telegram.messenger.g0.E1(b70Var.getParentActivity())) {
            return;
        }
        Activity parentActivity = b70Var.getParentActivity();
        int i7 = b70Var.currentAccount;
        long j10 = -j3;
        TLRPC.User f10 = b70Var.getUserConfig().f();
        if (chat.admin_rights != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        fy0.c(parentActivity, i7, j10, f10, null, z9, chat.creator, b70Var.f32124wd.I0);
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f32121td && this.f32122ud) {
            this.f32121td = true;
            org.telegram.messenger.qp messagesController = getMessagesController();
            long j3 = this.f32123vd;
            TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j3));
            if (org.telegram.messenger.t3.h(M0)) {
                cc K = hc.a0(this).K(2131623989, org.telegram.messenger.id.M0(2131749071, null), org.telegram.messenger.id.M0(2131749070, null), new bi.d3(this, j3, M0, 23));
                K.f32635r = false;
                K.k(true);
                return;
            }
            cc Q = hc.a0(this).Q(2131623989, 36, org.telegram.messenger.id.M0(2131749071, null));
            Q.f32635r = false;
            Q.k(true);
        }
    }
}
