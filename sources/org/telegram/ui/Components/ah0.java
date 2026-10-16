package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
public final class ah0 implements Runnable {
    public final int f23245a;
    public final fh0 f23246b;

    public ah0(fh0 fh0Var, int i10) {
        this.f23245a = i10;
        this.f23246b = fh0Var;
    }

    @Override
    public final void run() {
        rg0 rg0Var;
        boolean z10;
        switch (this.f23245a) {
            case 0:
                this.f23246b.u();
                return;
            case 1:
                fh0 fh0Var = this.f23246b;
                PhotoViewer photoViewer = fh0Var.V;
                if (photoViewer != null) {
                    if (fh0Var.f24751r != null) {
                        fh0Var.Z = rg0Var.getCurrentPosition() / fh0Var.f24751r.getVideoDuration();
                        fh0Var.f24735a0 = fh0Var.f24751r.getBufferedPosition();
                    } else {
                        i81 i81Var = photoViewer.F2;
                        if (i81Var != null) {
                            float m10 = (float) fh0Var.m();
                            fh0Var.Z = ((float) i81Var.n()) / m10;
                            fh0Var.f24735a0 = ((float) i81Var.j()) / m10;
                        } else {
                            return;
                        }
                    }
                    fh0Var.f24737b0.invalidate();
                    AndroidUtilities.runOnUIThread(fh0Var.f24741e0, 500L);
                    return;
                }
                return;
            case 2:
                fh0 fh0Var2 = this.f23246b;
                PhotoViewer photoViewer2 = fh0Var2.V;
                if (photoViewer2 != null) {
                    if ((photoViewer2.F2 != null || fh0Var2.f24751r != null) && !fh0Var2.f24739c0 && !fh0Var2.Y && !fh0Var2.f24753w && !fh0Var2.f24752s.isInProgress() && fh0Var2.f24743f0) {
                        i81 i81Var2 = fh0Var2.V.F2;
                        if (fh0Var2.f24744g0[0] >= fh0Var2.t() * fh0Var2.J * 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        long l4 = fh0Var2.l();
                        long m11 = fh0Var2.m();
                        if (l4 != -9223372036854775807L && m11 >= 15000) {
                            rg0 rg0Var2 = fh0Var2.f24751r;
                            if (rg0Var2 != null) {
                                PhotoViewer photoViewer3 = fh0Var2.V;
                                photoViewer3.f31914c4.startRewind(rg0Var2, z10, fh0Var2.f24744g0[0], photoViewer3.f32061t1, fh0Var2.R);
                            } else {
                                PhotoViewer photoViewer4 = fh0Var2.V;
                                photoViewer4.f31914c4.startRewind(i81Var2, z10, fh0Var2.f24744g0[0], photoViewer4.f32061t1, fh0Var2.R);
                            }
                            if (!fh0Var2.E) {
                                fh0Var2.E = true;
                                fh0Var2.y(true);
                                if (!fh0Var2.f24746i0) {
                                    AndroidUtilities.runOnUIThread(fh0Var2.f24747j0, 1500L);
                                    fh0Var2.f24746i0 = true;
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
                fh0 fh0Var3 = this.f23246b;
                PhotoViewer photoViewer5 = fh0Var3.V;
                if (photoViewer5 != null && photoViewer5.f31914c4.rewinding) {
                    AndroidUtilities.runOnUIThread(fh0Var3.f24747j0, 1500L);
                    return;
                }
                fh0Var3.E = false;
                fh0Var3.y(false);
                fh0Var3.f24746i0 = false;
                return;
        }
    }
}
