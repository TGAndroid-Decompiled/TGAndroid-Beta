package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class bn implements Utilities.Callback {
    public final int f25664a;
    public final Utilities.Callback f25665b;

    public bn(int i10, Utilities.Callback callback) {
        this.f25664a = i10;
        this.f25665b = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f25664a) {
            case 0:
                this.f25665b.run(new fh.e((String) obj));
                return;
            default:
                int[] iArr = (int[]) obj;
                boolean z4 = false;
                if (iArr.length >= 1 && iArr[0] == 0) {
                    z4 = true;
                }
                this.f25665b.run(Boolean.valueOf(z4));
                return;
        }
    }
}
