package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class m2 implements DialogInterface.OnDismissListener {
    public final int f28487a = 0;
    public final boolean[] f28488b;
    public final Runnable f28489c;

    public m2(Runnable runnable, boolean[] zArr) {
        this.f28489c = runnable;
        this.f28488b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f28487a) {
            case 0:
                Runnable runnable = this.f28489c;
                if (runnable != null && this.f28488b[0]) {
                    runnable.run();
                    return;
                }
                return;
            default:
                boolean[] zArr = this.f28488b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    Runnable runnable2 = this.f28489c;
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
        this.f28488b = zArr;
        this.f28489c = runnable;
    }
}
