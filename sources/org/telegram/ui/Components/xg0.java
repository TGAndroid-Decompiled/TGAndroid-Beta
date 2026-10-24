package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
public final class xg0 implements Runnable {
    public final int f32578a;
    public final ch0 f32579b;

    public xg0(ch0 ch0Var, int i10) {
        this.f32578a = i10;
        this.f32579b = ch0Var;
    }

    @Override
    public final void run() {
        og0 og0Var;
        boolean z10;
        switch (this.f32578a) {
            case 0:
                this.f32579b.u();
                return;
            case 1:
                ch0 ch0Var = this.f32579b;
                PhotoViewer photoViewer = ch0Var.V;
                if (photoViewer != null) {
                    if (ch0Var.f25331r != null) {
                        ch0Var.Z = og0Var.getCurrentPosition() / ch0Var.f25331r.getVideoDuration();
                        ch0Var.f25315a0 = ch0Var.f25331r.getBufferedPosition();
                    } else {
                        j81 j81Var = photoViewer.F2;
                        if (j81Var != null) {
                            float m10 = (float) ch0Var.m();
                            ch0Var.Z = ((float) j81Var.n()) / m10;
                            ch0Var.f25315a0 = ((float) j81Var.j()) / m10;
                        } else {
                            return;
                        }
                    }
                    ch0Var.f25317b0.invalidate();
                    AndroidUtilities.runOnUIThread(ch0Var.f25321e0, 500L);
                    return;
                }
                return;
            case 2:
                ch0 ch0Var2 = this.f32579b;
                PhotoViewer photoViewer2 = ch0Var2.V;
                if (photoViewer2 != null) {
                    if ((photoViewer2.F2 != null || ch0Var2.f25331r != null) && !ch0Var2.f25319c0 && !ch0Var2.Y && !ch0Var2.f25333w && !ch0Var2.f25332s.isInProgress() && ch0Var2.f25323f0) {
                        j81 j81Var2 = ch0Var2.V.F2;
                        if (ch0Var2.f25324g0[0] >= ch0Var2.t() * ch0Var2.J * 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        long l4 = ch0Var2.l();
                        long m11 = ch0Var2.m();
                        if (l4 != -9223372036854775807L && m11 >= 15000) {
                            og0 og0Var2 = ch0Var2.f25331r;
                            if (og0Var2 != null) {
                                PhotoViewer photoViewer3 = ch0Var2.V;
                                photoViewer3.f33568c4.startRewind(og0Var2, z10, ch0Var2.f25324g0[0], photoViewer3.f33715t1, ch0Var2.R);
                            } else {
                                PhotoViewer photoViewer4 = ch0Var2.V;
                                photoViewer4.f33568c4.startRewind(j81Var2, z10, ch0Var2.f25324g0[0], photoViewer4.f33715t1, ch0Var2.R);
                            }
                            if (!ch0Var2.E) {
                                ch0Var2.E = true;
                                ch0Var2.y(true);
                                if (!ch0Var2.f25326i0) {
                                    AndroidUtilities.runOnUIThread(ch0Var2.f25327j0, 1500L);
                                    ch0Var2.f25326i0 = true;
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
                ch0 ch0Var3 = this.f32579b;
                PhotoViewer photoViewer5 = ch0Var3.V;
                if (photoViewer5 != null && photoViewer5.f33568c4.rewinding) {
                    AndroidUtilities.runOnUIThread(ch0Var3.f25327j0, 1500L);
                    return;
                }
                ch0Var3.E = false;
                ch0Var3.y(false);
                ch0Var3.f25326i0 = false;
                return;
        }
    }
}
