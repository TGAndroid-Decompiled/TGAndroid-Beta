package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class m31 implements Runnable {
    public final int f39807a;
    public final boolean[] f39808b;
    public final Utilities.Callback f39809c;

    public m31(int i10, Utilities.Callback callback, boolean[] zArr) {
        this.f39807a = i10;
        this.f39808b = zArr;
        this.f39809c = callback;
    }

    @Override
    public final void run() {
        Utilities.Callback callback;
        Utilities.Callback callback2;
        Utilities.Callback callback3;
        switch (this.f39807a) {
            case 0:
                boolean[] zArr = this.f39808b;
                if (!zArr[0] && (callback = this.f39809c) != null) {
                    zArr[0] = true;
                    callback.run(Boolean.TRUE);
                }
                AndroidUtilities.runOnUIThread(new t21(1), 220L);
                return;
            case 1:
                boolean[] zArr2 = this.f39808b;
                if (!zArr2[0] && (callback2 = this.f39809c) != null) {
                    zArr2[0] = true;
                    callback2.run(Boolean.FALSE);
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f39808b;
                if (!zArr3[0] && (callback3 = this.f39809c) != null) {
                    callback3.run("cancelled");
                    zArr3[0] = true;
                    return;
                }
                return;
        }
    }

    public m31(yh.m5 m5Var, boolean[] zArr, Utilities.Callback callback) {
        this.f39807a = 2;
        this.f39808b = zArr;
        this.f39809c = callback;
    }
}
