package org.telegram.ui.Components;
public final class js implements Runnable {
    public final int f27633a;
    public final ps f27634b;

    public js(ps psVar, int i10) {
        this.f27633a = i10;
        this.f27634b = psVar;
    }

    @Override
    public final void run() {
        switch (this.f27633a) {
            case 0:
                this.f27634b.X(false);
                return;
            default:
                ps.R(this.f27634b);
                return;
        }
    }
}
