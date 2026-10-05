package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class r1 implements DialogInterface.OnDismissListener {
    public final int f21494a;
    public final Object f21495b;

    public r1(Object obj, int i10) {
        this.f21494a = i10;
        this.f21495b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f21494a) {
            case 0:
                ((b2) this.f21495b).K = null;
                return;
            default:
                ((Runnable) this.f21495b).run();
                return;
        }
    }
}
