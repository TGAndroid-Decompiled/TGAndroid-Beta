package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class m31 implements Runnable {
    public final int f35514a;
    public final boolean[] f35515b;
    public final Utilities.Callback f35516c;

    public m31(yh.t5 t5Var, boolean[] zArr, Utilities.Callback callback) {
        this.f35514a = 2;
        this.f35515b = zArr;
        this.f35516c = callback;
    }

    @Override
    public final void run() {
        Utilities.Callback callback;
        Utilities.Callback callback2;
        Utilities.Callback callback3;
        switch (this.f35514a) {
            case 0:
                boolean[] zArr = this.f35515b;
                if (!zArr[0] && (callback = this.f35516c) != null) {
                    zArr[0] = true;
                    callback.run(Boolean.TRUE);
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.sh(29), 220L);
                return;
            case 1:
                boolean[] zArr2 = this.f35515b;
                if (!zArr2[0] && (callback2 = this.f35516c) != null) {
                    zArr2[0] = true;
                    callback2.run(Boolean.FALSE);
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f35515b;
                if (!zArr3[0] && (callback3 = this.f35516c) != null) {
                    callback3.run("cancelled");
                    zArr3[0] = true;
                    return;
                }
                return;
        }
    }

    public m31(boolean[] zArr, Utilities.Callback callback, int i10) {
        this.f35514a = i10;
        this.f35515b = zArr;
        this.f35516c = callback;
    }
}
