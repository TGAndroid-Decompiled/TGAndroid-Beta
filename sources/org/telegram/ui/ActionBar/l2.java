package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class l2 implements DialogInterface.OnDismissListener {
    public final int f29198a;
    public final Runnable f29199b;

    public l2(int i7, Runnable runnable) {
        this.f29198a = i7;
        this.f29199b = runnable;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f29198a) {
            case 0:
                this.f29199b.run();
                return;
            case 1:
                Runnable runnable = this.f29199b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                Runnable runnable2 = this.f29199b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
