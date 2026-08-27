package org.telegram.ui.Components;

import android.content.DialogInterface;

public final class k2 implements DialogInterface.OnDismissListener {

    public final int f29897a = 0;

    public final boolean[] f29898b;

    public final Runnable f29899c;

    public k2(Runnable runnable, boolean[] zArr) {
        this.f29899c = runnable;
        this.f29898b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f29897a) {
            case 0:
                Runnable runnable = this.f29899c;
                if (runnable != null && this.f29898b[0]) {
                    runnable.run();
                    break;
                }
                break;
            default:
                boolean[] zArr = this.f29898b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    Runnable runnable2 = this.f29899c;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
                break;
        }
    }

    public k2(boolean[] zArr, Runnable runnable) {
        this.f29898b = zArr;
        this.f29899c = runnable;
    }
}
