package org.telegram.ui.Components;
public final class b3 implements org.telegram.ui.ActionBar.q1 {
    public final int f33726a;
    public final org.telegram.messenger.x10 f33727b;
    public final boolean[] f33728c;

    public b3(int i7, org.telegram.messenger.x10 x10Var, boolean[] zArr) {
        this.f33726a = i7;
        this.f33727b = x10Var;
        this.f33728c = zArr;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f33726a) {
            case 0:
                this.f33727b.a(Boolean.valueOf(this.f33728c[0]));
                return;
            default:
                this.f33727b.a(Boolean.TRUE);
                this.f33728c[0] = true;
                t1Var.dismiss();
                return;
        }
    }
}
