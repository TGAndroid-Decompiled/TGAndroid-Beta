package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class g31 implements Runnable {
    public final int f36482a;
    public final boolean[] f36483b;
    public final Utilities.Callback f36484c;

    public g31(int i10, Utilities.Callback callback, boolean[] zArr) {
        this.f36482a = i10;
        this.f36483b = zArr;
        this.f36484c = callback;
    }

    @Override
    public final void run() {
        Utilities.Callback callback;
        Utilities.Callback callback2;
        Utilities.Callback callback3;
        switch (this.f36482a) {
            case 0:
                boolean[] zArr = this.f36483b;
                if (!zArr[0] && (callback = this.f36484c) != null) {
                    zArr[0] = true;
                    callback.run(Boolean.TRUE);
                }
                AndroidUtilities.runOnUIThread(new n21(1), 220L);
                return;
            case 1:
                boolean[] zArr2 = this.f36483b;
                if (!zArr2[0] && (callback2 = this.f36484c) != null) {
                    zArr2[0] = true;
                    callback2.run(Boolean.FALSE);
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f36483b;
                if (!zArr3[0] && (callback3 = this.f36484c) != null) {
                    callback3.run("cancelled");
                    zArr3[0] = true;
                    return;
                }
                return;
        }
    }

    public g31(yh.t5 t5Var, boolean[] zArr, Utilities.Callback callback) {
        this.f36482a = 2;
        this.f36483b = zArr;
        this.f36484c = callback;
    }
}
