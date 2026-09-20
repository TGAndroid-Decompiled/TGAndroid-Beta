package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import org.telegram.messenger.Utilities;
public final class k3 implements DialogInterface.OnDismissListener {
    public final int f19565a = 1;
    public final Utilities.Callback f19566b;
    public final boolean[] f19567c;

    public k3(Utilities.Callback callback, boolean[] zArr) {
        this.f19566b = callback;
        this.f19567c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f19565a) {
            case 0:
                boolean[] zArr = this.f19567c;
                if (!zArr[0]) {
                    this.f19566b.run(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
            default:
                Utilities.Callback callback = this.f19566b;
                if (callback != null && !this.f19567c[0]) {
                    callback.run(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public k3(boolean[] zArr, Utilities.Callback callback) {
        this.f19567c = zArr;
        this.f19566b = callback;
    }
}
