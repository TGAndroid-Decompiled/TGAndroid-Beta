package org.telegram.ui;

import org.telegram.messenger.MediaController;
public final class og implements Runnable {
    public final int f50548a = 0;
    public final bn f50549b;
    public final boolean f50550c;
    public final long d;

    public og(bn bnVar, long j3, boolean z10) {
        this.f50549b = bnVar;
        this.d = j3;
        this.f50550c = z10;
    }

    @Override
    public final void run() {
        long j3;
        long j10;
        switch (this.f50548a) {
            case 0:
                bn.c1(this.f50549b, this.d, this.f50550c);
                return;
            default:
                rj rjVar = this.f50549b.f45923a0;
                if (rjVar != null) {
                    MediaController B = MediaController.B();
                    if (!rjVar.M2 && !rjVar.f32687t3 && B.J() && !B.K() && B.f22713h1 == rjVar.f32693u3) {
                        rjVar.f32567d1 = false;
                        org.telegram.ui.Components.pe peVar = rjVar.f32559c1;
                        if (peVar != null) {
                            peVar.j(org.telegram.ui.Components.wg.f41708a, false);
                        }
                        rjVar.f32717x4 = true;
                        rjVar.f32687t3 = true;
                        org.telegram.ui.Components.kg kgVar = rjVar.N3;
                        if (kgVar != null) {
                            kgVar.a1(1);
                        }
                        rjVar.o2(0, true);
                        if (this.f50550c) {
                            rjVar.P = true;
                            org.telegram.ui.Components.pg pgVar = rjVar.C2;
                            if (pgVar != null) {
                                pgVar.E.d(1, true, false);
                            }
                            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(rjVar.R);
                            long j11 = rjVar.E3;
                            bn bnVar = rjVar.D3;
                            if (bnVar != null && bnVar.f46227x4) {
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
                        rjVar.W1 = j3;
                        org.telegram.ui.Components.ug ugVar = rjVar.Z0;
                        if (ugVar != null) {
                            ugVar.a(j3);
                        }
                        rjVar.f32596g5 = true;
                        rjVar.Z1();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public og(bn bnVar, boolean z10, long j3) {
        this.f50549b = bnVar;
        this.f50550c = z10;
        this.d = j3;
    }
}
