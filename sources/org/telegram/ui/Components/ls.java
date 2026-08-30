package org.telegram.ui.Components;
public final class ls implements Runnable {
    public final int f26878a;
    public final ps f26879b;

    public ls(ps psVar, int i10) {
        this.f26878a = i10;
        this.f26879b = psVar;
    }

    @Override
    public final void run() {
        switch (this.f26878a) {
            case 0:
                this.f26879b.W(false);
                return;
            default:
                this.f26879b.N(true);
                return;
        }
    }
}
