package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class k3 implements DialogInterface.OnDismissListener {
    public final int f19580a = 1;
    public final Utilities.Callback f19581b;
    public final boolean[] f19582c;

    public k3(Utilities.Callback callback, boolean[] zArr) {
        this.f19581b = callback;
        this.f19582c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f19580a) {
            case 0:
                boolean[] zArr = this.f19582c;
                if (!zArr[0]) {
                    this.f19581b.run(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
            default:
                Utilities.Callback callback = this.f19581b;
                if (callback != null && !this.f19582c[0]) {
                    callback.run(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public k3(boolean[] zArr, Utilities.Callback callback) {
        this.f19582c = zArr;
        this.f19581b = callback;
    }
}
