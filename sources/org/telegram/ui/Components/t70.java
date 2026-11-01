package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class t70 extends org.telegram.ui.un {
    public boolean f30544kd;
    public final boolean f30545ld;
    public final long f30546md;
    public final u70 f30547nd;

    public t70(u70 u70Var, Bundle bundle, boolean z10, long j10) {
        super(bundle);
        this.f30547nd = u70Var;
        this.f30545ld = z10;
        this.f30546md = j10;
        this.f30544kd = false;
    }

    public static void yd(t70 t70Var, long j10, TLRPC.Chat chat) {
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
        jz0.c(parentActivity, i10, j11, f7, null, z10, chat.creator, t70Var.f30547nd.I0);
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f30544kd && this.f30545ld) {
            this.f30544kd = true;
            org.telegram.messenger.wp messagesController = getMessagesController();
            long j10 = this.f30546md;
            TLRPC.Chat L0 = messagesController.L0(Long.valueOf(j10));
            if (org.telegram.messenger.w3.h(L0)) {
                wb K = cc.a0(this).K(2131623989, org.telegram.messenger.dd.L0(2131749081, null), org.telegram.messenger.dd.L0(2131749080, null), new a3.i0(this, j10, L0, 14));
                K.f32209r = false;
                K.k(true);
                return;
            }
            wb Q = cc.a0(this).Q(2131623989, 36, org.telegram.messenger.dd.L0(2131749081, null));
            Q.f32209r = false;
            Q.k(true);
        }
    }
}
