package org.telegram.ui.Components;

import java.util.concurrent.Executor;
public final class j51 implements Executor {
    public final org.telegram.messenger.q5 f34867a;

    @Override
    public final void execute(Runnable runnable) {
        this.f34867a.postRunnable(runnable);
    }
}
