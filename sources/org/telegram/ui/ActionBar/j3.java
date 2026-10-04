package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class j3 implements DialogInterface.OnDismissListener {
    public final int f21242a = 1;
    public final Utilities.Callback f21243b;
    public final boolean[] f21244c;

    public j3(Utilities.Callback callback, boolean[] zArr) {
        this.f21243b = callback;
        this.f21244c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f21242a) {
            case 0:
                boolean[] zArr = this.f21244c;
                if (!zArr[0]) {
                    this.f21243b.run(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
            default:
                Utilities.Callback callback = this.f21243b;
                if (callback != null && !this.f21244c[0]) {
                    callback.run(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public j3(boolean[] zArr, Utilities.Callback callback) {
        this.f21244c = zArr;
        this.f21243b = callback;
    }
}
