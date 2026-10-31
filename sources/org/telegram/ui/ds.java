package org.telegram.ui;
public final class ds implements Runnable {
    public final int f36815a;
    public final ns f36816b;

    public ds(ns nsVar, int i10) {
        this.f36815a = i10;
        this.f36816b = nsVar;
    }

    @Override
    public final void run() {
        switch (this.f36815a) {
            case 0:
                ns.c0(this.f36816b);
                return;
            case 1:
                ns nsVar = this.f36816b;
                if (nsVar.J) {
                    nsVar.d.d.requestFocus();
                    org.telegram.messenger.i0.J3(nsVar.d.d);
                    return;
                }
                return;
            default:
                ns nsVar2 = this.f36816b;
                nsVar2.presentFragment(un.ha(nsVar2.H), true);
                return;
        }
    }
}
