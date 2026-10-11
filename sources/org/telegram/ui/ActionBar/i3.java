package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class i3 implements DialogInterface.OnDismissListener {
    public final int f21240a = 1;
    public final Utilities.Callback f21241b;
    public final boolean[] f21242c;

    public i3(Utilities.Callback callback, boolean[] zArr) {
        this.f21241b = callback;
        this.f21242c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f21240a) {
            case 0:
                boolean[] zArr = this.f21242c;
                if (!zArr[0]) {
                    this.f21241b.run(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
            default:
                Utilities.Callback callback = this.f21241b;
                if (callback != null && !this.f21242c[0]) {
                    callback.run(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public i3(boolean[] zArr, Utilities.Callback callback) {
        this.f21242c = zArr;
        this.f21241b = callback;
    }
}
