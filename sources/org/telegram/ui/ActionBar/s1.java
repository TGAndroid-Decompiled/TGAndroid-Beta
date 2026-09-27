package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class s1 implements DialogInterface.OnDismissListener {
    public final int f19759a;
    public final Object f19760b;

    public s1(Object obj, int i10) {
        this.f19759a = i10;
        this.f19760b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f19759a) {
            case 0:
                ((c2) this.f19760b).K = null;
                return;
            default:
                ((Runnable) this.f19760b).run();
                return;
        }
    }
}
