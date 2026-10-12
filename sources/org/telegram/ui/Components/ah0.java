package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
public final class ah0 implements Runnable {
    public final int f23556a;
    public final fh0 f23557b;

    public ah0(fh0 fh0Var, int i10) {
        this.f23556a = i10;
        this.f23557b = fh0Var;
    }

    @Override
    public final void run() {
        qg0 qg0Var;
        boolean z10;
        switch (this.f23556a) {
            case 0:
                this.f23557b.u();
                return;
            case 1:
                fh0 fh0Var = this.f23557b;
                PhotoViewer photoViewer = fh0Var.V;
                if (photoViewer != null) {
                    if (fh0Var.f25053r != null) {
                        fh0Var.Z = qg0Var.getCurrentPosition() / fh0Var.f25053r.getVideoDuration();
                        fh0Var.f25037a0 = fh0Var.f25053r.getBufferedPosition();
                    } else {
                        h81 h81Var = photoViewer.F2;
                        if (h81Var != null) {
                            float m10 = (float) fh0Var.m();
                            fh0Var.Z = ((float) h81Var.n()) / m10;
                            fh0Var.f25037a0 = ((float) h81Var.j()) / m10;
                        } else {
                            return;
                        }
                    }
                    fh0Var.f25039b0.invalidate();
                    AndroidUtilities.runOnUIThread(fh0Var.f25043e0, 500L);
                    return;
                }
                return;
            case 2:
                fh0 fh0Var2 = this.f23557b;
                PhotoViewer photoViewer2 = fh0Var2.V;
                if (photoViewer2 != null) {
                    if ((photoViewer2.F2 != null || fh0Var2.f25053r != null) && !fh0Var2.f25041c0 && !fh0Var2.Y && !fh0Var2.f25055w && !fh0Var2.f25054s.isInProgress() && fh0Var2.f25045f0) {
                        h81 h81Var2 = fh0Var2.V.F2;
                        if (fh0Var2.f25046g0[0] >= fh0Var2.t() * fh0Var2.J * 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        long l4 = fh0Var2.l();
                        long m11 = fh0Var2.m();
                        if (l4 != -9223372036854775807L && m11 >= 15000) {
                            qg0 qg0Var2 = fh0Var2.f25053r;
                            if (qg0Var2 != null) {
                                PhotoViewer photoViewer3 = fh0Var2.V;
                                photoViewer3.f32212c4.startRewind(qg0Var2, z10, fh0Var2.f25046g0[0], photoViewer3.f32359t1, fh0Var2.R);
                            } else {
                                PhotoViewer photoViewer4 = fh0Var2.V;
                                photoViewer4.f32212c4.startRewind(h81Var2, z10, fh0Var2.f25046g0[0], photoViewer4.f32359t1, fh0Var2.R);
                            }
                            if (!fh0Var2.E) {
                                fh0Var2.E = true;
                                fh0Var2.y(true);
                                if (!fh0Var2.f25048i0) {
                                    AndroidUtilities.runOnUIThread(fh0Var2.f25049j0, 1500L);
                                    fh0Var2.f25048i0 = true;
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
                fh0 fh0Var3 = this.f23557b;
                PhotoViewer photoViewer5 = fh0Var3.V;
                if (photoViewer5 != null && photoViewer5.f32212c4.rewinding) {
                    AndroidUtilities.runOnUIThread(fh0Var3.f25049j0, 1500L);
                    return;
                }
                fh0Var3.E = false;
                fh0Var3.y(false);
                fh0Var3.f25048i0 = false;
                return;
        }
    }
}
