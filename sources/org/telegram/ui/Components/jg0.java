package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
public final class jg0 implements Runnable {
    public final int f25415a;
    public final og0 f25416b;

    public jg0(og0 og0Var, int i10) {
        this.f25415a = i10;
        this.f25416b = og0Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f25415a) {
            case 0:
                this.f25416b.u();
                return;
            case 1:
                og0 og0Var = this.f25416b;
                PhotoViewer photoViewer = og0Var.V;
                if (photoViewer != null) {
                    ag0 ag0Var = og0Var.f27064r;
                    if (ag0Var != null) {
                        og0Var.Z = ag0Var.getCurrentPosition() / og0Var.f27064r.getVideoDuration();
                        og0Var.f27048a0 = og0Var.f27064r.getBufferedPosition();
                    } else {
                        s71 s71Var = photoViewer.F2;
                        if (s71Var != null) {
                            float m10 = (float) og0Var.m();
                            og0Var.Z = ((float) s71Var.n()) / m10;
                            og0Var.f27048a0 = ((float) s71Var.j()) / m10;
                        } else {
                            return;
                        }
                    }
                    og0Var.f27050b0.invalidate();
                    AndroidUtilities.runOnUIThread(og0Var.f27054e0, 500L);
                    return;
                }
                return;
            case 2:
                og0 og0Var2 = this.f25416b;
                PhotoViewer photoViewer2 = og0Var2.V;
                if (photoViewer2 != null) {
                    if ((photoViewer2.F2 != null || og0Var2.f27064r != null) && !og0Var2.f27052c0 && !og0Var2.Y && !og0Var2.f27066w && !og0Var2.f27065s.isInProgress() && og0Var2.f27056f0) {
                        s71 s71Var2 = og0Var2.V.F2;
                        if (og0Var2.f27057g0[0] >= og0Var2.t() * og0Var2.J * 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        long l4 = og0Var2.l();
                        long m11 = og0Var2.m();
                        if (l4 != -9223372036854775807L && m11 >= 15000) {
                            ag0 ag0Var2 = og0Var2.f27064r;
                            if (ag0Var2 != null) {
                                PhotoViewer photoViewer3 = og0Var2.V;
                                photoViewer3.f31209c4.startRewind(ag0Var2, z10, og0Var2.f27057g0[0], photoViewer3.f31355t1, og0Var2.R);
                            } else {
                                PhotoViewer photoViewer4 = og0Var2.V;
                                photoViewer4.f31209c4.startRewind(s71Var2, z10, og0Var2.f27057g0[0], photoViewer4.f31355t1, og0Var2.R);
                            }
                            if (!og0Var2.E) {
                                og0Var2.E = true;
                                og0Var2.y(true);
                                if (!og0Var2.f27059i0) {
                                    AndroidUtilities.runOnUIThread(og0Var2.f27060j0, 1500L);
                                    og0Var2.f27059i0 = true;
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
                og0 og0Var3 = this.f25416b;
                PhotoViewer photoViewer5 = og0Var3.V;
                if (photoViewer5 != null && photoViewer5.f31209c4.rewinding) {
                    AndroidUtilities.runOnUIThread(og0Var3.f27060j0, 1500L);
                    return;
                }
                og0Var3.E = false;
                og0Var3.y(false);
                og0Var3.f27059i0 = false;
                return;
        }
    }
}
