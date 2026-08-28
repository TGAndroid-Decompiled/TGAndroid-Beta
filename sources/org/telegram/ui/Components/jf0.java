package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
public final class jf0 implements Runnable {
    public final int f29727a;
    public final pf0 f29728b;

    public jf0(pf0 pf0Var, int i9) {
        this.f29727a = i9;
        this.f29728b = pf0Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f29727a) {
            case 0:
                this.f29728b.u();
                return;
            case 1:
                pf0 pf0Var = this.f29728b;
                PhotoViewer photoViewer = pf0Var.R;
                if (photoViewer != null) {
                    ze0 ze0Var = pf0Var.f31638r;
                    if (ze0Var != null) {
                        pf0Var.V = ze0Var.getCurrentPosition() / pf0Var.f31638r.getVideoDuration();
                        pf0Var.W = pf0Var.f31638r.getBufferedPosition();
                    } else {
                        k61 k61Var = photoViewer.B2;
                        if (k61Var != null) {
                            float m10 = (float) pf0Var.m();
                            pf0Var.V = ((float) k61Var.o()) / m10;
                            pf0Var.W = ((float) k61Var.k()) / m10;
                        } else {
                            return;
                        }
                    }
                    pf0Var.X.invalidate();
                    AndroidUtilities.runOnUIThread(pf0Var.f31624a0, 500L);
                    return;
                }
                return;
            case 2:
                pf0 pf0Var2 = this.f29728b;
                PhotoViewer photoViewer2 = pf0Var2.R;
                if (photoViewer2 != null) {
                    if ((photoViewer2.B2 != null || pf0Var2.f31638r != null) && !pf0Var2.Y && !pf0Var2.U && !pf0Var2.f31640w && !pf0Var2.f31639s.isInProgress() && pf0Var2.f31626b0) {
                        k61 k61Var2 = pf0Var2.R.B2;
                        if (pf0Var2.f31628c0[0] >= pf0Var2.t() * pf0Var2.F * 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        long l10 = pf0Var2.l();
                        long m11 = pf0Var2.m();
                        if (l10 != -9223372036854775807L && m11 >= 15000) {
                            ze0 ze0Var2 = pf0Var2.f31638r;
                            if (ze0Var2 != null) {
                                PhotoViewer photoViewer3 = pf0Var2.R;
                                photoViewer3.Y3.startRewind(ze0Var2, z10, pf0Var2.f31628c0[0], photoViewer3.f35716p1, pf0Var2.N);
                            } else {
                                PhotoViewer photoViewer4 = pf0Var2.R;
                                photoViewer4.Y3.startRewind(k61Var2, z10, pf0Var2.f31628c0[0], photoViewer4.f35716p1, pf0Var2.N);
                            }
                            if (!pf0Var2.A) {
                                pf0Var2.A = true;
                                pf0Var2.y(true);
                                if (!pf0Var2.f31631e0) {
                                    AndroidUtilities.runOnUIThread(pf0Var2.f31633f0, 1500L);
                                    pf0Var2.f31631e0 = true;
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
                pf0 pf0Var3 = this.f29728b;
                PhotoViewer photoViewer5 = pf0Var3.R;
                if (photoViewer5 != null && photoViewer5.Y3.rewinding) {
                    AndroidUtilities.runOnUIThread(pf0Var3.f31633f0, 1500L);
                    return;
                }
                pf0Var3.A = false;
                pf0Var3.y(false);
                pf0Var3.f31631e0 = false;
                return;
        }
    }
}
