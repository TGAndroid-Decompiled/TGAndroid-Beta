package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class y1 implements DialogInterface.OnDismissListener {
    public final int f32593a = 0;
    public final boolean[] f32594b;
    public final Runnable f32595c;

    public y1(Runnable runnable, boolean[] zArr) {
        this.f32595c = runnable;
        this.f32594b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f32593a) {
            case 0:
                Runnable runnable = this.f32595c;
                if (runnable != null && this.f32594b[0]) {
                    runnable.run();
                    return;
                }
                return;
            default:
                boolean[] zArr = this.f32594b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    Runnable runnable2 = this.f32595c;
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
        this.f32594b = zArr;
        this.f32595c = runnable;
    }
}
