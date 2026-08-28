package org.telegram.ui.Components;
public final class te0 implements Runnable {
    public final int f32690a;
    public final ze0 f32691b;

    public te0(ze0 ze0Var, int i9) {
        this.f32690a = i9;
        this.f32691b = ze0Var;
    }

    @Override
    public final void run() {
        switch (this.f32690a) {
            case 0:
                this.f32691b.e();
                return;
            default:
                this.f32691b.g();
                return;
        }
    }
}
