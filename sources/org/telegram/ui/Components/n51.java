package org.telegram.ui.Components;

import java.util.concurrent.Executor;
public final class n51 implements Executor {
    public final org.telegram.messenger.q5 f37456a;

    @Override
    public final void execute(Runnable runnable) {
        this.f37456a.postRunnable(runnable);
    }
}
