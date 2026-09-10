package org.telegram.ui.Cells;

import android.os.Build;
import android.view.ActionMode;
import org.telegram.messenger.AndroidUtilities;
public final class n9 implements Runnable {
    public final fa f19582a;

    public n9(fa faVar) {
        this.f19582a = faVar;
    }

    @Override
    public final void run() {
        fa faVar;
        ActionMode actionMode;
        if (Build.VERSION.SDK_INT >= 23 && (actionMode = (faVar = this.f19582a).Y) != null && !faVar.P) {
            actionMode.hide(Long.MAX_VALUE);
            AndroidUtilities.runOnUIThread(faVar.f19161s0, 1000L);
        }
    }
}
