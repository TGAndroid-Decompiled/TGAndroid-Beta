package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
public final class gg0 implements Runnable {
    public final int f27163a;
    public final ng0 f27164b;

    public gg0(ng0 ng0Var, int i10) {
        this.f27163a = i10;
        this.f27164b = ng0Var;
    }

    @Override
    public final void run() {
        boolean z4;
        switch (this.f27163a) {
            case 0:
                this.f27164b.u();
                return;
            case 1:
                ng0 ng0Var = this.f27164b;
                PhotoViewer photoViewer = ng0Var.S;
                if (photoViewer != null) {
                    xf0 xf0Var = ng0Var.f29479r;
                    if (xf0Var != null) {
                        ng0Var.W = xf0Var.getCurrentPosition() / ng0Var.f29479r.getVideoDuration();
                        ng0Var.X = ng0Var.f29479r.getBufferedPosition();
                    } else {
                        j71 j71Var = photoViewer.C2;
                        if (j71Var != null) {
                            float m9 = (float) ng0Var.m();
                            ng0Var.W = ((float) j71Var.n()) / m9;
                            ng0Var.X = ((float) j71Var.j()) / m9;
                        } else {
                            return;
                        }
                    }
                    ng0Var.Y.invalidate();
                    AndroidUtilities.runOnUIThread(ng0Var.f29466b0, 500L);
                    return;
                }
                return;
            case 2:
                ng0 ng0Var2 = this.f27164b;
                PhotoViewer photoViewer2 = ng0Var2.S;
                if (photoViewer2 != null) {
                    if ((photoViewer2.C2 != null || ng0Var2.f29479r != null) && !ng0Var2.Z && !ng0Var2.V && !ng0Var2.f29481w && !ng0Var2.f29480s.isInProgress() && ng0Var2.f29468c0) {
                        j71 j71Var2 = ng0Var2.S.C2;
                        if (ng0Var2.f29469d0[0] >= ng0Var2.t() * ng0Var2.G * 0.5f) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        long l10 = ng0Var2.l();
                        long m10 = ng0Var2.m();
                        if (l10 != -9223372036854775807L && m10 >= 15000) {
                            xf0 xf0Var2 = ng0Var2.f29479r;
                            if (xf0Var2 != null) {
                                PhotoViewer photoViewer3 = ng0Var2.S;
                                photoViewer3.Z3.startRewind(xf0Var2, z4, ng0Var2.f29469d0[0], photoViewer3.f34366q1, ng0Var2.O);
                            } else {
                                PhotoViewer photoViewer4 = ng0Var2.S;
                                photoViewer4.Z3.startRewind(j71Var2, z4, ng0Var2.f29469d0[0], photoViewer4.f34366q1, ng0Var2.O);
                            }
                            if (!ng0Var2.B) {
                                ng0Var2.B = true;
                                ng0Var2.y(true);
                                if (!ng0Var2.f29473f0) {
                                    AndroidUtilities.runOnUIThread(ng0Var2.f29474g0, 1500L);
                                    ng0Var2.f29473f0 = true;
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
                ng0 ng0Var3 = this.f27164b;
                PhotoViewer photoViewer5 = ng0Var3.S;
                if (photoViewer5 != null && photoViewer5.Z3.rewinding) {
                    AndroidUtilities.runOnUIThread(ng0Var3.f29474g0, 1500L);
                    return;
                }
                ng0Var3.B = false;
                ng0Var3.y(false);
                ng0Var3.f29473f0 = false;
                return;
        }
    }
}
