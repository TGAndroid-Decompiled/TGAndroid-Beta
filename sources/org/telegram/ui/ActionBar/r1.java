package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class r1 implements DialogInterface.OnDismissListener {
    public final int f21501a;
    public final Object f21502b;

    public r1(Object obj, int i10) {
        this.f21501a = i10;
        this.f21502b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f21501a) {
            case 0:
                ((b2) this.f21502b).K = null;
                return;
            default:
                ((Runnable) this.f21502b).run();
                return;
        }
    }
}
