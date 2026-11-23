package org.telegram.ui.Components;
public final class ge0 implements Runnable {
    public final int f35407a;
    public final ke0 f35408b;

    public ge0(ke0 ke0Var, int i7) {
        this.f35407a = i7;
        this.f35408b = ke0Var;
    }

    @Override
    public final void run() {
        switch (this.f35407a) {
            case 0:
                this.f35408b.e();
                return;
            default:
                this.f35408b.g();
                return;
        }
    }
}
