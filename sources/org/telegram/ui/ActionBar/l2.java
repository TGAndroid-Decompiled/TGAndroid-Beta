package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class l2 implements DialogInterface.OnDismissListener {
    public final int f29196a;
    public final Runnable f29197b;

    public l2(int i7, Runnable runnable) {
        this.f29196a = i7;
        this.f29197b = runnable;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f29196a) {
            case 0:
                this.f29197b.run();
                return;
            case 1:
                Runnable runnable = this.f29197b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                Runnable runnable2 = this.f29197b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
