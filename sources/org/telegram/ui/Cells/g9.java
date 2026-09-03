package org.telegram.ui.Cells;

import android.os.Build;
import android.view.ActionMode;
import org.telegram.messenger.AndroidUtilities;
public final class g9 implements Runnable {
    public final y9 f21114a;

    public g9(y9 y9Var) {
        this.f21114a = y9Var;
    }

    @Override
    public final void run() {
        y9 y9Var;
        ActionMode actionMode;
        if (Build.VERSION.SDK_INT >= 23 && (actionMode = (y9Var = this.f21114a).Y) != null && !y9Var.P) {
            actionMode.hide(Long.MAX_VALUE);
            AndroidUtilities.runOnUIThread(y9Var.f22634s0, 1000L);
        }
    }
}
