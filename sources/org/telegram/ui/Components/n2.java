package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class n2 implements DialogInterface.OnDismissListener {
    public final int f28824a = 0;
    public final boolean[] f28825b;
    public final Runnable f28826c;

    public n2(Runnable runnable, boolean[] zArr) {
        this.f28826c = runnable;
        this.f28825b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f28824a) {
            case 0:
                Runnable runnable = this.f28826c;
                if (runnable != null && this.f28825b[0]) {
                    runnable.run();
                    return;
                }
                return;
            default:
                boolean[] zArr = this.f28825b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    Runnable runnable2 = this.f28826c;
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
        this.f28825b = zArr;
        this.f28826c = runnable;
    }
}
