package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class s1 implements DialogInterface.OnDismissListener {
    public final int f19548a;
    public final Object f19549b;

    public s1(Object obj, int i10) {
        this.f19548a = i10;
        this.f19549b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f19548a) {
            case 0:
                ((c2) this.f19549b).K = null;
                return;
            default:
                ((Runnable) this.f19549b).run();
                return;
        }
    }
}
