package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class j3 implements DialogInterface.OnDismissListener {
    public final int f21213a = 1;
    public final Utilities.Callback f21214b;
    public final boolean[] f21215c;

    public j3(Utilities.Callback callback, boolean[] zArr) {
        this.f21214b = callback;
        this.f21215c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f21213a) {
            case 0:
                boolean[] zArr = this.f21215c;
                if (!zArr[0]) {
                    this.f21214b.run(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
            default:
                Utilities.Callback callback = this.f21214b;
                if (callback != null && !this.f21215c[0]) {
                    callback.run(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public j3(boolean[] zArr, Utilities.Callback callback) {
        this.f21215c = zArr;
        this.f21214b = callback;
    }
}
