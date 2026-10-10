package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class tn implements Utilities.Callback {
    public final int f31184a;
    public final Utilities.Callback f31185b;

    public tn(int i10, Utilities.Callback callback) {
        this.f31184a = i10;
        this.f31185b = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f31184a) {
            case 0:
                this.f31185b.run(new rh.e((String) obj));
                return;
            default:
                int[] iArr = (int[]) obj;
                boolean z10 = false;
                if (iArr.length >= 1 && iArr[0] == 0) {
                    z10 = true;
                }
                this.f31185b.run(Boolean.valueOf(z10));
                return;
        }
    }
}
