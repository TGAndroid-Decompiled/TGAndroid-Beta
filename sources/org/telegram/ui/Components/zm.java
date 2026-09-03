package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class zm implements Utilities.Callback {
    public final int f31432a;
    public final Utilities.Callback f31433b;

    public zm(int i10, Utilities.Callback callback) {
        this.f31432a = i10;
        this.f31433b = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f31432a) {
            case 0:
                this.f31433b.run(new eh.e((String) obj));
                return;
            default:
                int[] iArr = (int[]) obj;
                boolean z4 = false;
                if (iArr.length >= 1 && iArr[0] == 0) {
                    z4 = true;
                }
                this.f31433b.run(Boolean.valueOf(z4));
                return;
        }
    }
}
