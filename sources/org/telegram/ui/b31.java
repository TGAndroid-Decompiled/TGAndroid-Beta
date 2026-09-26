package org.telegram.ui;
public final class b31 extends r61 {
    public final d31 e;

    public b31(d31 d31Var, a31 a31Var) {
        super(a31Var);
        this.e = d31Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.e.f32908n = null;
    }
}
