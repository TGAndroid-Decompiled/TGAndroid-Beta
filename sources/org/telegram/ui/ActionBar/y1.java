package org.telegram.ui.ActionBar;

import android.app.Dialog;
import android.content.DialogInterface;
import org.telegram.messenger.y10;
public final class y1 implements DialogInterface.OnDismissListener {
    public final int f30298a;
    public final Object f30299b;
    public final Object f30300c;

    public y1(int i7, Object obj, Object obj2) {
        this.f30298a = i7;
        this.f30299b = obj;
        this.f30300c = obj2;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        Runnable runnable;
        switch (this.f30298a) {
            case 0:
                g2 g2Var = (g2) this.f30299b;
                DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) this.f30300c;
                g2Var.getClass();
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(dialogInterface);
                }
                g2Var.onDialogDismiss((Dialog) dialogInterface);
                if (dialogInterface == g2Var.visibleDialog) {
                    g2Var.visibleDialog = null;
                    return;
                }
                return;
            case 1:
                g2 g2Var2 = (g2) this.f30299b;
                e2 e2Var = (e2) this.f30300c;
                g2Var2.onPause();
                g2Var2.onFragmentDestroy();
                if (e2Var != null && (runnable = e2Var.f28906b) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                boolean[] zArr = (boolean[]) this.f30299b;
                y10 y10Var = (y10) this.f30300c;
                if (!zArr[0]) {
                    y10Var.a(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
        }
    }
}
