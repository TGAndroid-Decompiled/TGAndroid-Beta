package org.telegram.ui;
public final class ds implements Runnable {
    public final int f36674a;
    public final ns f36675b;

    public ds(ns nsVar, int i10) {
        this.f36674a = i10;
        this.f36675b = nsVar;
    }

    @Override
    public final void run() {
        switch (this.f36674a) {
            case 0:
                ns.d0(this.f36675b);
                return;
            case 1:
                ns nsVar = this.f36675b;
                if (nsVar.J) {
                    nsVar.d.d.requestFocus();
                    org.telegram.messenger.i0.J3(nsVar.d.d);
                    return;
                }
                return;
            default:
                ns nsVar2 = this.f36675b;
                nsVar2.presentFragment(un.ma(nsVar2.H), true);
                return;
        }
    }
}
