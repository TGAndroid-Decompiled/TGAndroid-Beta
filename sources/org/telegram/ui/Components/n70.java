package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class n70 extends org.telegram.ui.bn {
    public boolean f37699vd;
    public final boolean f37700wd;
    public final long f37701xd;
    public final o70 f37702yd;

    public n70(o70 o70Var, Bundle bundle, boolean z10, long j3) {
        super(bundle);
        this.f37702yd = o70Var;
        this.f37700wd = z10;
        this.f37701xd = j3;
        this.f37699vd = false;
    }

    public static void Hd(n70 n70Var, long j3, TLRPC.Chat chat) {
        boolean z10;
        if (!org.telegram.messenger.g0.E1(n70Var.getParentActivity())) {
            return;
        }
        Activity parentActivity = n70Var.getParentActivity();
        int i7 = n70Var.currentAccount;
        long j10 = -j3;
        TLRPC.User f10 = n70Var.getUserConfig().f();
        if (chat.admin_rights != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        oy0.c(parentActivity, i7, j10, f10, null, z10, chat.creator, n70Var.f37702yd.J0);
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f37699vd && this.f37700wd) {
            this.f37699vd = true;
            org.telegram.messenger.mp messagesController = getMessagesController();
            long j3 = this.f37701xd;
            TLRPC.Chat O0 = messagesController.O0(Long.valueOf(j3));
            if (org.telegram.messenger.v3.h(O0)) {
                fc K = kc.b0(this).K(2131623990, org.telegram.messenger.gd.N0(2131748878, null), org.telegram.messenger.gd.N0(2131748877, null), new bi.s2(this, j3, O0, 24));
                K.f35099r = false;
                K.k(true);
                return;
            }
            fc Q = kc.b0(this).Q(2131623990, 36, org.telegram.messenger.gd.N0(2131748878, null));
            Q.f35099r = false;
            Q.k(true);
        }
    }
}
