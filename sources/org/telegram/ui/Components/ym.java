package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class ym implements Utilities.Callback {
    public final int f35101a;
    public final Utilities.Callback f35102b;

    public ym(int i10, Utilities.Callback callback) {
        this.f35101a = i10;
        this.f35102b = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35101a) {
            case 0:
                this.f35102b.run(new ch.e((String) obj));
                return;
            default:
                int[] iArr = (int[]) obj;
                boolean z10 = false;
                if (iArr.length >= 1 && iArr[0] == 0) {
                    z10 = true;
                }
                this.f35102b.run(Boolean.valueOf(z10));
                return;
        }
    }
}
