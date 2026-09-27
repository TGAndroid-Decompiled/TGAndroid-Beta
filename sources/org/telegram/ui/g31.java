package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class g31 implements Runnable {
    public final int f33714a;
    public final boolean[] f33715b;
    public final Utilities.Callback f33716c;

    public g31(int i10, Utilities.Callback callback, boolean[] zArr) {
        this.f33714a = i10;
        this.f33715b = zArr;
        this.f33716c = callback;
    }

    @Override
    public final void run() {
        Utilities.Callback callback;
        Utilities.Callback callback2;
        Utilities.Callback callback3;
        switch (this.f33714a) {
            case 0:
                boolean[] zArr = this.f33715b;
                if (!zArr[0] && (callback = this.f33716c) != null) {
                    zArr[0] = true;
                    callback.run(Boolean.TRUE);
                }
                AndroidUtilities.runOnUIThread(new n21(1), 220L);
                return;
            case 1:
                boolean[] zArr2 = this.f33715b;
                if (!zArr2[0] && (callback2 = this.f33716c) != null) {
                    zArr2[0] = true;
                    callback2.run(Boolean.FALSE);
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f33715b;
                if (!zArr3[0] && (callback3 = this.f33716c) != null) {
                    callback3.run("cancelled");
                    zArr3[0] = true;
                    return;
                }
                return;
        }
    }

    public g31(yh.s5 s5Var, boolean[] zArr, Utilities.Callback callback) {
        this.f33714a = 2;
        this.f33715b = zArr;
        this.f33716c = callback;
    }
}
