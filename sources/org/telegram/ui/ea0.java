package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class ea0 implements org.telegram.ui.Components.lr0 {
    public final la0 f44944a;

    public ea0(la0 la0Var) {
        this.f44944a = la0Var;
    }

    @Override
    public final void V() {
        int m0;
        boolean z10;
        la0 la0Var = this.f44944a;
        fa0 fa0Var = la0Var.M0;
        if (fa0Var == null) {
            m0 = 0;
        } else {
            m0 = fa0Var.m0(8);
        }
        la0Var.N0.setText(org.telegram.messenger.bd.G(m0, "LocationStories", new Object[0]));
        da0 da0Var = la0Var.Q;
        if (m0 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (da0Var.f17120a0 != z10) {
            da0Var.f17120a0 = z10;
            da0Var.f();
            la0Var.R.w0(0, org.telegram.messenger.g0.L(200.0f), null);
        }
    }

    @Override
    public final boolean X() {
        return false;
    }

    @Override
    public final org.telegram.ui.Components.tj0 f() {
        return this.f44944a.R;
    }

    @Override
    public final TLRPC.Chat g() {
        return null;
    }

    @Override
    public final boolean h(TLRPC.ChatParticipant chatParticipant, boolean z10, boolean z11, View view) {
        return false;
    }

    @Override
    public final boolean t() {
        return true;
    }

    @Override
    public final void I() {
    }
}
