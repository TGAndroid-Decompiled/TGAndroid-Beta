package org.telegram.ui;

import org.telegram.messenger.MediaController;
public final class og implements Runnable {
    public final int f50579a = 0;
    public final bn f50580b;
    public final boolean f50581c;
    public final long d;

    public og(bn bnVar, long j3, boolean z10) {
        this.f50580b = bnVar;
        this.d = j3;
        this.f50581c = z10;
    }

    @Override
    public final void run() {
        long j3;
        long j10;
        switch (this.f50579a) {
            case 0:
                bn.c1(this.f50580b, this.d, this.f50581c);
                return;
            default:
                rj rjVar = this.f50580b.f45950a0;
                if (rjVar != null) {
                    MediaController B = MediaController.B();
                    if (!rjVar.O2 && !rjVar.f32736v3 && B.J() && !B.K() && B.f22744h1 == rjVar.f32744w3) {
                        rjVar.f32598d1 = false;
                        org.telegram.ui.Components.pe peVar = rjVar.f32590c1;
                        if (peVar != null) {
                            peVar.j(org.telegram.ui.Components.yg.f42427a, false);
                        }
                        rjVar.f32768z4 = true;
                        rjVar.f32736v3 = true;
                        org.telegram.ui.Components.ng ngVar = rjVar.P3;
                        if (ngVar != null) {
                            ngVar.a1(1);
                        }
                        rjVar.s2(0, true);
                        if (this.f50581c) {
                            rjVar.P = true;
                            org.telegram.ui.Components.rg rgVar = rjVar.E2;
                            if (rgVar != null) {
                                rgVar.E.d(1, true, false);
                            }
                            org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(rjVar.R);
                            long j11 = rjVar.G3;
                            bn bnVar = rjVar.F3;
                            if (bnVar != null && bnVar.f46254x4) {
                                j10 = bnVar.d();
                            } else {
                                j10 = 0;
                            }
                            d02.j2(j11, j10, true);
                        }
                        long j12 = this.d;
                        if (j12 > 0) {
                            j3 = System.currentTimeMillis() - j12;
                        } else {
                            j3 = B.l1;
                        }
                        rjVar.Y1 = j3;
                        org.telegram.ui.Components.wg wgVar = rjVar.Z0;
                        if (wgVar != null) {
                            wgVar.a(j3);
                        }
                        rjVar.f32642i5 = true;
                        rjVar.d2();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public og(bn bnVar, boolean z10, long j3) {
        this.f50580b = bnVar;
        this.f50581c = z10;
        this.d = j3;
    }
}
