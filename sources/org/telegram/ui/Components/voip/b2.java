package org.telegram.ui.Components.voip;

import android.content.DialogInterface;

public final class b2 implements DialogInterface.OnDismissListener {

    public final int f33496a;

    public final Runnable f33497b;

    public b2(int i10, Runnable runnable) {
        this.f33496a = i10;
        this.f33497b = runnable;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f33496a) {
            case 0:
                Runnable runnable = this.f33497b;
                if (runnable != null) {
                    runnable.run();
                }
                break;
            default:
                Runnable runnable2 = this.f33497b;
                if (runnable2 != null) {
                    runnable2.run();
                }
                break;
        }
    }
}
