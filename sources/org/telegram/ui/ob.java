package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
public final class ob implements Runnable {
    public final int f50545a;
    public final sb f50546b;

    public ob(sb sbVar, int i7) {
        this.f50545a = i7;
        this.f50546b = sbVar;
    }

    @Override
    public final void run() {
        switch (this.f50545a) {
            case 0:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                sb sbVar = this.f50546b;
                sbVar.a(countDownLatch, null);
                sbVar.b(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                org.telegram.messenger.g0.g3(new ob(sbVar, 3));
                return;
            case 1:
                sb sbVar2 = this.f50546b;
                sbVar2.H = false;
                sbVar2.d(true);
                return;
            case 2:
                sb sbVar3 = this.f50546b;
                sbVar3.H = false;
                sbVar3.d(true);
                return;
            default:
                sb sbVar4 = this.f50546b;
                sbVar4.H = false;
                sbVar4.d(true);
                return;
        }
    }
}
