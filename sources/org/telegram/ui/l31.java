package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class l31 implements Runnable {
    public final int f39542a;
    public final boolean[] f39543b;
    public final Utilities.Callback f39544c;

    public l31(int i10, Utilities.Callback callback, boolean[] zArr) {
        this.f39542a = i10;
        this.f39543b = zArr;
        this.f39544c = callback;
    }

    @Override
    public final void run() {
        Utilities.Callback callback;
        Utilities.Callback callback2;
        Utilities.Callback callback3;
        switch (this.f39542a) {
            case 0:
                boolean[] zArr = this.f39543b;
                if (!zArr[0] && (callback = this.f39544c) != null) {
                    zArr[0] = true;
                    callback.run(Boolean.TRUE);
                }
                AndroidUtilities.runOnUIThread(new s21(1), 220L);
                return;
            case 1:
                boolean[] zArr2 = this.f39543b;
                if (!zArr2[0] && (callback2 = this.f39544c) != null) {
                    zArr2[0] = true;
                    callback2.run(Boolean.FALSE);
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f39543b;
                if (!zArr3[0] && (callback3 = this.f39544c) != null) {
                    callback3.run("cancelled");
                    zArr3[0] = true;
                    return;
                }
                return;
        }
    }

    public l31(yh.n5 n5Var, boolean[] zArr, Utilities.Callback callback) {
        this.f39542a = 2;
        this.f39543b = zArr;
        this.f39544c = callback;
    }
}
