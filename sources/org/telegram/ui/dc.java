package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
public final class dc implements Runnable {
    public final int f35227a;
    public final ic f35228b;

    public dc(ic icVar, int i10) {
        this.f35227a = i10;
        this.f35228b = icVar;
    }

    @Override
    public final void run() {
        switch (this.f35227a) {
            case 0:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                ic icVar = this.f35228b;
                icVar.a(countDownLatch, null);
                icVar.b(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                AndroidUtilities.runOnUIThread(new dc(icVar, 3));
                return;
            case 1:
                ic icVar2 = this.f35228b;
                icVar2.H = false;
                icVar2.d(true);
                return;
            case 2:
                ic icVar3 = this.f35228b;
                icVar3.H = false;
                icVar3.d(true);
                return;
            default:
                ic icVar4 = this.f35228b;
                icVar4.H = false;
                icVar4.d(true);
                return;
        }
    }
}
