package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
public final class yg0 implements Runnable {
    public final int f32915a;
    public final dh0 f32916b;

    public yg0(dh0 dh0Var, int i10) {
        this.f32915a = i10;
        this.f32916b = dh0Var;
    }

    @Override
    public final void run() {
        pg0 pg0Var;
        boolean z10;
        switch (this.f32915a) {
            case 0:
                this.f32916b.u();
                return;
            case 1:
                dh0 dh0Var = this.f32916b;
                PhotoViewer photoViewer = dh0Var.V;
                if (photoViewer != null) {
                    if (dh0Var.f25649r != null) {
                        dh0Var.Z = pg0Var.getCurrentPosition() / dh0Var.f25649r.getVideoDuration();
                        dh0Var.f25633a0 = dh0Var.f25649r.getBufferedPosition();
                    } else {
                        j81 j81Var = photoViewer.F2;
                        if (j81Var != null) {
                            float m10 = (float) dh0Var.m();
                            dh0Var.Z = ((float) j81Var.n()) / m10;
                            dh0Var.f25633a0 = ((float) j81Var.j()) / m10;
                        } else {
                            return;
                        }
                    }
                    dh0Var.f25635b0.invalidate();
                    AndroidUtilities.runOnUIThread(dh0Var.f25639e0, 500L);
                    return;
                }
                return;
            case 2:
                dh0 dh0Var2 = this.f32916b;
                PhotoViewer photoViewer2 = dh0Var2.V;
                if (photoViewer2 != null) {
                    if ((photoViewer2.F2 != null || dh0Var2.f25649r != null) && !dh0Var2.f25637c0 && !dh0Var2.Y && !dh0Var2.f25651w && !dh0Var2.f25650s.isInProgress() && dh0Var2.f25641f0) {
                        j81 j81Var2 = dh0Var2.V.F2;
                        if (dh0Var2.f25642g0[0] >= dh0Var2.t() * dh0Var2.J * 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        long l4 = dh0Var2.l();
                        long m11 = dh0Var2.m();
                        if (l4 != -9223372036854775807L && m11 >= 15000) {
                            pg0 pg0Var2 = dh0Var2.f25649r;
                            if (pg0Var2 != null) {
                                PhotoViewer photoViewer3 = dh0Var2.V;
                                photoViewer3.f33566c4.startRewind(pg0Var2, z10, dh0Var2.f25642g0[0], photoViewer3.f33713t1, dh0Var2.R);
                            } else {
                                PhotoViewer photoViewer4 = dh0Var2.V;
                                photoViewer4.f33566c4.startRewind(j81Var2, z10, dh0Var2.f25642g0[0], photoViewer4.f33713t1, dh0Var2.R);
                            }
                            if (!dh0Var2.E) {
                                dh0Var2.E = true;
                                dh0Var2.y(true);
                                if (!dh0Var2.f25644i0) {
                                    AndroidUtilities.runOnUIThread(dh0Var2.f25645j0, 1500L);
                                    dh0Var2.f25644i0 = true;
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
                dh0 dh0Var3 = this.f32916b;
                PhotoViewer photoViewer5 = dh0Var3.V;
                if (photoViewer5 != null && photoViewer5.f33566c4.rewinding) {
                    AndroidUtilities.runOnUIThread(dh0Var3.f25645j0, 1500L);
                    return;
                }
                dh0Var3.E = false;
                dh0Var3.y(false);
                dh0Var3.f25644i0 = false;
                return;
        }
    }
}
