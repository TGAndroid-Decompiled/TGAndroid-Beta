package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class i3 implements DialogInterface.OnDismissListener {
    public final int f19478a = 1;
    public final Utilities.Callback f19479b;
    public final boolean[] f19480c;

    public i3(Utilities.Callback callback, boolean[] zArr) {
        this.f19479b = callback;
        this.f19480c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f19478a) {
            case 0:
                boolean[] zArr = this.f19480c;
                if (!zArr[0]) {
                    this.f19479b.run(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
            default:
                Utilities.Callback callback = this.f19479b;
                if (callback != null && !this.f19480c[0]) {
                    callback.run(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public i3(boolean[] zArr, Utilities.Callback callback) {
        this.f19480c = zArr;
        this.f19479b = callback;
    }
}
