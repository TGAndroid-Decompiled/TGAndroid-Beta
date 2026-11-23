package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class i2 implements DialogInterface.OnDismissListener {
    public final int f36114a = 0;
    public final boolean[] f36115b;
    public final Runnable f36116c;

    public i2(Runnable runnable, boolean[] zArr) {
        this.f36116c = runnable;
        this.f36115b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f36114a) {
            case 0:
                Runnable runnable = this.f36116c;
                if (runnable != null && this.f36115b[0]) {
                    runnable.run();
                    return;
                }
                return;
            default:
                boolean[] zArr = this.f36115b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    Runnable runnable2 = this.f36116c;
                    if (runnable2 != null) {
                        runnable2.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public i2(boolean[] zArr, Runnable runnable) {
        this.f36115b = zArr;
        this.f36116c = runnable;
    }
}
