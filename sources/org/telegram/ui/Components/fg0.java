package org.telegram.ui.Components;
public final class fg0 implements Runnable {
    public final int f26222a;
    public final kg0 f26223b;

    public fg0(kg0 kg0Var, int i10) {
        this.f26222a = i10;
        this.f26223b = kg0Var;
    }

    @Override
    public final void run() {
        switch (this.f26222a) {
            case 0:
                this.f26223b.e();
                return;
            default:
                this.f26223b.g();
                return;
        }
    }
}
