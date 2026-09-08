package org.telegram.ui.Components;
public final class ls implements Runnable {
    public final int f28325a;
    public final qs f28326b;

    public ls(qs qsVar, int i10) {
        this.f28325a = i10;
        this.f28326b = qsVar;
    }

    @Override
    public final void run() {
        switch (this.f28325a) {
            case 0:
                this.f28326b.W(false);
                return;
            default:
                this.f28326b.N(true);
                return;
        }
    }
}
