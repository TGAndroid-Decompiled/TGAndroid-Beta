package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
public final class ag0 implements Runnable {
    public final int f22412a;
    public final fg0 f22413b;

    public ag0(fg0 fg0Var, int i10) {
        this.f22412a = i10;
        this.f22413b = fg0Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f22412a) {
            case 0:
                this.f22413b.u();
                return;
            case 1:
                fg0 fg0Var = this.f22413b;
                PhotoViewer photoViewer = fg0Var.V;
                if (photoViewer != null) {
                    qf0 qf0Var = fg0Var.f23932r;
                    if (qf0Var != null) {
                        fg0Var.Z = qf0Var.getCurrentPosition() / fg0Var.f23932r.getVideoDuration();
                        fg0Var.f23916a0 = fg0Var.f23932r.getBufferedPosition();
                    } else {
                        h71 h71Var = photoViewer.F2;
                        if (h71Var != null) {
                            float m10 = (float) fg0Var.m();
                            fg0Var.Z = ((float) h71Var.n()) / m10;
                            fg0Var.f23916a0 = ((float) h71Var.j()) / m10;
                        } else {
                            return;
                        }
                    }
                    fg0Var.f23918b0.invalidate();
                    AndroidUtilities.runOnUIThread(fg0Var.f23922e0, 500L);
                    return;
                }
                return;
            case 2:
                fg0 fg0Var2 = this.f22413b;
                PhotoViewer photoViewer2 = fg0Var2.V;
                if (photoViewer2 != null) {
                    if ((photoViewer2.F2 != null || fg0Var2.f23932r != null) && !fg0Var2.f23920c0 && !fg0Var2.Y && !fg0Var2.f23934w && !fg0Var2.f23933s.isInProgress() && fg0Var2.f23924f0) {
                        h71 h71Var2 = fg0Var2.V.F2;
                        if (fg0Var2.f23925g0[0] >= fg0Var2.t() * fg0Var2.J * 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        long l4 = fg0Var2.l();
                        long m11 = fg0Var2.m();
                        if (l4 != -9223372036854775807L && m11 >= 15000) {
                            qf0 qf0Var2 = fg0Var2.f23932r;
                            if (qf0Var2 != null) {
                                PhotoViewer photoViewer3 = fg0Var2.V;
                                photoViewer3.f30940c4.startRewind(qf0Var2, z10, fg0Var2.f23925g0[0], photoViewer3.f31086t1, fg0Var2.R);
                            } else {
                                PhotoViewer photoViewer4 = fg0Var2.V;
                                photoViewer4.f30940c4.startRewind(h71Var2, z10, fg0Var2.f23925g0[0], photoViewer4.f31086t1, fg0Var2.R);
                            }
                            if (!fg0Var2.E) {
                                fg0Var2.E = true;
                                fg0Var2.y(true);
                                if (!fg0Var2.f23927i0) {
                                    AndroidUtilities.runOnUIThread(fg0Var2.f23928j0, 1500L);
                                    fg0Var2.f23927i0 = true;
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
                fg0 fg0Var3 = this.f22413b;
                PhotoViewer photoViewer5 = fg0Var3.V;
                if (photoViewer5 != null && photoViewer5.f30940c4.rewinding) {
                    AndroidUtilities.runOnUIThread(fg0Var3.f23928j0, 1500L);
                    return;
                }
                fg0Var3.E = false;
                fg0Var3.y(false);
                fg0Var3.f23927i0 = false;
                return;
        }
    }
}
