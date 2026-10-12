package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class o31 implements Runnable {
    public final int f40554a;
    public final boolean[] f40555b;
    public final Utilities.Callback f40556c;

    public o31(int i10, Utilities.Callback callback, boolean[] zArr) {
        this.f40554a = i10;
        this.f40555b = zArr;
        this.f40556c = callback;
    }

    @Override
    public final void run() {
        Utilities.Callback callback;
        Utilities.Callback callback2;
        Utilities.Callback callback3;
        switch (this.f40554a) {
            case 0:
                boolean[] zArr = this.f40555b;
                if (!zArr[0] && (callback = this.f40556c) != null) {
                    zArr[0] = true;
                    callback.run(Boolean.TRUE);
                }
                AndroidUtilities.runOnUIThread(new w21(1), 220L);
                return;
            case 1:
                boolean[] zArr2 = this.f40555b;
                if (!zArr2[0] && (callback2 = this.f40556c) != null) {
                    zArr2[0] = true;
                    callback2.run(Boolean.FALSE);
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f40555b;
                if (!zArr3[0] && (callback3 = this.f40556c) != null) {
                    callback3.run("cancelled");
                    zArr3[0] = true;
                    return;
                }
                return;
        }
    }

    public o31(yh.n5 n5Var, boolean[] zArr, Utilities.Callback callback) {
        this.f40554a = 2;
        this.f40555b = zArr;
        this.f40556c = callback;
    }
}
