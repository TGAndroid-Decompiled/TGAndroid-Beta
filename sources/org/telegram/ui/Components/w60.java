package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class w60 extends org.telegram.ui.wm {
    public boolean f39915sd;
    public final boolean f39916td;
    public final long f39917ud;
    public final x60 f39918vd;

    public w60(x60 x60Var, Bundle bundle, boolean z10, long j10) {
        super(bundle);
        this.f39918vd = x60Var;
        this.f39916td = z10;
        this.f39917ud = j10;
        this.f39915sd = false;
    }

    public static void Dd(w60 w60Var, long j10, TLRPC.Chat chat) {
        boolean z10;
        if (!org.telegram.messenger.g0.E1(w60Var.getParentActivity())) {
            return;
        }
        Activity parentActivity = w60Var.getParentActivity();
        int i3 = w60Var.currentAccount;
        long j11 = -j10;
        TLRPC.User f10 = w60Var.getUserConfig().f();
        if (chat.admin_rights != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        dy0.c(parentActivity, i3, j11, f10, null, z10, chat.creator, w60Var.f39918vd.J0);
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f39915sd && this.f39916td) {
            this.f39915sd = true;
            org.telegram.messenger.hp messagesController = getMessagesController();
            long j10 = this.f39917ud;
            TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j10));
            if (org.telegram.messenger.t3.h(M0)) {
                ac K = fc.a0(this).K(2131623989, org.telegram.messenger.bd.M0(2131749079, null), org.telegram.messenger.bd.M0(2131749078, null), new ai.r1(this, j10, M0, 24));
                K.f31800r = false;
                K.k(true);
                return;
            }
            ac Q = fc.a0(this).Q(2131623989, 36, org.telegram.messenger.bd.M0(2131749079, null));
            Q.f31800r = false;
            Q.k(true);
        }
    }
}
