package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
public final class k5 implements Runnable {
    public final int f49200a;
    public final t5 f49201b;

    public k5(t5 t5Var, int i7) {
        this.f49200a = i7;
        this.f49201b = t5Var;
    }

    @Override
    public final void run() {
        switch (this.f49200a) {
            case 0:
                t5 t5Var = this.f49201b;
                t5Var.f52223h0 = false;
                t5Var.J0(true);
                return;
            case 1:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                t5 t5Var2 = this.f49201b;
                t5Var2.F0(countDownLatch, null);
                t5Var2.G0(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                org.telegram.messenger.ls.f(t5Var2.T).d(new k5(t5Var2, 4));
                return;
            case 2:
                t5 t5Var3 = this.f49201b;
                t5Var3.f52223h0 = false;
                t5Var3.J0(true);
                return;
            case 3:
                t5 t5Var4 = this.f49201b;
                t5Var4.f52223h0 = false;
                t5Var4.J0(true);
                return;
            default:
                org.telegram.messenger.g0.g3(new k5(this.f49201b, 0));
                return;
        }
    }
}
