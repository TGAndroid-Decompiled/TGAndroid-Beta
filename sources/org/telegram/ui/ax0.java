package org.telegram.ui;
public final class ax0 implements Runnable {
    public final int f43854a;
    public final cx0 f43855b;
    public final int f43856c;

    public ax0(cx0 cx0Var, int i3, int i10) {
        this.f43854a = i10;
        this.f43855b = cx0Var;
        this.f43856c = i3;
    }

    @Override
    public final void run() {
        switch (this.f43854a) {
            case 0:
                cx0 cx0Var = this.f43855b;
                org.telegram.ui.Components.m61 m61Var = cx0Var.f44467b;
                bx0 bx0Var = cx0Var.d;
                int i3 = this.f43856c;
                m61Var.d(i3, bx0Var.i(i3));
                return;
            default:
                cx0 cx0Var2 = this.f43855b;
                org.telegram.ui.Components.m61 m61Var2 = cx0Var2.f44467b;
                bx0 bx0Var2 = cx0Var2.d;
                int i10 = this.f43856c;
                m61Var2.d(i10, bx0Var2.i(i10));
                return;
        }
    }
}
