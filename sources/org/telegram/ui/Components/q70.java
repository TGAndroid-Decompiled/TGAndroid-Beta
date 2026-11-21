package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class q70 extends org.telegram.ui.bn {
    public boolean f38807vd;
    public final boolean f38808wd;
    public final long f38809xd;
    public final r70 f38810yd;

    public q70(r70 r70Var, Bundle bundle, boolean z10, long j3) {
        super(bundle);
        this.f38810yd = r70Var;
        this.f38808wd = z10;
        this.f38809xd = j3;
        this.f38807vd = false;
    }

    public static void Hd(q70 q70Var, long j3, TLRPC.Chat chat) {
        boolean z10;
        if (!org.telegram.messenger.g0.E1(q70Var.getParentActivity())) {
            return;
        }
        Activity parentActivity = q70Var.getParentActivity();
        int i7 = q70Var.currentAccount;
        long j10 = -j3;
        TLRPC.User f10 = q70Var.getUserConfig().f();
        if (chat.admin_rights != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        py0.c(parentActivity, i7, j10, f10, null, z10, chat.creator, q70Var.f38810yd.J0);
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f38807vd && this.f38808wd) {
            this.f38807vd = true;
            org.telegram.messenger.mp messagesController = getMessagesController();
            long j3 = this.f38809xd;
            TLRPC.Chat O0 = messagesController.O0(Long.valueOf(j3));
            if (org.telegram.messenger.v3.h(O0)) {
                gc K = lc.b0(this).K(2131623990, org.telegram.messenger.gd.N0(2131748878, null), org.telegram.messenger.gd.N0(2131748877, null), new bi.q2(this, j3, O0, 24));
                K.f35516r = false;
                K.k(true);
                return;
            }
            gc Q = lc.b0(this).Q(2131623990, 36, org.telegram.messenger.gd.N0(2131748878, null));
            Q.f35516r = false;
            Q.k(true);
        }
    }
}
