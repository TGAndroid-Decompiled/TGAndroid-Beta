package org.telegram.ui.Components;
public final class ih0 implements Runnable {
    public final int f25091a;
    public final lh0 f25092b;

    public ih0(lh0 lh0Var, int i10) {
        this.f25091a = i10;
        this.f25092b = lh0Var;
    }

    @Override
    public final void run() {
        switch (this.f25091a) {
            case 0:
                this.f25092b.a(true);
                return;
            default:
                this.f25092b.d();
                return;
        }
    }
}
