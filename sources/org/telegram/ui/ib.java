package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class ib extends xh.n {
    public int W;
    public yt0 X;
    public final sb Y;

    public ib(sb sbVar, hb hbVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(null, hbVar, g6Var);
        this.Y = sbVar;
        this.W = -1;
    }

    @Override
    public final void N() {
        super.N();
        yt0 yt0Var = this.X;
        if (yt0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(yt0Var);
        }
        yt0 yt0Var2 = new yt0(this, 20);
        this.X = yt0Var2;
        AndroidUtilities.runOnUIThread(yt0Var2);
    }

    @Override
    public final void W() {
        if (this.W == -1) {
            this.W = this.Y.getNotificationCenter().setAnimationInProgress(this.W, sb.V0, false);
        }
        yt0 yt0Var = this.X;
        if (yt0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(yt0Var);
            this.X = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("admin logs chatItemAnimator disable notifications");
        }
    }
}
