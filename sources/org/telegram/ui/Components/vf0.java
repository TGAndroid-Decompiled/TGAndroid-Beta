package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
public final class vf0 implements Runnable {
    public final int f33552a;
    public final bg0 f33553b;

    public vf0(bg0 bg0Var, int i10) {
        this.f33552a = i10;
        this.f33553b = bg0Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f33552a) {
            case 0:
                this.f33553b.u();
                return;
            case 1:
                bg0 bg0Var = this.f33553b;
                PhotoViewer photoViewer = bg0Var.R;
                if (photoViewer != null) {
                    mf0 mf0Var = bg0Var.f27092r;
                    if (mf0Var != null) {
                        bg0Var.V = mf0Var.getCurrentPosition() / bg0Var.f27092r.getVideoDuration();
                        bg0Var.W = bg0Var.f27092r.getBufferedPosition();
                    } else {
                        x61 x61Var = photoViewer.B2;
                        if (x61Var != null) {
                            float m10 = (float) bg0Var.m();
                            bg0Var.V = ((float) x61Var.o()) / m10;
                            bg0Var.W = ((float) x61Var.k()) / m10;
                        } else {
                            return;
                        }
                    }
                    bg0Var.X.invalidate();
                    AndroidUtilities.runOnUIThread(bg0Var.f27078a0, 500L);
                    return;
                }
                return;
            case 2:
                bg0 bg0Var2 = this.f33553b;
                PhotoViewer photoViewer2 = bg0Var2.R;
                if (photoViewer2 != null) {
                    if ((photoViewer2.B2 != null || bg0Var2.f27092r != null) && !bg0Var2.Y && !bg0Var2.U && !bg0Var2.f27094w && !bg0Var2.f27093s.isInProgress() && bg0Var2.f27080b0) {
                        x61 x61Var2 = bg0Var2.R.B2;
                        if (bg0Var2.f27082c0[0] >= bg0Var2.t() * bg0Var2.F * 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        long l10 = bg0Var2.l();
                        long m11 = bg0Var2.m();
                        if (l10 != -9223372036854775807L && m11 >= 15000) {
                            mf0 mf0Var2 = bg0Var2.f27092r;
                            if (mf0Var2 != null) {
                                PhotoViewer photoViewer3 = bg0Var2.R;
                                photoViewer3.Y3.startRewind(mf0Var2, z10, bg0Var2.f27082c0[0], photoViewer3.f35783p1, bg0Var2.N);
                            } else {
                                PhotoViewer photoViewer4 = bg0Var2.R;
                                photoViewer4.Y3.startRewind(x61Var2, z10, bg0Var2.f27082c0[0], photoViewer4.f35783p1, bg0Var2.N);
                            }
                            if (!bg0Var2.A) {
                                bg0Var2.A = true;
                                bg0Var2.y(true);
                                if (!bg0Var2.f27085e0) {
                                    AndroidUtilities.runOnUIThread(bg0Var2.f27087f0, 1500L);
                                    bg0Var2.f27085e0 = true;
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
                bg0 bg0Var3 = this.f33553b;
                PhotoViewer photoViewer5 = bg0Var3.R;
                if (photoViewer5 != null && photoViewer5.Y3.rewinding) {
                    AndroidUtilities.runOnUIThread(bg0Var3.f27087f0, 1500L);
                    return;
                }
                bg0Var3.A = false;
                bg0Var3.y(false);
                bg0Var3.f27085e0 = false;
                return;
        }
    }
}
