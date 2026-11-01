package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
public final class j5 implements Runnable {
    public final int f38274a;
    public final t5 f38275b;

    public j5(t5 t5Var, int i10) {
        this.f38274a = i10;
        this.f38275b = t5Var;
    }

    @Override
    public final void run() {
        switch (this.f38274a) {
            case 0:
                t5 t5Var = this.f38275b;
                t5Var.f41540g0 = false;
                t5Var.J0(true);
                return;
            case 1:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                t5 t5Var2 = this.f38275b;
                t5Var2.F0(countDownLatch, null);
                t5Var2.G0(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                org.telegram.messenger.at.f(t5Var2.S).d(new j5(t5Var2, 4));
                return;
            case 2:
                t5 t5Var3 = this.f38275b;
                t5Var3.f41540g0 = false;
                t5Var3.J0(true);
                return;
            case 3:
                t5 t5Var4 = this.f38275b;
                t5Var4.f41540g0 = false;
                t5Var4.J0(true);
                return;
            default:
                org.telegram.messenger.i0.g3(new j5(this.f38275b, 0));
                return;
        }
    }
}
