package org.telegram.ui.Cells;

import android.os.Build;
import android.view.ActionMode;
import org.telegram.messenger.AndroidUtilities;

public final class e9 implements Runnable {

    public final w9 f24321a;

    public e9(w9 w9Var) {
        this.f24321a = w9Var;
    }

    @Override
    public final void run() {
        w9 w9Var;
        ActionMode actionMode;
        if (Build.VERSION.SDK_INT < 23 || (actionMode = (w9Var = this.f24321a).Y) == null || w9Var.P) {
            return;
        }
        actionMode.hide(Long.MAX_VALUE);
        AndroidUtilities.runOnUIThread(w9Var.f25892s0, 1000L);
    }
}
