package org.telegram.ui.Cells;

import android.os.Build;
import android.view.ActionMode;
import org.telegram.messenger.AndroidUtilities;
public final class l9 implements Runnable {
    public final da f20410a;

    public l9(da daVar) {
        this.f20410a = daVar;
    }

    @Override
    public final void run() {
        da daVar;
        ActionMode actionMode;
        if (Build.VERSION.SDK_INT >= 23 && (actionMode = (daVar = this.f20410a).Y) != null && !daVar.P) {
            actionMode.hide(Long.MAX_VALUE);
            AndroidUtilities.runOnUIThread(daVar.f19982s0, 1000L);
        }
    }
}
