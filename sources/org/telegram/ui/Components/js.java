package org.telegram.ui.Components;
public final class js implements Runnable {
    public final int f27630a;
    public final ps f27631b;

    public js(ps psVar, int i10) {
        this.f27630a = i10;
        this.f27631b = psVar;
    }

    @Override
    public final void run() {
        switch (this.f27630a) {
            case 0:
                this.f27631b.X(false);
                return;
            default:
                ps.R(this.f27631b);
                return;
        }
    }
}
