package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class gn implements Utilities.Callback {
    public final int f24642a;
    public final Utilities.Callback f24643b;

    public gn(int i10, Utilities.Callback callback) {
        this.f24642a = i10;
        this.f24643b = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f24642a) {
            case 0:
                this.f24643b.run(new rh.e((String) obj));
                return;
            default:
                int[] iArr = (int[]) obj;
                boolean z10 = false;
                if (iArr.length >= 1 && iArr[0] == 0) {
                    z10 = true;
                }
                this.f24643b.run(Boolean.valueOf(z10));
                return;
        }
    }
}
