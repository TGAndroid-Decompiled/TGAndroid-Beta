package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
public final class f7 implements Runnable {
    public final int f26103a;
    public final g7 f26104b;

    public f7(g7 g7Var, int i10) {
        this.f26103a = i10;
        this.f26104b = g7Var;
    }

    @Override
    public final void run() {
        long U;
        long j10;
        float f7;
        switch (this.f26103a) {
            case 0:
                g7 g7Var = this.f26104b;
                int i10 = g7Var.f26327w + 1;
                g7Var.f26327w = i10;
                if (i10 == 1) {
                    w7 w7Var = g7Var.H;
                    w7Var.f32129x2 = -1;
                    w7Var.f32131y2 = MediaController.B().f14483u0.f16652b0;
                    g7Var.f26328x = System.currentTimeMillis();
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
                g7 g7Var2 = this.f26104b;
                w7 w7Var2 = g7Var2.H;
                v61 v61Var = MediaController.B().f14458i0;
                if (v61Var == null) {
                    U = 0;
                } else {
                    U = v61Var.U();
                }
                if (U != 0 && U != -9223372036854775807L) {
                    float f10 = w7Var2.f32131y2;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j11 = currentTimeMillis - g7Var2.f26328x;
                    g7Var2.f26328x = currentTimeMillis;
                    long j12 = currentTimeMillis - g7Var2.f26329y;
                    int i11 = g7Var2.f26327w;
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
                    w7Var2.f32131y2 = f11;
                    org.telegram.messenger.kj kjVar = MediaController.B().f14483u0;
                    if (kjVar != null && kjVar.I3()) {
                        w7Var2.b1(kjVar, false);
                    }
                    if (w7Var2.f32129x2 == -1 && g7Var2.f26327w > 0) {
                        if (j12 > 200 || w7Var2.f32131y2 == 0.0f) {
                            g7Var2.f26329y = currentTimeMillis;
                            if (w7Var2.f32131y2 == 0.0f) {
                                MediaController.B().i0(MediaController.B().f14483u0, 0.0f);
                                v61 v61Var2 = MediaController.B().f14458i0;
                                if (v61Var2 != null) {
                                    v61Var2.g0();
                                }
                            } else {
                                MediaController.B().i0(MediaController.B().f14483u0, f11);
                            }
                        }
                        if (g7Var2.f26327w > 0 && w7Var2.f32131y2 > 0.0f) {
                            org.telegram.messenger.i0.h3(g7Var2.E, 16L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                g7Var2.f26328x = System.currentTimeMillis();
                return;
        }
    }
}
