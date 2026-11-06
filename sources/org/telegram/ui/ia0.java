package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class ia0 implements org.telegram.ui.Components.mr0 {
    public final pa0 f46628a;

    public ia0(pa0 pa0Var) {
        this.f46628a = pa0Var;
    }

    @Override
    public final void V() {
        int m0;
        boolean z9;
        pa0 pa0Var = this.f46628a;
        ja0 ja0Var = pa0Var.L0;
        if (ja0Var == null) {
            m0 = 0;
        } else {
            m0 = ja0Var.m0(8);
        }
        pa0Var.M0.setText(org.telegram.messenger.hd.G(m0, "LocationStories", new Object[0]));
        ha0 ha0Var = pa0Var.P;
        if (m0 > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (ha0Var.Z != z9) {
            ha0Var.Z = z9;
            ha0Var.f();
            pa0Var.Q.w0(0, org.telegram.messenger.g0.L(200.0f), null);
        }
    }

    @Override
    public final boolean X() {
        return false;
    }

    @Override
    public final org.telegram.ui.Components.pj0 f() {
        return this.f46628a.Q;
    }

    @Override
    public final TLRPC.Chat g() {
        return null;
    }

    @Override
    public final boolean h(TLRPC.ChatParticipant chatParticipant, boolean z9, boolean z10, View view) {
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
