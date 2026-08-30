package org.telegram.ui.Cells;

import android.os.Build;
import android.view.ActionMode;
import org.telegram.messenger.AndroidUtilities;
public final class h9 implements Runnable {
    public final z9 f21189a;

    public h9(z9 z9Var) {
        this.f21189a = z9Var;
    }

    @Override
    public final void run() {
        z9 z9Var;
        ActionMode actionMode;
        if (Build.VERSION.SDK_INT >= 23 && (actionMode = (z9Var = this.f21189a).Y) != null && !z9Var.P) {
            actionMode.hide(Long.MAX_VALUE);
            AndroidUtilities.runOnUIThread(z9Var.f22698s0, 1000L);
        }
    }
}
