package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class vn implements Utilities.Callback {
    public final int f31573a;
    public final Utilities.Callback f31574b;

    public vn(int i10, Utilities.Callback callback) {
        this.f31573a = i10;
        this.f31574b = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f31573a) {
            case 0:
                this.f31574b.run(new rh.e((String) obj));
                return;
            default:
                int[] iArr = (int[]) obj;
                boolean z10 = false;
                if (iArr.length >= 1 && iArr[0] == 0) {
                    z10 = true;
                }
                this.f31574b.run(Boolean.valueOf(z10));
                return;
        }
    }
}
