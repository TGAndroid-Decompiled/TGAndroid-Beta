package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
public final class bh0 implements Runnable {
    public final int f25017a;
    public final gh0 f25018b;

    public bh0(gh0 gh0Var, int i10) {
        this.f25017a = i10;
        this.f25018b = gh0Var;
    }

    @Override
    public final void run() {
        sg0 sg0Var;
        boolean z10;
        switch (this.f25017a) {
            case 0:
                this.f25018b.u();
                return;
            case 1:
                gh0 gh0Var = this.f25018b;
                PhotoViewer photoViewer = gh0Var.V;
                if (photoViewer != null) {
                    if (gh0Var.f26719r != null) {
                        gh0Var.Z = sg0Var.getCurrentPosition() / gh0Var.f26719r.getVideoDuration();
                        gh0Var.f26702a0 = gh0Var.f26719r.getBufferedPosition();
                    } else {
                        k81 k81Var = photoViewer.F2;
                        if (k81Var != null) {
                            float m10 = (float) gh0Var.m();
                            gh0Var.Z = ((float) k81Var.n()) / m10;
                            gh0Var.f26702a0 = ((float) k81Var.j()) / m10;
                        } else {
                            return;
                        }
                    }
                    gh0Var.f26704b0.invalidate();
                    AndroidUtilities.runOnUIThread(gh0Var.f26709e0, 500L);
                    return;
                }
                return;
            case 2:
                gh0 gh0Var2 = this.f25018b;
                PhotoViewer photoViewer2 = gh0Var2.V;
                if (photoViewer2 != null) {
                    if ((photoViewer2.F2 != null || gh0Var2.f26719r != null) && !gh0Var2.f26706c0 && !gh0Var2.Y && !gh0Var2.f26721w && !gh0Var2.f26720s.isInProgress() && gh0Var2.f26711f0) {
                        k81 k81Var2 = gh0Var2.V.F2;
                        if (gh0Var2.f26712g0[0] >= gh0Var2.t() * gh0Var2.J * 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        long l4 = gh0Var2.l();
                        long m11 = gh0Var2.m();
                        if (l4 != -9223372036854775807L && m11 >= 15000) {
                            sg0 sg0Var2 = gh0Var2.f26719r;
                            if (sg0Var2 != null) {
                                PhotoViewer photoViewer3 = gh0Var2.V;
                                photoViewer3.f33889c4.startRewind(sg0Var2, z10, gh0Var2.f26712g0[0], photoViewer3.f34036t1, gh0Var2.R);
                            } else {
                                PhotoViewer photoViewer4 = gh0Var2.V;
                                photoViewer4.f33889c4.startRewind(k81Var2, z10, gh0Var2.f26712g0[0], photoViewer4.f34036t1, gh0Var2.R);
                            }
                            if (!gh0Var2.E) {
                                gh0Var2.E = true;
                                gh0Var2.y(true);
                                if (!gh0Var2.f26714i0) {
                                    AndroidUtilities.runOnUIThread(gh0Var2.f26715j0, 1500L);
                                    gh0Var2.f26714i0 = true;
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
                gh0 gh0Var3 = this.f25018b;
                PhotoViewer photoViewer5 = gh0Var3.V;
                if (photoViewer5 != null && photoViewer5.f33889c4.rewinding) {
                    AndroidUtilities.runOnUIThread(gh0Var3.f26715j0, 1500L);
                    return;
                }
                gh0Var3.E = false;
                gh0Var3.y(false);
                gh0Var3.f26714i0 = false;
                return;
        }
    }
}
