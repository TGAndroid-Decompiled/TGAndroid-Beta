package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
public final class n7 implements Runnable {
    public final int f37779a;
    public final o7 f37780b;

    public n7(o7 o7Var, int i7) {
        this.f37779a = i7;
        this.f37780b = o7Var;
    }

    @Override
    public final void run() {
        long U;
        long j3;
        float f10;
        switch (this.f37779a) {
            case 0:
                o7 o7Var = this.f37780b;
                int i7 = o7Var.f38110w + 1;
                o7Var.f38110w = i7;
                if (i7 == 1) {
                    f8 f8Var = o7Var.I;
                    f8Var.B2 = -1;
                    f8Var.C2 = MediaController.B().f22735v0.f24137b0;
                    o7Var.f38111x = System.currentTimeMillis();
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
                o7 o7Var2 = this.f37780b;
                f8 f8Var2 = o7Var2.I;
                i61 i61Var = MediaController.B().f22711j0;
                if (i61Var == null) {
                    U = 0;
                } else {
                    U = i61Var.U();
                }
                if (U != 0 && U != -9223372036854775807L) {
                    float f11 = f8Var2.C2;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j10 = currentTimeMillis - o7Var2.f38111x;
                    o7Var2.f38111x = currentTimeMillis;
                    long j11 = currentTimeMillis - o7Var2.f38112y;
                    int i10 = o7Var2.f38110w;
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
                    f8Var2.C2 = f12;
                    org.telegram.messenger.gj gjVar = MediaController.B().f22735v0;
                    if (gjVar != null && gjVar.I3()) {
                        f8Var2.c1(gjVar, false);
                    }
                    if (f8Var2.B2 == -1 && o7Var2.f38110w > 0) {
                        if (j11 > 200 || f8Var2.C2 == 0.0f) {
                            o7Var2.f38112y = currentTimeMillis;
                            if (f8Var2.C2 == 0.0f) {
                                MediaController.B().i0(MediaController.B().f22735v0, 0.0f);
                                i61 i61Var2 = MediaController.B().f22711j0;
                                if (i61Var2 != null) {
                                    i61Var2.g0();
                                }
                            } else {
                                MediaController.B().i0(MediaController.B().f22735v0, f12);
                            }
                        }
                        if (o7Var2.f38110w > 0 && f8Var2.C2 > 0.0f) {
                            org.telegram.messenger.g0.h3(o7Var2.F, 16L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                o7Var2.f38111x = System.currentTimeMillis();
                return;
        }
    }
}
