package org.telegram.ui.Components;
public final class fg0 implements Runnable {
    public final int f26220a;
    public final kg0 f26221b;

    public fg0(kg0 kg0Var, int i10) {
        this.f26220a = i10;
        this.f26221b = kg0Var;
    }

    @Override
    public final void run() {
        switch (this.f26220a) {
            case 0:
                this.f26221b.e();
                return;
            default:
                this.f26221b.g();
                return;
        }
    }
}
