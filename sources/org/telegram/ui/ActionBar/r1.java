package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class r1 implements DialogInterface.OnDismissListener {
    public final int f19707a;
    public final Object f19708b;

    public r1(Object obj, int i10) {
        this.f19707a = i10;
        this.f19708b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f19707a) {
            case 0:
                ((b2) this.f19708b).K = null;
                return;
            default:
                ((Runnable) this.f19708b).run();
                return;
        }
    }
}
