package org.telegram.ui.Components;
public final class bs implements Runnable {
    public final int f23071a;
    public final hs f23072b;

    public bs(hs hsVar, int i10) {
        this.f23071a = i10;
        this.f23072b = hsVar;
    }

    @Override
    public final void run() {
        switch (this.f23071a) {
            case 0:
                this.f23072b.W(false);
                return;
            default:
                hs.Q(this.f23072b);
                return;
        }
    }
}
