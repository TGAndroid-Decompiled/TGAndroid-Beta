package org.telegram.ui.Components.voip;

import android.content.DialogInterface;
public final class b2 implements DialogInterface.OnDismissListener {
    public final int f28058a;
    public final Runnable f28059b;

    public b2(int i10, Runnable runnable) {
        this.f28058a = i10;
        this.f28059b = runnable;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f28058a) {
            case 0:
                Runnable runnable = this.f28059b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                Runnable runnable2 = this.f28059b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
