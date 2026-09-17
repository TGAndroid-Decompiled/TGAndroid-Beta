package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class r1 implements DialogInterface.OnDismissListener {
    public final int f21344a;
    public final Object f21345b;

    public r1(Object obj, int i10) {
        this.f21344a = i10;
        this.f21345b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f21344a) {
            case 0:
                ((b2) this.f21345b).K = null;
                return;
            default:
                ((Runnable) this.f21345b).run();
                return;
        }
    }
}
