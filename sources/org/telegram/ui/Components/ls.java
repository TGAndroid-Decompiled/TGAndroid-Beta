package org.telegram.ui.Components;
public final class ls implements Runnable {
    public final int f28326a;
    public final qs f28327b;

    public ls(qs qsVar, int i10) {
        this.f28326a = i10;
        this.f28327b = qsVar;
    }

    @Override
    public final void run() {
        switch (this.f28326a) {
            case 0:
                this.f28327b.W(false);
                return;
            default:
                this.f28327b.N(true);
                return;
        }
    }
}
