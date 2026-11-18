package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class h2 implements DialogInterface.OnDismissListener {
    public final int f35698a = 0;
    public final boolean[] f35699b;
    public final Runnable f35700c;

    public h2(Runnable runnable, boolean[] zArr) {
        this.f35700c = runnable;
        this.f35699b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f35698a) {
            case 0:
                Runnable runnable = this.f35700c;
                if (runnable != null && this.f35699b[0]) {
                    runnable.run();
                    return;
                }
                return;
            default:
                boolean[] zArr = this.f35699b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    Runnable runnable2 = this.f35700c;
                    if (runnable2 != null) {
                        runnable2.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public h2(boolean[] zArr, Runnable runnable) {
        this.f35699b = zArr;
        this.f35700c = runnable;
    }
}
