package org.telegram.ui.Components;
public final class b3 implements org.telegram.ui.ActionBar.q1 {
    public final int f33719a;
    public final org.telegram.messenger.y10 f33720b;
    public final boolean[] f33721c;

    public b3(int i7, org.telegram.messenger.y10 y10Var, boolean[] zArr) {
        this.f33719a = i7;
        this.f33720b = y10Var;
        this.f33721c = zArr;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f33719a) {
            case 0:
                this.f33720b.a(Boolean.valueOf(this.f33721c[0]));
                return;
            default:
                this.f33720b.a(Boolean.TRUE);
                this.f33721c[0] = true;
                t1Var.dismiss();
                return;
        }
    }
}
