package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class a70 extends org.telegram.ui.an {
    public boolean f31704rd;
    public final boolean f31705sd;
    public final long f31706td;
    public final b70 f31707ud;

    public a70(b70 b70Var, Bundle bundle, boolean z9, long j3) {
        super(bundle);
        this.f31707ud = b70Var;
        this.f31705sd = z9;
        this.f31706td = j3;
        this.f31704rd = false;
    }

    public static void Dd(a70 a70Var, long j3, TLRPC.Chat chat) {
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
        dy0.c(parentActivity, i7, j10, f10, null, z9, chat.creator, a70Var.f31707ud.I0);
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f31704rd && this.f31705sd) {
            this.f31704rd = true;
            org.telegram.messenger.qp messagesController = getMessagesController();
            long j3 = this.f31706td;
            TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j3));
            if (org.telegram.messenger.t3.h(M0)) {
                cc K = hc.a0(this).K(2131623989, org.telegram.messenger.hd.M0(2131749070, null), org.telegram.messenger.hd.M0(2131749069, null), new bi.d3(this, j3, M0, 23));
                K.f32531r = false;
                K.k(true);
                return;
            }
            cc Q = hc.a0(this).Q(2131623989, 36, org.telegram.messenger.hd.M0(2131749070, null));
            Q.f32531r = false;
            Q.k(true);
        }
    }
}
