package org.telegram.ui.Components;

import java.util.concurrent.Executor;
public final class f51 implements Executor {
    public final org.telegram.messenger.q5 f33479a;

    @Override
    public final void execute(Runnable runnable) {
        this.f33479a.postRunnable(runnable);
    }
}
