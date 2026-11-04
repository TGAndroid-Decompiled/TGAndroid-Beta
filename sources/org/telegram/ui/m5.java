package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
public final class m5 implements Runnable {
    public final int f47523a;
    public final v5 f47524b;

    public m5(v5 v5Var, int i3) {
        this.f47523a = i3;
        this.f47524b = v5Var;
    }

    @Override
    public final void run() {
        switch (this.f47523a) {
            case 0:
                v5 v5Var = this.f47524b;
                v5Var.f50389h0 = false;
                v5Var.J0(true);
                return;
            case 1:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                v5 v5Var2 = this.f47524b;
                v5Var2.F0(countDownLatch, null);
                v5Var2.G0(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                org.telegram.messenger.hs.f(v5Var2.T).d(new m5(v5Var2, 4));
                return;
            case 2:
                v5 v5Var3 = this.f47524b;
                v5Var3.f50389h0 = false;
                v5Var3.J0(true);
                return;
            case 3:
                v5 v5Var4 = this.f47524b;
                v5Var4.f50389h0 = false;
                v5Var4.J0(true);
                return;
            default:
                org.telegram.messenger.g0.h3(new m5(this.f47524b, 0));
                return;
        }
    }
}
