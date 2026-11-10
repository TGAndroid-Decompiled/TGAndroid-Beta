package org.telegram.ui;

import org.telegram.messenger.MediaController;
public final class pg implements Runnable {
    public final int f48766a = 0;
    public final cn f48767b;
    public final boolean f48768c;
    public final long d;

    public pg(cn cnVar, long j3, boolean z9) {
        this.f48767b = cnVar;
        this.d = j3;
        this.f48768c = z9;
    }

    @Override
    public final void run() {
        long j3;
        long j10;
        switch (this.f48766a) {
            case 0:
                cn.c1(this.f48767b, this.d, this.f48768c);
                return;
            default:
                sj sjVar = this.f48767b.Z;
                if (sjVar != null) {
                    MediaController B = MediaController.B();
                    if (!sjVar.Y1 && !sjVar.F2 && B.J() && !B.K() && B.f21273g1 == sjVar.G2) {
                        sjVar.f31045c1 = false;
                        org.telegram.ui.Components.de deVar = sjVar.f31038b1;
                        if (deVar != null) {
                            deVar.j(org.telegram.ui.Components.gg.f33889a, false);
                        }
                        sjVar.J3 = true;
                        sjVar.F2 = true;
                        org.telegram.ui.Components.vf vfVar = sjVar.Z2;
                        if (vfVar != null) {
                            vfVar.R0(1);
                        }
                        sjVar.N1(0, true);
                        if (this.f48768c) {
                            sjVar.O = true;
                            org.telegram.ui.Components.zf zfVar = sjVar.O1;
                            if (zfVar != null) {
                                zfVar.D.d(1, true, false);
                            }
                            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(sjVar.Q);
                            long j11 = sjVar.Q2;
                            cn cnVar = sjVar.P2;
                            if (cnVar != null && cnVar.f44693v4) {
                                j10 = cnVar.b();
                            } else {
                                j10 = 0;
                            }
                            b02.e2(j11, j10, true);
                        }
                        long j12 = this.d;
                        if (j12 > 0) {
                            j3 = System.currentTimeMillis() - j12;
                        } else {
                            j3 = B.f21281k1;
                        }
                        sjVar.f31082i1 = j3;
                        org.telegram.ui.Components.eg egVar = sjVar.Y0;
                        if (egVar != null) {
                            egVar.a(j3);
                        }
                        sjVar.f31143s4 = true;
                        sjVar.z1();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public pg(cn cnVar, boolean z9, long j3) {
        this.f48767b = cnVar;
        this.f48768c = z9;
        this.d = j3;
    }
}
