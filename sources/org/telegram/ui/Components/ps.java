package org.telegram.ui.Components;
public final class ps implements Runnable {
    public final int f27469a;
    public final us f27470b;

    public ps(us usVar, int i10) {
        this.f27469a = i10;
        this.f27470b = usVar;
    }

    @Override
    public final void run() {
        switch (this.f27469a) {
            case 0:
                this.f27470b.W(false);
                return;
            default:
                this.f27470b.N(true);
                return;
        }
    }
}
