package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class pb0 implements org.telegram.ui.Components.ms0 {
    public final yb0 f40564a;

    public pb0(yb0 yb0Var) {
        this.f40564a = yb0Var;
    }

    @Override
    public final void V() {
        int k02;
        boolean z10;
        yb0 yb0Var = this.f40564a;
        qb0 qb0Var = yb0Var.S0;
        if (qb0Var == null) {
            k02 = 0;
        } else {
            k02 = qb0Var.k0(8);
        }
        yb0Var.T0.setText(org.telegram.messenger.cd.G(k02, "LocationStories", new Object[0]));
        ob0 ob0Var = yb0Var.R;
        if (k02 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (ob0Var.f55519i0 != z10) {
            ob0Var.f55519i0 = z10;
            ob0Var.f();
            yb0Var.S.w0(0, org.telegram.messenger.i0.L(200.0f), null);
        }
    }

    @Override
    public final boolean X() {
        return false;
    }

    @Override
    public final org.telegram.ui.Components.tk0 f() {
        return this.f40564a.S;
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
    public final boolean s() {
        return true;
    }

    @Override
    public final void I() {
    }
}
