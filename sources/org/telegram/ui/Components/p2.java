package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class p2 implements DialogInterface.OnDismissListener {
    public final int f29689a = 0;
    public final boolean[] f29690b;
    public final Runnable f29691c;

    public p2(Runnable runnable, boolean[] zArr) {
        this.f29691c = runnable;
        this.f29690b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f29689a) {
            case 0:
                Runnable runnable = this.f29691c;
                if (runnable != null && this.f29690b[0]) {
                    runnable.run();
                    return;
                }
                return;
            default:
                boolean[] zArr = this.f29690b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    Runnable runnable2 = this.f29691c;
                    if (runnable2 != null) {
                        runnable2.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public p2(boolean[] zArr, Runnable runnable) {
        this.f29690b = zArr;
        this.f29691c = runnable;
    }
}
