package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class k3 implements DialogInterface.OnDismissListener {
    public final int f19340a = 1;
    public final Utilities.Callback f19341b;
    public final boolean[] f19342c;

    public k3(Utilities.Callback callback, boolean[] zArr) {
        this.f19341b = callback;
        this.f19342c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f19340a) {
            case 0:
                boolean[] zArr = this.f19342c;
                if (!zArr[0]) {
                    this.f19341b.run(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
            default:
                Utilities.Callback callback = this.f19341b;
                if (callback != null && !this.f19342c[0]) {
                    callback.run(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public k3(boolean[] zArr, Utilities.Callback callback) {
        this.f19342c = zArr;
        this.f19341b = callback;
    }
}
