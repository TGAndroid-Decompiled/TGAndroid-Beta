package org.telegram.ui.Components;

import java.util.concurrent.Executor;
public final class b61 implements Executor {
    public final org.telegram.messenger.r5 f33755a;

    @Override
    public final void execute(Runnable runnable) {
        this.f33755a.postRunnable(runnable);
    }
}
