package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
public final class h7 implements Runnable {
    public final int f34316a;
    public final i7 f34317b;

    public h7(i7 i7Var, int i3) {
        this.f34316a = i3;
        this.f34317b = i7Var;
    }

    @Override
    public final void run() {
        long U;
        long j10;
        float f10;
        switch (this.f34316a) {
            case 0:
                i7 i7Var = this.f34317b;
                int i3 = i7Var.f34625w + 1;
                i7Var.f34625w = i3;
                if (i3 == 1) {
                    z7 z7Var = i7Var.I;
                    z7Var.f40977y2 = -1;
                    z7Var.f40979z2 = MediaController.B().f21348v0.f26828b0;
                    i7Var.f34626x = System.currentTimeMillis();
                    org.telegram.messenger.g0.i3(this, 2000L);
                    org.telegram.messenger.g0.h3(i7Var.F);
                    return;
                } else if (i3 == 2) {
                    org.telegram.messenger.g0.i3(this, 2000L);
                    return;
                } else {
                    return;
                }
            default:
                i7 i7Var2 = this.f34317b;
                z7 z7Var2 = i7Var2.I;
                m51 m51Var = MediaController.B().f21324j0;
                if (m51Var == null) {
                    U = 0;
                } else {
                    U = m51Var.U();
                }
                if (U != 0 && U != -9223372036854775807L) {
                    float f11 = z7Var2.f40979z2;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j11 = currentTimeMillis - i7Var2.f34626x;
                    i7Var2.f34626x = currentTimeMillis;
                    long j12 = currentTimeMillis - i7Var2.f34627y;
                    int i10 = i7Var2.f34625w;
                    if (i10 == 1) {
                        j10 = 3;
                    } else if (i10 == 2) {
                        j10 = 6;
                    } else {
                        j10 = 12;
                    }
                    float f12 = ((f11 * f10) - ((float) (j11 * j10))) / ((float) U);
                    if (f12 < 0.0f) {
                        f12 = 0.0f;
                    }
                    z7Var2.f40979z2 = f12;
                    org.telegram.messenger.zi ziVar = MediaController.B().f21348v0;
                    if (ziVar != null && ziVar.J3()) {
                        z7Var2.b1(ziVar, false);
                    }
                    if (z7Var2.f40977y2 == -1 && i7Var2.f34625w > 0) {
                        if (j12 > 200 || z7Var2.f40979z2 == 0.0f) {
                            i7Var2.f34627y = currentTimeMillis;
                            if (z7Var2.f40979z2 == 0.0f) {
                                MediaController.B().i0(MediaController.B().f21348v0, 0.0f);
                                m51 m51Var2 = MediaController.B().f21324j0;
                                if (m51Var2 != null) {
                                    m51Var2.g0();
                                }
                            } else {
                                MediaController.B().i0(MediaController.B().f21348v0, f12);
                            }
                        }
                        if (i7Var2.f34625w > 0 && z7Var2.f40979z2 > 0.0f) {
                            org.telegram.messenger.g0.i3(i7Var2.F, 16L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                i7Var2.f34626x = System.currentTimeMillis();
                return;
        }
    }
}
