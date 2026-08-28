package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class k2 implements DialogInterface.OnDismissListener {
    public final int f29911a = 0;
    public final boolean[] f29912b;
    public final Runnable f29913c;

    public k2(Runnable runnable, boolean[] zArr) {
        this.f29913c = runnable;
        this.f29912b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f29911a) {
            case 0:
                Runnable runnable = this.f29913c;
                if (runnable != null && this.f29912b[0]) {
                    runnable.run();
                    return;
                }
                return;
            default:
                boolean[] zArr = this.f29912b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    Runnable runnable2 = this.f29913c;
                    if (runnable2 != null) {
                        runnable2.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public k2(boolean[] zArr, Runnable runnable) {
        this.f29912b = zArr;
        this.f29913c = runnable;
    }
}
