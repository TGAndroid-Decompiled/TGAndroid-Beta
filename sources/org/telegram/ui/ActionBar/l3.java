package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class l3 implements DialogInterface.OnDismissListener {
    public final int f19371a = 1;
    public final Utilities.Callback f19372b;
    public final boolean[] f19373c;

    public l3(Utilities.Callback callback, boolean[] zArr) {
        this.f19372b = callback;
        this.f19373c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f19371a) {
            case 0:
                boolean[] zArr = this.f19373c;
                if (!zArr[0]) {
                    this.f19372b.run(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
            default:
                Utilities.Callback callback = this.f19372b;
                if (callback != null && !this.f19373c[0]) {
                    callback.run(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public l3(boolean[] zArr, Utilities.Callback callback) {
        this.f19373c = zArr;
        this.f19372b = callback;
    }
}
