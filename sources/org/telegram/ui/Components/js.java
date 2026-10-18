package org.telegram.ui.Components;
public final class js implements Runnable {
    public final int f27588a;
    public final ps f27589b;

    public js(ps psVar, int i10) {
        this.f27588a = i10;
        this.f27589b = psVar;
    }

    @Override
    public final void run() {
        switch (this.f27588a) {
            case 0:
                this.f27589b.X(false);
                return;
            default:
                ps.R(this.f27589b);
                return;
        }
    }
}
