package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class ia0 implements org.telegram.ui.Components.nr0 {
    public final pa0 f48008a;

    public ia0(pa0 pa0Var) {
        this.f48008a = pa0Var;
    }

    @Override
    public final void W() {
        int m0;
        boolean z10;
        pa0 pa0Var = this.f48008a;
        ja0 ja0Var = pa0Var.M0;
        if (ja0Var == null) {
            m0 = 0;
        } else {
            m0 = ja0Var.m0(8);
        }
        pa0Var.N0.setText(org.telegram.messenger.hd.G(m0, "LocationStories", new Object[0]));
        ha0 ha0Var = pa0Var.Q;
        if (m0 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (ha0Var.f17256a0 != z10) {
            ha0Var.f17256a0 = z10;
            ha0Var.f();
            pa0Var.R.w0(0, org.telegram.messenger.g0.L(200.0f), null);
        }
    }

    @Override
    public final boolean Y() {
        return false;
    }

    @Override
    public final org.telegram.ui.Components.uj0 f() {
        return this.f48008a.R;
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
    public final void J() {
    }
}
