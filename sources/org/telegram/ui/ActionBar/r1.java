package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class r1 implements DialogInterface.OnDismissListener {
    public final int f21485a;
    public final Object f21486b;

    public r1(Object obj, int i10) {
        this.f21485a = i10;
        this.f21486b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f21485a) {
            case 0:
                ((b2) this.f21486b).K = null;
                return;
            default:
                ((Runnable) this.f21486b).run();
                return;
        }
    }
}
