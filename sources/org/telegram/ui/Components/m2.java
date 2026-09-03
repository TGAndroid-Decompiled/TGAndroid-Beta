package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class m2 implements DialogInterface.OnDismissListener {
    public final int f26923a = 0;
    public final boolean[] f26924b;
    public final Runnable f26925c;

    public m2(Runnable runnable, boolean[] zArr) {
        this.f26925c = runnable;
        this.f26924b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f26923a) {
            case 0:
                Runnable runnable = this.f26925c;
                if (runnable != null && this.f26924b[0]) {
                    runnable.run();
                    return;
                }
                return;
            default:
                boolean[] zArr = this.f26924b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    Runnable runnable2 = this.f26925c;
                    if (runnable2 != null) {
                        runnable2.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public m2(boolean[] zArr, Runnable runnable) {
        this.f26924b = zArr;
        this.f26925c = runnable;
    }
}
