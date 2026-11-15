package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class j0 implements DialogInterface.OnDismissListener {
    public final int f35808a;
    public final Runnable f35809b;

    public j0(int i7, Runnable runnable) {
        this.f35808a = i7;
        this.f35809b = runnable;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f35808a) {
            case 0:
                Runnable runnable = this.f35809b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                Runnable runnable2 = this.f35809b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 2:
                this.f35809b.run();
                return;
            default:
                Runnable runnable3 = this.f35809b;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
        }
    }
}
