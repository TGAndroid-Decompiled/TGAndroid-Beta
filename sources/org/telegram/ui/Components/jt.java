package org.telegram.ui.Components;
public final class jt implements xh.j, org.telegram.ui.ActionBar.q1 {
    public final EditTextBoldCursor f36170a;

    public jt(EditTextBoldCursor editTextBoldCursor) {
        this.f36170a = editTextBoldCursor;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        org.telegram.messenger.g0.v1(this.f36170a);
    }

    @Override
    public void j(xh.f fVar, float f10, float f11) {
        this.f36170a.i(fVar, f10, f11);
    }
}
