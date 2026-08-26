package org.telegram.ui;

import java.util.concurrent.Executor;
import org.telegram.messenger.AndroidUtilities;

public final class LinkManager$$ExternalSyntheticLambda9 implements Executor {
    public final int $r8$classId;

    @Override
    public final void execute(Runnable runnable) {
        switch (this.$r8$classId) {
            case 0:
                AndroidUtilities.runOnUIThread(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
