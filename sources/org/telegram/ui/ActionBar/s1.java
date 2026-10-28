package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class s1 implements DialogInterface.OnDismissListener {
    public final int f23069a;
    public final Object f23070b;

    public s1(Object obj, int i10) {
        this.f23069a = i10;
        this.f23070b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f23069a) {
            case 0:
                ((e2) this.f23070b).K = null;
                return;
            default:
                ((Runnable) this.f23070b).run();
                return;
        }
    }
}
