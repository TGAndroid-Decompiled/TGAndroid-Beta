package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class la0 implements org.telegram.ui.Components.nr0 {
    public final sa0 f47566a;

    public la0(sa0 sa0Var) {
        this.f47566a = sa0Var;
    }

    @Override
    public final void V() {
        int m0;
        boolean z9;
        sa0 sa0Var = this.f47566a;
        ma0 ma0Var = sa0Var.L0;
        if (ma0Var == null) {
            m0 = 0;
        } else {
            m0 = ma0Var.m0(8);
        }
        sa0Var.M0.setText(org.telegram.messenger.id.G(m0, "LocationStories", new Object[0]));
        ka0 ka0Var = sa0Var.P;
        if (m0 > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (ka0Var.Z != z9) {
            ka0Var.Z = z9;
            ka0Var.f();
            sa0Var.Q.w0(0, org.telegram.messenger.g0.L(200.0f), null);
        }
    }

    @Override
    public final boolean X() {
        return false;
    }

    @Override
    public final org.telegram.ui.Components.pj0 f() {
        return this.f47566a.Q;
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
