package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
public final class eh0 implements Runnable {
    public final int f25704a;
    public final jh0 f25705b;

    public eh0(jh0 jh0Var, int i10) {
        this.f25704a = i10;
        this.f25705b = jh0Var;
    }

    @Override
    public final void run() {
        vg0 vg0Var;
        boolean z10;
        switch (this.f25704a) {
            case 0:
                this.f25705b.u();
                return;
            case 1:
                jh0 jh0Var = this.f25705b;
                PhotoViewer photoViewer = jh0Var.V;
                if (photoViewer != null) {
                    if (jh0Var.f27516r != null) {
                        jh0Var.Z = vg0Var.getCurrentPosition() / jh0Var.f27516r.getVideoDuration();
                        jh0Var.f27499a0 = jh0Var.f27516r.getBufferedPosition();
                    } else {
                        q81 q81Var = photoViewer.F2;
                        if (q81Var != null) {
                            float m10 = (float) jh0Var.m();
                            jh0Var.Z = ((float) q81Var.n()) / m10;
                            jh0Var.f27499a0 = ((float) q81Var.j()) / m10;
                        } else {
                            return;
                        }
                    }
                    jh0Var.f27501b0.invalidate();
                    AndroidUtilities.runOnUIThread(jh0Var.f27506e0, 500L);
                    return;
                }
                return;
            case 2:
                jh0 jh0Var2 = this.f25705b;
                PhotoViewer photoViewer2 = jh0Var2.V;
                if (photoViewer2 != null) {
                    if ((photoViewer2.F2 != null || jh0Var2.f27516r != null) && !jh0Var2.f27503c0 && !jh0Var2.Y && !jh0Var2.f27518w && !jh0Var2.f27517s.isInProgress() && jh0Var2.f27508f0) {
                        q81 q81Var2 = jh0Var2.V.F2;
                        if (jh0Var2.f27509g0[0] >= jh0Var2.t() * jh0Var2.J * 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        long l4 = jh0Var2.l();
                        long m11 = jh0Var2.m();
                        if (l4 != -9223372036854775807L && m11 >= 15000) {
                            vg0 vg0Var2 = jh0Var2.f27516r;
                            if (vg0Var2 != null) {
                                PhotoViewer photoViewer3 = jh0Var2.V;
                                photoViewer3.f33728c4.startRewind(vg0Var2, z10, jh0Var2.f27509g0[0], photoViewer3.f33875t1, jh0Var2.R);
                            } else {
                                PhotoViewer photoViewer4 = jh0Var2.V;
                                photoViewer4.f33728c4.startRewind(q81Var2, z10, jh0Var2.f27509g0[0], photoViewer4.f33875t1, jh0Var2.R);
                            }
                            if (!jh0Var2.E) {
                                jh0Var2.E = true;
                                jh0Var2.y(true);
                                if (!jh0Var2.f27511i0) {
                                    AndroidUtilities.runOnUIThread(jh0Var2.f27512j0, 1500L);
                                    jh0Var2.f27511i0 = true;
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
                jh0 jh0Var3 = this.f25705b;
                PhotoViewer photoViewer5 = jh0Var3.V;
                if (photoViewer5 != null && photoViewer5.f33728c4.rewinding) {
                    AndroidUtilities.runOnUIThread(jh0Var3.f27512j0, 1500L);
                    return;
                }
                jh0Var3.E = false;
                jh0Var3.y(false);
                jh0Var3.f27511i0 = false;
                return;
        }
    }
}
