package org.telegram.ui;

import java.util.concurrent.Executor;
import org.telegram.messenger.AndroidUtilities;
public final class ib0 implements Executor {
    public final int f39196a;

    public ib0(int i10) {
        this.f39196a = i10;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f39196a) {
            case 0:
                AndroidUtilities.runOnUIThread(runnable);
                return;
            default:
                runnable.run();
                return;
        }
    }
}
