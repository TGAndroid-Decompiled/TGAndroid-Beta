package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class r1 implements DialogInterface.OnDismissListener {
    public final int f19739a;
    public final Object f19740b;

    public r1(Object obj, int i10) {
        this.f19739a = i10;
        this.f19740b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f19739a) {
            case 0:
                ((b2) this.f19740b).K = null;
                return;
            default:
                ((Runnable) this.f19740b).run();
                return;
        }
    }
}
