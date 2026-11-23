package org.telegram.ui;
public final class lx0 implements Runnable {
    public final int f49722a;
    public final nx0 f49723b;
    public final int f49724c;

    public lx0(nx0 nx0Var, int i7, int i10) {
        this.f49722a = i10;
        this.f49723b = nx0Var;
        this.f49724c = i7;
    }

    @Override
    public final void run() {
        switch (this.f49722a) {
            case 0:
                nx0 nx0Var = this.f49723b;
                org.telegram.ui.Components.i71 i71Var = nx0Var.f50348b;
                mx0 mx0Var = nx0Var.d;
                int i7 = this.f49724c;
                i71Var.e(i7, mx0Var.i(i7));
                return;
            default:
                nx0 nx0Var2 = this.f49723b;
                org.telegram.ui.Components.i71 i71Var2 = nx0Var2.f50348b;
                mx0 mx0Var2 = nx0Var2.d;
                int i10 = this.f49724c;
                i71Var2.e(i10, mx0Var2.i(i10));
                return;
        }
    }
}
