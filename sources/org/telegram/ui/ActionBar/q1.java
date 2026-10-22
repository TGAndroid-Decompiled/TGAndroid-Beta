package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class q1 implements DialogInterface.OnDismissListener {
    public final int f21676a;
    public final Object f21677b;

    public q1(Object obj, int i10) {
        this.f21676a = i10;
        this.f21677b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f21676a) {
            case 0:
                ((b2) this.f21677b).K = null;
                return;
            default:
                ((Runnable) this.f21677b).run();
                return;
        }
    }
}
