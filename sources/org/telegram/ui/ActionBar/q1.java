package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class q1 implements DialogInterface.OnDismissListener {
    public final int f19711a;
    public final Object f19712b;

    public q1(Object obj, int i10) {
        this.f19711a = i10;
        this.f19712b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f19711a) {
            case 0:
                ((a2) this.f19712b).K = null;
                return;
            default:
                ((Runnable) this.f19712b).run();
                return;
        }
    }
}
