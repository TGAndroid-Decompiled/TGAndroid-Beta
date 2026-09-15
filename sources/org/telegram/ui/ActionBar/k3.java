package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class k3 implements DialogInterface.OnDismissListener {
    public final int f19344a = 1;
    public final Utilities.Callback f19345b;
    public final boolean[] f19346c;

    public k3(Utilities.Callback callback, boolean[] zArr) {
        this.f19345b = callback;
        this.f19346c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f19344a) {
            case 0:
                boolean[] zArr = this.f19346c;
                if (!zArr[0]) {
                    this.f19345b.run(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
            default:
                Utilities.Callback callback = this.f19345b;
                if (callback != null && !this.f19346c[0]) {
                    callback.run(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public k3(boolean[] zArr, Utilities.Callback callback) {
        this.f19346c = zArr;
        this.f19345b = callback;
    }
}
