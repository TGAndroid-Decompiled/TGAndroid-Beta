package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class e31 implements Runnable {
    public final int f35937a;
    public final boolean[] f35938b;
    public final Utilities.Callback f35939c;

    public e31(int i10, Utilities.Callback callback, boolean[] zArr) {
        this.f35937a = i10;
        this.f35938b = zArr;
        this.f35939c = callback;
    }

    @Override
    public final void run() {
        Utilities.Callback callback;
        Utilities.Callback callback2;
        Utilities.Callback callback3;
        switch (this.f35937a) {
            case 0:
                boolean[] zArr = this.f35938b;
                if (!zArr[0] && (callback = this.f35939c) != null) {
                    zArr[0] = true;
                    callback.run(Boolean.TRUE);
                }
                AndroidUtilities.runOnUIThread(new n21(1), 220L);
                return;
            case 1:
                boolean[] zArr2 = this.f35938b;
                if (!zArr2[0] && (callback2 = this.f35939c) != null) {
                    zArr2[0] = true;
                    callback2.run(Boolean.FALSE);
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f35938b;
                if (!zArr3[0] && (callback3 = this.f35939c) != null) {
                    callback3.run("cancelled");
                    zArr3[0] = true;
                    return;
                }
                return;
        }
    }

    public e31(yh.u5 u5Var, boolean[] zArr, Utilities.Callback callback) {
        this.f35937a = 2;
        this.f35938b = zArr;
        this.f35939c = callback;
    }
}
