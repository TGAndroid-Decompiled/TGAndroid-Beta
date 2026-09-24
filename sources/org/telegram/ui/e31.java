package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class e31 implements Runnable {
    public final int f33239a;
    public final boolean[] f33240b;
    public final Utilities.Callback f33241c;

    public e31(int i10, Utilities.Callback callback, boolean[] zArr) {
        this.f33239a = i10;
        this.f33240b = zArr;
        this.f33241c = callback;
    }

    @Override
    public final void run() {
        Utilities.Callback callback;
        Utilities.Callback callback2;
        Utilities.Callback callback3;
        switch (this.f33239a) {
            case 0:
                boolean[] zArr = this.f33240b;
                if (!zArr[0] && (callback = this.f33241c) != null) {
                    zArr[0] = true;
                    callback.run(Boolean.TRUE);
                }
                AndroidUtilities.runOnUIThread(new l21(1), 220L);
                return;
            case 1:
                boolean[] zArr2 = this.f33240b;
                if (!zArr2[0] && (callback2 = this.f33241c) != null) {
                    zArr2[0] = true;
                    callback2.run(Boolean.FALSE);
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f33240b;
                if (!zArr3[0] && (callback3 = this.f33241c) != null) {
                    callback3.run("cancelled");
                    zArr3[0] = true;
                    return;
                }
                return;
        }
    }

    public e31(yh.t5 t5Var, boolean[] zArr, Utilities.Callback callback) {
        this.f33239a = 2;
        this.f33240b = zArr;
        this.f33241c = callback;
    }
}
