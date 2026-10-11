package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class tn implements Utilities.Callback {
    public final int f31303a;
    public final Utilities.Callback f31304b;

    public tn(int i10, Utilities.Callback callback) {
        this.f31303a = i10;
        this.f31304b = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f31303a) {
            case 0:
                this.f31304b.run(new rh.e((String) obj));
                return;
            default:
                int[] iArr = (int[]) obj;
                boolean z10 = false;
                if (iArr.length >= 1 && iArr[0] == 0) {
                    z10 = true;
                }
                this.f31304b.run(Boolean.valueOf(z10));
                return;
        }
    }
}
