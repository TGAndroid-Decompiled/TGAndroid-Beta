package org.telegram.ui.ActionBar;

import android.app.Dialog;
import android.content.DialogInterface;
import org.telegram.messenger.w10;
public final class y1 implements DialogInterface.OnDismissListener {
    public final int f30355a;
    public final Object f30356b;
    public final Object f30357c;

    public y1(int i7, Object obj, Object obj2) {
        this.f30355a = i7;
        this.f30356b = obj;
        this.f30357c = obj2;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        Runnable runnable;
        switch (this.f30355a) {
            case 0:
                g2 g2Var = (g2) this.f30356b;
                DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) this.f30357c;
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
                g2 g2Var2 = (g2) this.f30356b;
                e2 e2Var = (e2) this.f30357c;
                g2Var2.onPause();
                g2Var2.onFragmentDestroy();
                if (e2Var != null && (runnable = e2Var.f28949b) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                boolean[] zArr = (boolean[]) this.f30356b;
                w10 w10Var = (w10) this.f30357c;
                if (!zArr[0]) {
                    w10Var.a(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
        }
    }
}
