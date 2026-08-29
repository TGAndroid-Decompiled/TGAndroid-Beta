package org.telegram.ui.Cells;

import android.os.Build;
import android.view.ActionMode;
import org.telegram.messenger.AndroidUtilities;
public final class f9 implements Runnable {
    public final x9 f24372a;

    public f9(x9 x9Var) {
        this.f24372a = x9Var;
    }

    @Override
    public final void run() {
        x9 x9Var;
        ActionMode actionMode;
        if (Build.VERSION.SDK_INT >= 23 && (actionMode = (x9Var = this.f24372a).Y) != null && !x9Var.P) {
            actionMode.hide(Long.MAX_VALUE);
            AndroidUtilities.runOnUIThread(x9Var.f25966s0, 1000L);
        }
    }
}
