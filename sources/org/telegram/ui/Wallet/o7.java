package org.telegram.ui.Wallet;

import org.telegram.ui.nc0;
public final class o7 implements Runnable {
    public final int f34684a;
    public final w7 f34685b;

    public o7(w7 w7Var, int i10) {
        this.f34684a = i10;
        this.f34685b = w7Var;
    }

    @Override
    public final void run() {
        j7 j10;
        switch (this.f34684a) {
            case 0:
                w7 w7Var = this.f34685b;
                w7Var.f35071n0 = false;
                w7Var.f35058g0 = null;
                w7Var.h0();
                return;
            case 1:
                this.f34685b.S();
                return;
            case 2:
                w7 w7Var2 = this.f34685b;
                v7 v7Var = w7Var2.f35058g0;
                if (v7Var != null && !w7Var2.f35060h0) {
                    if (w7Var2.f35075p0) {
                        w7Var2.f35062i0 = true;
                        w7Var2.f35092w0 = Float.NaN;
                        w7Var2.f35100z0 = Float.NaN;
                        w7Var2.f35095x0 = 0.0f;
                        w7Var2.G0 = false;
                        w7Var2.f35098y0 = v7Var.f35002i.f34938b;
                        v7Var.f35010q.a(0.0f);
                        v7 v7Var2 = w7Var2.f35058g0;
                        u7 u7Var = v7Var2.f35005l;
                        u7Var.d = 260.0f;
                        u7Var.e = 0.58f;
                        u7Var.f34938b = 1.0f;
                        long j11 = w7Var2.I0 + 1;
                        w7Var2.I0 = j11;
                        v7Var2.I = j11;
                        v7Var2.f34997c.setAllowStartLottieAnimation(true);
                        w7Var2.f35058g0.f34997c.startAnimation();
                        w7Var2.performHapticFeedback(0);
                        w7Var2.h0();
                        return;
                    } else if (w7Var2.f35066k0 && (j10 = w7Var2.j(v7Var)) != null) {
                        w7Var2.U(j10);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                w7 w7Var3 = this.f34685b;
                if (w7Var3.f35068l0 && w7Var3.f35058g0 != null) {
                    w7Var3.f35068l0 = false;
                    w7Var3.f35066k0 = true;
                    w7Var3.removeCallbacks(w7Var3.f35093w1);
                    ((nc0) w7Var3.d.f17035b).Z();
                    w7Var3.getParent().requestDisallowInterceptTouchEvent(true);
                    w7Var3.performHapticFeedback(4);
                    j7 j12 = w7Var3.j(w7Var3.f35058g0);
                    if (j12 != null) {
                        j12.n();
                        j12.animate().scaleX(0.94f).scaleY(0.94f).setDuration(100L).start();
                    }
                    w7Var3.h0();
                    return;
                }
                return;
        }
    }
}
