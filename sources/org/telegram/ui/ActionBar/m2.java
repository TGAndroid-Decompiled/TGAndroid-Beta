package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class m2 implements DialogInterface.OnDismissListener {
    public final int f20581a;
    public final Runnable f20582b;

    public m2(int i10, Runnable runnable) {
        this.f20581a = i10;
        this.f20582b = runnable;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f20581a) {
            case 0:
                this.f20582b.run();
                return;
            case 1:
                Runnable runnable = this.f20582b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                Runnable runnable2 = this.f20582b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
