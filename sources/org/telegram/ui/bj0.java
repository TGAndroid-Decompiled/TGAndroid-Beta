package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class bj0 extends ki.n {
    public Runnable W;

    @Override
    public final void N() {
        super.N();
        Runnable runnable = this.W;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.W = null;
        }
        aj0 aj0Var = new aj0(this, 0);
        this.W = aj0Var;
        AndroidUtilities.runOnUIThread(aj0Var);
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
        aj0 aj0Var = new aj0(this, 1);
        this.W = aj0Var;
        AndroidUtilities.runOnUIThread(aj0Var);
    }

    @Override
    public final void F() {
    }
}
