package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
public final class dh0 implements Runnable {
    public final int f25604a;
    public final ih0 f25605b;

    public dh0(ih0 ih0Var, int i10) {
        this.f25604a = i10;
        this.f25605b = ih0Var;
    }

    @Override
    public final void run() {
        ug0 ug0Var;
        boolean z10;
        switch (this.f25604a) {
            case 0:
                this.f25605b.u();
                return;
            case 1:
                ih0 ih0Var = this.f25605b;
                PhotoViewer photoViewer = ih0Var.V;
                if (photoViewer != null) {
                    if (ih0Var.f27344r != null) {
                        ih0Var.Z = ug0Var.getCurrentPosition() / ih0Var.f27344r.getVideoDuration();
                        ih0Var.f27327a0 = ih0Var.f27344r.getBufferedPosition();
                    } else {
                        m81 m81Var = photoViewer.F2;
                        if (m81Var != null) {
                            float m10 = (float) ih0Var.m();
                            ih0Var.Z = ((float) m81Var.n()) / m10;
                            ih0Var.f27327a0 = ((float) m81Var.j()) / m10;
                        } else {
                            return;
                        }
                    }
                    ih0Var.f27329b0.invalidate();
                    AndroidUtilities.runOnUIThread(ih0Var.f27334e0, 500L);
                    return;
                }
                return;
            case 2:
                ih0 ih0Var2 = this.f25605b;
                PhotoViewer photoViewer2 = ih0Var2.V;
                if (photoViewer2 != null) {
                    if ((photoViewer2.F2 != null || ih0Var2.f27344r != null) && !ih0Var2.f27331c0 && !ih0Var2.Y && !ih0Var2.f27346w && !ih0Var2.f27345s.isInProgress() && ih0Var2.f27336f0) {
                        m81 m81Var2 = ih0Var2.V.F2;
                        if (ih0Var2.f27337g0[0] >= ih0Var2.t() * ih0Var2.J * 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        long l4 = ih0Var2.l();
                        long m11 = ih0Var2.m();
                        if (l4 != -9223372036854775807L && m11 >= 15000) {
                            ug0 ug0Var2 = ih0Var2.f27344r;
                            if (ug0Var2 != null) {
                                PhotoViewer photoViewer3 = ih0Var2.V;
                                photoViewer3.f33917c4.startRewind(ug0Var2, z10, ih0Var2.f27337g0[0], photoViewer3.f34064t1, ih0Var2.R);
                            } else {
                                PhotoViewer photoViewer4 = ih0Var2.V;
                                photoViewer4.f33917c4.startRewind(m81Var2, z10, ih0Var2.f27337g0[0], photoViewer4.f34064t1, ih0Var2.R);
                            }
                            if (!ih0Var2.E) {
                                ih0Var2.E = true;
                                ih0Var2.y(true);
                                if (!ih0Var2.f27339i0) {
                                    AndroidUtilities.runOnUIThread(ih0Var2.f27340j0, 1500L);
                                    ih0Var2.f27339i0 = true;
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
                ih0 ih0Var3 = this.f25605b;
                PhotoViewer photoViewer5 = ih0Var3.V;
                if (photoViewer5 != null && photoViewer5.f33917c4.rewinding) {
                    AndroidUtilities.runOnUIThread(ih0Var3.f27340j0, 1500L);
                    return;
                }
                ih0Var3.E = false;
                ih0Var3.y(false);
                ih0Var3.f27339i0 = false;
                return;
        }
    }
}
