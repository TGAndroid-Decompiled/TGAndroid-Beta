package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class i3 implements DialogInterface.OnDismissListener {
    public final int f19476a = 1;
    public final Utilities.Callback f19477b;
    public final boolean[] f19478c;

    public i3(Utilities.Callback callback, boolean[] zArr) {
        this.f19477b = callback;
        this.f19478c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f19476a) {
            case 0:
                boolean[] zArr = this.f19478c;
                if (!zArr[0]) {
                    this.f19477b.run(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
            default:
                Utilities.Callback callback = this.f19477b;
                if (callback != null && !this.f19478c[0]) {
                    callback.run(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public i3(boolean[] zArr, Utilities.Callback callback) {
        this.f19478c = zArr;
        this.f19477b = callback;
    }
}
