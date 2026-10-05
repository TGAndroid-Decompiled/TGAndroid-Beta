package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class j3 implements DialogInterface.OnDismissListener {
    public final int f21247a = 1;
    public final Utilities.Callback f21248b;
    public final boolean[] f21249c;

    public j3(Utilities.Callback callback, boolean[] zArr) {
        this.f21248b = callback;
        this.f21249c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f21247a) {
            case 0:
                boolean[] zArr = this.f21249c;
                if (!zArr[0]) {
                    this.f21248b.run(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
            default:
                Utilities.Callback callback = this.f21248b;
                if (callback != null && !this.f21249c[0]) {
                    callback.run(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public j3(boolean[] zArr, Utilities.Callback callback) {
        this.f21249c = zArr;
        this.f21248b = callback;
    }
}
