package org.telegram.ui.Components;
public final class js implements Runnable {
    public final int f27595a;
    public final ps f27596b;

    public js(ps psVar, int i10) {
        this.f27595a = i10;
        this.f27596b = psVar;
    }

    @Override
    public final void run() {
        switch (this.f27595a) {
            case 0:
                this.f27596b.X(false);
                return;
            default:
                ps.R(this.f27596b);
                return;
        }
    }
}
