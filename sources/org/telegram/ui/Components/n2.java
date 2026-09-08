package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class n2 implements DialogInterface.OnDismissListener {
    public final int f28627a = 0;
    public final boolean[] f28628b;
    public final Runnable f28629c;

    public n2(Runnable runnable, boolean[] zArr) {
        this.f28629c = runnable;
        this.f28628b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f28627a) {
            case 0:
                Runnable runnable = this.f28629c;
                if (runnable != null && this.f28628b[0]) {
                    runnable.run();
                    return;
                }
                return;
            default:
                boolean[] zArr = this.f28628b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    Runnable runnable2 = this.f28629c;
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
        this.f28628b = zArr;
        this.f28629c = runnable;
    }
}
