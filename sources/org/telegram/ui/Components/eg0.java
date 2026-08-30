package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
public final class eg0 implements Runnable {
    public final int f24571a;
    public final lg0 f24572b;

    public eg0(lg0 lg0Var, int i10) {
        this.f24571a = i10;
        this.f24572b = lg0Var;
    }

    @Override
    public final void run() {
        boolean z4;
        switch (this.f24571a) {
            case 0:
                this.f24572b.u();
                return;
            case 1:
                lg0 lg0Var = this.f24572b;
                PhotoViewer photoViewer = lg0Var.S;
                if (photoViewer != null) {
                    vf0 vf0Var = lg0Var.f26673r;
                    if (vf0Var != null) {
                        lg0Var.W = vf0Var.getCurrentPosition() / lg0Var.f26673r.getVideoDuration();
                        lg0Var.X = lg0Var.f26673r.getBufferedPosition();
                    } else {
                        i71 i71Var = photoViewer.C2;
                        if (i71Var != null) {
                            float m9 = (float) lg0Var.m();
                            lg0Var.W = ((float) i71Var.n()) / m9;
                            lg0Var.X = ((float) i71Var.j()) / m9;
                        } else {
                            return;
                        }
                    }
                    lg0Var.Y.invalidate();
                    AndroidUtilities.runOnUIThread(lg0Var.f26661b0, 500L);
                    return;
                }
                return;
            case 2:
                lg0 lg0Var2 = this.f24572b;
                PhotoViewer photoViewer2 = lg0Var2.S;
                if (photoViewer2 != null) {
                    if ((photoViewer2.C2 != null || lg0Var2.f26673r != null) && !lg0Var2.Z && !lg0Var2.V && !lg0Var2.f26675w && !lg0Var2.f26674s.isInProgress() && lg0Var2.f26663c0) {
                        i71 i71Var2 = lg0Var2.S.C2;
                        if (lg0Var2.f26664d0[0] >= lg0Var2.t() * lg0Var2.G * 0.5f) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        long l10 = lg0Var2.l();
                        long m10 = lg0Var2.m();
                        if (l10 != -9223372036854775807L && m10 >= 15000) {
                            vf0 vf0Var2 = lg0Var2.f26673r;
                            if (vf0Var2 != null) {
                                PhotoViewer photoViewer3 = lg0Var2.S;
                                photoViewer3.Z3.startRewind(vf0Var2, z4, lg0Var2.f26664d0[0], photoViewer3.f31840q1, lg0Var2.O);
                            } else {
                                PhotoViewer photoViewer4 = lg0Var2.S;
                                photoViewer4.Z3.startRewind(i71Var2, z4, lg0Var2.f26664d0[0], photoViewer4.f31840q1, lg0Var2.O);
                            }
                            if (!lg0Var2.B) {
                                lg0Var2.B = true;
                                lg0Var2.y(true);
                                if (!lg0Var2.f26667f0) {
                                    AndroidUtilities.runOnUIThread(lg0Var2.f26668g0, 1500L);
                                    lg0Var2.f26667f0 = true;
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
                lg0 lg0Var3 = this.f24572b;
                PhotoViewer photoViewer5 = lg0Var3.S;
                if (photoViewer5 != null && photoViewer5.Z3.rewinding) {
                    AndroidUtilities.runOnUIThread(lg0Var3.f26668g0, 1500L);
                    return;
                }
                lg0Var3.B = false;
                lg0Var3.y(false);
                lg0Var3.f26667f0 = false;
                return;
        }
    }
}
