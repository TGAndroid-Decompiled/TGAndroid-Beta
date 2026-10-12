package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
public final class bc implements Runnable {
    public final int f36129a;
    public final fc f36130b;

    public bc(fc fcVar, int i10) {
        this.f36129a = i10;
        this.f36130b = fcVar;
    }

    @Override
    public final void run() {
        switch (this.f36129a) {
            case 0:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                fc fcVar = this.f36130b;
                fcVar.a(countDownLatch, null);
                fcVar.b(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                AndroidUtilities.runOnUIThread(new bc(fcVar, 3));
                return;
            case 1:
                fc fcVar2 = this.f36130b;
                fcVar2.H = false;
                fcVar2.d(true);
                return;
            case 2:
                fc fcVar3 = this.f36130b;
                fcVar3.H = false;
                fcVar3.d(true);
                return;
            default:
                fc fcVar4 = this.f36130b;
                fcVar4.H = false;
                fcVar4.d(true);
                return;
        }
    }
}
