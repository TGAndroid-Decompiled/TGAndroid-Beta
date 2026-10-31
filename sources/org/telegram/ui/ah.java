package org.telegram.ui;

import org.telegram.messenger.MediaController;
public final class ah implements Runnable {
    public final int f35648a = 0;
    public final un f35649b;
    public final boolean f35650c;
    public final long d;

    public ah(un unVar, long j10, boolean z10) {
        this.f35649b = unVar;
        this.d = j10;
        this.f35650c = z10;
    }

    @Override
    public final void run() {
        long j10;
        long j11;
        switch (this.f35648a) {
            case 0:
                un.k1(this.f35649b, this.d, this.f35650c);
                return;
            default:
                mk mkVar = this.f35649b.Z;
                if (mkVar != null) {
                    MediaController B = MediaController.B();
                    if (!mkVar.Y1 && !mkVar.F2 && B.J() && !B.K() && B.f14452f1 == mkVar.G2) {
                        mkVar.f23688c1 = false;
                        org.telegram.ui.Components.zd zdVar = mkVar.f23681b1;
                        if (zdVar != null) {
                            zdVar.j(org.telegram.ui.Components.dg.f25405a, false);
                        }
                        mkVar.F2 = true;
                        mkVar.K1(0, true);
                        if (this.f35650c) {
                            mkVar.O = true;
                            org.telegram.ui.Components.wf wfVar = mkVar.O1;
                            if (wfVar != null) {
                                wfVar.D.d(1, true, false);
                            }
                            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(mkVar.Q);
                            long j12 = mkVar.Q2;
                            un unVar = mkVar.P2;
                            if (unVar != null && unVar.f42445v4) {
                                j11 = unVar.b();
                            } else {
                                j11 = 0;
                            }
                            b02.e2(j12, j11, true);
                        }
                        long j13 = this.d;
                        if (j13 > 0) {
                            j10 = System.currentTimeMillis() - j13;
                        } else {
                            j10 = B.f14460j1;
                        }
                        mkVar.f23725i1 = j10;
                        org.telegram.ui.Components.bg bgVar = mkVar.Y0;
                        if (bgVar != null) {
                            bgVar.a(j10);
                        }
                        mkVar.f23787s4 = true;
                        mkVar.w1();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public ah(un unVar, boolean z10, long j10) {
        this.f35649b = unVar;
        this.f35650c = z10;
        this.d = j10;
    }
}
