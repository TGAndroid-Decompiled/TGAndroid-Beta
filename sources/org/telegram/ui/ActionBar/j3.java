package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class j3 implements DialogInterface.OnDismissListener {
    public final int f21237a = 1;
    public final Utilities.Callback f21238b;
    public final boolean[] f21239c;

    public j3(Utilities.Callback callback, boolean[] zArr) {
        this.f21238b = callback;
        this.f21239c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f21237a) {
            case 0:
                boolean[] zArr = this.f21239c;
                if (!zArr[0]) {
                    this.f21238b.run(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
            default:
                Utilities.Callback callback = this.f21238b;
                if (callback != null && !this.f21239c[0]) {
                    callback.run(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public j3(boolean[] zArr, Utilities.Callback callback) {
        this.f21239c = zArr;
        this.f21238b = callback;
    }
}
