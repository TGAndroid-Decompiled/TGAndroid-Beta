package org.telegram.ui.Components;

public final class nr implements Runnable {

    public final int f31023a;

    public final ur f31024b;

    public nr(ur urVar, int i10) {
        this.f31023a = i10;
        this.f31024b = urVar;
    }

    @Override
    public final void run() {
        switch (this.f31023a) {
            case 0:
                this.f31024b.W(false);
                break;
            default:
                ur.Q(this.f31024b);
                break;
        }
    }
}
