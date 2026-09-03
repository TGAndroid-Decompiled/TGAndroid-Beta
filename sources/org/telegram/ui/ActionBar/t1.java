package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class t1 implements DialogInterface.OnDismissListener {
    public final int f20553a;
    public final Object f20554b;

    public t1(Object obj, int i10) {
        this.f20553a = i10;
        this.f20554b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f20553a) {
            case 0:
                ((d2) this.f20554b).H = null;
                return;
            default:
                ((Runnable) this.f20554b).run();
                return;
        }
    }
}
