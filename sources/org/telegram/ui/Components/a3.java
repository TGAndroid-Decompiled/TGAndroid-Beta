package org.telegram.ui.Components;
public final class a3 implements org.telegram.ui.ActionBar.q1 {
    public final int f33344a;
    public final org.telegram.messenger.w10 f33345b;
    public final boolean[] f33346c;

    public a3(int i7, org.telegram.messenger.w10 w10Var, boolean[] zArr) {
        this.f33344a = i7;
        this.f33345b = w10Var;
        this.f33346c = zArr;
    }

    @Override
    public final void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f33344a) {
            case 0:
                this.f33345b.a(Boolean.valueOf(this.f33346c[0]));
                return;
            default:
                this.f33345b.a(Boolean.TRUE);
                this.f33346c[0] = true;
                t1Var.dismiss();
                return;
        }
    }
}
