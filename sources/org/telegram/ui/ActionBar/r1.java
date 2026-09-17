package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class r1 implements DialogInterface.OnDismissListener {
    public final int f21317a;
    public final Object f21318b;

    public r1(Object obj, int i10) {
        this.f21317a = i10;
        this.f21318b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f21317a) {
            case 0:
                ((b2) this.f21318b).K = null;
                return;
            default:
                ((Runnable) this.f21318b).run();
                return;
        }
    }
}
