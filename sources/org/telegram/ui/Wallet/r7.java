package org.telegram.ui.Wallet;

import org.telegram.ui.nc0;
public final class r7 implements Runnable {
    public final int f34849a;
    public final z7 f34850b;

    public r7(z7 z7Var, int i10) {
        this.f34849a = i10;
        this.f34850b = z7Var;
    }

    @Override
    public final void run() {
        m7 j10;
        switch (this.f34849a) {
            case 0:
                z7 z7Var = this.f34850b;
                z7Var.f35207n0 = false;
                z7Var.f35194g0 = null;
                z7Var.h0();
                return;
            case 1:
                this.f34850b.S();
                return;
            case 2:
                z7 z7Var2 = this.f34850b;
                y7 y7Var = z7Var2.f35194g0;
                if (y7Var != null && !z7Var2.f35196h0) {
                    if (z7Var2.f35211p0) {
                        z7Var2.f35198i0 = true;
                        z7Var2.f35228w0 = Float.NaN;
                        z7Var2.f35236z0 = Float.NaN;
                        z7Var2.f35231x0 = 0.0f;
                        z7Var2.G0 = false;
                        z7Var2.f35234y0 = y7Var.f35142i.f35097b;
                        y7Var.f35150q.a(0.0f);
                        y7 y7Var2 = z7Var2.f35194g0;
                        x7 x7Var = y7Var2.f35145l;
                        x7Var.d = 260.0f;
                        x7Var.e = 0.58f;
                        x7Var.f35097b = 1.0f;
                        long j11 = z7Var2.I0 + 1;
                        z7Var2.I0 = j11;
                        y7Var2.I = j11;
                        y7Var2.f35137c.setAllowStartLottieAnimation(true);
                        z7Var2.f35194g0.f35137c.startAnimation();
                        z7Var2.performHapticFeedback(0);
                        z7Var2.h0();
                        return;
                    } else if (z7Var2.f35202k0 && (j10 = z7Var2.j(y7Var)) != null) {
                        z7Var2.U(j10);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                z7 z7Var3 = this.f34850b;
                if (z7Var3.f35204l0 && z7Var3.f35194g0 != null) {
                    z7Var3.f35204l0 = false;
                    z7Var3.f35202k0 = true;
                    z7Var3.removeCallbacks(z7Var3.f35229w1);
                    ((nc0) z7Var3.d.f17042b).Z();
                    z7Var3.getParent().requestDisallowInterceptTouchEvent(true);
                    z7Var3.performHapticFeedback(4);
                    m7 j12 = z7Var3.j(z7Var3.f35194g0);
                    if (j12 != null) {
                        j12.n();
                        j12.animate().scaleX(0.94f).scaleY(0.94f).setDuration(100L).start();
                    }
                    z7Var3.h0();
                    return;
                }
                return;
        }
    }
}
