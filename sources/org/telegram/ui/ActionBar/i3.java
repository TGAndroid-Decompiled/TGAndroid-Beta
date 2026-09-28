package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class i3 implements DialogInterface.OnDismissListener {
    public final int f19477a = 1;
    public final Utilities.Callback f19478b;
    public final boolean[] f19479c;

    public i3(Utilities.Callback callback, boolean[] zArr) {
        this.f19478b = callback;
        this.f19479c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f19477a) {
            case 0:
                boolean[] zArr = this.f19479c;
                if (!zArr[0]) {
                    this.f19478b.run(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
            default:
                Utilities.Callback callback = this.f19478b;
                if (callback != null && !this.f19479c[0]) {
                    callback.run(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public i3(boolean[] zArr, Utilities.Callback callback) {
        this.f19479c = zArr;
        this.f19478b = callback;
    }
}
