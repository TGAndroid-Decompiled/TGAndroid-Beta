package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class r1 implements DialogInterface.OnDismissListener {
    public final int f21316a;
    public final Object f21317b;

    public r1(Object obj, int i10) {
        this.f21316a = i10;
        this.f21317b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f21316a) {
            case 0:
                ((b2) this.f21317b).K = null;
                return;
            default:
                ((Runnable) this.f21317b).run();
                return;
        }
    }
}
