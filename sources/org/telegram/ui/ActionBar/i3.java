package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class i3 implements DialogInterface.OnDismissListener {
    public final int f20363a = 1;
    public final Utilities.Callback f20364b;
    public final boolean[] f20365c;

    public i3(Utilities.Callback callback, boolean[] zArr) {
        this.f20364b = callback;
        this.f20365c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f20363a) {
            case 0:
                boolean[] zArr = this.f20365c;
                if (!zArr[0]) {
                    this.f20364b.run(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
            default:
                Utilities.Callback callback = this.f20364b;
                if (callback != null && !this.f20365c[0]) {
                    callback.run(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public i3(boolean[] zArr, Utilities.Callback callback) {
        this.f20365c = zArr;
        this.f20364b = callback;
    }
}
