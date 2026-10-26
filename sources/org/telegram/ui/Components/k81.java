package org.telegram.ui.Components;

import java.util.concurrent.Executor;
import org.telegram.messenger.DispatchQueue;
public final class k81 implements Executor {
    public final DispatchQueue f29875a;

    @Override
    public final void execute(Runnable runnable) {
        this.f29875a.postRunnable(runnable);
    }
}
