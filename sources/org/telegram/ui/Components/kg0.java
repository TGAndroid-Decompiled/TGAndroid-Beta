package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
public final class kg0 implements Runnable {
    public final int f25722a;
    public final pg0 f25723b;

    public kg0(pg0 pg0Var, int i10) {
        this.f25722a = i10;
        this.f25723b = pg0Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f25722a) {
            case 0:
                this.f25723b.u();
                return;
            case 1:
                pg0 pg0Var = this.f25723b;
                PhotoViewer photoViewer = pg0Var.V;
                if (photoViewer != null) {
                    bg0 bg0Var = pg0Var.f27371r;
                    if (bg0Var != null) {
                        pg0Var.Z = bg0Var.getCurrentPosition() / pg0Var.f27371r.getVideoDuration();
                        pg0Var.f27355a0 = pg0Var.f27371r.getBufferedPosition();
                    } else {
                        t71 t71Var = photoViewer.F2;
                        if (t71Var != null) {
                            float m10 = (float) pg0Var.m();
                            pg0Var.Z = ((float) t71Var.n()) / m10;
                            pg0Var.f27355a0 = ((float) t71Var.j()) / m10;
                        } else {
                            return;
                        }
                    }
                    pg0Var.f27357b0.invalidate();
                    AndroidUtilities.runOnUIThread(pg0Var.f27361e0, 500L);
                    return;
                }
                return;
            case 2:
                pg0 pg0Var2 = this.f25723b;
                PhotoViewer photoViewer2 = pg0Var2.V;
                if (photoViewer2 != null) {
                    if ((photoViewer2.F2 != null || pg0Var2.f27371r != null) && !pg0Var2.f27359c0 && !pg0Var2.Y && !pg0Var2.f27373w && !pg0Var2.f27372s.isInProgress() && pg0Var2.f27363f0) {
                        t71 t71Var2 = pg0Var2.V.F2;
                        if (pg0Var2.f27364g0[0] >= pg0Var2.t() * pg0Var2.J * 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        long l4 = pg0Var2.l();
                        long m11 = pg0Var2.m();
                        if (l4 != -9223372036854775807L && m11 >= 15000) {
                            bg0 bg0Var2 = pg0Var2.f27371r;
                            if (bg0Var2 != null) {
                                PhotoViewer photoViewer3 = pg0Var2.V;
                                photoViewer3.f31208c4.startRewind(bg0Var2, z10, pg0Var2.f27364g0[0], photoViewer3.f31354t1, pg0Var2.R);
                            } else {
                                PhotoViewer photoViewer4 = pg0Var2.V;
                                photoViewer4.f31208c4.startRewind(t71Var2, z10, pg0Var2.f27364g0[0], photoViewer4.f31354t1, pg0Var2.R);
                            }
                            if (!pg0Var2.E) {
                                pg0Var2.E = true;
                                pg0Var2.y(true);
                                if (!pg0Var2.f27366i0) {
                                    AndroidUtilities.runOnUIThread(pg0Var2.f27367j0, 1500L);
                                    pg0Var2.f27366i0 = true;
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
                pg0 pg0Var3 = this.f25723b;
                PhotoViewer photoViewer5 = pg0Var3.V;
                if (photoViewer5 != null && photoViewer5.f31208c4.rewinding) {
                    AndroidUtilities.runOnUIThread(pg0Var3.f27367j0, 1500L);
                    return;
                }
                pg0Var3.E = false;
                pg0Var3.y(false);
                pg0Var3.f27366i0 = false;
                return;
        }
    }
}
