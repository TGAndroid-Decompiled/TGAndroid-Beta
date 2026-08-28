package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class s1 implements DialogInterface.OnDismissListener {
    public final int f23755a;
    public final Object f23756b;

    public s1(Object obj, int i9) {
        this.f23755a = i9;
        this.f23756b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f23755a) {
            case 0:
                ((c2) this.f23756b).G = null;
                return;
            default:
                ((Runnable) this.f23756b).run();
                return;
        }
    }
}
