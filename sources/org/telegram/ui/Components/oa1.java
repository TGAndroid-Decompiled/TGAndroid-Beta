package org.telegram.ui.Components;

import java.util.concurrent.CountDownLatch;
public final class oa1 implements Runnable {
    public final int f31247a;
    public final Runnable f31248b;
    public final CountDownLatch f31249c;

    public oa1(Runnable runnable, CountDownLatch countDownLatch, int i10) {
        this.f31247a = i10;
        this.f31248b = runnable;
        this.f31249c = countDownLatch;
    }

    @Override
    public final void run() {
        CountDownLatch countDownLatch;
        switch (this.f31247a) {
            case 0:
                Runnable runnable = this.f31248b;
                countDownLatch = this.f31249c;
                try {
                    runnable.run();
                    return;
                } finally {
                }
            default:
                Runnable runnable2 = this.f31248b;
                countDownLatch = this.f31249c;
                try {
                    runnable2.run();
                    return;
                } finally {
                }
        }
    }
}
