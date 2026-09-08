package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class k3 implements DialogInterface.OnDismissListener {
    public final int f21157a = 1;
    public final Utilities.Callback f21158b;
    public final boolean[] f21159c;

    public k3(Utilities.Callback callback, boolean[] zArr) {
        this.f21158b = callback;
        this.f21159c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f21157a) {
            case 0:
                boolean[] zArr = this.f21159c;
                if (!zArr[0]) {
                    this.f21158b.run(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
            default:
                Utilities.Callback callback = this.f21158b;
                if (callback != null && !this.f21159c[0]) {
                    callback.run(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public k3(boolean[] zArr, Utilities.Callback callback) {
        this.f21159c = zArr;
        this.f21158b = callback;
    }
}
