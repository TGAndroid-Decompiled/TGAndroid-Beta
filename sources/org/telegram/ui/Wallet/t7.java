package org.telegram.ui.Wallet;

import org.telegram.ui.oa0;
public final class t7 implements Runnable {
    public final int f43181a;
    public final b8 f43182b;

    public t7(b8 b8Var, int i7) {
        this.f43181a = i7;
        this.f43182b = b8Var;
    }

    @Override
    public final void run() {
        o7 j3;
        switch (this.f43181a) {
            case 0:
                b8 b8Var = this.f43182b;
                b8Var.f42257s0 = false;
                b8Var.f42233g0 = null;
                b8Var.f0();
                return;
            case 1:
                this.f43182b.Q();
                return;
            case 2:
                b8 b8Var2 = this.f43182b;
                a8 a8Var = b8Var2.f42233g0;
                if (a8Var != null && !b8Var2.m0) {
                    if (b8Var2.f42261u0) {
                        b8Var2.f42246n0 = true;
                        b8Var2.f42235h0 = a8Var;
                        b8Var2.B0 = Float.NaN;
                        b8Var2.E0 = Float.NaN;
                        b8Var2.C0 = 0.0f;
                        b8Var2.L0 = false;
                        b8Var2.D0 = a8Var.f42133i.f43472b;
                        a8Var.f42141q.a(0.0f);
                        a8 a8Var2 = b8Var2.f42233g0;
                        z7 z7Var = a8Var2.f42136l;
                        z7Var.d = 260.0f;
                        z7Var.f43474e = 0.58f;
                        z7Var.f43472b = 1.0f;
                        long j10 = b8Var2.N0 + 1;
                        b8Var2.N0 = j10;
                        a8Var2.I = j10;
                        di.z2 z2Var = a8Var2.f42127c;
                        z2Var.f21222u0 = true;
                        z2Var.P0(false);
                        b8Var2.performHapticFeedback(0);
                        b8Var2.f0();
                        return;
                    } else if (b8Var2.f42249p0 && (j3 = b8Var2.j(a8Var)) != null) {
                        b8Var2.S(j3);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                b8 b8Var3 = this.f43182b;
                if (b8Var3.f42251q0 && b8Var3.f42233g0 != null) {
                    b8Var3.f42251q0 = false;
                    b8Var3.f42249p0 = true;
                    b8Var3.removeCallbacks(b8Var3.B1);
                    ((oa0) b8Var3.d.f19611a).X();
                    b8Var3.getParent().requestDisallowInterceptTouchEvent(true);
                    b8Var3.performHapticFeedback(4);
                    o7 j11 = b8Var3.j(b8Var3.f42233g0);
                    if (j11 != null) {
                        j11.o();
                        j11.animate().scaleX(0.94f).scaleY(0.94f).setDuration(100L).start();
                    }
                    b8Var3.f0();
                    return;
                }
                return;
        }
    }
}
