package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
public final class g7 implements Runnable {
    public final int f34861a;
    public final h7 f34862b;

    public g7(h7 h7Var, int i7) {
        this.f34861a = i7;
        this.f34862b = h7Var;
    }

    @Override
    public final void run() {
        long U;
        long j3;
        float f10;
        switch (this.f34861a) {
            case 0:
                h7 h7Var = this.f34862b;
                int i7 = h7Var.f35184w + 1;
                h7Var.f35184w = i7;
                if (i7 == 1) {
                    y7 y7Var = h7Var.I;
                    y7Var.B2 = -1;
                    y7Var.C2 = MediaController.B().f22377v0.f23777b0;
                    h7Var.f35185x = System.currentTimeMillis();
                    org.telegram.messenger.g0.i3(this, 2000L);
                    org.telegram.messenger.g0.h3(h7Var.F);
                    return;
                } else if (i7 == 2) {
                    org.telegram.messenger.g0.i3(this, 2000L);
                    return;
                } else {
                    return;
                }
            default:
                h7 h7Var2 = this.f34862b;
                y7 y7Var2 = h7Var2.I;
                u51 u51Var = MediaController.B().f22353j0;
                if (u51Var == null) {
                    U = 0;
                } else {
                    U = u51Var.U();
                }
                if (U != 0 && U != -9223372036854775807L) {
                    float f11 = y7Var2.C2;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j10 = currentTimeMillis - h7Var2.f35185x;
                    h7Var2.f35185x = currentTimeMillis;
                    long j11 = currentTimeMillis - h7Var2.f35186y;
                    int i10 = h7Var2.f35184w;
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
                    y7Var2.C2 = f12;
                    org.telegram.messenger.gj gjVar = MediaController.B().f22377v0;
                    if (gjVar != null && gjVar.I3()) {
                        y7Var2.b1(gjVar, false);
                    }
                    if (y7Var2.B2 == -1 && h7Var2.f35184w > 0) {
                        if (j11 > 200 || y7Var2.C2 == 0.0f) {
                            h7Var2.f35186y = currentTimeMillis;
                            if (y7Var2.C2 == 0.0f) {
                                MediaController.B().i0(MediaController.B().f22377v0, 0.0f);
                                u51 u51Var2 = MediaController.B().f22353j0;
                                if (u51Var2 != null) {
                                    u51Var2.g0();
                                }
                            } else {
                                MediaController.B().i0(MediaController.B().f22377v0, f12);
                            }
                        }
                        if (h7Var2.f35184w > 0 && y7Var2.C2 > 0.0f) {
                            org.telegram.messenger.g0.i3(h7Var2.F, 16L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                h7Var2.f35185x = System.currentTimeMillis();
                return;
        }
    }
}
