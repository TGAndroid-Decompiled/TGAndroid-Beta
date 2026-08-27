package org.telegram.ui.ActionBar;

import android.content.DialogInterface;

public final class r1 implements DialogInterface.OnDismissListener {

    public final int f23748a;

    public final Object f23749b;

    public r1(Object obj, int i10) {
        this.f23748a = i10;
        this.f23749b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f23748a) {
            case 0:
                ((b2) this.f23749b).G = null;
                break;
            default:
                ((Runnable) this.f23749b).run();
                break;
        }
    }
}
