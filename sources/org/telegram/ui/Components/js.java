package org.telegram.ui.Components;
public final class js implements Runnable {
    public final int f27594a;
    public final ps f27595b;

    public js(ps psVar, int i10) {
        this.f27594a = i10;
        this.f27595b = psVar;
    }

    @Override
    public final void run() {
        switch (this.f27594a) {
            case 0:
                this.f27595b.X(false);
                return;
            default:
                ps.R(this.f27595b);
                return;
        }
    }
}
