package org.telegram.ui.Components;
public final class ls implements Runnable {
    public final int f28298a;
    public final qs f28299b;

    public ls(qs qsVar, int i10) {
        this.f28298a = i10;
        this.f28299b = qsVar;
    }

    @Override
    public final void run() {
        switch (this.f28298a) {
            case 0:
                this.f28299b.W(false);
                return;
            default:
                this.f28299b.N(true);
                return;
        }
    }
}
