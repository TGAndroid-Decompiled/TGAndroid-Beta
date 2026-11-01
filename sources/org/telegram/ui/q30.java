package org.telegram.ui;

import android.view.TextureView;
public final class q30 implements ns0 {
    public final a50 f40675a;

    public q30(a50 a50Var) {
        this.f40675a = a50Var;
    }

    @Override
    public final void H0(org.telegram.messenger.kj kjVar) {
        a50 a50Var = this.f40675a;
        a50Var.H1.I0(true);
        a50Var.T3.f40593f.K0(org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(13.0f), 0, 0);
        a50Var.f21587b.invalidate();
    }

    @Override
    public final void I(org.telegram.messenger.kj kjVar) {
        this.f40675a.f21587b.invalidate();
    }

    @Override
    public final TextureView k0() {
        return null;
    }
}
