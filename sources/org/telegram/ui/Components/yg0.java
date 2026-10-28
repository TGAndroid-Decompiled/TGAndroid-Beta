package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
public final class yg0 implements Runnable {
    public final int f35051a;
    public final dh0 f35052b;

    public yg0(dh0 dh0Var, int i10) {
        this.f35051a = i10;
        this.f35052b = dh0Var;
    }

    @Override
    public final void run() {
        ng0 ng0Var;
        boolean z10;
        switch (this.f35051a) {
            case 0:
                this.f35052b.u();
                return;
            case 1:
                dh0 dh0Var = this.f35052b;
                PhotoViewer photoViewer = dh0Var.V;
                if (photoViewer != null) {
                    if (dh0Var.f27462r != null) {
                        dh0Var.Z = ng0Var.getCurrentPosition() / dh0Var.f27462r.getVideoDuration();
                        dh0Var.f27446a0 = dh0Var.f27462r.getBufferedPosition();
                    } else {
                        t81 t81Var = photoViewer.F2;
                        if (t81Var != null) {
                            float m10 = (float) dh0Var.m();
                            dh0Var.Z = ((float) t81Var.n()) / m10;
                            dh0Var.f27446a0 = ((float) t81Var.j()) / m10;
                        } else {
                            return;
                        }
                    }
                    dh0Var.f27448b0.invalidate();
                    AndroidUtilities.runOnUIThread(dh0Var.f27452e0, 500L);
                    return;
                }
                return;
            case 2:
                dh0 dh0Var2 = this.f35052b;
                PhotoViewer photoViewer2 = dh0Var2.V;
                if (photoViewer2 != null) {
                    if ((photoViewer2.F2 != null || dh0Var2.f27462r != null) && !dh0Var2.f27450c0 && !dh0Var2.Y && !dh0Var2.f27464w && !dh0Var2.f27463s.isInProgress() && dh0Var2.f27454f0) {
                        t81 t81Var2 = dh0Var2.V.F2;
                        if (dh0Var2.f27455g0[0] >= dh0Var2.t() * dh0Var2.J * 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        long l4 = dh0Var2.l();
                        long m11 = dh0Var2.m();
                        if (l4 != -9223372036854775807L && m11 >= 15000) {
                            ng0 ng0Var2 = dh0Var2.f27462r;
                            if (ng0Var2 != null) {
                                PhotoViewer photoViewer3 = dh0Var2.V;
                                photoViewer3.f35656c4.startRewind(ng0Var2, z10, dh0Var2.f27455g0[0], photoViewer3.f35803t1, dh0Var2.R);
                            } else {
                                PhotoViewer photoViewer4 = dh0Var2.V;
                                photoViewer4.f35656c4.startRewind(t81Var2, z10, dh0Var2.f27455g0[0], photoViewer4.f35803t1, dh0Var2.R);
                            }
                            if (!dh0Var2.E) {
                                dh0Var2.E = true;
                                dh0Var2.y(true);
                                if (!dh0Var2.f27457i0) {
                                    AndroidUtilities.runOnUIThread(dh0Var2.f27458j0, 1500L);
                                    dh0Var2.f27457i0 = true;
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
                dh0 dh0Var3 = this.f35052b;
                PhotoViewer photoViewer5 = dh0Var3.V;
                if (photoViewer5 != null && photoViewer5.f35656c4.rewinding) {
                    AndroidUtilities.runOnUIThread(dh0Var3.f27458j0, 1500L);
                    return;
                }
                dh0Var3.E = false;
                dh0Var3.y(false);
                dh0Var3.f27457i0 = false;
                return;
        }
    }
}
