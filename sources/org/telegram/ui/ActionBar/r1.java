package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class r1 implements DialogInterface.OnDismissListener {
    public final int f19482a;
    public final Object f19483b;

    public r1(Object obj, int i10) {
        this.f19482a = i10;
        this.f19483b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f19482a) {
            case 0:
                ((b2) this.f19483b).K = null;
                return;
            default:
                ((Runnable) this.f19483b).run();
                return;
        }
    }
}
