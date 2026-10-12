package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class p2 implements DialogInterface.OnDismissListener {
    public final int f28138a = 0;
    public final boolean[] f28139b;
    public final Runnable f28140c;

    public p2(Runnable runnable, boolean[] zArr) {
        this.f28140c = runnable;
        this.f28139b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f28138a) {
            case 0:
                Runnable runnable = this.f28140c;
                if (runnable != null && this.f28139b[0]) {
                    runnable.run();
                    return;
                }
                return;
            default:
                boolean[] zArr = this.f28139b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    Runnable runnable2 = this.f28140c;
                    if (runnable2 != null) {
                        runnable2.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public p2(boolean[] zArr, Runnable runnable) {
        this.f28139b = zArr;
        this.f28140c = runnable;
    }
}
