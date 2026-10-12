package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class i3 implements DialogInterface.OnDismissListener {
    public final int f20978a = 1;
    public final Utilities.Callback f20979b;
    public final boolean[] f20980c;

    public i3(Utilities.Callback callback, boolean[] zArr) {
        this.f20979b = callback;
        this.f20980c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f20978a) {
            case 0:
                boolean[] zArr = this.f20980c;
                if (!zArr[0]) {
                    this.f20979b.run(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
            default:
                Utilities.Callback callback = this.f20979b;
                if (callback != null && !this.f20980c[0]) {
                    callback.run(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public i3(boolean[] zArr, Utilities.Callback callback) {
        this.f20980c = zArr;
        this.f20979b = callback;
    }
}
