package org.telegram.ui;

import org.telegram.messenger.MediaController;
public final class og implements Runnable {
    public final int f50680a = 0;
    public final bn f50681b;
    public final boolean f50682c;
    public final long d;

    public og(bn bnVar, long j3, boolean z10) {
        this.f50681b = bnVar;
        this.d = j3;
        this.f50682c = z10;
    }

    @Override
    public final void run() {
        long j3;
        long j10;
        switch (this.f50680a) {
            case 0:
                bn.c1(this.f50681b, this.d, this.f50682c);
                return;
            default:
                rj rjVar = this.f50681b.f46118a0;
                if (rjVar != null) {
                    MediaController B = MediaController.B();
                    if (!rjVar.O2 && !rjVar.f32800v3 && B.J() && !B.K() && B.f22811h1 == rjVar.f32808w3) {
                        rjVar.f32662d1 = false;
                        org.telegram.ui.Components.qe qeVar = rjVar.f32654c1;
                        if (qeVar != null) {
                            qeVar.j(org.telegram.ui.Components.xg.f41993a, false);
                        }
                        rjVar.f32832z4 = true;
                        rjVar.f32800v3 = true;
                        org.telegram.ui.Components.mg mgVar = rjVar.P3;
                        if (mgVar != null) {
                            mgVar.U0(1);
                        }
                        rjVar.u2(0, true);
                        if (this.f50682c) {
                            rjVar.P = true;
                            org.telegram.ui.Components.qg qgVar = rjVar.E2;
                            if (qgVar != null) {
                                qgVar.E.d(1, true, false);
                            }
                            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(rjVar.R);
                            long j11 = rjVar.G3;
                            bn bnVar = rjVar.F3;
                            if (bnVar != null && bnVar.f46422x4) {
                                j10 = bnVar.b();
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
                        org.telegram.ui.Components.vg vgVar = rjVar.Z0;
                        if (vgVar != null) {
                            vgVar.a(j3);
                        }
                        rjVar.f32706i5 = true;
                        rjVar.f2();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public og(bn bnVar, boolean z10, long j3) {
        this.f50681b = bnVar;
        this.f50682c = z10;
        this.d = j3;
    }
}
