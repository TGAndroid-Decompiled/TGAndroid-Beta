package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class t1 implements DialogInterface.OnDismissListener {
    public final int f22286a;
    public final Object f22287b;

    public t1(Object obj, int i10) {
        this.f22286a = i10;
        this.f22287b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f22286a) {
            case 0:
                ((d2) this.f22287b).H = null;
                return;
            default:
                ((Runnable) this.f22287b).run();
                return;
        }
    }
}
