package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class ib extends wh.n {
    public int W;
    public rt0 X;
    public final sb Y;

    public ib(sb sbVar, hb hbVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(null, hbVar, f6Var);
        this.Y = sbVar;
        this.W = -1;
    }

    @Override
    public final void N() {
        super.N();
        rt0 rt0Var = this.X;
        if (rt0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(rt0Var);
        }
        rt0 rt0Var2 = new rt0(this, 20);
        this.X = rt0Var2;
        AndroidUtilities.runOnUIThread(rt0Var2);
    }

    @Override
    public final void W() {
        if (this.W == -1) {
            this.W = this.Y.getNotificationCenter().setAnimationInProgress(this.W, sb.V0, false);
        }
        rt0 rt0Var = this.X;
        if (rt0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(rt0Var);
            this.X = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("admin logs chatItemAnimator disable notifications");
        }
    }
}
