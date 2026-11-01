package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class cf0 implements Runnable {
    public final int f25102a;
    public final jf0 f25103b;

    public cf0(jf0 jf0Var, int i10) {
        this.f25102a = i10;
        this.f25103b = jf0Var;
    }

    @Override
    public final void run() {
        ve0 ve0Var;
        boolean z10;
        switch (this.f25102a) {
            case 0:
                this.f25103b.u();
                return;
            case 1:
                jf0 jf0Var = this.f25103b;
                PhotoViewer photoViewer = jf0Var.V;
                if (photoViewer != null) {
                    if (jf0Var.f27418r != null) {
                        jf0Var.Z = ve0Var.getCurrentPosition() / jf0Var.f27418r.getVideoDuration();
                        jf0Var.f27402a0 = jf0Var.f27418r.getBufferedPosition();
                    } else {
                        v61 v61Var = photoViewer.F2;
                        if (v61Var != null) {
                            float f7 = (float) jf0Var.f();
                            jf0Var.Z = ((float) v61Var.S()) / f7;
                            jf0Var.f27402a0 = ((float) v61Var.J()) / f7;
                        } else {
                            return;
                        }
                    }
                    jf0Var.f27404b0.invalidate();
                    org.telegram.messenger.i0.h3(jf0Var.f27408e0, 500L);
                    return;
                }
                return;
            case 2:
                jf0 jf0Var2 = this.f25103b;
                PhotoViewer photoViewer2 = jf0Var2.V;
                if (photoViewer2 != null) {
                    if ((photoViewer2.F2 != null || jf0Var2.f27418r != null) && !jf0Var2.f27406c0 && !jf0Var2.Y && !jf0Var2.f27421x && !jf0Var2.f27419s.isInProgress() && jf0Var2.f27410f0) {
                        v61 v61Var2 = jf0Var2.V.F2;
                        if (jf0Var2.f27411g0[0] >= jf0Var2.t() * jf0Var2.J * 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        long e = jf0Var2.e();
                        long f10 = jf0Var2.f();
                        if (e != -9223372036854775807L && f10 >= 15000) {
                            ve0 ve0Var2 = jf0Var2.f27418r;
                            if (ve0Var2 != null) {
                                PhotoViewer photoViewer3 = jf0Var2.V;
                                photoViewer3.f33463c4.startRewind(ve0Var2, z10, jf0Var2.f27411g0[0], photoViewer3.f33610t1, jf0Var2.R);
                            } else {
                                PhotoViewer photoViewer4 = jf0Var2.V;
                                photoViewer4.f33463c4.startRewind(v61Var2, z10, jf0Var2.f27411g0[0], photoViewer4.f33610t1, jf0Var2.R);
                            }
                            if (!jf0Var2.E) {
                                jf0Var2.E = true;
                                jf0Var2.y(true);
                                if (!jf0Var2.f27413i0) {
                                    org.telegram.messenger.i0.h3(jf0Var2.f27414j0, 1500L);
                                    jf0Var2.f27413i0 = true;
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
                jf0 jf0Var3 = this.f25103b;
                PhotoViewer photoViewer5 = jf0Var3.V;
                if (photoViewer5 != null && photoViewer5.f33463c4.rewinding) {
                    org.telegram.messenger.i0.h3(jf0Var3.f27414j0, 1500L);
                    return;
                }
                jf0Var3.E = false;
                jf0Var3.y(false);
                jf0Var3.f27413i0 = false;
                return;
        }
    }
}
