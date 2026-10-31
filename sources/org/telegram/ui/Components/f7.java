package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
public final class f7 implements Runnable {
    public final int f25988a;
    public final g7 f25989b;

    public f7(g7 g7Var, int i10) {
        this.f25988a = i10;
        this.f25989b = g7Var;
    }

    @Override
    public final void run() {
        long U;
        long j10;
        float f7;
        switch (this.f25988a) {
            case 0:
                g7 g7Var = this.f25989b;
                int i10 = g7Var.f26275w + 1;
                g7Var.f26275w = i10;
                if (i10 == 1) {
                    w7 w7Var = g7Var.H;
                    w7Var.f32081x2 = -1;
                    w7Var.f32083y2 = MediaController.B().f14482u0.f16299b0;
                    g7Var.f26276x = System.currentTimeMillis();
                    org.telegram.messenger.i0.h3(this, 2000L);
                    org.telegram.messenger.i0.g3(g7Var.E);
                    return;
                } else if (i10 == 2) {
                    org.telegram.messenger.i0.h3(this, 2000L);
                    return;
                } else {
                    return;
                }
            default:
                g7 g7Var2 = this.f25989b;
                w7 w7Var2 = g7Var2.H;
                u61 u61Var = MediaController.B().f14457i0;
                if (u61Var == null) {
                    U = 0;
                } else {
                    U = u61Var.U();
                }
                if (U != 0 && U != -9223372036854775807L) {
                    float f10 = w7Var2.f32083y2;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j11 = currentTimeMillis - g7Var2.f26276x;
                    g7Var2.f26276x = currentTimeMillis;
                    long j12 = currentTimeMillis - g7Var2.f26277y;
                    int i11 = g7Var2.f26275w;
                    if (i11 == 1) {
                        j10 = 3;
                    } else if (i11 == 2) {
                        j10 = 6;
                    } else {
                        j10 = 12;
                    }
                    float f11 = ((f10 * f7) - ((float) (j11 * j10))) / ((float) U);
                    if (f11 < 0.0f) {
                        f11 = 0.0f;
                    }
                    w7Var2.f32083y2 = f11;
                    org.telegram.messenger.jj jjVar = MediaController.B().f14482u0;
                    if (jjVar != null && jjVar.I3()) {
                        w7Var2.b1(jjVar, false);
                    }
                    if (w7Var2.f32081x2 == -1 && g7Var2.f26275w > 0) {
                        if (j12 > 200 || w7Var2.f32083y2 == 0.0f) {
                            g7Var2.f26277y = currentTimeMillis;
                            if (w7Var2.f32083y2 == 0.0f) {
                                MediaController.B().i0(MediaController.B().f14482u0, 0.0f);
                                u61 u61Var2 = MediaController.B().f14457i0;
                                if (u61Var2 != null) {
                                    u61Var2.g0();
                                }
                            } else {
                                MediaController.B().i0(MediaController.B().f14482u0, f11);
                            }
                        }
                        if (g7Var2.f26275w > 0 && w7Var2.f32083y2 > 0.0f) {
                            org.telegram.messenger.i0.h3(g7Var2.E, 16L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                g7Var2.f26276x = System.currentTimeMillis();
                return;
        }
    }
}
