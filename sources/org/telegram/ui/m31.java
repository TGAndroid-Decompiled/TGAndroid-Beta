package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class m31 implements Runnable {
    public final int f39763a;
    public final boolean[] f39764b;
    public final Utilities.Callback f39765c;

    public m31(int i10, Utilities.Callback callback, boolean[] zArr) {
        this.f39763a = i10;
        this.f39764b = zArr;
        this.f39765c = callback;
    }

    @Override
    public final void run() {
        Utilities.Callback callback;
        Utilities.Callback callback2;
        Utilities.Callback callback3;
        switch (this.f39763a) {
            case 0:
                boolean[] zArr = this.f39764b;
                if (!zArr[0] && (callback = this.f39765c) != null) {
                    zArr[0] = true;
                    callback.run(Boolean.TRUE);
                }
                AndroidUtilities.runOnUIThread(new t21(1), 220L);
                return;
            case 1:
                boolean[] zArr2 = this.f39764b;
                if (!zArr2[0] && (callback2 = this.f39765c) != null) {
                    zArr2[0] = true;
                    callback2.run(Boolean.FALSE);
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f39764b;
                if (!zArr3[0] && (callback3 = this.f39765c) != null) {
                    callback3.run("cancelled");
                    zArr3[0] = true;
                    return;
                }
                return;
        }
    }

    public m31(yh.m5 m5Var, boolean[] zArr, Utilities.Callback callback) {
        this.f39763a = 2;
        this.f39764b = zArr;
        this.f39765c = callback;
    }
}
