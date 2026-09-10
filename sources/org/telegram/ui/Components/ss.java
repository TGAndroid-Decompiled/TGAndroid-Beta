package org.telegram.ui.Components;
public final class ss implements Runnable {
    public final int f27208a;
    public final xs f27209b;

    public ss(xs xsVar, int i10) {
        this.f27208a = i10;
        this.f27209b = xsVar;
    }

    @Override
    public final void run() {
        switch (this.f27208a) {
            case 0:
                this.f27209b.W(false);
                return;
            default:
                this.f27209b.N(true);
                return;
        }
    }
}
