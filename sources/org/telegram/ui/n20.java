package org.telegram.ui;

import android.view.TextureView;
public final class n20 implements tq0 {
    public final x30 f47854a;

    public n20(x30 x30Var) {
        this.f47854a = x30Var;
    }

    @Override
    public final void G(org.telegram.messenger.zi ziVar) {
        this.f47854a.f28586b.invalidate();
    }

    @Override
    public final void I0(org.telegram.messenger.zi ziVar) {
        x30 x30Var = this.f47854a;
        x30Var.I1.I0(true);
        x30Var.U3.f50584f.K0(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), 0, 0);
        x30Var.f28586b.invalidate();
    }

    @Override
    public final TextureView i0() {
        return null;
    }
}
