package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class q1 implements DialogInterface.OnDismissListener {
    public final int f21783a;
    public final Object f21784b;

    public q1(Object obj, int i10) {
        this.f21783a = i10;
        this.f21784b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f21783a) {
            case 0:
                ((c2) this.f21784b).K = null;
                return;
            default:
                ((Runnable) this.f21784b).run();
                return;
        }
    }
}
