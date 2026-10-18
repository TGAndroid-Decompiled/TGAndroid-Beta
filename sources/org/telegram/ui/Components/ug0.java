package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
public final class ug0 implements Runnable {
    public final int f30992a;
    public final zg0 f30993b;

    public ug0(zg0 zg0Var, int i10) {
        this.f30992a = i10;
        this.f30993b = zg0Var;
    }

    @Override
    public final void run() {
        kg0 kg0Var;
        boolean z10;
        switch (this.f30992a) {
            case 0:
                this.f30993b.u();
                return;
            case 1:
                zg0 zg0Var = this.f30993b;
                PhotoViewer photoViewer = zg0Var.V;
                if (photoViewer != null) {
                    if (zg0Var.f32930r != null) {
                        zg0Var.Z = kg0Var.getCurrentPosition() / zg0Var.f32930r.getVideoDuration();
                        zg0Var.f32914a0 = zg0Var.f32930r.getBufferedPosition();
                    } else {
                        a81 a81Var = photoViewer.F2;
                        if (a81Var != null) {
                            float m10 = (float) zg0Var.m();
                            zg0Var.Z = ((float) a81Var.n()) / m10;
                            zg0Var.f32914a0 = ((float) a81Var.j()) / m10;
                        } else {
                            return;
                        }
                    }
                    zg0Var.f32916b0.invalidate();
                    AndroidUtilities.runOnUIThread(zg0Var.f32920e0, 500L);
                    return;
                }
                return;
            case 2:
                zg0 zg0Var2 = this.f30993b;
                PhotoViewer photoViewer2 = zg0Var2.V;
                if (photoViewer2 != null) {
                    if ((photoViewer2.F2 != null || zg0Var2.f32930r != null) && !zg0Var2.f32918c0 && !zg0Var2.Y && !zg0Var2.f32932w && !zg0Var2.f32931s.isInProgress() && zg0Var2.f32922f0) {
                        a81 a81Var2 = zg0Var2.V.F2;
                        if (zg0Var2.f32923g0[0] >= zg0Var2.t() * zg0Var2.J * 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        long l4 = zg0Var2.l();
                        long m11 = zg0Var2.m();
                        if (l4 != -9223372036854775807L && m11 >= 15000) {
                            kg0 kg0Var2 = zg0Var2.f32930r;
                            if (kg0Var2 != null) {
                                PhotoViewer photoViewer3 = zg0Var2.V;
                                photoViewer3.f33259c4.startRewind(kg0Var2, z10, zg0Var2.f32923g0[0], photoViewer3.f33406t1, zg0Var2.R);
                            } else {
                                PhotoViewer photoViewer4 = zg0Var2.V;
                                photoViewer4.f33259c4.startRewind(a81Var2, z10, zg0Var2.f32923g0[0], photoViewer4.f33406t1, zg0Var2.R);
                            }
                            if (!zg0Var2.E) {
                                zg0Var2.E = true;
                                zg0Var2.y(true);
                                if (!zg0Var2.f32925i0) {
                                    AndroidUtilities.runOnUIThread(zg0Var2.f32926j0, 1500L);
                                    zg0Var2.f32925i0 = true;
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
                zg0 zg0Var3 = this.f30993b;
                PhotoViewer photoViewer5 = zg0Var3.V;
                if (photoViewer5 != null && photoViewer5.f33259c4.rewinding) {
                    AndroidUtilities.runOnUIThread(zg0Var3.f32926j0, 1500L);
                    return;
                }
                zg0Var3.E = false;
                zg0Var3.y(false);
                zg0Var3.f32925i0 = false;
                return;
        }
    }
}
