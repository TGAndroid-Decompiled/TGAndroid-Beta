package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class qn implements Utilities.Callback {
    public final int f28334a;
    public final Utilities.Callback f28335b;

    public qn(int i10, Utilities.Callback callback) {
        this.f28334a = i10;
        this.f28335b = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f28334a) {
            case 0:
                this.f28335b.run(new sh.e((String) obj));
                return;
            default:
                int[] iArr = (int[]) obj;
                boolean z10 = false;
                if (iArr.length >= 1 && iArr[0] == 0) {
                    z10 = true;
                }
                this.f28335b.run(Boolean.valueOf(z10));
                return;
        }
    }
}
