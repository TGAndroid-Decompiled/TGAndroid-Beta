package org.telegram.ui.Components;
public final class bt implements xh.j, org.telegram.ui.ActionBar.r1 {
    public final EditTextBoldCursor f32323a;

    public bt(EditTextBoldCursor editTextBoldCursor) {
        this.f32323a = editTextBoldCursor;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        org.telegram.messenger.g0.v1(this.f32323a);
    }

    @Override
    public void m(xh.f fVar, float f10, float f11) {
        this.f32323a.i(fVar, f10, f11);
    }
}
