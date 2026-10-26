package org.telegram.ui.Components;
public final class wa1 implements Runnable {
    public final yb1 f34399a;
    public final int f34400b;
    public final float f34401c;
    public final float d;

    public wa1(yb1 yb1Var, int i10, float f7, float f10) {
        this.f34399a = yb1Var;
        this.f34400b = i10;
        this.f34401c = f7;
        this.d = f10;
    }

    @Override
    public final void run() {
        yb1 yb1Var = this.f34399a;
        int i10 = this.f34400b;
        float f7 = this.f34401c;
        float f10 = this.d;
        long j10 = yb1Var.f35017r;
        if (!yb1Var.f35018s && j10 != 0) {
            WidgetSandboxNative.touch(j10, i10, f7, f10, 0, true, false, 0, 0);
        }
    }
}
