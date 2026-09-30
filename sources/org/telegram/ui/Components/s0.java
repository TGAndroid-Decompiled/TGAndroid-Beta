package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class s0 implements DialogInterface.OnDismissListener {
    public final int f28154a;
    public final Runnable f28155b;

    public s0(int i10, Runnable runnable) {
        this.f28154a = i10;
        this.f28155b = runnable;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f28154a) {
            case 0:
                this.f28155b.run();
                return;
            case 1:
                Runnable runnable = this.f28155b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                Runnable runnable2 = this.f28155b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            default:
                Runnable runnable3 = this.f28155b;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
        }
    }
}
