package org.telegram.ui.Wallet;
public final class y1 implements Runnable {
    public final int f35410a;
    public final boolean[] f35411b;
    public final a2 f35412c;
    public final z2 d;

    public y1(boolean[] zArr, a2 a2Var, z2 z2Var, int i10) {
        this.f35410a = i10;
        this.f35411b = zArr;
        this.f35412c = a2Var;
        this.d = z2Var;
    }

    @Override
    public final void run() {
        switch (this.f35410a) {
            case 0:
                if (!this.f35411b[0]) {
                    if (this.f35412c.f34178m) {
                        org.telegram.messenger.i0.h3(this, 1000L);
                        return;
                    } else {
                        this.d.dismiss();
                        return;
                    }
                }
                return;
            default:
                if (!this.f35411b[0]) {
                    if (this.f35412c.f34178m) {
                        org.telegram.messenger.i0.h3(this, 1000L);
                        return;
                    } else {
                        this.d.dismiss();
                        return;
                    }
                }
                return;
        }
    }
}
