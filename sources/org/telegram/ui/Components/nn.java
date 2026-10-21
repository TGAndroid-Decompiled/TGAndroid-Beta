package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class nn implements Utilities.Callback {
    public final int f28851a;
    public final Utilities.Callback f28852b;

    public nn(int i10, Utilities.Callback callback) {
        this.f28851a = i10;
        this.f28852b = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f28851a) {
            case 0:
                this.f28852b.run(new sh.e((String) obj));
                return;
            default:
                int[] iArr = (int[]) obj;
                boolean z10 = false;
                if (iArr.length >= 1 && iArr[0] == 0) {
                    z10 = true;
                }
                this.f28852b.run(Boolean.valueOf(z10));
                return;
        }
    }
}
