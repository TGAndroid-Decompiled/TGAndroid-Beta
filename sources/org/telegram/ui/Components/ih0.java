package org.telegram.ui.Components;
public final class ih0 implements Runnable {
    public final int f25131a;
    public final lh0 f25132b;

    public ih0(lh0 lh0Var, int i10) {
        this.f25131a = i10;
        this.f25132b = lh0Var;
    }

    @Override
    public final void run() {
        switch (this.f25131a) {
            case 0:
                this.f25132b.a(true);
                return;
            default:
                this.f25132b.d();
                return;
        }
    }
}
