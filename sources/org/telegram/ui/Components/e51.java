package org.telegram.ui.Components;

import java.util.concurrent.Executor;
public final class e51 implements Executor {
    public final org.telegram.messenger.q5 f33294a;

    @Override
    public final void execute(Runnable runnable) {
        this.f33294a.postRunnable(runnable);
    }
}
