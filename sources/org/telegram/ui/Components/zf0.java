package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
public final class zf0 implements Runnable {
    public final int f30579a;
    public final eg0 f30580b;

    public zf0(eg0 eg0Var, int i10) {
        this.f30579a = i10;
        this.f30580b = eg0Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f30579a) {
            case 0:
                this.f30580b.u();
                return;
            case 1:
                eg0 eg0Var = this.f30580b;
                PhotoViewer photoViewer = eg0Var.V;
                if (photoViewer != null) {
                    qf0 qf0Var = eg0Var.f23679r;
                    if (qf0Var != null) {
                        eg0Var.Z = qf0Var.getCurrentPosition() / eg0Var.f23679r.getVideoDuration();
                        eg0Var.f23663a0 = eg0Var.f23679r.getBufferedPosition();
                    } else {
                        f71 f71Var = photoViewer.F2;
                        if (f71Var != null) {
                            float m10 = (float) eg0Var.m();
                            eg0Var.Z = ((float) f71Var.n()) / m10;
                            eg0Var.f23663a0 = ((float) f71Var.j()) / m10;
                        } else {
                            return;
                        }
                    }
                    eg0Var.f23665b0.invalidate();
                    AndroidUtilities.runOnUIThread(eg0Var.f23669e0, 500L);
                    return;
                }
                return;
            case 2:
                eg0 eg0Var2 = this.f30580b;
                PhotoViewer photoViewer2 = eg0Var2.V;
                if (photoViewer2 != null) {
                    if ((photoViewer2.F2 != null || eg0Var2.f23679r != null) && !eg0Var2.f23667c0 && !eg0Var2.Y && !eg0Var2.f23681w && !eg0Var2.f23680s.isInProgress() && eg0Var2.f23671f0) {
                        f71 f71Var2 = eg0Var2.V.F2;
                        if (eg0Var2.f23672g0[0] >= eg0Var2.t() * eg0Var2.J * 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        long l4 = eg0Var2.l();
                        long m11 = eg0Var2.m();
                        if (l4 != -9223372036854775807L && m11 >= 15000) {
                            qf0 qf0Var2 = eg0Var2.f23679r;
                            if (qf0Var2 != null) {
                                PhotoViewer photoViewer3 = eg0Var2.V;
                                photoViewer3.f30894c4.startRewind(qf0Var2, z10, eg0Var2.f23672g0[0], photoViewer3.f31040t1, eg0Var2.R);
                            } else {
                                PhotoViewer photoViewer4 = eg0Var2.V;
                                photoViewer4.f30894c4.startRewind(f71Var2, z10, eg0Var2.f23672g0[0], photoViewer4.f31040t1, eg0Var2.R);
                            }
                            if (!eg0Var2.E) {
                                eg0Var2.E = true;
                                eg0Var2.y(true);
                                if (!eg0Var2.f23674i0) {
                                    AndroidUtilities.runOnUIThread(eg0Var2.f23675j0, 1500L);
                                    eg0Var2.f23674i0 = true;
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
                eg0 eg0Var3 = this.f30580b;
                PhotoViewer photoViewer5 = eg0Var3.V;
                if (photoViewer5 != null && photoViewer5.f30894c4.rewinding) {
                    AndroidUtilities.runOnUIThread(eg0Var3.f23675j0, 1500L);
                    return;
                }
                eg0Var3.E = false;
                eg0Var3.y(false);
                eg0Var3.f23674i0 = false;
                return;
        }
    }
}
