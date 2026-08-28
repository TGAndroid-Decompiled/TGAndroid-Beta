package org.telegram.ui.Components;
public final class pr implements Runnable {
    public final int f31732a;
    public final wr f31733b;

    public pr(wr wrVar, int i9) {
        this.f31732a = i9;
        this.f31733b = wrVar;
    }

    @Override
    public final void run() {
        switch (this.f31732a) {
            case 0:
                this.f31733b.V(false);
                return;
            default:
                wr.P(this.f31733b);
                return;
        }
    }
}
