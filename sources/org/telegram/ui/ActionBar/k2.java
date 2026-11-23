package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class k2 implements DialogInterface.OnDismissListener {
    public final int f29199a;
    public final Runnable f29200b;

    public k2(int i7, Runnable runnable) {
        this.f29199a = i7;
        this.f29200b = runnable;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f29199a) {
            case 0:
                this.f29200b.run();
                return;
            case 1:
                Runnable runnable = this.f29200b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                Runnable runnable2 = this.f29200b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
