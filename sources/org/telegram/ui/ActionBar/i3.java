package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class i3 implements DialogInterface.OnDismissListener {
    public final int f19493a = 1;
    public final Utilities.Callback f19494b;
    public final boolean[] f19495c;

    public i3(Utilities.Callback callback, boolean[] zArr) {
        this.f19494b = callback;
        this.f19495c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f19493a) {
            case 0:
                boolean[] zArr = this.f19495c;
                if (!zArr[0]) {
                    this.f19494b.run(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
            default:
                Utilities.Callback callback = this.f19494b;
                if (callback != null && !this.f19495c[0]) {
                    callback.run(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public i3(boolean[] zArr, Utilities.Callback callback) {
        this.f19495c = zArr;
        this.f19494b = callback;
    }
}
