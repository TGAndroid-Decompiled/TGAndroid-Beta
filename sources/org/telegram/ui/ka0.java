package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class ka0 implements org.telegram.ui.Components.or0 {
    public final ra0 f47250a;

    public ka0(ra0 ra0Var) {
        this.f47250a = ra0Var;
    }

    @Override
    public final void V() {
        int m0;
        boolean z9;
        ra0 ra0Var = this.f47250a;
        la0 la0Var = ra0Var.L0;
        if (la0Var == null) {
            m0 = 0;
        } else {
            m0 = la0Var.m0(8);
        }
        ra0Var.M0.setText(org.telegram.messenger.id.G(m0, "LocationStories", new Object[0]));
        ja0 ja0Var = ra0Var.P;
        if (m0 > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (ja0Var.Z != z9) {
            ja0Var.Z = z9;
            ja0Var.f();
            ra0Var.Q.w0(0, org.telegram.messenger.g0.L(200.0f), null);
        }
    }

    @Override
    public final boolean X() {
        return false;
    }

    @Override
    public final org.telegram.ui.Components.qj0 f() {
        return this.f47250a.Q;
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
