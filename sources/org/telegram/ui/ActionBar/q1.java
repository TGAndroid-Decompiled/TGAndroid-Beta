package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class q1 implements DialogInterface.OnDismissListener {
    public final int f21223a;
    public final Object f21224b;

    public q1(Object obj, int i10) {
        this.f21223a = i10;
        this.f21224b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f21223a) {
            case 0:
                ((a2) this.f21224b).K = null;
                return;
            default:
                ((Runnable) this.f21224b).run();
                return;
        }
    }
}
