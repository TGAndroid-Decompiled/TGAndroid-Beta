package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
public final class ig0 implements Runnable {
    public final int f24015a;
    public final og0 f24016b;

    public ig0(og0 og0Var, int i10) {
        this.f24015a = i10;
        this.f24016b = og0Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f24015a) {
            case 0:
                this.f24016b.u();
                return;
            case 1:
                og0 og0Var = this.f24016b;
                PhotoViewer photoViewer = og0Var.V;
                if (photoViewer != null) {
                    zf0 zf0Var = og0Var.f25799r;
                    if (zf0Var != null) {
                        og0Var.Z = zf0Var.getCurrentPosition() / og0Var.f25799r.getVideoDuration();
                        og0Var.f25783a0 = og0Var.f25799r.getBufferedPosition();
                    } else {
                        t71 t71Var = photoViewer.F2;
                        if (t71Var != null) {
                            float m10 = (float) og0Var.m();
                            og0Var.Z = ((float) t71Var.n()) / m10;
                            og0Var.f25783a0 = ((float) t71Var.j()) / m10;
                        } else {
                            return;
                        }
                    }
                    og0Var.f25785b0.invalidate();
                    AndroidUtilities.runOnUIThread(og0Var.f25789e0, 500L);
                    return;
                }
                return;
            case 2:
                og0 og0Var2 = this.f24016b;
                PhotoViewer photoViewer2 = og0Var2.V;
                if (photoViewer2 != null) {
                    if ((photoViewer2.F2 != null || og0Var2.f25799r != null) && !og0Var2.f25787c0 && !og0Var2.Y && !og0Var2.f25801w && !og0Var2.f25800s.isInProgress() && og0Var2.f25791f0) {
                        t71 t71Var2 = og0Var2.V.F2;
                        if (og0Var2.f25792g0[0] >= og0Var2.t() * og0Var2.J * 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        long l4 = og0Var2.l();
                        long m11 = og0Var2.m();
                        if (l4 != -9223372036854775807L && m11 >= 15000) {
                            zf0 zf0Var2 = og0Var2.f25799r;
                            if (zf0Var2 != null) {
                                PhotoViewer photoViewer3 = og0Var2.V;
                                photoViewer3.f30035c4.startRewind(zf0Var2, z10, og0Var2.f25792g0[0], photoViewer3.f30181t1, og0Var2.R);
                            } else {
                                PhotoViewer photoViewer4 = og0Var2.V;
                                photoViewer4.f30035c4.startRewind(t71Var2, z10, og0Var2.f25792g0[0], photoViewer4.f30181t1, og0Var2.R);
                            }
                            if (!og0Var2.E) {
                                og0Var2.E = true;
                                og0Var2.y(true);
                                if (!og0Var2.f25794i0) {
                                    AndroidUtilities.runOnUIThread(og0Var2.f25795j0, 1500L);
                                    og0Var2.f25794i0 = true;
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
                og0 og0Var3 = this.f24016b;
                PhotoViewer photoViewer5 = og0Var3.V;
                if (photoViewer5 != null && photoViewer5.f30035c4.rewinding) {
                    AndroidUtilities.runOnUIThread(og0Var3.f25795j0, 1500L);
                    return;
                }
                og0Var3.E = false;
                og0Var3.y(false);
                og0Var3.f25794i0 = false;
                return;
        }
    }
}
