package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class o31 implements Runnable {
    public final int f39125a;
    public final boolean[] f39126b;
    public final Utilities.Callback f39127c;

    public o31(zh.s5 s5Var, boolean[] zArr, Utilities.Callback callback) {
        this.f39125a = 2;
        this.f39126b = zArr;
        this.f39127c = callback;
    }

    @Override
    public final void run() {
        Utilities.Callback callback;
        Utilities.Callback callback2;
        Utilities.Callback callback3;
        switch (this.f39125a) {
            case 0:
                boolean[] zArr = this.f39126b;
                if (!zArr[0] && (callback = this.f39127c) != null) {
                    zArr[0] = true;
                    callback.run(Boolean.TRUE);
                }
                AndroidUtilities.runOnUIThread(new q31(0), 220L);
                return;
            case 1:
                boolean[] zArr2 = this.f39126b;
                if (!zArr2[0] && (callback2 = this.f39127c) != null) {
                    zArr2[0] = true;
                    callback2.run(Boolean.FALSE);
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f39126b;
                if (!zArr3[0] && (callback3 = this.f39127c) != null) {
                    callback3.run("cancelled");
                    zArr3[0] = true;
                    return;
                }
                return;
        }
    }

    public o31(boolean[] zArr, Utilities.Callback callback, int i10) {
        this.f39125a = i10;
        this.f39126b = zArr;
        this.f39127c = callback;
    }
}
