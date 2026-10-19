package org.telegram.ui.Components;
public final class js implements Runnable {
    public final int f27596a;
    public final ps f27597b;

    public js(ps psVar, int i10) {
        this.f27596a = i10;
        this.f27597b = psVar;
    }

    @Override
    public final void run() {
        switch (this.f27596a) {
            case 0:
                this.f27597b.X(false);
                return;
            default:
                ps.R(this.f27597b);
                return;
        }
    }
}
