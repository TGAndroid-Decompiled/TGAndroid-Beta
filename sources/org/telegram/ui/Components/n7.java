package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
public final class n7 implements Runnable {
    public final int f37747a;
    public final o7 f37748b;

    public n7(o7 o7Var, int i7) {
        this.f37747a = i7;
        this.f37748b = o7Var;
    }

    @Override
    public final void run() {
        long U;
        long j3;
        float f10;
        switch (this.f37747a) {
            case 0:
                o7 o7Var = this.f37748b;
                int i7 = o7Var.f38003w + 1;
                o7Var.f38003w = i7;
                if (i7 == 1) {
                    g8 g8Var = o7Var.I;
                    g8Var.B2 = -1;
                    g8Var.C2 = MediaController.B().f22743v0.f23928b0;
                    o7Var.f38004x = System.currentTimeMillis();
                    org.telegram.messenger.g0.h3(this, 2000L);
                    org.telegram.messenger.g0.g3(o7Var.F);
                    return;
                } else if (i7 == 2) {
                    org.telegram.messenger.g0.h3(this, 2000L);
                    return;
                } else {
                    return;
                }
            default:
                o7 o7Var2 = this.f37748b;
                g8 g8Var2 = o7Var2.I;
                f61 f61Var = MediaController.B().f22719j0;
                if (f61Var == null) {
                    U = 0;
                } else {
                    U = f61Var.U();
                }
                if (U != 0 && U != -9223372036854775807L) {
                    float f11 = g8Var2.C2;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j10 = currentTimeMillis - o7Var2.f38004x;
                    o7Var2.f38004x = currentTimeMillis;
                    long j11 = currentTimeMillis - o7Var2.f38005y;
                    int i10 = o7Var2.f38003w;
                    if (i10 == 1) {
                        j3 = 3;
                    } else if (i10 == 2) {
                        j3 = 6;
                    } else {
                        j3 = 12;
                    }
                    float f12 = ((f11 * f10) - ((float) (j10 * j3))) / ((float) U);
                    if (f12 < 0.0f) {
                        f12 = 0.0f;
                    }
                    g8Var2.C2 = f12;
                    org.telegram.messenger.fj fjVar = MediaController.B().f22743v0;
                    if (fjVar != null && fjVar.I3()) {
                        g8Var2.c1(fjVar, false);
                    }
                    if (g8Var2.B2 == -1 && o7Var2.f38003w > 0) {
                        if (j11 > 200 || g8Var2.C2 == 0.0f) {
                            o7Var2.f38005y = currentTimeMillis;
                            if (g8Var2.C2 == 0.0f) {
                                MediaController.B().i0(MediaController.B().f22743v0, 0.0f);
                                f61 f61Var2 = MediaController.B().f22719j0;
                                if (f61Var2 != null) {
                                    f61Var2.g0();
                                }
                            } else {
                                MediaController.B().i0(MediaController.B().f22743v0, f12);
                            }
                        }
                        if (o7Var2.f38003w > 0 && g8Var2.C2 > 0.0f) {
                            org.telegram.messenger.g0.h3(o7Var2.F, 16L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                o7Var2.f38004x = System.currentTimeMillis();
                return;
        }
    }
}
