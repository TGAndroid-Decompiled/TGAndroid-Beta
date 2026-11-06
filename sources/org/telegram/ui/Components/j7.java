package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
public final class j7 implements Runnable {
    public final int f34876a;
    public final k7 f34877b;

    public j7(k7 k7Var, int i7) {
        this.f34876a = i7;
        this.f34877b = k7Var;
    }

    @Override
    public final void run() {
        long U;
        long j3;
        float f10;
        switch (this.f34876a) {
            case 0:
                k7 k7Var = this.f34877b;
                int i7 = k7Var.f35192w + 1;
                k7Var.f35192w = i7;
                if (i7 == 1) {
                    b8 b8Var = k7Var.H;
                    b8Var.f32064x2 = -1;
                    b8Var.f32066y2 = MediaController.B().f21292u0.f23197b0;
                    k7Var.f35193x = System.currentTimeMillis();
                    org.telegram.messenger.g0.i3(this, 2000L);
                    org.telegram.messenger.g0.h3(k7Var.E);
                    return;
                } else if (i7 == 2) {
                    org.telegram.messenger.g0.i3(this, 2000L);
                    return;
                } else {
                    return;
                }
            default:
                k7 k7Var2 = this.f34877b;
                b8 b8Var2 = k7Var2.H;
                s51 s51Var = MediaController.B().f21268i0;
                if (s51Var == null) {
                    U = 0;
                } else {
                    U = s51Var.U();
                }
                if (U != 0 && U != -9223372036854775807L) {
                    float f11 = b8Var2.f32066y2;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j10 = currentTimeMillis - k7Var2.f35193x;
                    k7Var2.f35193x = currentTimeMillis;
                    long j11 = currentTimeMillis - k7Var2.f35194y;
                    int i10 = k7Var2.f35192w;
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
                    b8Var2.f32066y2 = f12;
                    org.telegram.messenger.ij ijVar = MediaController.B().f21292u0;
                    if (ijVar != null && ijVar.J3()) {
                        b8Var2.b1(ijVar, false);
                    }
                    if (b8Var2.f32064x2 == -1 && k7Var2.f35192w > 0) {
                        if (j11 > 200 || b8Var2.f32066y2 == 0.0f) {
                            k7Var2.f35194y = currentTimeMillis;
                            if (b8Var2.f32066y2 == 0.0f) {
                                MediaController.B().i0(MediaController.B().f21292u0, 0.0f);
                                s51 s51Var2 = MediaController.B().f21268i0;
                                if (s51Var2 != null) {
                                    s51Var2.g0();
                                }
                            } else {
                                MediaController.B().i0(MediaController.B().f21292u0, f12);
                            }
                        }
                        if (k7Var2.f35192w > 0 && b8Var2.f32066y2 > 0.0f) {
                            org.telegram.messenger.g0.i3(k7Var2.E, 16L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                k7Var2.f35193x = System.currentTimeMillis();
                return;
        }
    }
}
