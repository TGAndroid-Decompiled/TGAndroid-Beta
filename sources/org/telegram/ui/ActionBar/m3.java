package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class m3 implements DialogInterface.OnDismissListener {
    public final int f18470a = 1;
    public final Utilities.Callback f18471b;
    public final boolean[] f18472c;

    public m3(Utilities.Callback callback, boolean[] zArr) {
        this.f18471b = callback;
        this.f18472c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f18470a) {
            case 0:
                boolean[] zArr = this.f18472c;
                if (!zArr[0]) {
                    this.f18471b.run(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
            default:
                Utilities.Callback callback = this.f18471b;
                if (callback != null && !this.f18472c[0]) {
                    callback.run(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public m3(boolean[] zArr, Utilities.Callback callback) {
        this.f18472c = zArr;
        this.f18471b = callback;
    }
}
