package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class q1 implements DialogInterface.OnDismissListener {
    public final int f19695a;
    public final Object f19696b;

    public q1(Object obj, int i10) {
        this.f19695a = i10;
        this.f19696b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f19695a) {
            case 0:
                ((a2) this.f19696b).K = null;
                return;
            default:
                ((Runnable) this.f19696b).run();
                return;
        }
    }
}
