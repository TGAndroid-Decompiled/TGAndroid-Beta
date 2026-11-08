package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class j2 implements DialogInterface.OnDismissListener {
    public final int f27611a;
    public final Runnable f27612b;

    public j2(int i7, Runnable runnable) {
        this.f27611a = i7;
        this.f27612b = runnable;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f27611a) {
            case 0:
                this.f27612b.run();
                return;
            case 1:
                Runnable runnable = this.f27612b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                Runnable runnable2 = this.f27612b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
