package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class l31 implements Runnable {
    public final int f39508a;
    public final boolean[] f39509b;
    public final Utilities.Callback f39510c;

    public l31(int i10, Utilities.Callback callback, boolean[] zArr) {
        this.f39508a = i10;
        this.f39509b = zArr;
        this.f39510c = callback;
    }

    @Override
    public final void run() {
        Utilities.Callback callback;
        Utilities.Callback callback2;
        Utilities.Callback callback3;
        switch (this.f39508a) {
            case 0:
                boolean[] zArr = this.f39509b;
                if (!zArr[0] && (callback = this.f39510c) != null) {
                    zArr[0] = true;
                    callback.run(Boolean.TRUE);
                }
                AndroidUtilities.runOnUIThread(new s21(1), 220L);
                return;
            case 1:
                boolean[] zArr2 = this.f39509b;
                if (!zArr2[0] && (callback2 = this.f39510c) != null) {
                    zArr2[0] = true;
                    callback2.run(Boolean.FALSE);
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f39509b;
                if (!zArr3[0] && (callback3 = this.f39510c) != null) {
                    callback3.run("cancelled");
                    zArr3[0] = true;
                    return;
                }
                return;
        }
    }

    public l31(yh.n5 n5Var, boolean[] zArr, Utilities.Callback callback) {
        this.f39508a = 2;
        this.f39509b = zArr;
        this.f39510c = callback;
    }
}
