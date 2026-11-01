package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class ob0 implements org.telegram.ui.Components.ns0 {
    public final xb0 f40126a;

    public ob0(xb0 xb0Var) {
        this.f40126a = xb0Var;
    }

    @Override
    public final void W() {
        int l02;
        boolean z10;
        xb0 xb0Var = this.f40126a;
        pb0 pb0Var = xb0Var.S0;
        if (pb0Var == null) {
            l02 = 0;
        } else {
            l02 = pb0Var.l0(8);
        }
        xb0Var.T0.setText(org.telegram.messenger.dd.G(l02, "LocationStories", new Object[0]));
        nb0 nb0Var = xb0Var.R;
        if (l02 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (nb0Var.f55537i0 != z10) {
            nb0Var.f55537i0 = z10;
            nb0Var.f();
            xb0Var.S.w0(0, org.telegram.messenger.i0.L(200.0f), null);
        }
    }

    @Override
    public final boolean Y() {
        return false;
    }

    @Override
    public final org.telegram.ui.Components.uk0 f() {
        return this.f40126a.S;
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
