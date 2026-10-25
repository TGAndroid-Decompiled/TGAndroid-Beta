package org.telegram.ui.Components.voip;

import android.content.DialogInterface;
public final class d2 implements DialogInterface.OnDismissListener {
    public final int f33758a;
    public final Runnable f33759b;

    public d2(int i10, Runnable runnable) {
        this.f33758a = i10;
        this.f33759b = runnable;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f33758a) {
            case 0:
                Runnable runnable = this.f33759b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                Runnable runnable2 = this.f33759b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
