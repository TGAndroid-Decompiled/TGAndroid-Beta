package org.telegram.ui.Components;

import java.util.concurrent.Executor;
public final class o61 implements Executor {
    public final org.telegram.messenger.s5 f29035a;

    @Override
    public final void execute(Runnable runnable) {
        this.f29035a.postRunnable(runnable);
    }
}
