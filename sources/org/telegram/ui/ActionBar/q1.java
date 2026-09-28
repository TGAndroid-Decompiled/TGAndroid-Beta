package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class q1 implements DialogInterface.OnDismissListener {
    public final int f19709a;
    public final Object f19710b;

    public q1(Object obj, int i10) {
        this.f19709a = i10;
        this.f19710b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f19709a) {
            case 0:
                ((a2) this.f19710b).K = null;
                return;
            default:
                ((Runnable) this.f19710b).run();
                return;
        }
    }
}
