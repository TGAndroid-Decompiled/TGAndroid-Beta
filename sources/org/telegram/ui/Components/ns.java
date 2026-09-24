package org.telegram.ui.Components;
public final class ns implements Runnable {
    public final int f26792a;
    public final ss f26793b;

    public ns(ss ssVar, int i10) {
        this.f26792a = i10;
        this.f26793b = ssVar;
    }

    @Override
    public final void run() {
        switch (this.f26792a) {
            case 0:
                this.f26793b.W(false);
                return;
            default:
                this.f26793b.N(true);
                return;
        }
    }
}
