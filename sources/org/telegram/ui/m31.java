package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class m31 implements Runnable {
    public final int f39761a;
    public final boolean[] f39762b;
    public final Utilities.Callback f39763c;

    public m31(int i10, Utilities.Callback callback, boolean[] zArr) {
        this.f39761a = i10;
        this.f39762b = zArr;
        this.f39763c = callback;
    }

    @Override
    public final void run() {
        Utilities.Callback callback;
        Utilities.Callback callback2;
        Utilities.Callback callback3;
        switch (this.f39761a) {
            case 0:
                boolean[] zArr = this.f39762b;
                if (!zArr[0] && (callback = this.f39763c) != null) {
                    zArr[0] = true;
                    callback.run(Boolean.TRUE);
                }
                AndroidUtilities.runOnUIThread(new t21(1), 220L);
                return;
            case 1:
                boolean[] zArr2 = this.f39762b;
                if (!zArr2[0] && (callback2 = this.f39763c) != null) {
                    zArr2[0] = true;
                    callback2.run(Boolean.FALSE);
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f39762b;
                if (!zArr3[0] && (callback3 = this.f39763c) != null) {
                    callback3.run("cancelled");
                    zArr3[0] = true;
                    return;
                }
                return;
        }
    }

    public m31(yh.m5 m5Var, boolean[] zArr, Utilities.Callback callback) {
        this.f39761a = 2;
        this.f39762b = zArr;
        this.f39763c = callback;
    }
}
