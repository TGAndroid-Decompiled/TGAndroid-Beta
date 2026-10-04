package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
public final class mg0 implements Runnable {
    public final int f28623a;
    public final rg0 f28624b;

    public mg0(rg0 rg0Var, int i10) {
        this.f28623a = i10;
        this.f28624b = rg0Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f28623a) {
            case 0:
                this.f28624b.u();
                return;
            case 1:
                rg0 rg0Var = this.f28624b;
                PhotoViewer photoViewer = rg0Var.V;
                if (photoViewer != null) {
                    dg0 dg0Var = rg0Var.f30403r;
                    if (dg0Var != null) {
                        rg0Var.Z = dg0Var.getCurrentPosition() / rg0Var.f30403r.getVideoDuration();
                        rg0Var.f30386a0 = rg0Var.f30403r.getBufferedPosition();
                    } else {
                        d81 d81Var = photoViewer.F2;
                        if (d81Var != null) {
                            float m10 = (float) rg0Var.m();
                            rg0Var.Z = ((float) d81Var.n()) / m10;
                            rg0Var.f30386a0 = ((float) d81Var.j()) / m10;
                        } else {
                            return;
                        }
                    }
                    rg0Var.f30388b0.invalidate();
                    AndroidUtilities.runOnUIThread(rg0Var.f30393e0, 500L);
                    return;
                }
                return;
            case 2:
                rg0 rg0Var2 = this.f28624b;
                PhotoViewer photoViewer2 = rg0Var2.V;
                if (photoViewer2 != null) {
                    if ((photoViewer2.F2 != null || rg0Var2.f30403r != null) && !rg0Var2.f30390c0 && !rg0Var2.Y && !rg0Var2.f30405w && !rg0Var2.f30404s.isInProgress() && rg0Var2.f30395f0) {
                        d81 d81Var2 = rg0Var2.V.F2;
                        if (rg0Var2.f30396g0[0] >= rg0Var2.t() * rg0Var2.J * 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        long l4 = rg0Var2.l();
                        long m11 = rg0Var2.m();
                        if (l4 != -9223372036854775807L && m11 >= 15000) {
                            dg0 dg0Var2 = rg0Var2.f30403r;
                            if (dg0Var2 != null) {
                                PhotoViewer photoViewer3 = rg0Var2.V;
                                photoViewer3.f33886c4.startRewind(dg0Var2, z10, rg0Var2.f30396g0[0], photoViewer3.f34033t1, rg0Var2.R);
                            } else {
                                PhotoViewer photoViewer4 = rg0Var2.V;
                                photoViewer4.f33886c4.startRewind(d81Var2, z10, rg0Var2.f30396g0[0], photoViewer4.f34033t1, rg0Var2.R);
                            }
                            if (!rg0Var2.E) {
                                rg0Var2.E = true;
                                rg0Var2.y(true);
                                if (!rg0Var2.f30398i0) {
                                    AndroidUtilities.runOnUIThread(rg0Var2.f30399j0, 1500L);
                                    rg0Var2.f30398i0 = true;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                rg0 rg0Var3 = this.f28624b;
                PhotoViewer photoViewer5 = rg0Var3.V;
                if (photoViewer5 != null && photoViewer5.f33886c4.rewinding) {
                    AndroidUtilities.runOnUIThread(rg0Var3.f30399j0, 1500L);
                    return;
                }
                rg0Var3.E = false;
                rg0Var3.y(false);
                rg0Var3.f30398i0 = false;
                return;
        }
    }
}
