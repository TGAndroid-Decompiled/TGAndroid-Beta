package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class q1 implements DialogInterface.OnDismissListener {
    public final int f19726a;
    public final Object f19727b;

    public q1(Object obj, int i10) {
        this.f19726a = i10;
        this.f19727b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f19726a) {
            case 0:
                ((a2) this.f19727b).K = null;
                return;
            default:
                ((Runnable) this.f19727b).run();
                return;
        }
    }
}
