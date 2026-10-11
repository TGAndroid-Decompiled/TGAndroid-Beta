package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
public final class ch0 implements Runnable {
    public final int f25361a;
    public final hh0 f25362b;

    public ch0(hh0 hh0Var, int i10) {
        this.f25361a = i10;
        this.f25362b = hh0Var;
    }

    @Override
    public final void run() {
        tg0 tg0Var;
        boolean z10;
        switch (this.f25361a) {
            case 0:
                this.f25362b.u();
                return;
            case 1:
                hh0 hh0Var = this.f25362b;
                PhotoViewer photoViewer = hh0Var.V;
                if (photoViewer != null) {
                    if (hh0Var.f27120r != null) {
                        hh0Var.Z = tg0Var.getCurrentPosition() / hh0Var.f27120r.getVideoDuration();
                        hh0Var.f27103a0 = hh0Var.f27120r.getBufferedPosition();
                    } else {
                        l81 l81Var = photoViewer.F2;
                        if (l81Var != null) {
                            float m10 = (float) hh0Var.m();
                            hh0Var.Z = ((float) l81Var.n()) / m10;
                            hh0Var.f27103a0 = ((float) l81Var.j()) / m10;
                        } else {
                            return;
                        }
                    }
                    hh0Var.f27105b0.invalidate();
                    AndroidUtilities.runOnUIThread(hh0Var.f27110e0, 500L);
                    return;
                }
                return;
            case 2:
                hh0 hh0Var2 = this.f25362b;
                PhotoViewer photoViewer2 = hh0Var2.V;
                if (photoViewer2 != null) {
                    if ((photoViewer2.F2 != null || hh0Var2.f27120r != null) && !hh0Var2.f27107c0 && !hh0Var2.Y && !hh0Var2.f27122w && !hh0Var2.f27121s.isInProgress() && hh0Var2.f27112f0) {
                        l81 l81Var2 = hh0Var2.V.F2;
                        if (hh0Var2.f27113g0[0] >= hh0Var2.t() * hh0Var2.J * 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        long l4 = hh0Var2.l();
                        long m11 = hh0Var2.m();
                        if (l4 != -9223372036854775807L && m11 >= 15000) {
                            tg0 tg0Var2 = hh0Var2.f27120r;
                            if (tg0Var2 != null) {
                                PhotoViewer photoViewer3 = hh0Var2.V;
                                photoViewer3.f33951c4.startRewind(tg0Var2, z10, hh0Var2.f27113g0[0], photoViewer3.f34098t1, hh0Var2.R);
                            } else {
                                PhotoViewer photoViewer4 = hh0Var2.V;
                                photoViewer4.f33951c4.startRewind(l81Var2, z10, hh0Var2.f27113g0[0], photoViewer4.f34098t1, hh0Var2.R);
                            }
                            if (!hh0Var2.E) {
                                hh0Var2.E = true;
                                hh0Var2.y(true);
                                if (!hh0Var2.f27115i0) {
                                    AndroidUtilities.runOnUIThread(hh0Var2.f27116j0, 1500L);
                                    hh0Var2.f27115i0 = true;
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
                hh0 hh0Var3 = this.f25362b;
                PhotoViewer photoViewer5 = hh0Var3.V;
                if (photoViewer5 != null && photoViewer5.f33951c4.rewinding) {
                    AndroidUtilities.runOnUIThread(hh0Var3.f27116j0, 1500L);
                    return;
                }
                hh0Var3.E = false;
                hh0Var3.y(false);
                hh0Var3.f27115i0 = false;
                return;
        }
    }
}
