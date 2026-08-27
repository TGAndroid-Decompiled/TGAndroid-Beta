package org.telegram.ui;

import java.util.concurrent.Executor;
import org.telegram.messenger.AndroidUtilities;

public final class kb0 implements Executor {

    public final int f39686a;

    public kb0(int i10) {
        this.f39686a = i10;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f39686a) {
            case 0:
                AndroidUtilities.runOnUIThread(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
