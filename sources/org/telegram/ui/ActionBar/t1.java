package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class t1 implements DialogInterface.OnDismissListener {
    public final int f18629a;
    public final Object f18630b;

    public t1(Object obj, int i10) {
        this.f18629a = i10;
        this.f18630b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f18629a) {
            case 0:
                ((d2) this.f18630b).K = null;
                return;
            default:
                ((Runnable) this.f18630b).run();
                return;
        }
    }
}
