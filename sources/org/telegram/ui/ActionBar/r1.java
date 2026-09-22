package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class r1 implements DialogInterface.OnDismissListener {
    public final int f19754a;
    public final Object f19755b;

    public r1(Object obj, int i10) {
        this.f19754a = i10;
        this.f19755b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f19754a) {
            case 0:
                ((b2) this.f19755b).K = null;
                return;
            default:
                ((Runnable) this.f19755b).run();
                return;
        }
    }
}
