package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class q1 implements DialogInterface.OnDismissListener {
    public final int f21670a;
    public final Object f21671b;

    public q1(Object obj, int i10) {
        this.f21670a = i10;
        this.f21671b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f21670a) {
            case 0:
                ((b2) this.f21671b).K = null;
                return;
            default:
                ((Runnable) this.f21671b).run();
                return;
        }
    }
}
