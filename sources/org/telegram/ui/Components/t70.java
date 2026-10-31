package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class t70 extends org.telegram.ui.un {
    public boolean f30469jd;
    public final boolean f30470kd;
    public final long f30471ld;
    public final u70 f30472md;

    public t70(u70 u70Var, Bundle bundle, boolean z10, long j10) {
        super(bundle);
        this.f30472md = u70Var;
        this.f30470kd = z10;
        this.f30471ld = j10;
        this.f30469jd = false;
    }

    public static void td(t70 t70Var, long j10, TLRPC.Chat chat) {
        boolean z10;
        if (!org.telegram.messenger.i0.E1(t70Var.getParentActivity())) {
            return;
        }
        Activity parentActivity = t70Var.getParentActivity();
        int i10 = t70Var.currentAccount;
        long j11 = -j10;
        TLRPC.User f7 = t70Var.getUserConfig().f();
        if (chat.admin_rights != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        iz0.c(parentActivity, i10, j11, f7, null, z10, chat.creator, t70Var.f30472md.I0);
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f30469jd && this.f30470kd) {
            this.f30469jd = true;
            org.telegram.messenger.vp messagesController = getMessagesController();
            long j10 = this.f30471ld;
            TLRPC.Chat L0 = messagesController.L0(Long.valueOf(j10));
            if (org.telegram.messenger.w3.h(L0)) {
                wb K = cc.a0(this).K(2131623989, org.telegram.messenger.cd.L0(2131749081, null), org.telegram.messenger.cd.L0(2131749080, null), new a3.i0(this, j10, L0, 14));
                K.f32143r = false;
                K.k(true);
                return;
            }
            wb Q = cc.a0(this).Q(2131623989, 36, org.telegram.messenger.cd.L0(2131749081, null));
            Q.f32143r = false;
            Q.k(true);
        }
    }
}
