package org.telegram.ui;
public final class bb implements Runnable {
    public final int f36123a;
    public final yb f36124b;

    public bb(yb ybVar, int i10) {
        this.f36123a = i10;
        this.f36124b = ybVar;
    }

    @Override
    public final void run() {
        switch (this.f36123a) {
            case 0:
                yb ybVar = this.f36124b;
                ybVar.G0 = Integer.MAX_VALUE;
                ybVar.H0 = -1;
                ybVar.d1();
                ybVar.I0 = null;
                return;
            case 1:
                yb ybVar2 = this.f36124b;
                ybVar2.W0(false);
                ybVar2.E.l();
                return;
            default:
                this.f36124b.V0();
                return;
        }
    }
}
