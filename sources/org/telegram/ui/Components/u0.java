package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class u0 implements DialogInterface.OnDismissListener {
    public final int f33068a;
    public final Runnable f33069b;

    public u0(int i10, Runnable runnable) {
        this.f33068a = i10;
        this.f33069b = runnable;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f33068a) {
            case 0:
                this.f33069b.run();
                return;
            case 1:
                Runnable runnable = this.f33069b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                Runnable runnable2 = this.f33069b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            default:
                Runnable runnable3 = this.f33069b;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
        }
    }
}
