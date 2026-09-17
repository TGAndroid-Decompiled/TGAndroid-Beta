package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class k3 implements DialogInterface.OnDismissListener {
    public final int f21131a = 1;
    public final Utilities.Callback f21132b;
    public final boolean[] f21133c;

    public k3(Utilities.Callback callback, boolean[] zArr) {
        this.f21132b = callback;
        this.f21133c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f21131a) {
            case 0:
                boolean[] zArr = this.f21133c;
                if (!zArr[0]) {
                    this.f21132b.run(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
            default:
                Utilities.Callback callback = this.f21132b;
                if (callback != null && !this.f21133c[0]) {
                    callback.run(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public k3(boolean[] zArr, Utilities.Callback callback) {
        this.f21133c = zArr;
        this.f21132b = callback;
    }
}
