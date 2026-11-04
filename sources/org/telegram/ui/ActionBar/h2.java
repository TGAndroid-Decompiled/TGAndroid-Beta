package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class h2 implements DialogInterface.OnDismissListener {
    public final int f27571a;
    public final Runnable f27572b;

    public h2(int i3, Runnable runnable) {
        this.f27571a = i3;
        this.f27572b = runnable;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f27571a) {
            case 0:
                this.f27572b.run();
                return;
            case 1:
                Runnable runnable = this.f27572b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                Runnable runnable2 = this.f27572b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
