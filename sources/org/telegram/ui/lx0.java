package org.telegram.ui;
public final class lx0 implements Runnable {
    public final int f49708a;
    public final nx0 f49709b;
    public final int f49710c;

    public lx0(nx0 nx0Var, int i7, int i10) {
        this.f49708a = i10;
        this.f49709b = nx0Var;
        this.f49710c = i7;
    }

    @Override
    public final void run() {
        switch (this.f49708a) {
            case 0:
                nx0 nx0Var = this.f49709b;
                org.telegram.ui.Components.f71 f71Var = nx0Var.f50353b;
                mx0 mx0Var = nx0Var.d;
                int i7 = this.f49710c;
                f71Var.e(i7, mx0Var.i(i7));
                return;
            default:
                nx0 nx0Var2 = this.f49709b;
                org.telegram.ui.Components.f71 f71Var2 = nx0Var2.f50353b;
                mx0 mx0Var2 = nx0Var2.d;
                int i10 = this.f49710c;
                f71Var2.e(i10, mx0Var2.i(i10));
                return;
        }
    }
}
