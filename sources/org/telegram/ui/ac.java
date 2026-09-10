package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
public final class ac implements Runnable {
    public final int f30882a;
    public final ec f30883b;

    public ac(ec ecVar, int i10) {
        this.f30882a = i10;
        this.f30883b = ecVar;
    }

    @Override
    public final void run() {
        switch (this.f30882a) {
            case 0:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                ec ecVar = this.f30883b;
                ecVar.a(countDownLatch, null);
                ecVar.b(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                AndroidUtilities.runOnUIThread(new ac(ecVar, 3));
                return;
            case 1:
                ec ecVar2 = this.f30883b;
                ecVar2.H = false;
                ecVar2.d(true);
                return;
            case 2:
                ec ecVar3 = this.f30883b;
                ecVar3.H = false;
                ecVar3.d(true);
                return;
            default:
                ec ecVar4 = this.f30883b;
                ecVar4.H = false;
                ecVar4.d(true);
                return;
        }
    }
}
