package org.telegram.ui.Components;

import java.util.concurrent.Executor;
public final class y51 implements Executor {
    public final org.telegram.messenger.r5 f42339a;

    @Override
    public final void execute(Runnable runnable) {
        this.f42339a.postRunnable(runnable);
    }
}
