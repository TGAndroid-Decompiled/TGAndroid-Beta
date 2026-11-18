package org.telegram.ui.Components;
public final class a3 implements org.telegram.ui.ActionBar.r1 {
    public final int f33233a;
    public final org.telegram.messenger.x10 f33234b;
    public final boolean[] f33235c;

    public a3(int i7, org.telegram.messenger.x10 x10Var, boolean[] zArr) {
        this.f33233a = i7;
        this.f33234b = x10Var;
        this.f33235c = zArr;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f33233a) {
            case 0:
                this.f33234b.a(Boolean.valueOf(this.f33235c[0]));
                return;
            default:
                this.f33234b.a(Boolean.TRUE);
                this.f33235c[0] = true;
                u1Var.dismiss();
                return;
        }
    }
}
