package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class i2 implements DialogInterface.OnDismissListener {
    public final int f36115a = 0;
    public final boolean[] f36116b;
    public final Runnable f36117c;

    public i2(Runnable runnable, boolean[] zArr) {
        this.f36117c = runnable;
        this.f36116b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f36115a) {
            case 0:
                Runnable runnable = this.f36117c;
                if (runnable != null && this.f36116b[0]) {
                    runnable.run();
                    return;
                }
                return;
            default:
                boolean[] zArr = this.f36116b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    Runnable runnable2 = this.f36117c;
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
        this.f36116b = zArr;
        this.f36117c = runnable;
    }
}
