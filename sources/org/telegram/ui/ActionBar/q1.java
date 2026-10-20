package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class q1 implements DialogInterface.OnDismissListener {
    public final int f21673a;
    public final Object f21674b;

    public q1(Object obj, int i10) {
        this.f21673a = i10;
        this.f21674b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f21673a) {
            case 0:
                ((b2) this.f21674b).K = null;
                return;
            default:
                ((Runnable) this.f21674b).run();
                return;
        }
    }
}
