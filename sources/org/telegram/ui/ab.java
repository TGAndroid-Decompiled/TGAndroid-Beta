package org.telegram.ui;
public final class ab implements Runnable {
    public final int f35380a;
    public final xb f35381b;

    public ab(xb xbVar, int i10) {
        this.f35380a = i10;
        this.f35381b = xbVar;
    }

    @Override
    public final void run() {
        switch (this.f35380a) {
            case 0:
                xb xbVar = this.f35381b;
                xbVar.G0 = Integer.MAX_VALUE;
                xbVar.H0 = -1;
                xbVar.d1();
                xbVar.I0 = null;
                return;
            case 1:
                xb xbVar2 = this.f35381b;
                xbVar2.W0(false);
                xbVar2.E.l();
                return;
            default:
                this.f35381b.V0();
                return;
        }
    }
}
