package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class l3 implements DialogInterface.OnDismissListener {
    public final int f19372a = 1;
    public final Utilities.Callback f19373b;
    public final boolean[] f19374c;

    public l3(Utilities.Callback callback, boolean[] zArr) {
        this.f19373b = callback;
        this.f19374c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f19372a) {
            case 0:
                boolean[] zArr = this.f19374c;
                if (!zArr[0]) {
                    this.f19373b.run(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
            default:
                Utilities.Callback callback = this.f19373b;
                if (callback != null && !this.f19374c[0]) {
                    callback.run(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public l3(boolean[] zArr, Utilities.Callback callback) {
        this.f19374c = zArr;
        this.f19373b = callback;
    }
}
