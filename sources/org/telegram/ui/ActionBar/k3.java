package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class k3 implements DialogInterface.OnDismissListener {
    public final int f21130a = 1;
    public final Utilities.Callback f21131b;
    public final boolean[] f21132c;

    public k3(Utilities.Callback callback, boolean[] zArr) {
        this.f21131b = callback;
        this.f21132c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f21130a) {
            case 0:
                boolean[] zArr = this.f21132c;
                if (!zArr[0]) {
                    this.f21131b.run(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
            default:
                Utilities.Callback callback = this.f21131b;
                if (callback != null && !this.f21132c[0]) {
                    callback.run(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public k3(boolean[] zArr, Utilities.Callback callback) {
        this.f21132c = zArr;
        this.f21131b = callback;
    }
}
