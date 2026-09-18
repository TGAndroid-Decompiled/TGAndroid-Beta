package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class o31 implements Runnable {
    public final int f36226a;
    public final boolean[] f36227b;
    public final Utilities.Callback f36228c;

    public o31(yh.v5 v5Var, boolean[] zArr, Utilities.Callback callback) {
        this.f36226a = 2;
        this.f36227b = zArr;
        this.f36228c = callback;
    }

    @Override
    public final void run() {
        Utilities.Callback callback;
        Utilities.Callback callback2;
        Utilities.Callback callback3;
        switch (this.f36226a) {
            case 0:
                boolean[] zArr = this.f36227b;
                if (!zArr[0] && (callback = this.f36228c) != null) {
                    zArr[0] = true;
                    callback.run(Boolean.TRUE);
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.sh(29), 220L);
                return;
            case 1:
                boolean[] zArr2 = this.f36227b;
                if (!zArr2[0] && (callback2 = this.f36228c) != null) {
                    zArr2[0] = true;
                    callback2.run(Boolean.FALSE);
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f36227b;
                if (!zArr3[0] && (callback3 = this.f36228c) != null) {
                    callback3.run("cancelled");
                    zArr3[0] = true;
                    return;
                }
                return;
        }
    }

    public o31(boolean[] zArr, Utilities.Callback callback, int i10) {
        this.f36226a = i10;
        this.f36227b = zArr;
        this.f36228c = callback;
    }
}
