package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
public final class lg0 implements Runnable {
    public final int f25996a;
    public final qg0 f25997b;

    public lg0(qg0 qg0Var, int i10) {
        this.f25996a = i10;
        this.f25997b = qg0Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f25996a) {
            case 0:
                this.f25997b.u();
                return;
            case 1:
                qg0 qg0Var = this.f25997b;
                PhotoViewer photoViewer = qg0Var.V;
                if (photoViewer != null) {
                    cg0 cg0Var = qg0Var.f27709r;
                    if (cg0Var != null) {
                        qg0Var.Z = cg0Var.getCurrentPosition() / qg0Var.f27709r.getVideoDuration();
                        qg0Var.f27693a0 = qg0Var.f27709r.getBufferedPosition();
                    } else {
                        u71 u71Var = photoViewer.F2;
                        if (u71Var != null) {
                            float m10 = (float) qg0Var.m();
                            qg0Var.Z = ((float) u71Var.n()) / m10;
                            qg0Var.f27693a0 = ((float) u71Var.j()) / m10;
                        } else {
                            return;
                        }
                    }
                    qg0Var.f27695b0.invalidate();
                    AndroidUtilities.runOnUIThread(qg0Var.f27699e0, 500L);
                    return;
                }
                return;
            case 2:
                qg0 qg0Var2 = this.f25997b;
                PhotoViewer photoViewer2 = qg0Var2.V;
                if (photoViewer2 != null) {
                    if ((photoViewer2.F2 != null || qg0Var2.f27709r != null) && !qg0Var2.f27697c0 && !qg0Var2.Y && !qg0Var2.f27711w && !qg0Var2.f27710s.isInProgress() && qg0Var2.f27701f0) {
                        u71 u71Var2 = qg0Var2.V.F2;
                        if (qg0Var2.f27702g0[0] >= qg0Var2.t() * qg0Var2.J * 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        long l4 = qg0Var2.l();
                        long m11 = qg0Var2.m();
                        if (l4 != -9223372036854775807L && m11 >= 15000) {
                            cg0 cg0Var2 = qg0Var2.f27709r;
                            if (cg0Var2 != null) {
                                PhotoViewer photoViewer3 = qg0Var2.V;
                                photoViewer3.f31210c4.startRewind(cg0Var2, z10, qg0Var2.f27702g0[0], photoViewer3.f31356t1, qg0Var2.R);
                            } else {
                                PhotoViewer photoViewer4 = qg0Var2.V;
                                photoViewer4.f31210c4.startRewind(u71Var2, z10, qg0Var2.f27702g0[0], photoViewer4.f31356t1, qg0Var2.R);
                            }
                            if (!qg0Var2.E) {
                                qg0Var2.E = true;
                                qg0Var2.y(true);
                                if (!qg0Var2.f27704i0) {
                                    AndroidUtilities.runOnUIThread(qg0Var2.f27705j0, 1500L);
                                    qg0Var2.f27704i0 = true;
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
                qg0 qg0Var3 = this.f25997b;
                PhotoViewer photoViewer5 = qg0Var3.V;
                if (photoViewer5 != null && photoViewer5.f31210c4.rewinding) {
                    AndroidUtilities.runOnUIThread(qg0Var3.f27705j0, 1500L);
                    return;
                }
                qg0Var3.E = false;
                qg0Var3.y(false);
                qg0Var3.f27704i0 = false;
                return;
        }
    }
}
