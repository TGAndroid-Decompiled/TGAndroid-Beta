package org.telegram.ui.Components;

import java.util.concurrent.Executor;
public final class l51 implements Executor {
    public final org.telegram.messenger.q5 f35547a;

    @Override
    public final void execute(Runnable runnable) {
        this.f35547a.postRunnable(runnable);
    }
}
