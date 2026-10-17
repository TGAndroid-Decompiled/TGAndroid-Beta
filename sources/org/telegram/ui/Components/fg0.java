package org.telegram.ui.Components;
public final class fg0 implements Runnable {
    public final int f26235a;
    public final kg0 f26236b;

    public fg0(kg0 kg0Var, int i10) {
        this.f26235a = i10;
        this.f26236b = kg0Var;
    }

    @Override
    public final void run() {
        switch (this.f26235a) {
            case 0:
                this.f26236b.e();
                return;
            default:
                this.f26236b.g();
                return;
        }
    }
}
