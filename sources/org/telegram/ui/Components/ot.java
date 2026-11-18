package org.telegram.ui.Components;
public final class ot implements xh.j, org.telegram.ui.ActionBar.r1 {
    public final EditTextBoldCursor f38171a;

    public ot(EditTextBoldCursor editTextBoldCursor) {
        this.f38171a = editTextBoldCursor;
    }

    @Override
    public void a(xh.f fVar, float f10, float f11) {
        this.f38171a.i(fVar, f10, f11);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        org.telegram.messenger.g0.v1(this.f38171a);
    }
}
