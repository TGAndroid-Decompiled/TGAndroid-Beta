package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class q1 implements DialogInterface.OnDismissListener {
    public final int f21449a;
    public final Object f21450b;

    public q1(Object obj, int i10) {
        this.f21449a = i10;
        this.f21450b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f21449a) {
            case 0:
                ((a2) this.f21450b).K = null;
                return;
            default:
                ((Runnable) this.f21450b).run();
                return;
        }
    }
}
