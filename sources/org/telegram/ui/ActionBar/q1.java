package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class q1 implements DialogInterface.OnDismissListener {
    public final int f21677a;
    public final Object f21678b;

    public q1(Object obj, int i10) {
        this.f21677a = i10;
        this.f21678b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f21677a) {
            case 0:
                ((b2) this.f21678b).K = null;
                return;
            default:
                ((Runnable) this.f21678b).run();
                return;
        }
    }
}
