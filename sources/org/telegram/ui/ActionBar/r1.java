package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class r1 implements DialogInterface.OnDismissListener {
    public final int f21343a;
    public final Object f21344b;

    public r1(Object obj, int i10) {
        this.f21343a = i10;
        this.f21344b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f21343a) {
            case 0:
                ((b2) this.f21344b).K = null;
                return;
            default:
                ((Runnable) this.f21344b).run();
                return;
        }
    }
}
