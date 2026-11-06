package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class m0 implements DialogInterface.OnDismissListener {
    public final int f35810a;
    public final Runnable f35811b;

    public m0(int i7, Runnable runnable) {
        this.f35810a = i7;
        this.f35811b = runnable;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f35810a) {
            case 0:
                Runnable runnable = this.f35811b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                Runnable runnable2 = this.f35811b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 2:
                this.f35811b.run();
                return;
            default:
                Runnable runnable3 = this.f35811b;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
        }
    }
}
