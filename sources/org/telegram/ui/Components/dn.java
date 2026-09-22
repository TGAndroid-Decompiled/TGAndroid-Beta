package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class dn implements Utilities.Callback {
    public final int f23364a;
    public final Utilities.Callback f23365b;

    public dn(int i10, Utilities.Callback callback) {
        this.f23364a = i10;
        this.f23365b = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f23364a) {
            case 0:
                this.f23365b.run(new rh.e((String) obj));
                return;
            default:
                int[] iArr = (int[]) obj;
                boolean z10 = false;
                if (iArr.length >= 1 && iArr[0] == 0) {
                    z10 = true;
                }
                this.f23365b.run(Boolean.valueOf(z10));
                return;
        }
    }
}
