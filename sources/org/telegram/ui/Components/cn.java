package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class cn implements Utilities.Callback {
    public final int f25060a;
    public final Utilities.Callback f25061b;

    public cn(int i10, Utilities.Callback callback) {
        this.f25060a = i10;
        this.f25061b = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f25060a) {
            case 0:
                this.f25061b.run(new sh.e((String) obj));
                return;
            default:
                int[] iArr = (int[]) obj;
                boolean z10 = false;
                if (iArr.length >= 1 && iArr[0] == 0) {
                    z10 = true;
                }
                this.f25061b.run(Boolean.valueOf(z10));
                return;
        }
    }
}
