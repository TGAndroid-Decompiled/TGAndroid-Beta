package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class ln implements Utilities.Callback {
    public final int f28421a;
    public final Utilities.Callback f28422b;

    public ln(int i10, Utilities.Callback callback) {
        this.f28421a = i10;
        this.f28422b = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f28421a) {
            case 0:
                this.f28422b.run(new sh.e((String) obj));
                return;
            default:
                int[] iArr = (int[]) obj;
                boolean z10 = false;
                if (iArr.length >= 1 && iArr[0] == 0) {
                    z10 = true;
                }
                this.f28422b.run(Boolean.valueOf(z10));
                return;
        }
    }
}
