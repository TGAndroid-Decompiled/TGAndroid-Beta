package org.telegram.ui.Components;
public final class ot implements xh.j, org.telegram.ui.ActionBar.q1 {
    public final EditTextBoldCursor f38266a;

    public ot(EditTextBoldCursor editTextBoldCursor) {
        this.f38266a = editTextBoldCursor;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        org.telegram.messenger.g0.v1(this.f38266a);
    }

    @Override
    public void o(xh.f fVar, float f10, float f11) {
        this.f38266a.i(fVar, f10, f11);
    }
}
