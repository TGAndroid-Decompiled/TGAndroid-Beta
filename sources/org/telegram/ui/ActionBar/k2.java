package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class k2 implements DialogInterface.OnDismissListener {
    public final int f29180a;
    public final Runnable f29181b;

    public k2(int i7, Runnable runnable) {
        this.f29180a = i7;
        this.f29181b = runnable;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f29180a) {
            case 0:
                this.f29181b.run();
                return;
            case 1:
                Runnable runnable = this.f29181b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                Runnable runnable2 = this.f29181b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
