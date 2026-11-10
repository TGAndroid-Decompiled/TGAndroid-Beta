package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class a70 extends org.telegram.ui.cn {
    public boolean f31730td;
    public final boolean f31731ud;
    public final long f31732vd;
    public final b70 f31733wd;

    public a70(b70 b70Var, Bundle bundle, boolean z9, long j3) {
        super(bundle);
        this.f31733wd = b70Var;
        this.f31731ud = z9;
        this.f31732vd = j3;
        this.f31730td = false;
    }

    public static void Gd(a70 a70Var, long j3, TLRPC.Chat chat) {
        boolean z9;
        if (!org.telegram.messenger.g0.E1(a70Var.getParentActivity())) {
            return;
        }
        Activity parentActivity = a70Var.getParentActivity();
        int i7 = a70Var.currentAccount;
        long j10 = -j3;
        TLRPC.User f10 = a70Var.getUserConfig().f();
        if (chat.admin_rights != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        ey0.c(parentActivity, i7, j10, f10, null, z9, chat.creator, a70Var.f31733wd.I0);
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f31730td && this.f31731ud) {
            this.f31730td = true;
            org.telegram.messenger.qp messagesController = getMessagesController();
            long j3 = this.f31732vd;
            TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j3));
            if (org.telegram.messenger.t3.h(M0)) {
                bc K = gc.a0(this).K(2131623989, org.telegram.messenger.id.M0(2131749071, null), org.telegram.messenger.id.M0(2131749070, null), new bi.d3(this, j3, M0, 23));
                K.f32211r = false;
                K.k(true);
                return;
            }
            bc Q = gc.a0(this).Q(2131623989, 36, org.telegram.messenger.id.M0(2131749071, null));
            Q.f32211r = false;
            Q.k(true);
        }
    }
}
