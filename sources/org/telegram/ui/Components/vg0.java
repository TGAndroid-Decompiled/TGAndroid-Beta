package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
public final class vg0 implements Runnable {
    public final int f31255a;
    public final ah0 f31256b;

    public vg0(ah0 ah0Var, int i10) {
        this.f31255a = i10;
        this.f31256b = ah0Var;
    }

    @Override
    public final void run() {
        lg0 lg0Var;
        boolean z10;
        switch (this.f31255a) {
            case 0:
                this.f31256b.u();
                return;
            case 1:
                ah0 ah0Var = this.f31256b;
                PhotoViewer photoViewer = ah0Var.V;
                if (photoViewer != null) {
                    if (ah0Var.f24619r != null) {
                        ah0Var.Z = lg0Var.getCurrentPosition() / ah0Var.f24619r.getVideoDuration();
                        ah0Var.f24603a0 = ah0Var.f24619r.getBufferedPosition();
                    } else {
                        c81 c81Var = photoViewer.F2;
                        if (c81Var != null) {
                            float m10 = (float) ah0Var.m();
                            ah0Var.Z = ((float) c81Var.n()) / m10;
                            ah0Var.f24603a0 = ((float) c81Var.j()) / m10;
                        } else {
                            return;
                        }
                    }
                    ah0Var.f24605b0.invalidate();
                    AndroidUtilities.runOnUIThread(ah0Var.f24609e0, 500L);
                    return;
                }
                return;
            case 2:
                ah0 ah0Var2 = this.f31256b;
                PhotoViewer photoViewer2 = ah0Var2.V;
                if (photoViewer2 != null) {
                    if ((photoViewer2.F2 != null || ah0Var2.f24619r != null) && !ah0Var2.f24607c0 && !ah0Var2.Y && !ah0Var2.f24621w && !ah0Var2.f24620s.isInProgress() && ah0Var2.f24611f0) {
                        c81 c81Var2 = ah0Var2.V.F2;
                        if (ah0Var2.f24612g0[0] >= ah0Var2.t() * ah0Var2.J * 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        long l4 = ah0Var2.l();
                        long m11 = ah0Var2.m();
                        if (l4 != -9223372036854775807L && m11 >= 15000) {
                            lg0 lg0Var2 = ah0Var2.f24619r;
                            if (lg0Var2 != null) {
                                PhotoViewer photoViewer3 = ah0Var2.V;
                                photoViewer3.f33268c4.startRewind(lg0Var2, z10, ah0Var2.f24612g0[0], photoViewer3.f33415t1, ah0Var2.R);
                            } else {
                                PhotoViewer photoViewer4 = ah0Var2.V;
                                photoViewer4.f33268c4.startRewind(c81Var2, z10, ah0Var2.f24612g0[0], photoViewer4.f33415t1, ah0Var2.R);
                            }
                            if (!ah0Var2.E) {
                                ah0Var2.E = true;
                                ah0Var2.y(true);
                                if (!ah0Var2.f24614i0) {
                                    AndroidUtilities.runOnUIThread(ah0Var2.f24615j0, 1500L);
                                    ah0Var2.f24614i0 = true;
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
                ah0 ah0Var3 = this.f31256b;
                PhotoViewer photoViewer5 = ah0Var3.V;
                if (photoViewer5 != null && photoViewer5.f33268c4.rewinding) {
                    AndroidUtilities.runOnUIThread(ah0Var3.f24615j0, 1500L);
                    return;
                }
                ah0Var3.E = false;
                ah0Var3.y(false);
                ah0Var3.f24614i0 = false;
                return;
        }
    }
}
