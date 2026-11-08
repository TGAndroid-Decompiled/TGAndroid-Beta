package org.telegram.ui.Components;
public final class ct implements xh.j, org.telegram.ui.ActionBar.r1 {
    public final EditTextBoldCursor f32676a;

    public ct(EditTextBoldCursor editTextBoldCursor) {
        this.f32676a = editTextBoldCursor;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        org.telegram.messenger.g0.v1(this.f32676a);
    }

    @Override
    public void m(xh.f fVar, float f10, float f11) {
        this.f32676a.i(fVar, f10, f11);
    }
}
