package org.telegram.ui;

import org.telegram.messenger.MediaController;
public final class lg implements Runnable {
    public final int f47512a = 0;
    public final an f47513b;
    public final boolean f47514c;
    public final long d;

    public lg(an anVar, long j3, boolean z9) {
        this.f47513b = anVar;
        this.d = j3;
        this.f47514c = z9;
    }

    @Override
    public final void run() {
        long j3;
        long j10;
        switch (this.f47512a) {
            case 0:
                an.X0(this.f47513b, this.d, this.f47514c);
                return;
            default:
                qj qjVar = this.f47513b.Z;
                if (qjVar != null) {
                    MediaController B = MediaController.B();
                    if (!qjVar.Y1 && !qjVar.F2 && B.J() && !B.K() && B.f21265g1 == qjVar.G2) {
                        qjVar.f31024c1 = false;
                        org.telegram.ui.Components.ee eeVar = qjVar.f31017b1;
                        if (eeVar != null) {
                            eeVar.j(org.telegram.ui.Components.hg.f34323a, false);
                        }
                        qjVar.F2 = true;
                        qjVar.N1(0, true);
                        if (this.f47514c) {
                            qjVar.O = true;
                            org.telegram.ui.Components.ag agVar = qjVar.O1;
                            if (agVar != null) {
                                agVar.D.d(1, true, false);
                            }
                            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(qjVar.Q);
                            long j11 = qjVar.Q2;
                            an anVar = qjVar.P2;
                            if (anVar != null && anVar.f43965v4) {
                                j10 = anVar.b();
                            } else {
                                j10 = 0;
                            }
                            b02.e2(j11, j10, true);
                        }
                        long j12 = this.d;
                        if (j12 > 0) {
                            j3 = System.currentTimeMillis() - j12;
                        } else {
                            j3 = B.f21273k1;
                        }
                        qjVar.f31061i1 = j3;
                        org.telegram.ui.Components.fg fgVar = qjVar.Y0;
                        if (fgVar != null) {
                            fgVar.a(j3);
                        }
                        qjVar.f31122s4 = true;
                        qjVar.z1();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public lg(an anVar, boolean z9, long j3) {
        this.f47513b = anVar;
        this.f47514c = z9;
        this.d = j3;
    }
}
