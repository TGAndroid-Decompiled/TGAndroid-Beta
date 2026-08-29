package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class s1 implements DialogInterface.OnDismissListener {
    public final int f23776a;
    public final Object f23777b;

    public s1(Object obj, int i10) {
        this.f23776a = i10;
        this.f23777b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f23776a) {
            case 0:
                ((c2) this.f23777b).G = null;
                return;
            default:
                ((Runnable) this.f23777b).run();
                return;
        }
    }
}
