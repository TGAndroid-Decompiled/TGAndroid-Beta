package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
public final class ac implements Runnable {
    public final int f35406a;
    public final ec f35407b;

    public ac(ec ecVar, int i10) {
        this.f35406a = i10;
        this.f35407b = ecVar;
    }

    @Override
    public final void run() {
        switch (this.f35406a) {
            case 0:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                ec ecVar = this.f35407b;
                ecVar.a(countDownLatch, null);
                ecVar.b(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                AndroidUtilities.runOnUIThread(new ac(ecVar, 3));
                return;
            case 1:
                ec ecVar2 = this.f35407b;
                ecVar2.H = false;
                ecVar2.d(true);
                return;
            case 2:
                ec ecVar3 = this.f35407b;
                ecVar3.H = false;
                ecVar3.d(true);
                return;
            default:
                ec ecVar4 = this.f35407b;
                ecVar4.H = false;
                ecVar4.d(true);
                return;
        }
    }
}
