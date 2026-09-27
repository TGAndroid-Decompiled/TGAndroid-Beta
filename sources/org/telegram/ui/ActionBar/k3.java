package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class k3 implements DialogInterface.OnDismissListener {
    public final int f19520a = 1;
    public final Utilities.Callback f19521b;
    public final boolean[] f19522c;

    public k3(Utilities.Callback callback, boolean[] zArr) {
        this.f19521b = callback;
        this.f19522c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f19520a) {
            case 0:
                boolean[] zArr = this.f19522c;
                if (!zArr[0]) {
                    this.f19521b.run(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
            default:
                Utilities.Callback callback = this.f19521b;
                if (callback != null && !this.f19522c[0]) {
                    callback.run(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public k3(boolean[] zArr, Utilities.Callback callback) {
        this.f19522c = zArr;
        this.f19521b = callback;
    }
}
