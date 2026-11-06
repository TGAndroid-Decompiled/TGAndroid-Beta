package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
public final class pb implements Runnable {
    public final int f48767a;
    public final tb f48768b;

    public pb(tb tbVar, int i7) {
        this.f48767a = i7;
        this.f48768b = tbVar;
    }

    @Override
    public final void run() {
        switch (this.f48767a) {
            case 0:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                tb tbVar = this.f48768b;
                tbVar.a(countDownLatch, null);
                tbVar.b(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                org.telegram.messenger.g0.h3(new pb(tbVar, 3));
                return;
            case 1:
                tb tbVar2 = this.f48768b;
                tbVar2.G = false;
                tbVar2.d(true);
                return;
            case 2:
                tb tbVar3 = this.f48768b;
                tbVar3.G = false;
                tbVar3.d(true);
                return;
            default:
                tb tbVar4 = this.f48768b;
                tbVar4.G = false;
                tbVar4.d(true);
                return;
        }
    }
}
