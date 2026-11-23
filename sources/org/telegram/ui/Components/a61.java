package org.telegram.ui.Components;

import java.util.concurrent.Executor;
public final class a61 implements Executor {
    public final org.telegram.messenger.r5 f33375a;

    @Override
    public final void execute(Runnable runnable) {
        this.f33375a.postRunnable(runnable);
    }
}
