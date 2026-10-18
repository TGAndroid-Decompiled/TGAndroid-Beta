package org.telegram.ui.Components;
public final class fg0 implements Runnable {
    public final int f26242a;
    public final kg0 f26243b;

    public fg0(kg0 kg0Var, int i10) {
        this.f26242a = i10;
        this.f26243b = kg0Var;
    }

    @Override
    public final void run() {
        switch (this.f26242a) {
            case 0:
                this.f26243b.e();
                return;
            default:
                this.f26243b.g();
                return;
        }
    }
}
