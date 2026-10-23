package org.telegram.ui.Components;
public final class js implements Runnable {
    public final int f27634a;
    public final ps f27635b;

    public js(ps psVar, int i10) {
        this.f27634a = i10;
        this.f27635b = psVar;
    }

    @Override
    public final void run() {
        switch (this.f27634a) {
            case 0:
                this.f27635b.X(false);
                return;
            default:
                ps.R(this.f27635b);
                return;
        }
    }
}
