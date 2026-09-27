package org.telegram.ui.Components;
public final class wf0 implements Runnable {
    public final int f29936a;
    public final bg0 f29937b;

    public wf0(bg0 bg0Var, int i10) {
        this.f29936a = i10;
        this.f29937b = bg0Var;
    }

    @Override
    public final void run() {
        switch (this.f29936a) {
            case 0:
                this.f29937b.e();
                return;
            default:
                this.f29937b.g();
                return;
        }
    }
}
