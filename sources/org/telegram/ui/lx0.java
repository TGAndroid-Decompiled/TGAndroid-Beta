package org.telegram.ui;
public final class lx0 implements Runnable {
    public final int f49688a;
    public final nx0 f49689b;
    public final int f49690c;

    public lx0(nx0 nx0Var, int i7, int i10) {
        this.f49688a = i10;
        this.f49689b = nx0Var;
        this.f49690c = i7;
    }

    @Override
    public final void run() {
        switch (this.f49688a) {
            case 0:
                nx0 nx0Var = this.f49689b;
                org.telegram.ui.Components.i71 i71Var = nx0Var.f50351b;
                mx0 mx0Var = nx0Var.d;
                int i7 = this.f49690c;
                i71Var.e(i7, mx0Var.i(i7));
                return;
            default:
                nx0 nx0Var2 = this.f49689b;
                org.telegram.ui.Components.i71 i71Var2 = nx0Var2.f50351b;
                mx0 mx0Var2 = nx0Var2.d;
                int i10 = this.f49690c;
                i71Var2.e(i10, mx0Var2.i(i10));
                return;
        }
    }
}
