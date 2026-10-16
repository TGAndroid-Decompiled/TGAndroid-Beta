package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class q1 implements DialogInterface.OnDismissListener {
    public final int f20295a;
    public final Object f20296b;

    public q1(Object obj, int i10) {
        this.f20295a = i10;
        this.f20296b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f20295a) {
            case 0:
                ((a2) this.f20296b).K = null;
                return;
            default:
                ((Runnable) this.f20296b).run();
                return;
        }
    }
}
