package org.telegram.ui.Components;
public final class hf0 implements Runnable {
    public final int f29174a;
    public final mf0 f29175b;

    public hf0(mf0 mf0Var, int i10) {
        this.f29174a = i10;
        this.f29175b = mf0Var;
    }

    @Override
    public final void run() {
        switch (this.f29174a) {
            case 0:
                this.f29175b.e();
                return;
            default:
                this.f29175b.g();
                return;
        }
    }
}
