package org.telegram.ui.Components;

import java.util.concurrent.CountDownLatch;
public final class pa1 implements Runnable {
    public final int f31559a;
    public final Runnable f31560b;
    public final CountDownLatch f31561c;

    public pa1(Runnable runnable, CountDownLatch countDownLatch, int i10) {
        this.f31559a = i10;
        this.f31560b = runnable;
        this.f31561c = countDownLatch;
    }

    @Override
    public final void run() {
        CountDownLatch countDownLatch;
        switch (this.f31559a) {
            case 0:
                Runnable runnable = this.f31560b;
                countDownLatch = this.f31561c;
                try {
                    runnable.run();
                    return;
                } finally {
                }
            default:
                Runnable runnable2 = this.f31560b;
                countDownLatch = this.f31561c;
                try {
                    runnable2.run();
                    return;
                } finally {
                }
        }
    }
}
