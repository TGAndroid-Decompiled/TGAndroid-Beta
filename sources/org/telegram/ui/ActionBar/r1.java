package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class r1 implements DialogInterface.OnDismissListener {
    public final int f19516a;
    public final Object f19517b;

    public r1(Object obj, int i10) {
        this.f19516a = i10;
        this.f19517b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f19516a) {
            case 0:
                ((b2) this.f19517b).K = null;
                return;
            default:
                ((Runnable) this.f19517b).run();
                return;
        }
    }
}
