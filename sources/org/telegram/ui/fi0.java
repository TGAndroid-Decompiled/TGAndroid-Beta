package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class fi0 extends uh.m {
    public Runnable W;

    @Override
    public final void N() {
        super.N();
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.W = null;
        }
        ei0 ei0Var = new ei0(this, 0);
        this.W = ei0Var;
        AndroidUtilities.runOnUIThread(ei0Var);
    }

    @Override
    public final void W() {
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.W = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("chatItemAnimator disable notifications");
        }
    }

    @Override
    public final void g() {
        super.g();
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        ei0 ei0Var = new ei0(this, 1);
        this.W = ei0Var;
        AndroidUtilities.runOnUIThread(ei0Var);
    }

    @Override
    public final void F() {
    }
}
