package org.telegram.ui.Components;
public final class wa1 implements Runnable {
    public final yb1 f34396a;
    public final int f34397b;
    public final float f34398c;
    public final float d;

    public wa1(yb1 yb1Var, int i10, float f7, float f10) {
        this.f34396a = yb1Var;
        this.f34397b = i10;
        this.f34398c = f7;
        this.d = f10;
    }

    @Override
    public final void run() {
        yb1 yb1Var = this.f34396a;
        int i10 = this.f34397b;
        float f7 = this.f34398c;
        float f10 = this.d;
        long j10 = yb1Var.f35014r;
        if (!yb1Var.f35015s && j10 != 0) {
            WidgetSandboxNative.touch(j10, i10, f7, f10, 0, true, false, 0, 0);
        }
    }
}
