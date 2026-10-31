package org.telegram.ui.Components;

import java.util.concurrent.Executor;
public final class n61 implements Executor {
    public final org.telegram.messenger.s5 f28694a;

    @Override
    public final void execute(Runnable runnable) {
        this.f28694a.postRunnable(runnable);
    }
}
