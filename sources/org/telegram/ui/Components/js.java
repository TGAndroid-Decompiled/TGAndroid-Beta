package org.telegram.ui.Components;
public final class js implements Runnable {
    public final int f27756a;
    public final ps f27757b;

    public js(ps psVar, int i10) {
        this.f27756a = i10;
        this.f27757b = psVar;
    }

    @Override
    public final void run() {
        switch (this.f27756a) {
            case 0:
                this.f27757b.W(false);
                return;
            default:
                ps.Q(this.f27757b);
                return;
        }
    }
}
