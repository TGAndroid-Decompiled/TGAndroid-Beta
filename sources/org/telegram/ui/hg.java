package org.telegram.ui;

import org.telegram.messenger.MediaController;
public final class hg implements Runnable {
    public final int f45918a = 0;
    public final wm f45919b;
    public final boolean f45920c;
    public final long d;

    public hg(wm wmVar, long j10, boolean z10) {
        this.f45919b = wmVar;
        this.d = j10;
        this.f45920c = z10;
    }

    @Override
    public final void run() {
        long j10;
        long j11;
        switch (this.f45918a) {
            case 0:
                wm.X0(this.f45919b, this.d, this.f45920c);
                return;
            default:
                mj mjVar = this.f45919b.f51237a0;
                if (mjVar != null) {
                    MediaController B = MediaController.B();
                    if (!mjVar.Z1 && !mjVar.G2 && B.J() && !B.K() && B.f21321h1 == mjVar.H2) {
                        mjVar.f31104d1 = false;
                        org.telegram.ui.Components.ce ceVar = mjVar.f31099c1;
                        if (ceVar != null) {
                            ceVar.j(org.telegram.ui.Components.fg.f33790a, false);
                        }
                        mjVar.G2 = true;
                        mjVar.M1(0, true);
                        if (this.f45920c) {
                            mjVar.P = true;
                            org.telegram.ui.Components.yf yfVar = mjVar.P1;
                            if (yfVar != null) {
                                yfVar.E.d(1, true, false);
                            }
                            org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(mjVar.R);
                            long j12 = mjVar.R2;
                            wm wmVar = mjVar.Q2;
                            if (wmVar != null && wmVar.f51525w4) {
                                j11 = wmVar.b();
                            } else {
                                j11 = 0;
                            }
                            b02.e2(j12, j11, true);
                        }
                        long j13 = this.d;
                        if (j13 > 0) {
                            j10 = System.currentTimeMillis() - j13;
                        } else {
                            j10 = B.f21328l1;
                        }
                        mjVar.f31141j1 = j10;
                        org.telegram.ui.Components.dg dgVar = mjVar.Z0;
                        if (dgVar != null) {
                            dgVar.a(j10);
                        }
                        mjVar.f31202t4 = true;
                        mjVar.y1();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public hg(wm wmVar, boolean z10, long j10) {
        this.f45919b = wmVar;
        this.f45920c = z10;
        this.d = j10;
    }
}
