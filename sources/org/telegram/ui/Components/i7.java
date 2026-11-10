package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
public final class i7 implements Runnable {
    public final int f34561a;
    public final j7 f34562b;

    public i7(j7 j7Var, int i7) {
        this.f34561a = i7;
        this.f34562b = j7Var;
    }

    @Override
    public final void run() {
        long U;
        long j3;
        float f10;
        switch (this.f34561a) {
            case 0:
                j7 j7Var = this.f34562b;
                int i7 = j7Var.f34855w + 1;
                j7Var.f34855w = i7;
                if (i7 == 1) {
                    a8 a8Var = j7Var.H;
                    a8Var.A2 = -1;
                    a8Var.B2 = MediaController.B().f21300u0.f23226b0;
                    j7Var.f34856x = System.currentTimeMillis();
                    org.telegram.messenger.g0.i3(this, 2000L);
                    org.telegram.messenger.g0.h3(j7Var.E);
                    return;
                } else if (i7 == 2) {
                    org.telegram.messenger.g0.i3(this, 2000L);
                    return;
                } else {
                    return;
                }
            default:
                j7 j7Var2 = this.f34562b;
                a8 a8Var2 = j7Var2.H;
                t51 t51Var = MediaController.B().f21276i0;
                if (t51Var == null) {
                    U = 0;
                } else {
                    U = t51Var.U();
                }
                if (U != 0 && U != -9223372036854775807L) {
                    float f11 = a8Var2.B2;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j10 = currentTimeMillis - j7Var2.f34856x;
                    j7Var2.f34856x = currentTimeMillis;
                    long j11 = currentTimeMillis - j7Var2.f34857y;
                    int i10 = j7Var2.f34855w;
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
                    a8Var2.B2 = f12;
                    org.telegram.messenger.ij ijVar = MediaController.B().f21300u0;
                    if (ijVar != null && ijVar.I3()) {
                        a8Var2.b1(ijVar, false);
                    }
                    if (a8Var2.A2 == -1 && j7Var2.f34855w > 0) {
                        if (j11 > 200 || a8Var2.B2 == 0.0f) {
                            j7Var2.f34857y = currentTimeMillis;
                            if (a8Var2.B2 == 0.0f) {
                                MediaController.B().i0(MediaController.B().f21300u0, 0.0f);
                                t51 t51Var2 = MediaController.B().f21276i0;
                                if (t51Var2 != null) {
                                    t51Var2.g0();
                                }
                            } else {
                                MediaController.B().i0(MediaController.B().f21300u0, f12);
                            }
                        }
                        if (j7Var2.f34855w > 0 && a8Var2.B2 > 0.0f) {
                            org.telegram.messenger.g0.i3(j7Var2.E, 16L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                j7Var2.f34856x = System.currentTimeMillis();
                return;
        }
    }
}
