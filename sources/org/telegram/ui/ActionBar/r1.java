package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class r1 implements DialogInterface.OnDismissListener {
    public final int f21486a;
    public final Object f21487b;

    public r1(Object obj, int i10) {
        this.f21486a = i10;
        this.f21487b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f21486a) {
            case 0:
                ((b2) this.f21487b).K = null;
                return;
            default:
                ((Runnable) this.f21487b).run();
                return;
        }
    }
}
