package org.telegram.ui.Components;
public final class b3 implements org.telegram.ui.ActionBar.q1 {
    public final int f33696a;
    public final org.telegram.messenger.y10 f33697b;
    public final boolean[] f33698c;

    public b3(int i7, org.telegram.messenger.y10 y10Var, boolean[] zArr) {
        this.f33696a = i7;
        this.f33697b = y10Var;
        this.f33698c = zArr;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f33696a) {
            case 0:
                this.f33697b.a(Boolean.valueOf(this.f33698c[0]));
                return;
            default:
                this.f33697b.a(Boolean.TRUE);
                this.f33698c[0] = true;
                t1Var.dismiss();
                return;
        }
    }
}
