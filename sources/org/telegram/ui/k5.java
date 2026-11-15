package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
public final class k5 implements Runnable {
    public final int f48585a;
    public final t5 f48586b;

    public k5(t5 t5Var, int i7) {
        this.f48585a = i7;
        this.f48586b = t5Var;
    }

    @Override
    public final void run() {
        switch (this.f48585a) {
            case 0:
                t5 t5Var = this.f48586b;
                t5Var.f51365h0 = false;
                t5Var.J0(true);
                return;
            case 1:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                t5 t5Var2 = this.f48586b;
                t5Var2.F0(countDownLatch, null);
                t5Var2.G0(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                org.telegram.messenger.ns.f(t5Var2.T).d(new k5(t5Var2, 4));
                return;
            case 2:
                t5 t5Var3 = this.f48586b;
                t5Var3.f51365h0 = false;
                t5Var3.J0(true);
                return;
            case 3:
                t5 t5Var4 = this.f48586b;
                t5Var4.f51365h0 = false;
                t5Var4.J0(true);
                return;
            default:
                org.telegram.messenger.g0.h3(new k5(this.f48586b, 0));
                return;
        }
    }
}
