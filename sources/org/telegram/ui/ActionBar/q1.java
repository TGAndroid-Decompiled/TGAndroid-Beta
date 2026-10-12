package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class q1 implements DialogInterface.OnDismissListener {
    public final int f20595a;
    public final Object f20596b;

    public q1(Object obj, int i10) {
        this.f20595a = i10;
        this.f20596b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f20595a) {
            case 0:
                ((a2) this.f20596b).K = null;
                return;
            default:
                ((Runnable) this.f20596b).run();
                return;
        }
    }
}
