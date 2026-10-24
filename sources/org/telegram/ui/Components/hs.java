package org.telegram.ui.Components;
public final class hs implements Runnable {
    public final int f27155a;
    public final ns f27156b;

    public hs(ns nsVar, int i10) {
        this.f27155a = i10;
        this.f27156b = nsVar;
    }

    @Override
    public final void run() {
        switch (this.f27155a) {
            case 0:
                this.f27156b.W(false);
                return;
            default:
                ns.Q(this.f27156b);
                return;
        }
    }
}
