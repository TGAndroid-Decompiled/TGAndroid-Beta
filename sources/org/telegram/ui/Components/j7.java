package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
public final class j7 implements Runnable {
    public final int f34926a;
    public final k7 f34927b;

    public j7(k7 k7Var, int i7) {
        this.f34926a = i7;
        this.f34927b = k7Var;
    }

    @Override
    public final void run() {
        long U;
        long j3;
        float f10;
        switch (this.f34926a) {
            case 0:
                k7 k7Var = this.f34927b;
                int i7 = k7Var.f35241w + 1;
                k7Var.f35241w = i7;
                if (i7 == 1) {
                    b8 b8Var = k7Var.H;
                    b8Var.f32119x2 = -1;
                    b8Var.f32121y2 = MediaController.B().f21295u0.f23222b0;
                    k7Var.f35242x = System.currentTimeMillis();
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
                k7 k7Var2 = this.f34927b;
                b8 b8Var2 = k7Var2.H;
                t51 t51Var = MediaController.B().f21271i0;
                if (t51Var == null) {
                    U = 0;
                } else {
                    U = t51Var.U();
                }
                if (U != 0 && U != -9223372036854775807L) {
                    float f11 = b8Var2.f32121y2;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j10 = currentTimeMillis - k7Var2.f35242x;
                    k7Var2.f35242x = currentTimeMillis;
                    long j11 = currentTimeMillis - k7Var2.f35243y;
                    int i10 = k7Var2.f35241w;
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
                    b8Var2.f32121y2 = f12;
                    org.telegram.messenger.ij ijVar = MediaController.B().f21295u0;
                    if (ijVar != null && ijVar.J3()) {
                        b8Var2.b1(ijVar, false);
                    }
                    if (b8Var2.f32119x2 == -1 && k7Var2.f35241w > 0) {
                        if (j11 > 200 || b8Var2.f32121y2 == 0.0f) {
                            k7Var2.f35243y = currentTimeMillis;
                            if (b8Var2.f32121y2 == 0.0f) {
                                MediaController.B().i0(MediaController.B().f21295u0, 0.0f);
                                t51 t51Var2 = MediaController.B().f21271i0;
                                if (t51Var2 != null) {
                                    t51Var2.g0();
                                }
                            } else {
                                MediaController.B().i0(MediaController.B().f21295u0, f12);
                            }
                        }
                        if (k7Var2.f35241w > 0 && b8Var2.f32121y2 > 0.0f) {
                            org.telegram.messenger.g0.i3(k7Var2.E, 16L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                k7Var2.f35242x = System.currentTimeMillis();
                return;
        }
    }
}
