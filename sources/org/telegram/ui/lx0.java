package org.telegram.ui;
public final class lx0 implements Runnable {
    public final int f49667a;
    public final nx0 f49668b;
    public final int f49669c;

    public lx0(nx0 nx0Var, int i7, int i10) {
        this.f49667a = i10;
        this.f49668b = nx0Var;
        this.f49669c = i7;
    }

    @Override
    public final void run() {
        switch (this.f49667a) {
            case 0:
                nx0 nx0Var = this.f49668b;
                org.telegram.ui.Components.f71 f71Var = nx0Var.f50337b;
                mx0 mx0Var = nx0Var.d;
                int i7 = this.f49669c;
                f71Var.e(i7, mx0Var.i(i7));
                return;
            default:
                nx0 nx0Var2 = this.f49668b;
                org.telegram.ui.Components.f71 f71Var2 = nx0Var2.f50337b;
                mx0 mx0Var2 = nx0Var2.d;
                int i10 = this.f49669c;
                f71Var2.e(i10, mx0Var2.i(i10));
                return;
        }
    }
}
