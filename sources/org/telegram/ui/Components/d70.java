package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class d70 extends org.telegram.ui.an {
    public boolean f33858ud;
    public final boolean f33859vd;
    public final long f33860wd;
    public final e70 f33861xd;

    public d70(e70 e70Var, Bundle bundle, boolean z10, long j3) {
        super(bundle);
        this.f33861xd = e70Var;
        this.f33859vd = z10;
        this.f33860wd = j3;
        this.f33858ud = false;
    }

    public static void Hd(d70 d70Var, long j3, TLRPC.Chat chat) {
        boolean z10;
        if (!org.telegram.messenger.g0.E1(d70Var.getParentActivity())) {
            return;
        }
        Activity parentActivity = d70Var.getParentActivity();
        int i7 = d70Var.currentAccount;
        long j10 = -j3;
        TLRPC.User f10 = d70Var.getUserConfig().f();
        if (chat.admin_rights != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        gy0.c(parentActivity, i7, j10, f10, null, z10, chat.creator, d70Var.f33861xd.J0);
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f33858ud && this.f33859vd) {
            this.f33858ud = true;
            org.telegram.messenger.np messagesController = getMessagesController();
            long j3 = this.f33860wd;
            TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j3));
            if (org.telegram.messenger.t3.h(M0)) {
                xb K = cc.a0(this).K(2131623990, org.telegram.messenger.hd.M0(2131749071, null), org.telegram.messenger.hd.M0(2131749070, null), new bi.m1(this, j3, M0, 24));
                K.f41643r = false;
                K.k(true);
                return;
            }
            xb Q = cc.a0(this).Q(2131623990, 36, org.telegram.messenger.hd.M0(2131749071, null));
            Q.f41643r = false;
            Q.k(true);
        }
    }
}
