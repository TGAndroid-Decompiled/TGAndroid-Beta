package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class n31 implements Runnable {
    public final int f35887a;
    public final boolean[] f35888b;
    public final Utilities.Callback f35889c;

    public n31(yh.u5 u5Var, boolean[] zArr, Utilities.Callback callback) {
        this.f35887a = 2;
        this.f35888b = zArr;
        this.f35889c = callback;
    }

    @Override
    public final void run() {
        Utilities.Callback callback;
        Utilities.Callback callback2;
        Utilities.Callback callback3;
        switch (this.f35887a) {
            case 0:
                boolean[] zArr = this.f35888b;
                if (!zArr[0] && (callback = this.f35889c) != null) {
                    zArr[0] = true;
                    callback.run(Boolean.TRUE);
                }
                AndroidUtilities.runOnUIThread(new u21(1), 220L);
                return;
            case 1:
                boolean[] zArr2 = this.f35888b;
                if (!zArr2[0] && (callback2 = this.f35889c) != null) {
                    zArr2[0] = true;
                    callback2.run(Boolean.FALSE);
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f35888b;
                if (!zArr3[0] && (callback3 = this.f35889c) != null) {
                    callback3.run("cancelled");
                    zArr3[0] = true;
                    return;
                }
                return;
        }
    }

    public n31(boolean[] zArr, Utilities.Callback callback, int i10) {
        this.f35887a = i10;
        this.f35888b = zArr;
        this.f35889c = callback;
    }
}
