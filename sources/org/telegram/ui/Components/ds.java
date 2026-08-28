package org.telegram.ui.Components;
public final class ds implements Runnable {
    public final int f27802a;
    public final hs f27803b;

    public ds(hs hsVar, int i9) {
        this.f27802a = i9;
        this.f27803b = hsVar;
    }

    @Override
    public final void run() {
        switch (this.f27802a) {
            case 0:
                this.f27803b.W(false);
                return;
            default:
                this.f27803b.N(true);
                return;
        }
    }
}
