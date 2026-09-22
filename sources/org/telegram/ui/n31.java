package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class n31 implements Runnable {
    public final int f35908a;
    public final boolean[] f35909b;
    public final Utilities.Callback f35910c;

    public n31(yh.u5 u5Var, boolean[] zArr, Utilities.Callback callback) {
        this.f35908a = 2;
        this.f35909b = zArr;
        this.f35910c = callback;
    }

    @Override
    public final void run() {
        Utilities.Callback callback;
        Utilities.Callback callback2;
        Utilities.Callback callback3;
        switch (this.f35908a) {
            case 0:
                boolean[] zArr = this.f35909b;
                if (!zArr[0] && (callback = this.f35910c) != null) {
                    zArr[0] = true;
                    callback.run(Boolean.TRUE);
                }
                AndroidUtilities.runOnUIThread(new u21(1), 220L);
                return;
            case 1:
                boolean[] zArr2 = this.f35909b;
                if (!zArr2[0] && (callback2 = this.f35910c) != null) {
                    zArr2[0] = true;
                    callback2.run(Boolean.FALSE);
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f35909b;
                if (!zArr3[0] && (callback3 = this.f35910c) != null) {
                    callback3.run("cancelled");
                    zArr3[0] = true;
                    return;
                }
                return;
        }
    }

    public n31(boolean[] zArr, Utilities.Callback callback, int i10) {
        this.f35908a = i10;
        this.f35909b = zArr;
        this.f35910c = callback;
    }
}
