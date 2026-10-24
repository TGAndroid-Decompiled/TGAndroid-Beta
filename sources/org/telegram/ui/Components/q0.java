package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class q0 implements DialogInterface.OnDismissListener {
    public final int f29703a;
    public final Runnable f29704b;

    public q0(int i10, Runnable runnable) {
        this.f29703a = i10;
        this.f29704b = runnable;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f29703a) {
            case 0:
                this.f29704b.run();
                return;
            case 1:
                Runnable runnable = this.f29704b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                Runnable runnable2 = this.f29704b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            default:
                Runnable runnable3 = this.f29704b;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
        }
    }
}
