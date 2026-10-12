package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
public final class eh0 implements Runnable {
    public final int f25699a;
    public final jh0 f25700b;

    public eh0(jh0 jh0Var, int i10) {
        this.f25699a = i10;
        this.f25700b = jh0Var;
    }

    @Override
    public final void run() {
        vg0 vg0Var;
        boolean z10;
        switch (this.f25699a) {
            case 0:
                this.f25700b.u();
                return;
            case 1:
                jh0 jh0Var = this.f25700b;
                PhotoViewer photoViewer = jh0Var.V;
                if (photoViewer != null) {
                    if (jh0Var.f27522r != null) {
                        jh0Var.Z = vg0Var.getCurrentPosition() / jh0Var.f27522r.getVideoDuration();
                        jh0Var.f27505a0 = jh0Var.f27522r.getBufferedPosition();
                    } else {
                        q81 q81Var = photoViewer.F2;
                        if (q81Var != null) {
                            float m10 = (float) jh0Var.m();
                            jh0Var.Z = ((float) q81Var.n()) / m10;
                            jh0Var.f27505a0 = ((float) q81Var.j()) / m10;
                        } else {
                            return;
                        }
                    }
                    jh0Var.f27507b0.invalidate();
                    AndroidUtilities.runOnUIThread(jh0Var.f27512e0, 500L);
                    return;
                }
                return;
            case 2:
                jh0 jh0Var2 = this.f25700b;
                PhotoViewer photoViewer2 = jh0Var2.V;
                if (photoViewer2 != null) {
                    if ((photoViewer2.F2 != null || jh0Var2.f27522r != null) && !jh0Var2.f27509c0 && !jh0Var2.Y && !jh0Var2.f27524w && !jh0Var2.f27523s.isInProgress() && jh0Var2.f27514f0) {
                        q81 q81Var2 = jh0Var2.V.F2;
                        if (jh0Var2.f27515g0[0] >= jh0Var2.t() * jh0Var2.J * 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        long l4 = jh0Var2.l();
                        long m11 = jh0Var2.m();
                        if (l4 != -9223372036854775807L && m11 >= 15000) {
                            vg0 vg0Var2 = jh0Var2.f27522r;
                            if (vg0Var2 != null) {
                                PhotoViewer photoViewer3 = jh0Var2.V;
                                photoViewer3.f33726c4.startRewind(vg0Var2, z10, jh0Var2.f27515g0[0], photoViewer3.f33873t1, jh0Var2.R);
                            } else {
                                PhotoViewer photoViewer4 = jh0Var2.V;
                                photoViewer4.f33726c4.startRewind(q81Var2, z10, jh0Var2.f27515g0[0], photoViewer4.f33873t1, jh0Var2.R);
                            }
                            if (!jh0Var2.E) {
                                jh0Var2.E = true;
                                jh0Var2.y(true);
                                if (!jh0Var2.f27517i0) {
                                    AndroidUtilities.runOnUIThread(jh0Var2.f27518j0, 1500L);
                                    jh0Var2.f27517i0 = true;
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
                jh0 jh0Var3 = this.f25700b;
                PhotoViewer photoViewer5 = jh0Var3.V;
                if (photoViewer5 != null && photoViewer5.f33726c4.rewinding) {
                    AndroidUtilities.runOnUIThread(jh0Var3.f27518j0, 1500L);
                    return;
                }
                jh0Var3.E = false;
                jh0Var3.y(false);
                jh0Var3.f27517i0 = false;
                return;
        }
    }
}
