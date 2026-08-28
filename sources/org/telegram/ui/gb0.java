package org.telegram.ui;

import java.util.concurrent.Executor;
import org.telegram.messenger.AndroidUtilities;
public final class gb0 implements Executor {
    public final int f38497a;

    public gb0(int i9) {
        this.f38497a = i9;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f38497a) {
            case 0:
                AndroidUtilities.runOnUIThread(runnable);
                return;
            default:
                runnable.run();
                return;
        }
    }
}
