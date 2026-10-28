package org.telegram.ui.Components;
public final class xa1 implements Runnable {
    public final dc1 f34715a;
    public final int f34716b;
    public final float f34717c;
    public final float d;

    public xa1(dc1 dc1Var, int i10, float f7, float f10) {
        this.f34715a = dc1Var;
        this.f34716b = i10;
        this.f34717c = f7;
        this.d = f10;
    }

    @Override
    public final void run() {
        dc1 dc1Var = this.f34715a;
        int i10 = this.f34716b;
        float f7 = this.f34717c;
        float f10 = this.d;
        long j10 = dc1Var.f27411s;
        if (!dc1Var.f27412t && j10 != 0) {
            WidgetSandboxNative.touch(j10, i10, f7, f10, 0, true, false, 0, 0);
        }
    }
}
