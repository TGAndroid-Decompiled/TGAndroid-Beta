package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;

public final class mf0 implements Runnable {

    public final int f30670a;

    public final sf0 f30671b;

    public mf0(sf0 sf0Var, int i10) {
        this.f30670a = i10;
        this.f30671b = sf0Var;
    }

    @Override
    public final void run() {
        switch (this.f30670a) {
            case 0:
                this.f30671b.u();
                break;
            case 1:
                sf0 sf0Var = this.f30671b;
                PhotoViewer photoViewer = sf0Var.R;
                if (photoViewer != null) {
                    df0 df0Var = sf0Var.f32431r;
                    if (df0Var != null) {
                        sf0Var.V = df0Var.getCurrentPosition() / sf0Var.f32431r.getVideoDuration();
                        sf0Var.W = sf0Var.f32431r.getBufferedPosition();
                    } else {
                        m61 m61Var = photoViewer.B2;
                        if (m61Var != null) {
                            float fM = sf0Var.m();
                            sf0Var.V = m61Var.o() / fM;
                            sf0Var.W = m61Var.k() / fM;
                        }
                    }
                    sf0Var.X.invalidate();
                    AndroidUtilities.runOnUIThread(sf0Var.f32417a0, 500L);
                    break;
                }
                break;
            case 2:
                sf0 sf0Var2 = this.f30671b;
                PhotoViewer photoViewer2 = sf0Var2.R;
                if (photoViewer2 != null) {
                    if ((photoViewer2.B2 != null || sf0Var2.f32431r != null) && !sf0Var2.Y && !sf0Var2.U && !sf0Var2.f32433w && !sf0Var2.f32432s.isInProgress() && sf0Var2.f32419b0) {
                        m61 m61Var2 = sf0Var2.R.B2;
                        boolean z10 = sf0Var2.f32421c0[0] >= (((float) sf0Var2.t()) * sf0Var2.F) * 0.5f;
                        long jL = sf0Var2.l();
                        long jM = sf0Var2.m();
                        if (jL != -9223372036854775807L && jM >= 15000) {
                            df0 df0Var2 = sf0Var2.f32431r;
                            if (df0Var2 != null) {
                                PhotoViewer photoViewer3 = sf0Var2.R;
                                photoViewer3.Y3.startRewind(df0Var2, z10, sf0Var2.f32421c0[0], photoViewer3.f35720p1, sf0Var2.N);
                            } else {
                                PhotoViewer photoViewer4 = sf0Var2.R;
                                photoViewer4.Y3.startRewind(m61Var2, z10, sf0Var2.f32421c0[0], photoViewer4.f35720p1, sf0Var2.N);
                            }
                            if (!sf0Var2.A) {
                                sf0Var2.A = true;
                                sf0Var2.y(true);
                                if (!sf0Var2.f32424e0) {
                                    AndroidUtilities.runOnUIThread(sf0Var2.f32426f0, 1500L);
                                    sf0Var2.f32424e0 = true;
                                }
                            }
                            break;
                        }
                    }
                }
                break;
            default:
                sf0 sf0Var3 = this.f30671b;
                PhotoViewer photoViewer5 = sf0Var3.R;
                if (photoViewer5 != null && photoViewer5.Y3.rewinding) {
                    AndroidUtilities.runOnUIThread(sf0Var3.f32426f0, 1500L);
                } else {
                    sf0Var3.A = false;
                    sf0Var3.y(false);
                    sf0Var3.f32424e0 = false;
                }
                break;
        }
    }
}
