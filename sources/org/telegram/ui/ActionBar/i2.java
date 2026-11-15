package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class i2 implements DialogInterface.OnDismissListener {
    public final int f28664a;
    public final Runnable f28665b;

    public i2(int i7, Runnable runnable) {
        this.f28664a = i7;
        this.f28665b = runnable;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f28664a) {
            case 0:
                this.f28665b.run();
                return;
            case 1:
                Runnable runnable = this.f28665b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                Runnable runnable2 = this.f28665b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
