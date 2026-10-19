package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
public final class ug0 implements Runnable {
    public final int f30960a;
    public final zg0 f30961b;

    public ug0(zg0 zg0Var, int i10) {
        this.f30960a = i10;
        this.f30961b = zg0Var;
    }

    @Override
    public final void run() {
        kg0 kg0Var;
        boolean z10;
        switch (this.f30960a) {
            case 0:
                this.f30961b.u();
                return;
            case 1:
                zg0 zg0Var = this.f30961b;
                PhotoViewer photoViewer = zg0Var.V;
                if (photoViewer != null) {
                    if (zg0Var.f32947r != null) {
                        zg0Var.Z = kg0Var.getCurrentPosition() / zg0Var.f32947r.getVideoDuration();
                        zg0Var.f32931a0 = zg0Var.f32947r.getBufferedPosition();
                    } else {
                        b81 b81Var = photoViewer.F2;
                        if (b81Var != null) {
                            float m10 = (float) zg0Var.m();
                            zg0Var.Z = ((float) b81Var.n()) / m10;
                            zg0Var.f32931a0 = ((float) b81Var.j()) / m10;
                        } else {
                            return;
                        }
                    }
                    zg0Var.f32933b0.invalidate();
                    AndroidUtilities.runOnUIThread(zg0Var.f32937e0, 500L);
                    return;
                }
                return;
            case 2:
                zg0 zg0Var2 = this.f30961b;
                PhotoViewer photoViewer2 = zg0Var2.V;
                if (photoViewer2 != null) {
                    if ((photoViewer2.F2 != null || zg0Var2.f32947r != null) && !zg0Var2.f32935c0 && !zg0Var2.Y && !zg0Var2.f32949w && !zg0Var2.f32948s.isInProgress() && zg0Var2.f32939f0) {
                        b81 b81Var2 = zg0Var2.V.F2;
                        if (zg0Var2.f32940g0[0] >= zg0Var2.t() * zg0Var2.J * 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        long l4 = zg0Var2.l();
                        long m11 = zg0Var2.m();
                        if (l4 != -9223372036854775807L && m11 >= 15000) {
                            kg0 kg0Var2 = zg0Var2.f32947r;
                            if (kg0Var2 != null) {
                                PhotoViewer photoViewer3 = zg0Var2.V;
                                photoViewer3.f33258c4.startRewind(kg0Var2, z10, zg0Var2.f32940g0[0], photoViewer3.f33405t1, zg0Var2.R);
                            } else {
                                PhotoViewer photoViewer4 = zg0Var2.V;
                                photoViewer4.f33258c4.startRewind(b81Var2, z10, zg0Var2.f32940g0[0], photoViewer4.f33405t1, zg0Var2.R);
                            }
                            if (!zg0Var2.E) {
                                zg0Var2.E = true;
                                zg0Var2.y(true);
                                if (!zg0Var2.f32942i0) {
                                    AndroidUtilities.runOnUIThread(zg0Var2.f32943j0, 1500L);
                                    zg0Var2.f32942i0 = true;
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
                zg0 zg0Var3 = this.f30961b;
                PhotoViewer photoViewer5 = zg0Var3.V;
                if (photoViewer5 != null && photoViewer5.f33258c4.rewinding) {
                    AndroidUtilities.runOnUIThread(zg0Var3.f32943j0, 1500L);
                    return;
                }
                zg0Var3.E = false;
                zg0Var3.y(false);
                zg0Var3.f32942i0 = false;
                return;
        }
    }
}
