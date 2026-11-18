package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
public final class ob implements Runnable {
    public final int f50506a;
    public final sb f50507b;

    public ob(sb sbVar, int i7) {
        this.f50506a = i7;
        this.f50507b = sbVar;
    }

    @Override
    public final void run() {
        switch (this.f50506a) {
            case 0:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                sb sbVar = this.f50507b;
                sbVar.a(countDownLatch, null);
                sbVar.b(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                org.telegram.messenger.g0.g3(new ob(sbVar, 3));
                return;
            case 1:
                sb sbVar2 = this.f50507b;
                sbVar2.H = false;
                sbVar2.d(true);
                return;
            case 2:
                sb sbVar3 = this.f50507b;
                sbVar3.H = false;
                sbVar3.d(true);
                return;
            default:
                sb sbVar4 = this.f50507b;
                sbVar4.H = false;
                sbVar4.d(true);
                return;
        }
    }
}
