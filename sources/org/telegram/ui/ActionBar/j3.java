package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class j3 implements DialogInterface.OnDismissListener {
    public final int f19246a = 1;
    public final Utilities.Callback f19247b;
    public final boolean[] f19248c;

    public j3(Utilities.Callback callback, boolean[] zArr) {
        this.f19247b = callback;
        this.f19248c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f19246a) {
            case 0:
                boolean[] zArr = this.f19248c;
                if (!zArr[0]) {
                    this.f19247b.run(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
            default:
                Utilities.Callback callback = this.f19247b;
                if (callback != null && !this.f19248c[0]) {
                    callback.run(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public j3(boolean[] zArr, Utilities.Callback callback) {
        this.f19248c = zArr;
        this.f19247b = callback;
    }
}
