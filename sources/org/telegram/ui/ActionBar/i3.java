package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class i3 implements DialogInterface.OnDismissListener {
    public final int f21204a = 1;
    public final Utilities.Callback f21205b;
    public final boolean[] f21206c;

    public i3(Utilities.Callback callback, boolean[] zArr) {
        this.f21205b = callback;
        this.f21206c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f21204a) {
            case 0:
                boolean[] zArr = this.f21206c;
                if (!zArr[0]) {
                    this.f21205b.run(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
            default:
                Utilities.Callback callback = this.f21205b;
                if (callback != null && !this.f21206c[0]) {
                    callback.run(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public i3(boolean[] zArr, Utilities.Callback callback) {
        this.f21206c = zArr;
        this.f21205b = callback;
    }
}
