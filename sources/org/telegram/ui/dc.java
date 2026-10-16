package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
public final class dc implements Runnable {
    public final int f34954a;
    public final hc f34955b;

    public dc(hc hcVar, int i10) {
        this.f34954a = i10;
        this.f34955b = hcVar;
    }

    @Override
    public final void run() {
        switch (this.f34954a) {
            case 0:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                hc hcVar = this.f34955b;
                hcVar.a(countDownLatch, null);
                hcVar.b(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                AndroidUtilities.runOnUIThread(new dc(hcVar, 3));
                return;
            case 1:
                hc hcVar2 = this.f34955b;
                hcVar2.H = false;
                hcVar2.d(true);
                return;
            case 2:
                hc hcVar3 = this.f34955b;
                hcVar3.H = false;
                hcVar3.d(true);
                return;
            default:
                hc hcVar4 = this.f34955b;
                hcVar4.H = false;
                hcVar4.d(true);
                return;
        }
    }
}
