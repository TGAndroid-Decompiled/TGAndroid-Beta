package org.telegram.ui;

import org.telegram.messenger.MediaController;
public final class mg implements Runnable {
    public final int f49224a = 0;
    public final an f49225b;
    public final boolean f49226c;
    public final long d;

    public mg(an anVar, long j3, boolean z10) {
        this.f49225b = anVar;
        this.d = j3;
        this.f49226c = z10;
    }

    @Override
    public final void run() {
        long j3;
        long j10;
        switch (this.f49224a) {
            case 0:
                an.c1(this.f49225b, this.d, this.f49226c);
                return;
            default:
                qj qjVar = this.f49225b.f45117a0;
                if (qjVar != null) {
                    MediaController B = MediaController.B();
                    if (!qjVar.G2 && !qjVar.f32248n3 && B.J() && !B.K() && B.f22350h1 == qjVar.f32255o3) {
                        qjVar.f32178d1 = false;
                        org.telegram.ui.Components.fe feVar = qjVar.f32171c1;
                        if (feVar != null) {
                            feVar.j(org.telegram.ui.Components.ng.f37569a, false);
                        }
                        qjVar.f32277r4 = true;
                        qjVar.f32248n3 = true;
                        org.telegram.ui.Components.cg cgVar = qjVar.H3;
                        if (cgVar != null) {
                            cgVar.a1(1);
                        }
                        qjVar.f2(0, true);
                        if (this.f49226c) {
                            qjVar.P = true;
                            org.telegram.ui.Components.gg ggVar = qjVar.f32310w2;
                            if (ggVar != null) {
                                ggVar.E.d(1, true, false);
                            }
                            org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(qjVar.R);
                            long j11 = qjVar.f32327y3;
                            an anVar = qjVar.f32319x3;
                            if (anVar != null && anVar.f45407w4) {
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
                            j3 = B.l1;
                        }
                        qjVar.Q1 = j3;
                        org.telegram.ui.Components.lg lgVar = qjVar.Z0;
                        if (lgVar != null) {
                            lgVar.a(j3);
                        }
                        qjVar.f32159a5 = true;
                        qjVar.R1();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public mg(an anVar, boolean z10, long j3) {
        this.f49225b = anVar;
        this.f49226c = z10;
        this.d = j3;
    }
}
