package org.telegram.ui.Components;
public final class qt implements xh.j, org.telegram.ui.ActionBar.q1 {
    public final EditTextBoldCursor f38998a;

    public qt(EditTextBoldCursor editTextBoldCursor) {
        this.f38998a = editTextBoldCursor;
    }

    @Override
    public void a(xh.f fVar, float f10, float f11) {
        this.f38998a.i(fVar, f10, f11);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        org.telegram.messenger.g0.v1(this.f38998a);
    }
}
