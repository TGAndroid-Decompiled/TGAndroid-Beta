package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class o2 implements DialogInterface.OnDismissListener {
    public final int f28868a = 0;
    public final boolean[] f28869b;
    public final Runnable f28870c;

    public o2(Runnable runnable, boolean[] zArr) {
        this.f28870c = runnable;
        this.f28869b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f28868a) {
            case 0:
                Runnable runnable = this.f28870c;
                if (runnable != null && this.f28869b[0]) {
                    runnable.run();
                    return;
                }
                return;
            default:
                boolean[] zArr = this.f28869b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    Runnable runnable2 = this.f28870c;
                    if (runnable2 != null) {
                        runnable2.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public o2(boolean[] zArr, Runnable runnable) {
        this.f28869b = zArr;
        this.f28870c = runnable;
    }
}
