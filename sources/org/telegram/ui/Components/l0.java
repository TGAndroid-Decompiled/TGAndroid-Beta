package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class l0 implements DialogInterface.OnDismissListener {
    public final int f35475a;
    public final Runnable f35476b;

    public l0(int i7, Runnable runnable) {
        this.f35475a = i7;
        this.f35476b = runnable;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f35475a) {
            case 0:
                Runnable runnable = this.f35476b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                Runnable runnable2 = this.f35476b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 2:
                this.f35476b.run();
                return;
            default:
                Runnable runnable3 = this.f35476b;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
        }
    }
}
