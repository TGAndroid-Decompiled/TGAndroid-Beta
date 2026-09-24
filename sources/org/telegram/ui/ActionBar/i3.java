package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class i3 implements DialogInterface.OnDismissListener {
    public final int f19462a = 1;
    public final Utilities.Callback f19463b;
    public final boolean[] f19464c;

    public i3(Utilities.Callback callback, boolean[] zArr) {
        this.f19463b = callback;
        this.f19464c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f19462a) {
            case 0:
                boolean[] zArr = this.f19464c;
                if (!zArr[0]) {
                    this.f19463b.run(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
            default:
                Utilities.Callback callback = this.f19463b;
                if (callback != null && !this.f19464c[0]) {
                    callback.run(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public i3(boolean[] zArr, Utilities.Callback callback) {
        this.f19464c = zArr;
        this.f19463b = callback;
    }
}
