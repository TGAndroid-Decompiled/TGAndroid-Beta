package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class i3 implements DialogInterface.OnDismissListener {
    public final int f20979a = 1;
    public final Utilities.Callback f20980b;
    public final boolean[] f20981c;

    public i3(Utilities.Callback callback, boolean[] zArr) {
        this.f20980b = callback;
        this.f20981c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f20979a) {
            case 0:
                boolean[] zArr = this.f20981c;
                if (!zArr[0]) {
                    this.f20980b.run(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
            default:
                Utilities.Callback callback = this.f20980b;
                if (callback != null && !this.f20981c[0]) {
                    callback.run(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public i3(boolean[] zArr, Utilities.Callback callback) {
        this.f20981c = zArr;
        this.f20980b = callback;
    }
}
