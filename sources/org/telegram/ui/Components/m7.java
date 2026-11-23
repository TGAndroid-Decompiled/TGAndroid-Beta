package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
public final class m7 implements Runnable {
    public final int f37423a;
    public final n7 f37424b;

    public m7(n7 n7Var, int i7) {
        this.f37423a = i7;
        this.f37424b = n7Var;
    }

    @Override
    public final void run() {
        long U;
        long j3;
        float f10;
        switch (this.f37423a) {
            case 0:
                n7 n7Var = this.f37424b;
                int i7 = n7Var.f37696w + 1;
                n7Var.f37696w = i7;
                if (i7 == 1) {
                    e8 e8Var = n7Var.I;
                    e8Var.B2 = -1;
                    e8Var.C2 = MediaController.B().f22838v0.f24033b0;
                    n7Var.f37697x = System.currentTimeMillis();
                    org.telegram.messenger.g0.h3(this, 2000L);
                    org.telegram.messenger.g0.g3(n7Var.F);
                    return;
                } else if (i7 == 2) {
                    org.telegram.messenger.g0.h3(this, 2000L);
                    return;
                } else {
                    return;
                }
            default:
                n7 n7Var2 = this.f37424b;
                e8 e8Var2 = n7Var2.I;
                h61 h61Var = MediaController.B().f22814j0;
                if (h61Var == null) {
                    U = 0;
                } else {
                    U = h61Var.U();
                }
                if (U != 0 && U != -9223372036854775807L) {
                    float f11 = e8Var2.C2;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j10 = currentTimeMillis - n7Var2.f37697x;
                    n7Var2.f37697x = currentTimeMillis;
                    long j11 = currentTimeMillis - n7Var2.f37698y;
                    int i10 = n7Var2.f37696w;
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
                    e8Var2.C2 = f12;
                    org.telegram.messenger.fj fjVar = MediaController.B().f22838v0;
                    if (fjVar != null && fjVar.I3()) {
                        e8Var2.c1(fjVar, false);
                    }
                    if (e8Var2.B2 == -1 && n7Var2.f37696w > 0) {
                        if (j11 > 200 || e8Var2.C2 == 0.0f) {
                            n7Var2.f37698y = currentTimeMillis;
                            if (e8Var2.C2 == 0.0f) {
                                MediaController.B().i0(MediaController.B().f22838v0, 0.0f);
                                h61 h61Var2 = MediaController.B().f22814j0;
                                if (h61Var2 != null) {
                                    h61Var2.g0();
                                }
                            } else {
                                MediaController.B().i0(MediaController.B().f22838v0, f12);
                            }
                        }
                        if (n7Var2.f37696w > 0 && e8Var2.C2 > 0.0f) {
                            org.telegram.messenger.g0.h3(n7Var2.F, 16L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                n7Var2.f37697x = System.currentTimeMillis();
                return;
        }
    }
}
