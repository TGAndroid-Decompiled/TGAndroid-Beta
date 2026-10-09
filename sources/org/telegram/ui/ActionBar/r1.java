package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class r1 implements DialogInterface.OnDismissListener {
    public final int f21497a;
    public final Object f21498b;

    public r1(Object obj, int i10) {
        this.f21497a = i10;
        this.f21498b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f21497a) {
            case 0:
                ((b2) this.f21498b).K = null;
                return;
            default:
                ((Runnable) this.f21498b).run();
                return;
        }
    }
}
