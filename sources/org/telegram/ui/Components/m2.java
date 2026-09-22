package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class m2 implements DialogInterface.OnDismissListener {
    public final int f26037a = 0;
    public final boolean[] f26038b;
    public final Runnable f26039c;

    public m2(Runnable runnable, boolean[] zArr) {
        this.f26039c = runnable;
        this.f26038b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f26037a) {
            case 0:
                Runnable runnable = this.f26039c;
                if (runnable != null && this.f26038b[0]) {
                    runnable.run();
                    return;
                }
                return;
            default:
                boolean[] zArr = this.f26038b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    Runnable runnable2 = this.f26039c;
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
        this.f26038b = zArr;
        this.f26039c = runnable;
    }
}
