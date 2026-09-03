package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
public final class fg0 implements Runnable {
    public final int f24882a;
    public final mg0 f24883b;

    public fg0(mg0 mg0Var, int i10) {
        this.f24882a = i10;
        this.f24883b = mg0Var;
    }

    @Override
    public final void run() {
        boolean z4;
        switch (this.f24882a) {
            case 0:
                this.f24883b.u();
                return;
            case 1:
                mg0 mg0Var = this.f24883b;
                PhotoViewer photoViewer = mg0Var.S;
                if (photoViewer != null) {
                    wf0 wf0Var = mg0Var.f27052r;
                    if (wf0Var != null) {
                        mg0Var.W = wf0Var.getCurrentPosition() / mg0Var.f27052r.getVideoDuration();
                        mg0Var.X = mg0Var.f27052r.getBufferedPosition();
                    } else {
                        i71 i71Var = photoViewer.C2;
                        if (i71Var != null) {
                            float m9 = (float) mg0Var.m();
                            mg0Var.W = ((float) i71Var.n()) / m9;
                            mg0Var.X = ((float) i71Var.j()) / m9;
                        } else {
                            return;
                        }
                    }
                    mg0Var.Y.invalidate();
                    AndroidUtilities.runOnUIThread(mg0Var.f27040b0, 500L);
                    return;
                }
                return;
            case 2:
                mg0 mg0Var2 = this.f24883b;
                PhotoViewer photoViewer2 = mg0Var2.S;
                if (photoViewer2 != null) {
                    if ((photoViewer2.C2 != null || mg0Var2.f27052r != null) && !mg0Var2.Z && !mg0Var2.V && !mg0Var2.f27054w && !mg0Var2.f27053s.isInProgress() && mg0Var2.f27042c0) {
                        i71 i71Var2 = mg0Var2.S.C2;
                        if (mg0Var2.f27043d0[0] >= mg0Var2.t() * mg0Var2.G * 0.5f) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        long l10 = mg0Var2.l();
                        long m10 = mg0Var2.m();
                        if (l10 != -9223372036854775807L && m10 >= 15000) {
                            wf0 wf0Var2 = mg0Var2.f27052r;
                            if (wf0Var2 != null) {
                                PhotoViewer photoViewer3 = mg0Var2.S;
                                photoViewer3.Z3.startRewind(wf0Var2, z4, mg0Var2.f27043d0[0], photoViewer3.f31814q1, mg0Var2.O);
                            } else {
                                PhotoViewer photoViewer4 = mg0Var2.S;
                                photoViewer4.Z3.startRewind(i71Var2, z4, mg0Var2.f27043d0[0], photoViewer4.f31814q1, mg0Var2.O);
                            }
                            if (!mg0Var2.B) {
                                mg0Var2.B = true;
                                mg0Var2.y(true);
                                if (!mg0Var2.f27046f0) {
                                    AndroidUtilities.runOnUIThread(mg0Var2.f27047g0, 1500L);
                                    mg0Var2.f27046f0 = true;
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
                mg0 mg0Var3 = this.f24883b;
                PhotoViewer photoViewer5 = mg0Var3.S;
                if (photoViewer5 != null && photoViewer5.Z3.rewinding) {
                    AndroidUtilities.runOnUIThread(mg0Var3.f27047g0, 1500L);
                    return;
                }
                mg0Var3.B = false;
                mg0Var3.y(false);
                mg0Var3.f27046f0 = false;
                return;
        }
    }
}
