package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class jn implements Utilities.Callback {
    public final int f24448a;
    public final Utilities.Callback f24449b;

    public jn(int i10, Utilities.Callback callback) {
        this.f24448a = i10;
        this.f24449b = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f24448a) {
            case 0:
                this.f24449b.run(new qh.e((String) obj));
                return;
            default:
                int[] iArr = (int[]) obj;
                boolean z10 = false;
                if (iArr.length >= 1 && iArr[0] == 0) {
                    z10 = true;
                }
                this.f24449b.run(Boolean.valueOf(z10));
                return;
        }
    }
}
