package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class qn implements Utilities.Callback {
    public final int f28651a;
    public final Utilities.Callback f28652b;

    public qn(int i10, Utilities.Callback callback) {
        this.f28651a = i10;
        this.f28652b = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f28651a) {
            case 0:
                this.f28652b.run(new sh.e((String) obj));
                return;
            default:
                int[] iArr = (int[]) obj;
                boolean z10 = false;
                if (iArr.length >= 1 && iArr[0] == 0) {
                    z10 = true;
                }
                this.f28652b.run(Boolean.valueOf(z10));
                return;
        }
    }
}
