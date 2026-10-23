package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class r0 implements DialogInterface.OnDismissListener {
    public final int f30033a;
    public final Runnable f30034b;

    public r0(int i10, Runnable runnable) {
        this.f30033a = i10;
        this.f30034b = runnable;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f30033a) {
            case 0:
                this.f30034b.run();
                return;
            case 1:
                Runnable runnable = this.f30034b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                Runnable runnable2 = this.f30034b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            default:
                Runnable runnable3 = this.f30034b;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
        }
    }
}
