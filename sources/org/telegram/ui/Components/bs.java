package org.telegram.ui.Components;

public final class bs implements Runnable {

    public final int f27203a;

    public final fs f27204b;

    public bs(fs fsVar, int i10) {
        this.f27203a = i10;
        this.f27204b = fsVar;
    }

    @Override
    public final void run() {
        switch (this.f27203a) {
            case 0:
                this.f27204b.W(false);
                break;
            default:
                this.f27204b.N(true);
                break;
        }
    }
}
