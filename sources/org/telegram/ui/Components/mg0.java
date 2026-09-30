package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
public final class mg0 implements Runnable {
    public final int f26285a;
    public final rg0 f26286b;

    public mg0(rg0 rg0Var, int i10) {
        this.f26285a = i10;
        this.f26286b = rg0Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f26285a) {
            case 0:
                this.f26286b.u();
                return;
            case 1:
                rg0 rg0Var = this.f26286b;
                PhotoViewer photoViewer = rg0Var.V;
                if (photoViewer != null) {
                    dg0 dg0Var = rg0Var.f28005r;
                    if (dg0Var != null) {
                        rg0Var.Z = dg0Var.getCurrentPosition() / rg0Var.f28005r.getVideoDuration();
                        rg0Var.f27989a0 = rg0Var.f28005r.getBufferedPosition();
                    } else {
                        v71 v71Var = photoViewer.F2;
                        if (v71Var != null) {
                            float m10 = (float) rg0Var.m();
                            rg0Var.Z = ((float) v71Var.n()) / m10;
                            rg0Var.f27989a0 = ((float) v71Var.j()) / m10;
                        } else {
                            return;
                        }
                    }
                    rg0Var.f27991b0.invalidate();
                    AndroidUtilities.runOnUIThread(rg0Var.f27995e0, 500L);
                    return;
                }
                return;
            case 2:
                rg0 rg0Var2 = this.f26286b;
                PhotoViewer photoViewer2 = rg0Var2.V;
                if (photoViewer2 != null) {
                    if ((photoViewer2.F2 != null || rg0Var2.f28005r != null) && !rg0Var2.f27993c0 && !rg0Var2.Y && !rg0Var2.f28007w && !rg0Var2.f28006s.isInProgress() && rg0Var2.f27997f0) {
                        v71 v71Var2 = rg0Var2.V.F2;
                        if (rg0Var2.f27998g0[0] >= rg0Var2.t() * rg0Var2.J * 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        long l4 = rg0Var2.l();
                        long m11 = rg0Var2.m();
                        if (l4 != -9223372036854775807L && m11 >= 15000) {
                            dg0 dg0Var2 = rg0Var2.f28005r;
                            if (dg0Var2 != null) {
                                PhotoViewer photoViewer3 = rg0Var2.V;
                                photoViewer3.f31283c4.startRewind(dg0Var2, z10, rg0Var2.f27998g0[0], photoViewer3.f31429t1, rg0Var2.R);
                            } else {
                                PhotoViewer photoViewer4 = rg0Var2.V;
                                photoViewer4.f31283c4.startRewind(v71Var2, z10, rg0Var2.f27998g0[0], photoViewer4.f31429t1, rg0Var2.R);
                            }
                            if (!rg0Var2.E) {
                                rg0Var2.E = true;
                                rg0Var2.y(true);
                                if (!rg0Var2.f28000i0) {
                                    AndroidUtilities.runOnUIThread(rg0Var2.f28001j0, 1500L);
                                    rg0Var2.f28000i0 = true;
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
                rg0 rg0Var3 = this.f26286b;
                PhotoViewer photoViewer5 = rg0Var3.V;
                if (photoViewer5 != null && photoViewer5.f31283c4.rewinding) {
                    AndroidUtilities.runOnUIThread(rg0Var3.f28001j0, 1500L);
                    return;
                }
                rg0Var3.E = false;
                rg0Var3.y(false);
                rg0Var3.f28000i0 = false;
                return;
        }
    }
}
