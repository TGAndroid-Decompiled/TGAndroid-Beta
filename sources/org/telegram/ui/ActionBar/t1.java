package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class t1 implements DialogInterface.OnDismissListener {
    public final int f20578a;
    public final Object f20579b;

    public t1(Object obj, int i10) {
        this.f20578a = i10;
        this.f20579b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f20578a) {
            case 0:
                ((d2) this.f20579b).H = null;
                return;
            default:
                ((Runnable) this.f20579b).run();
                return;
        }
    }
}
