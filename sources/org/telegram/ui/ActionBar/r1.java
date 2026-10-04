package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class r1 implements DialogInterface.OnDismissListener {
    public final int f21490a;
    public final Object f21491b;

    public r1(Object obj, int i10) {
        this.f21490a = i10;
        this.f21491b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f21490a) {
            case 0:
                ((b2) this.f21491b).K = null;
                return;
            default:
                ((Runnable) this.f21491b).run();
                return;
        }
    }
}
