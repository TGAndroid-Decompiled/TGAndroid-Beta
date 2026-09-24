package org.telegram.ui.Cells;

import android.os.Build;
import android.view.ActionMode;
import org.telegram.messenger.AndroidUtilities;
public final class l9 implements Runnable {
    public final da f20602a;

    public l9(da daVar) {
        this.f20602a = daVar;
    }

    @Override
    public final void run() {
        da daVar;
        ActionMode actionMode;
        if (Build.VERSION.SDK_INT >= 23 && (actionMode = (daVar = this.f20602a).Y) != null && !daVar.P) {
            actionMode.hide(Long.MAX_VALUE);
            AndroidUtilities.runOnUIThread(daVar.f20174s0, 1000L);
        }
    }
}
