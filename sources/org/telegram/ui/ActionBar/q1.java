package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class q1 implements DialogInterface.OnDismissListener {
    public final int f21669a;
    public final Object f21670b;

    public q1(Object obj, int i10) {
        this.f21669a = i10;
        this.f21670b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f21669a) {
            case 0:
                ((b2) this.f21670b).K = null;
                return;
            default:
                ((Runnable) this.f21670b).run();
                return;
        }
    }
}
