package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class n2 implements DialogInterface.OnDismissListener {
    public final int f26615a = 0;
    public final boolean[] f26616b;
    public final Runnable f26617c;

    public n2(Runnable runnable, boolean[] zArr) {
        this.f26617c = runnable;
        this.f26616b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f26615a) {
            case 0:
                Runnable runnable = this.f26617c;
                if (runnable != null && this.f26616b[0]) {
                    runnable.run();
                    return;
                }
                return;
            default:
                boolean[] zArr = this.f26616b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    Runnable runnable2 = this.f26617c;
                    if (runnable2 != null) {
                        runnable2.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public n2(boolean[] zArr, Runnable runnable) {
        this.f26616b = zArr;
        this.f26617c = runnable;
    }
}
