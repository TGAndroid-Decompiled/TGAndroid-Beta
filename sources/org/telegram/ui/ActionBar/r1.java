package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class r1 implements DialogInterface.OnDismissListener {
    public final int f19520a;
    public final Object f19521b;

    public r1(Object obj, int i10) {
        this.f19520a = i10;
        this.f19521b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f19520a) {
            case 0:
                ((b2) this.f19521b).K = null;
                return;
            default:
                ((Runnable) this.f19521b).run();
                return;
        }
    }
}
