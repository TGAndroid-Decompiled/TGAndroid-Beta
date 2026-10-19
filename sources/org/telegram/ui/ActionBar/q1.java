package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class q1 implements DialogInterface.OnDismissListener {
    public final int f21672a;
    public final Object f21673b;

    public q1(Object obj, int i10) {
        this.f21672a = i10;
        this.f21673b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f21672a) {
            case 0:
                ((b2) this.f21673b).K = null;
                return;
            default:
                ((Runnable) this.f21673b).run();
                return;
        }
    }
}
