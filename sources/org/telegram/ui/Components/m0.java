package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class m0 implements DialogInterface.OnDismissListener {
    public final int f35883a;
    public final Runnable f35884b;

    public m0(int i7, Runnable runnable) {
        this.f35883a = i7;
        this.f35884b = runnable;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f35883a) {
            case 0:
                Runnable runnable = this.f35884b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                Runnable runnable2 = this.f35884b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 2:
                this.f35884b.run();
                return;
            default:
                Runnable runnable3 = this.f35884b;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
        }
    }
}
