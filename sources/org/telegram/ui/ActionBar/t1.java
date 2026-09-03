package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class t1 implements DialogInterface.OnDismissListener {
    public final int f22288a;
    public final Object f22289b;

    public t1(Object obj, int i10) {
        this.f22288a = i10;
        this.f22289b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f22288a) {
            case 0:
                ((d2) this.f22289b).H = null;
                return;
            default:
                ((Runnable) this.f22289b).run();
                return;
        }
    }
}
