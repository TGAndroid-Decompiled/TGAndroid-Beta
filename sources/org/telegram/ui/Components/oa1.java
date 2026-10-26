package org.telegram.ui.Components;

import java.util.concurrent.CountDownLatch;
public final class oa1 implements Runnable {
    public final int f31249a;
    public final Runnable f31250b;
    public final CountDownLatch f31251c;

    public oa1(Runnable runnable, CountDownLatch countDownLatch, int i10) {
        this.f31249a = i10;
        this.f31250b = runnable;
        this.f31251c = countDownLatch;
    }

    @Override
    public final void run() {
        CountDownLatch countDownLatch;
        switch (this.f31249a) {
            case 0:
                Runnable runnable = this.f31250b;
                countDownLatch = this.f31251c;
                try {
                    runnable.run();
                    return;
                } finally {
                }
            default:
                Runnable runnable2 = this.f31250b;
                countDownLatch = this.f31251c;
                try {
                    runnable2.run();
                    return;
                } finally {
                }
        }
    }
}
