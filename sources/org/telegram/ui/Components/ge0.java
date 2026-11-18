package org.telegram.ui.Components;
public final class ge0 implements Runnable {
    public final int f35481a;
    public final ke0 f35482b;

    public ge0(ke0 ke0Var, int i7) {
        this.f35481a = i7;
        this.f35482b = ke0Var;
    }

    @Override
    public final void run() {
        switch (this.f35481a) {
            case 0:
                this.f35482b.e();
                return;
            default:
                this.f35482b.g();
                return;
        }
    }
}
