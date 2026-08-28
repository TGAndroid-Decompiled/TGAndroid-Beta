package org.telegram.ui.Cells;

import android.os.Build;
import android.view.ActionMode;
import org.telegram.messenger.AndroidUtilities;
public final class i9 implements Runnable {
    public final aa f24526a;

    public i9(aa aaVar) {
        this.f24526a = aaVar;
    }

    @Override
    public final void run() {
        aa aaVar;
        ActionMode actionMode;
        if (Build.VERSION.SDK_INT >= 23 && (actionMode = (aaVar = this.f24526a).Y) != null && !aaVar.P) {
            actionMode.hide(Long.MAX_VALUE);
            AndroidUtilities.runOnUIThread(aaVar.f24105s0, 1000L);
        }
    }
}
