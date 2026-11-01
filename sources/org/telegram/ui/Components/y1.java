package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class y1 implements DialogInterface.OnDismissListener {
    public final int f32684a = 0;
    public final boolean[] f32685b;
    public final Runnable f32686c;

    public y1(Runnable runnable, boolean[] zArr) {
        this.f32686c = runnable;
        this.f32685b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f32684a) {
            case 0:
                Runnable runnable = this.f32686c;
                if (runnable != null && this.f32685b[0]) {
                    runnable.run();
                    return;
                }
                return;
            default:
                boolean[] zArr = this.f32685b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    Runnable runnable2 = this.f32686c;
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
        this.f32685b = zArr;
        this.f32686c = runnable;
    }
}
