package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class k2 implements DialogInterface.OnDismissListener {
    public final int f29183a;
    public final Runnable f29184b;

    public k2(int i7, Runnable runnable) {
        this.f29183a = i7;
        this.f29184b = runnable;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f29183a) {
            case 0:
                this.f29184b.run();
                return;
            case 1:
                Runnable runnable = this.f29184b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                Runnable runnable2 = this.f29184b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
