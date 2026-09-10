package org.telegram.ui.Components;
public final class fs implements Runnable {
    public final int f23075a;
    public final ls f23076b;

    public fs(ls lsVar, int i10) {
        this.f23075a = i10;
        this.f23076b = lsVar;
    }

    @Override
    public final void run() {
        switch (this.f23075a) {
            case 0:
                this.f23076b.W(false);
                return;
            default:
                ls.Q(this.f23076b);
                return;
        }
    }
}
