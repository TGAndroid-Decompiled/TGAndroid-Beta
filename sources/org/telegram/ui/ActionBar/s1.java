package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class s1 implements DialogInterface.OnDismissListener {
    public final int f19547a;
    public final Object f19548b;

    public s1(Object obj, int i10) {
        this.f19547a = i10;
        this.f19548b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f19547a) {
            case 0:
                ((c2) this.f19548b).K = null;
                return;
            default:
                ((Runnable) this.f19548b).run();
                return;
        }
    }
}
