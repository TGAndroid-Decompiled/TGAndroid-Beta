package org.telegram.ui.Components;
public final class pt implements nh.m, org.telegram.ui.ActionBar.u1 {
    public final EditTextBoldCursor f29423a;

    public pt(EditTextBoldCursor editTextBoldCursor) {
        this.f29423a = editTextBoldCursor;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        org.telegram.messenger.i0.v1(this.f29423a);
    }

    @Override
    public void m(nh.i iVar, float f7, float f10) {
        this.f29423a.i(iVar, f7, f10);
    }
}
