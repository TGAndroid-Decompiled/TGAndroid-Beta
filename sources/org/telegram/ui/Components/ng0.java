package org.telegram.ui.Components;
public final class ng0 implements Runnable {
    public final int f29157a;
    public final sg0 f29158b;

    public ng0(sg0 sg0Var, int i10) {
        this.f29157a = i10;
        this.f29158b = sg0Var;
    }

    @Override
    public final void run() {
        switch (this.f29157a) {
            case 0:
                this.f29158b.e();
                return;
            default:
                this.f29158b.g();
                return;
        }
    }
}
