package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
public final class mg0 implements Runnable {
    public final int f28702a;
    public final rg0 f28703b;

    public mg0(rg0 rg0Var, int i10) {
        this.f28702a = i10;
        this.f28703b = rg0Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f28702a) {
            case 0:
                this.f28703b.u();
                return;
            case 1:
                rg0 rg0Var = this.f28703b;
                PhotoViewer photoViewer = rg0Var.V;
                if (photoViewer != null) {
                    dg0 dg0Var = rg0Var.f30485r;
                    if (dg0Var != null) {
                        rg0Var.Z = dg0Var.getCurrentPosition() / rg0Var.f30485r.getVideoDuration();
                        rg0Var.f30468a0 = rg0Var.f30485r.getBufferedPosition();
                    } else {
                        e81 e81Var = photoViewer.F2;
                        if (e81Var != null) {
                            float m10 = (float) rg0Var.m();
                            rg0Var.Z = ((float) e81Var.n()) / m10;
                            rg0Var.f30468a0 = ((float) e81Var.j()) / m10;
                        } else {
                            return;
                        }
                    }
                    rg0Var.f30470b0.invalidate();
                    AndroidUtilities.runOnUIThread(rg0Var.f30475e0, 500L);
                    return;
                }
                return;
            case 2:
                rg0 rg0Var2 = this.f28703b;
                PhotoViewer photoViewer2 = rg0Var2.V;
                if (photoViewer2 != null) {
                    if ((photoViewer2.F2 != null || rg0Var2.f30485r != null) && !rg0Var2.f30472c0 && !rg0Var2.Y && !rg0Var2.f30487w && !rg0Var2.f30486s.isInProgress() && rg0Var2.f30477f0) {
                        e81 e81Var2 = rg0Var2.V.F2;
                        if (rg0Var2.f30478g0[0] >= rg0Var2.t() * rg0Var2.J * 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        long l4 = rg0Var2.l();
                        long m11 = rg0Var2.m();
                        if (l4 != -9223372036854775807L && m11 >= 15000) {
                            dg0 dg0Var2 = rg0Var2.f30485r;
                            if (dg0Var2 != null) {
                                PhotoViewer photoViewer3 = rg0Var2.V;
                                photoViewer3.f33899c4.startRewind(dg0Var2, z10, rg0Var2.f30478g0[0], photoViewer3.f34046t1, rg0Var2.R);
                            } else {
                                PhotoViewer photoViewer4 = rg0Var2.V;
                                photoViewer4.f33899c4.startRewind(e81Var2, z10, rg0Var2.f30478g0[0], photoViewer4.f34046t1, rg0Var2.R);
                            }
                            if (!rg0Var2.E) {
                                rg0Var2.E = true;
                                rg0Var2.y(true);
                                if (!rg0Var2.f30480i0) {
                                    AndroidUtilities.runOnUIThread(rg0Var2.f30481j0, 1500L);
                                    rg0Var2.f30480i0 = true;
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
                rg0 rg0Var3 = this.f28703b;
                PhotoViewer photoViewer5 = rg0Var3.V;
                if (photoViewer5 != null && photoViewer5.f33899c4.rewinding) {
                    AndroidUtilities.runOnUIThread(rg0Var3.f30481j0, 1500L);
                    return;
                }
                rg0Var3.E = false;
                rg0Var3.y(false);
                rg0Var3.f30480i0 = false;
                return;
        }
    }
}
