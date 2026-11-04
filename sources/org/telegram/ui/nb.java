package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
public final class nb implements Runnable {
    public final int f47929a;
    public final rb f47930b;

    public nb(rb rbVar, int i3) {
        this.f47929a = i3;
        this.f47930b = rbVar;
    }

    @Override
    public final void run() {
        switch (this.f47929a) {
            case 0:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                rb rbVar = this.f47930b;
                rbVar.a(countDownLatch, null);
                rbVar.b(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                org.telegram.messenger.g0.h3(new nb(rbVar, 3));
                return;
            case 1:
                rb rbVar2 = this.f47930b;
                rbVar2.H = false;
                rbVar2.d(true);
                return;
            case 2:
                rb rbVar3 = this.f47930b;
                rbVar3.H = false;
                rbVar3.d(true);
                return;
            default:
                rb rbVar4 = this.f47930b;
                rbVar4.H = false;
                rbVar4.d(true);
                return;
        }
    }
}
