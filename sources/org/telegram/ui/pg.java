package org.telegram.ui;

import org.telegram.messenger.MediaController;
public final class pg implements Runnable {
    public final int f48713a = 0;
    public final cn f48714b;
    public final boolean f48715c;
    public final long d;

    public pg(cn cnVar, long j3, boolean z9) {
        this.f48714b = cnVar;
        this.d = j3;
        this.f48715c = z9;
    }

    @Override
    public final void run() {
        long j3;
        long j10;
        switch (this.f48713a) {
            case 0:
                cn.c1(this.f48714b, this.d, this.f48715c);
                return;
            default:
                sj sjVar = this.f48714b.Z;
                if (sjVar != null) {
                    MediaController B = MediaController.B();
                    if (!sjVar.Y1 && !sjVar.F2 && B.J() && !B.K() && B.f21268g1 == sjVar.G2) {
                        sjVar.f31034c1 = false;
                        org.telegram.ui.Components.ee eeVar = sjVar.f31027b1;
                        if (eeVar != null) {
                            eeVar.j(org.telegram.ui.Components.hg.f34289a, false);
                        }
                        sjVar.J3 = true;
                        sjVar.F2 = true;
                        org.telegram.ui.Components.wf wfVar = sjVar.Z2;
                        if (wfVar != null) {
                            wfVar.R0(1);
                        }
                        sjVar.N1(0, true);
                        if (this.f48715c) {
                            sjVar.O = true;
                            org.telegram.ui.Components.ag agVar = sjVar.O1;
                            if (agVar != null) {
                                agVar.D.d(1, true, false);
                            }
                            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(sjVar.Q);
                            long j11 = sjVar.Q2;
                            cn cnVar = sjVar.P2;
                            if (cnVar != null && cnVar.f44652v4) {
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
                            j3 = B.f21276k1;
                        }
                        sjVar.f31071i1 = j3;
                        org.telegram.ui.Components.fg fgVar = sjVar.Y0;
                        if (fgVar != null) {
                            fgVar.a(j3);
                        }
                        sjVar.f31132s4 = true;
                        sjVar.z1();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public pg(cn cnVar, boolean z9, long j3) {
        this.f48714b = cnVar;
        this.f48715c = z9;
        this.d = j3;
    }
}
