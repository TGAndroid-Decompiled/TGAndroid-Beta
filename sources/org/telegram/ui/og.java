package org.telegram.ui;

import org.telegram.messenger.MediaController;
public final class og implements Runnable {
    public final int f50562a = 0;
    public final bn f50563b;
    public final boolean f50564c;
    public final long d;

    public og(bn bnVar, long j3, boolean z10) {
        this.f50563b = bnVar;
        this.d = j3;
        this.f50564c = z10;
    }

    @Override
    public final void run() {
        long j3;
        long j10;
        switch (this.f50562a) {
            case 0:
                bn.c1(this.f50563b, this.d, this.f50564c);
                return;
            default:
                rj rjVar = this.f50563b.f45903a0;
                if (rjVar != null) {
                    MediaController B = MediaController.B();
                    if (!rjVar.O2 && !rjVar.f32702v3 && B.J() && !B.K() && B.f22708h1 == rjVar.f32710w3) {
                        rjVar.f32564d1 = false;
                        org.telegram.ui.Components.pe peVar = rjVar.f32556c1;
                        if (peVar != null) {
                            peVar.j(org.telegram.ui.Components.yg.f42407a, false);
                        }
                        rjVar.f32734z4 = true;
                        rjVar.f32702v3 = true;
                        org.telegram.ui.Components.mg mgVar = rjVar.P3;
                        if (mgVar != null) {
                            mgVar.a1(1);
                        }
                        rjVar.s2(0, true);
                        if (this.f50564c) {
                            rjVar.P = true;
                            org.telegram.ui.Components.rg rgVar = rjVar.E2;
                            if (rgVar != null) {
                                rgVar.E.d(1, true, false);
                            }
                            org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(rjVar.R);
                            long j11 = rjVar.G3;
                            bn bnVar = rjVar.F3;
                            if (bnVar != null && bnVar.f46207x4) {
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
                        rjVar.f32608i5 = true;
                        rjVar.d2();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public og(bn bnVar, boolean z10, long j3) {
        this.f50563b = bnVar;
        this.f50564c = z10;
        this.d = j3;
    }
}
