package org.telegram.ui.Components;
public final class rf0 implements Runnable {
    public final int f28469a;
    public final wf0 f28470b;

    public rf0(wf0 wf0Var, int i10) {
        this.f28469a = i10;
        this.f28470b = wf0Var;
    }

    @Override
    public final void run() {
        switch (this.f28469a) {
            case 0:
                this.f28470b.e();
                return;
            default:
                this.f28470b.g();
                return;
        }
    }
}
