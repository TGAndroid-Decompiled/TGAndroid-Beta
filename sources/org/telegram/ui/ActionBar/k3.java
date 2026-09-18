package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class k3 implements DialogInterface.OnDismissListener {
    public final int f19533a = 1;
    public final Utilities.Callback f19534b;
    public final boolean[] f19535c;

    public k3(Utilities.Callback callback, boolean[] zArr) {
        this.f19534b = callback;
        this.f19535c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f19533a) {
            case 0:
                boolean[] zArr = this.f19535c;
                if (!zArr[0]) {
                    this.f19534b.run(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
            default:
                Utilities.Callback callback = this.f19534b;
                if (callback != null && !this.f19535c[0]) {
                    callback.run(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public k3(boolean[] zArr, Utilities.Callback callback) {
        this.f19535c = zArr;
        this.f19534b = callback;
    }
}
