package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class on implements Utilities.Callback {
    public final int f31347a;
    public final Utilities.Callback f31348b;

    public on(int i10, Utilities.Callback callback) {
        this.f31347a = i10;
        this.f31348b = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f31347a) {
            case 0:
                this.f31348b.run(new th.e((String) obj));
                return;
            default:
                int[] iArr = (int[]) obj;
                boolean z10 = false;
                if (iArr.length >= 1 && iArr[0] == 0) {
                    z10 = true;
                }
                this.f31348b.run(Boolean.valueOf(z10));
                return;
        }
    }
}
