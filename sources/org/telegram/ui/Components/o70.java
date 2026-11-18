package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class o70 extends org.telegram.ui.bn {
    public boolean f38006vd;
    public final boolean f38007wd;
    public final long f38008xd;
    public final p70 f38009yd;

    public o70(p70 p70Var, Bundle bundle, boolean z10, long j3) {
        super(bundle);
        this.f38009yd = p70Var;
        this.f38007wd = z10;
        this.f38008xd = j3;
        this.f38006vd = false;
    }

    public static void Hd(o70 o70Var, long j3, TLRPC.Chat chat) {
        boolean z10;
        if (!org.telegram.messenger.g0.E1(o70Var.getParentActivity())) {
            return;
        }
        Activity parentActivity = o70Var.getParentActivity();
        int i7 = o70Var.currentAccount;
        long j10 = -j3;
        TLRPC.User f10 = o70Var.getUserConfig().f();
        if (chat.admin_rights != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        ny0.c(parentActivity, i7, j10, f10, null, z10, chat.creator, o70Var.f38009yd.J0);
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f38006vd && this.f38007wd) {
            this.f38006vd = true;
            org.telegram.messenger.mp messagesController = getMessagesController();
            long j3 = this.f38008xd;
            TLRPC.Chat O0 = messagesController.O0(Long.valueOf(j3));
            if (org.telegram.messenger.v3.h(O0)) {
                gc K = lc.b0(this).K(2131623990, org.telegram.messenger.gd.M0(2131748879, null), org.telegram.messenger.gd.M0(2131748878, null), new bi.m2(this, j3, O0, 24));
                K.f35469r = false;
                K.k(true);
                return;
            }
            gc Q = lc.b0(this).Q(2131623990, 36, org.telegram.messenger.gd.M0(2131748879, null));
            Q.f35469r = false;
            Q.k(true);
        }
    }
}
