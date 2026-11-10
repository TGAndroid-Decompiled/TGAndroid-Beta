package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class y1 implements DialogInterface.OnDismissListener {
    public final int f40456a = 0;
    public final boolean[] f40457b;
    public final Runnable f40458c;

    public y1(Runnable runnable, boolean[] zArr) {
        this.f40458c = runnable;
        this.f40457b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f40456a) {
            case 0:
                Runnable runnable = this.f40458c;
                if (runnable != null && this.f40457b[0]) {
                    runnable.run();
                    return;
                }
                return;
            default:
                boolean[] zArr = this.f40457b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    Runnable runnable2 = this.f40458c;
                    if (runnable2 != null) {
                        runnable2.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public y1(boolean[] zArr, Runnable runnable) {
        this.f40457b = zArr;
        this.f40458c = runnable;
    }
}
