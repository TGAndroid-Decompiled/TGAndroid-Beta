package org.telegram.ui.Components;
public final class y1 implements Runnable {
    public final int f41831a;
    public final org.telegram.ui.ActionBar.t1 f41832b;

    public y1(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        this.f41831a = i7;
        this.f41832b = t1Var;
    }

    @Override
    public final void run() {
        switch (this.f41831a) {
            case 0:
                try {
                    this.f41832b.dismiss();
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                this.f41832b.dismiss();
                return;
        }
    }
}
