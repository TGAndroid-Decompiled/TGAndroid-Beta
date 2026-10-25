package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class s1 implements DialogInterface.OnDismissListener {
    public final int f23066a;
    public final Object f23067b;

    public s1(Object obj, int i10) {
        this.f23066a = i10;
        this.f23067b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f23066a) {
            case 0:
                ((e2) this.f23067b).K = null;
                return;
            default:
                ((Runnable) this.f23067b).run();
                return;
        }
    }
}
