package org.telegram.ui.Components;

import java.util.concurrent.Executor;
public final class n51 implements Executor {
    public final org.telegram.messenger.q5 f37457a;

    @Override
    public final void execute(Runnable runnable) {
        this.f37457a.postRunnable(runnable);
    }
}
