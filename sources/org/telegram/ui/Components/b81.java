package org.telegram.ui.Components;

import java.util.concurrent.Executor;
import org.telegram.messenger.DispatchQueue;
public final class b81 implements Executor {
    public final DispatchQueue f24927a;

    @Override
    public final void execute(Runnable runnable) {
        this.f24927a.postRunnable(runnable);
    }
}
