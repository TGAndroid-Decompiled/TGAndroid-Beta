package org.telegram.p009ui.ActionBar;

import java.util.concurrent.CountDownLatch;

public final class Theme$$ExternalSyntheticLambda2 implements Runnable {
    public final CountDownLatch f$0;

    @Override
    public final void run() {
        this.f$0.countDown();
    }
}
