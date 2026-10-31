package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
public final class m2 implements DialogInterface.OnDismissListener {
    public final int f20580a;
    public final Runnable f20581b;

    public m2(int i10, Runnable runnable) {
        this.f20580a = i10;
        this.f20581b = runnable;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f20580a) {
            case 0:
                this.f20581b.run();
                return;
            case 1:
                Runnable runnable = this.f20581b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                Runnable runnable2 = this.f20581b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
