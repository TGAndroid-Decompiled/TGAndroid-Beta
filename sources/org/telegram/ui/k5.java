package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
public final class k5 implements Runnable {
    public final int f49196a;
    public final t5 f49197b;

    public k5(t5 t5Var, int i7) {
        this.f49196a = i7;
        this.f49197b = t5Var;
    }

    @Override
    public final void run() {
        switch (this.f49196a) {
            case 0:
                t5 t5Var = this.f49197b;
                t5Var.f52219h0 = false;
                t5Var.J0(true);
                return;
            case 1:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                t5 t5Var2 = this.f49197b;
                t5Var2.F0(countDownLatch, null);
                t5Var2.G0(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                org.telegram.messenger.ks.f(t5Var2.T).d(new k5(t5Var2, 4));
                return;
            case 2:
                t5 t5Var3 = this.f49197b;
                t5Var3.f52219h0 = false;
                t5Var3.J0(true);
                return;
            case 3:
                t5 t5Var4 = this.f49197b;
                t5Var4.f52219h0 = false;
                t5Var4.J0(true);
                return;
            default:
                org.telegram.messenger.g0.g3(new k5(this.f49197b, 0));
                return;
        }
    }
}
