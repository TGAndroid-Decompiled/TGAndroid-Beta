package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class t0 implements DialogInterface.OnDismissListener {
    public final int f30455a;
    public final Runnable f30456b;

    public t0(int i10, Runnable runnable) {
        this.f30455a = i10;
        this.f30456b = runnable;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f30455a) {
            case 0:
                this.f30456b.run();
                return;
            case 1:
                Runnable runnable = this.f30456b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                Runnable runnable2 = this.f30456b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            default:
                Runnable runnable3 = this.f30456b;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
        }
    }
}
