package org.telegram.ui.Components;
public final class ls implements Runnable {
    public final int f28299a;
    public final qs f28300b;

    public ls(qs qsVar, int i10) {
        this.f28299a = i10;
        this.f28300b = qsVar;
    }

    @Override
    public final void run() {
        switch (this.f28299a) {
            case 0:
                this.f28300b.W(false);
                return;
            default:
                this.f28300b.N(true);
                return;
        }
    }
}
