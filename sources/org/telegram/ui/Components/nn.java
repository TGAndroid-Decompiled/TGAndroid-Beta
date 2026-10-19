package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class nn implements Utilities.Callback {
    public final int f28819a;
    public final Utilities.Callback f28820b;

    public nn(int i10, Utilities.Callback callback) {
        this.f28819a = i10;
        this.f28820b = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f28819a) {
            case 0:
                this.f28820b.run(new sh.e((String) obj));
                return;
            default:
                int[] iArr = (int[]) obj;
                boolean z10 = false;
                if (iArr.length >= 1 && iArr[0] == 0) {
                    z10 = true;
                }
                this.f28820b.run(Boolean.valueOf(z10));
                return;
        }
    }
}
