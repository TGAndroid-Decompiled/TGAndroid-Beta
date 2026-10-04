package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class gn implements Utilities.Callback {
    public final int f26894a;
    public final Utilities.Callback f26895b;

    public gn(int i10, Utilities.Callback callback) {
        this.f26894a = i10;
        this.f26895b = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f26894a) {
            case 0:
                this.f26895b.run(new rh.e((String) obj));
                return;
            default:
                int[] iArr = (int[]) obj;
                boolean z10 = false;
                if (iArr.length >= 1 && iArr[0] == 0) {
                    z10 = true;
                }
                this.f26895b.run(Boolean.valueOf(z10));
                return;
        }
    }
}
