package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class j2 implements DialogInterface.OnDismissListener {
    public final int f27607a;
    public final Runnable f27608b;

    public j2(int i7, Runnable runnable) {
        this.f27607a = i7;
        this.f27608b = runnable;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f27607a) {
            case 0:
                this.f27608b.run();
                return;
            case 1:
                Runnable runnable = this.f27608b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                Runnable runnable2 = this.f27608b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
