package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class ja0 implements org.telegram.ui.Components.xr0 {
    public final qa0 f48946a;

    public ja0(qa0 qa0Var) {
        this.f48946a = qa0Var;
    }

    @Override
    public final void W() {
        int m0;
        boolean z10;
        qa0 qa0Var = this.f48946a;
        ka0 ka0Var = qa0Var.R0;
        if (ka0Var == null) {
            m0 = 0;
        } else {
            m0 = ka0Var.m0(8);
        }
        qa0Var.S0.setText(org.telegram.messenger.gd.G(m0, "LocationStories", new Object[0]));
        ia0 ia0Var = qa0Var.Q;
        if (m0 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (ia0Var.f17664a0 != z10) {
            ia0Var.f17664a0 = z10;
            ia0Var.f();
            qa0Var.R.w0(0, org.telegram.messenger.g0.L(200.0f), null);
        }
    }

    @Override
    public final boolean Y() {
        return false;
    }

    @Override
    public final org.telegram.ui.Components.ek0 f() {
        return this.f48946a.R;
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
