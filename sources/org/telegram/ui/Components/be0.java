package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class be0 implements Runnable {
    public final int f32165a;
    public final ie0 f32166b;

    public be0(ie0 ie0Var, int i3) {
        this.f32165a = i3;
        this.f32166b = ie0Var;
    }

    @Override
    public final void run() {
        ud0 ud0Var;
        boolean z10;
        switch (this.f32165a) {
            case 0:
                this.f32166b.u();
                return;
            case 1:
                ie0 ie0Var = this.f32166b;
                PhotoViewer photoViewer = ie0Var.W;
                if (photoViewer != null) {
                    if (ie0Var.f34703r != null) {
                        ie0Var.f34685a0 = ud0Var.getCurrentPosition() / ie0Var.f34703r.getVideoDuration();
                        ie0Var.f34687b0 = ie0Var.f34703r.getBufferedPosition();
                    } else {
                        m51 m51Var = photoViewer.G2;
                        if (m51Var != null) {
                            float f10 = (float) ie0Var.f();
                            ie0Var.f34685a0 = ((float) m51Var.S()) / f10;
                            ie0Var.f34687b0 = ((float) m51Var.K()) / f10;
                        } else {
                            return;
                        }
                    }
                    ie0Var.f34689c0.invalidate();
                    org.telegram.messenger.g0.i3(ie0Var.f34694f0, 500L);
                    return;
                }
                return;
            case 2:
                ie0 ie0Var2 = this.f32166b;
                PhotoViewer photoViewer2 = ie0Var2.W;
                if (photoViewer2 != null) {
                    if ((photoViewer2.G2 != null || ie0Var2.f34703r != null) && !ie0Var2.f34690d0 && !ie0Var2.Z && !ie0Var2.f34706x && !ie0Var2.f34704s.isInProgress() && ie0Var2.f34695g0) {
                        m51 m51Var2 = ie0Var2.W.G2;
                        if (ie0Var2.f34696h0[0] >= ie0Var2.t() * ie0Var2.K * 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        long e10 = ie0Var2.e();
                        long f11 = ie0Var2.f();
                        if (e10 != -9223372036854775807L && f11 >= 15000) {
                            ud0 ud0Var2 = ie0Var2.f34703r;
                            if (ud0Var2 != null) {
                                PhotoViewer photoViewer3 = ie0Var2.W;
                                photoViewer3.f41404d4.startRewind(ud0Var2, z10, ie0Var2.f34696h0[0], photoViewer3.f41550u1, ie0Var2.S);
                            } else {
                                PhotoViewer photoViewer4 = ie0Var2.W;
                                photoViewer4.f41404d4.startRewind(m51Var2, z10, ie0Var2.f34696h0[0], photoViewer4.f41550u1, ie0Var2.S);
                            }
                            if (!ie0Var2.F) {
                                ie0Var2.F = true;
                                ie0Var2.y(true);
                                if (!ie0Var2.f34698j0) {
                                    org.telegram.messenger.g0.i3(ie0Var2.f34699k0, 1500L);
                                    ie0Var2.f34698j0 = true;
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
                ie0 ie0Var3 = this.f32166b;
                PhotoViewer photoViewer5 = ie0Var3.W;
                if (photoViewer5 != null && photoViewer5.f41404d4.rewinding) {
                    org.telegram.messenger.g0.i3(ie0Var3.f34699k0, 1500L);
                    return;
                }
                ie0Var3.F = false;
                ie0Var3.y(false);
                ie0Var3.f34698j0 = false;
                return;
        }
    }
}
