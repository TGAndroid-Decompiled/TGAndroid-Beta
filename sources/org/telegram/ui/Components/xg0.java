package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
public final class xg0 implements Runnable {
    public final int f34714a;
    public final ch0 f34715b;

    public xg0(ch0 ch0Var, int i10) {
        this.f34714a = i10;
        this.f34715b = ch0Var;
    }

    @Override
    public final void run() {
        mg0 mg0Var;
        boolean z10;
        switch (this.f34714a) {
            case 0:
                this.f34715b.u();
                return;
            case 1:
                ch0 ch0Var = this.f34715b;
                PhotoViewer photoViewer = ch0Var.V;
                if (photoViewer != null) {
                    if (ch0Var.f27175r != null) {
                        ch0Var.Z = mg0Var.getCurrentPosition() / ch0Var.f27175r.getVideoDuration();
                        ch0Var.f27159a0 = ch0Var.f27175r.getBufferedPosition();
                    } else {
                        s81 s81Var = photoViewer.F2;
                        if (s81Var != null) {
                            float m10 = (float) ch0Var.m();
                            ch0Var.Z = ((float) s81Var.n()) / m10;
                            ch0Var.f27159a0 = ((float) s81Var.j()) / m10;
                        } else {
                            return;
                        }
                    }
                    ch0Var.f27161b0.invalidate();
                    AndroidUtilities.runOnUIThread(ch0Var.f27165e0, 500L);
                    return;
                }
                return;
            case 2:
                ch0 ch0Var2 = this.f34715b;
                PhotoViewer photoViewer2 = ch0Var2.V;
                if (photoViewer2 != null) {
                    if ((photoViewer2.F2 != null || ch0Var2.f27175r != null) && !ch0Var2.f27163c0 && !ch0Var2.Y && !ch0Var2.f27177w && !ch0Var2.f27176s.isInProgress() && ch0Var2.f27167f0) {
                        s81 s81Var2 = ch0Var2.V.F2;
                        if (ch0Var2.f27168g0[0] >= ch0Var2.t() * ch0Var2.J * 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        long l4 = ch0Var2.l();
                        long m11 = ch0Var2.m();
                        if (l4 != -9223372036854775807L && m11 >= 15000) {
                            mg0 mg0Var2 = ch0Var2.f27175r;
                            if (mg0Var2 != null) {
                                PhotoViewer photoViewer3 = ch0Var2.V;
                                photoViewer3.f35629c4.startRewind(mg0Var2, z10, ch0Var2.f27168g0[0], photoViewer3.f35776t1, ch0Var2.R);
                            } else {
                                PhotoViewer photoViewer4 = ch0Var2.V;
                                photoViewer4.f35629c4.startRewind(s81Var2, z10, ch0Var2.f27168g0[0], photoViewer4.f35776t1, ch0Var2.R);
                            }
                            if (!ch0Var2.E) {
                                ch0Var2.E = true;
                                ch0Var2.y(true);
                                if (!ch0Var2.f27170i0) {
                                    AndroidUtilities.runOnUIThread(ch0Var2.f27171j0, 1500L);
                                    ch0Var2.f27170i0 = true;
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
                ch0 ch0Var3 = this.f34715b;
                PhotoViewer photoViewer5 = ch0Var3.V;
                if (photoViewer5 != null && photoViewer5.f35629c4.rewinding) {
                    AndroidUtilities.runOnUIThread(ch0Var3.f27171j0, 1500L);
                    return;
                }
                ch0Var3.E = false;
                ch0Var3.y(false);
                ch0Var3.f27170i0 = false;
                return;
        }
    }
}
