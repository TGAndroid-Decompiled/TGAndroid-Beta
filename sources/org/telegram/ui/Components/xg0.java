package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
public final class xg0 implements Runnable {
    public final int f34717a;
    public final ch0 f34718b;

    public xg0(ch0 ch0Var, int i10) {
        this.f34717a = i10;
        this.f34718b = ch0Var;
    }

    @Override
    public final void run() {
        mg0 mg0Var;
        boolean z10;
        switch (this.f34717a) {
            case 0:
                this.f34718b.u();
                return;
            case 1:
                ch0 ch0Var = this.f34718b;
                PhotoViewer photoViewer = ch0Var.V;
                if (photoViewer != null) {
                    if (ch0Var.f27177r != null) {
                        ch0Var.Z = mg0Var.getCurrentPosition() / ch0Var.f27177r.getVideoDuration();
                        ch0Var.f27161a0 = ch0Var.f27177r.getBufferedPosition();
                    } else {
                        s81 s81Var = photoViewer.F2;
                        if (s81Var != null) {
                            float m10 = (float) ch0Var.m();
                            ch0Var.Z = ((float) s81Var.n()) / m10;
                            ch0Var.f27161a0 = ((float) s81Var.j()) / m10;
                        } else {
                            return;
                        }
                    }
                    ch0Var.f27163b0.invalidate();
                    AndroidUtilities.runOnUIThread(ch0Var.f27167e0, 500L);
                    return;
                }
                return;
            case 2:
                ch0 ch0Var2 = this.f34718b;
                PhotoViewer photoViewer2 = ch0Var2.V;
                if (photoViewer2 != null) {
                    if ((photoViewer2.F2 != null || ch0Var2.f27177r != null) && !ch0Var2.f27165c0 && !ch0Var2.Y && !ch0Var2.f27179w && !ch0Var2.f27178s.isInProgress() && ch0Var2.f27169f0) {
                        s81 s81Var2 = ch0Var2.V.F2;
                        if (ch0Var2.f27170g0[0] >= ch0Var2.t() * ch0Var2.J * 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        long l4 = ch0Var2.l();
                        long m11 = ch0Var2.m();
                        if (l4 != -9223372036854775807L && m11 >= 15000) {
                            mg0 mg0Var2 = ch0Var2.f27177r;
                            if (mg0Var2 != null) {
                                PhotoViewer photoViewer3 = ch0Var2.V;
                                photoViewer3.f35632c4.startRewind(mg0Var2, z10, ch0Var2.f27170g0[0], photoViewer3.f35779t1, ch0Var2.R);
                            } else {
                                PhotoViewer photoViewer4 = ch0Var2.V;
                                photoViewer4.f35632c4.startRewind(s81Var2, z10, ch0Var2.f27170g0[0], photoViewer4.f35779t1, ch0Var2.R);
                            }
                            if (!ch0Var2.E) {
                                ch0Var2.E = true;
                                ch0Var2.y(true);
                                if (!ch0Var2.f27172i0) {
                                    AndroidUtilities.runOnUIThread(ch0Var2.f27173j0, 1500L);
                                    ch0Var2.f27172i0 = true;
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
                ch0 ch0Var3 = this.f34718b;
                PhotoViewer photoViewer5 = ch0Var3.V;
                if (photoViewer5 != null && photoViewer5.f35632c4.rewinding) {
                    AndroidUtilities.runOnUIThread(ch0Var3.f27173j0, 1500L);
                    return;
                }
                ch0Var3.E = false;
                ch0Var3.y(false);
                ch0Var3.f27172i0 = false;
                return;
        }
    }
}
