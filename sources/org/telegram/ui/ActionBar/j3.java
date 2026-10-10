package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class j3 implements DialogInterface.OnDismissListener {
    public final int f21217a = 1;
    public final Utilities.Callback f21218b;
    public final boolean[] f21219c;

    public j3(Utilities.Callback callback, boolean[] zArr) {
        this.f21218b = callback;
        this.f21219c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f21217a) {
            case 0:
                boolean[] zArr = this.f21219c;
                if (!zArr[0]) {
                    this.f21218b.run(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
            default:
                Utilities.Callback callback = this.f21218b;
                if (callback != null && !this.f21219c[0]) {
                    callback.run(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public j3(boolean[] zArr, Utilities.Callback callback) {
        this.f21219c = zArr;
        this.f21218b = callback;
    }
}
