package org.telegram.ui;
public final class bb implements Runnable {
    public final int f36121a;
    public final yb f36122b;

    public bb(yb ybVar, int i10) {
        this.f36121a = i10;
        this.f36122b = ybVar;
    }

    @Override
    public final void run() {
        switch (this.f36121a) {
            case 0:
                yb ybVar = this.f36122b;
                ybVar.G0 = Integer.MAX_VALUE;
                ybVar.H0 = -1;
                ybVar.d1();
                ybVar.I0 = null;
                return;
            case 1:
                yb ybVar2 = this.f36122b;
                ybVar2.W0(false);
                ybVar2.E.l();
                return;
            default:
                this.f36122b.V0();
                return;
        }
    }
}
