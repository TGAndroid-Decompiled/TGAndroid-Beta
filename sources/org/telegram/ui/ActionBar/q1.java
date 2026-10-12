package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class q1 implements DialogInterface.OnDismissListener {
    public final int f21224a;
    public final Object f21225b;

    public q1(Object obj, int i10) {
        this.f21224a = i10;
        this.f21225b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f21224a) {
            case 0:
                ((a2) this.f21225b).K = null;
                return;
            default:
                ((Runnable) this.f21225b).run();
                return;
        }
    }
}
