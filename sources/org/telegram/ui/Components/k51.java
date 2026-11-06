package org.telegram.ui.Components;

import java.util.concurrent.Executor;
public final class k51 implements Executor {
    public final org.telegram.messenger.q5 f35171a;

    @Override
    public final void execute(Runnable runnable) {
        this.f35171a.postRunnable(runnable);
    }
}
