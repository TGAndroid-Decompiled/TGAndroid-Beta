package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class i3 implements DialogInterface.OnDismissListener {
    public final int f20063a = 1;
    public final Utilities.Callback f20064b;
    public final boolean[] f20065c;

    public i3(Utilities.Callback callback, boolean[] zArr) {
        this.f20064b = callback;
        this.f20065c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f20063a) {
            case 0:
                boolean[] zArr = this.f20065c;
                if (!zArr[0]) {
                    this.f20064b.run(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
            default:
                Utilities.Callback callback = this.f20064b;
                if (callback != null && !this.f20065c[0]) {
                    callback.run(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public i3(boolean[] zArr, Utilities.Callback callback) {
        this.f20065c = zArr;
        this.f20064b = callback;
    }
}
