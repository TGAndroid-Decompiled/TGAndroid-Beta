package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
public final class kg0 implements Runnable {
    public final int f25721a;
    public final pg0 f25722b;

    public kg0(pg0 pg0Var, int i10) {
        this.f25721a = i10;
        this.f25722b = pg0Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f25721a) {
            case 0:
                this.f25722b.u();
                return;
            case 1:
                pg0 pg0Var = this.f25722b;
                PhotoViewer photoViewer = pg0Var.V;
                if (photoViewer != null) {
                    zf0 zf0Var = pg0Var.f27227r;
                    if (zf0Var != null) {
                        pg0Var.Z = zf0Var.getCurrentPosition() / pg0Var.f27227r.getVideoDuration();
                        pg0Var.f27211a0 = pg0Var.f27227r.getBufferedPosition();
                    } else {
                        u71 u71Var = photoViewer.F2;
                        if (u71Var != null) {
                            float m10 = (float) pg0Var.m();
                            pg0Var.Z = ((float) u71Var.n()) / m10;
                            pg0Var.f27211a0 = ((float) u71Var.j()) / m10;
                        } else {
                            return;
                        }
                    }
                    pg0Var.f27213b0.invalidate();
                    AndroidUtilities.runOnUIThread(pg0Var.f27217e0, 500L);
                    return;
                }
                return;
            case 2:
                pg0 pg0Var2 = this.f25722b;
                PhotoViewer photoViewer2 = pg0Var2.V;
                if (photoViewer2 != null) {
                    if ((photoViewer2.F2 != null || pg0Var2.f27227r != null) && !pg0Var2.f27215c0 && !pg0Var2.Y && !pg0Var2.f27229w && !pg0Var2.f27228s.isInProgress() && pg0Var2.f27219f0) {
                        u71 u71Var2 = pg0Var2.V.F2;
                        if (pg0Var2.f27220g0[0] >= pg0Var2.t() * pg0Var2.J * 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        long l4 = pg0Var2.l();
                        long m11 = pg0Var2.m();
                        if (l4 != -9223372036854775807L && m11 >= 15000) {
                            zf0 zf0Var2 = pg0Var2.f27227r;
                            if (zf0Var2 != null) {
                                PhotoViewer photoViewer3 = pg0Var2.V;
                                photoViewer3.f31167c4.startRewind(zf0Var2, z10, pg0Var2.f27220g0[0], photoViewer3.f31313t1, pg0Var2.R);
                            } else {
                                PhotoViewer photoViewer4 = pg0Var2.V;
                                photoViewer4.f31167c4.startRewind(u71Var2, z10, pg0Var2.f27220g0[0], photoViewer4.f31313t1, pg0Var2.R);
                            }
                            if (!pg0Var2.E) {
                                pg0Var2.E = true;
                                pg0Var2.y(true);
                                if (!pg0Var2.f27222i0) {
                                    AndroidUtilities.runOnUIThread(pg0Var2.f27223j0, 1500L);
                                    pg0Var2.f27222i0 = true;
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
                pg0 pg0Var3 = this.f25722b;
                PhotoViewer photoViewer5 = pg0Var3.V;
                if (photoViewer5 != null && photoViewer5.f31167c4.rewinding) {
                    AndroidUtilities.runOnUIThread(pg0Var3.f27223j0, 1500L);
                    return;
                }
                pg0Var3.E = false;
                pg0Var3.y(false);
                pg0Var3.f27222i0 = false;
                return;
        }
    }
}
