package org.telegram.ui.Cells;

import android.os.Build;
import android.view.ActionMode;
import org.telegram.messenger.AndroidUtilities;
public final class m9 implements Runnable {
    public final ea f20656a;

    public m9(ea eaVar) {
        this.f20656a = eaVar;
    }

    @Override
    public final void run() {
        ea eaVar;
        ActionMode actionMode;
        if (Build.VERSION.SDK_INT >= 23 && (actionMode = (eaVar = this.f20656a).Y) != null && !eaVar.P) {
            actionMode.hide(Long.MAX_VALUE);
            AndroidUtilities.runOnUIThread(eaVar.f20236s0, 1000L);
        }
    }
}
