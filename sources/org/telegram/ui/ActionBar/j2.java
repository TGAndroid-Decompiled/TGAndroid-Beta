package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class j2 implements DialogInterface.OnDismissListener {
    public final int f27568a;
    public final Runnable f27569b;

    public j2(int i7, Runnable runnable) {
        this.f27568a = i7;
        this.f27569b = runnable;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f27568a) {
            case 0:
                this.f27569b.run();
                return;
            case 1:
                Runnable runnable = this.f27569b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                Runnable runnable2 = this.f27569b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
