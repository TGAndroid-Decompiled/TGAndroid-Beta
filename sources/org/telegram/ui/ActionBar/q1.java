package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class q1 implements DialogInterface.OnDismissListener {
    public final int f19710a;
    public final Object f19711b;

    public q1(Object obj, int i10) {
        this.f19710a = i10;
        this.f19711b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f19710a) {
            case 0:
                ((a2) this.f19711b).K = null;
                return;
            default:
                ((Runnable) this.f19711b).run();
                return;
        }
    }
}
