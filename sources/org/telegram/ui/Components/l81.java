package org.telegram.ui.Components;

import java.util.concurrent.Executor;
import org.telegram.messenger.DispatchQueue;
public final class l81 implements Executor {
    public final DispatchQueue f30175a;

    @Override
    public final void execute(Runnable runnable) {
        this.f30175a.postRunnable(runnable);
    }
}
