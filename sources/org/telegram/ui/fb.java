package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class fb extends rh.m {
    public int W;
    public kt0 X;
    public final pb Y;

    public fb(pb pbVar, eb ebVar, org.telegram.ui.ActionBar.b6 b6Var) {
        super(null, ebVar, b6Var);
        this.Y = pbVar;
        this.W = -1;
    }

    @Override
    public final void N() {
        super.N();
        kt0 kt0Var = this.X;
        if (kt0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(kt0Var);
        }
        kt0 kt0Var2 = new kt0(this, 20);
        this.X = kt0Var2;
        AndroidUtilities.runOnUIThread(kt0Var2);
    }

    @Override
    public final void W() {
        if (this.W == -1) {
            this.W = this.Y.getNotificationCenter().setAnimationInProgress(this.W, pb.U0, false);
        }
        kt0 kt0Var = this.X;
        if (kt0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(kt0Var);
            this.X = null;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("admin logs chatItemAnimator disable notifications");
        }
    }
}
