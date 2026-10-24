package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class q1 implements DialogInterface.OnDismissListener {
    public final int f21784a;
    public final Object f21785b;

    public q1(Object obj, int i10) {
        this.f21784a = i10;
        this.f21785b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f21784a) {
            case 0:
                ((c2) this.f21785b).K = null;
                return;
            default:
                ((Runnable) this.f21785b).run();
                return;
        }
    }
}
