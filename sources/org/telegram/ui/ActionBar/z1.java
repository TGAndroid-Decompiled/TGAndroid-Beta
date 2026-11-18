package org.telegram.ui.ActionBar;

import android.app.Dialog;
import android.content.DialogInterface;
import org.telegram.messenger.x10;
public final class z1 implements DialogInterface.OnDismissListener {
    public final int f30312a;
    public final Object f30313b;
    public final Object f30314c;

    public z1(int i7, Object obj, Object obj2) {
        this.f30312a = i7;
        this.f30313b = obj;
        this.f30314c = obj2;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        Runnable runnable;
        switch (this.f30312a) {
            case 0:
                h2 h2Var = (h2) this.f30313b;
                DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) this.f30314c;
                h2Var.getClass();
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(dialogInterface);
                }
                h2Var.onDialogDismiss((Dialog) dialogInterface);
                if (dialogInterface == h2Var.visibleDialog) {
                    h2Var.visibleDialog = null;
                    return;
                }
                return;
            case 1:
                h2 h2Var2 = (h2) this.f30313b;
                f2 f2Var = (f2) this.f30314c;
                h2Var2.onPause();
                h2Var2.onFragmentDestroy();
                if (f2Var != null && (runnable = f2Var.f28922b) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                boolean[] zArr = (boolean[]) this.f30313b;
                x10 x10Var = (x10) this.f30314c;
                if (!zArr[0]) {
                    x10Var.a(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
        }
    }
}
