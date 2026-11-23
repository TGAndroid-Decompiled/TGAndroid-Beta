package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class w0 implements DialogInterface.OnDismissListener {
    public final int f41609a;
    public final Runnable f41610b;

    public w0(int i7, Runnable runnable) {
        this.f41609a = i7;
        this.f41610b = runnable;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f41609a) {
            case 0:
                Runnable runnable = this.f41610b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                Runnable runnable2 = this.f41610b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 2:
                this.f41610b.run();
                return;
            default:
                Runnable runnable3 = this.f41610b;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
        }
    }
}
