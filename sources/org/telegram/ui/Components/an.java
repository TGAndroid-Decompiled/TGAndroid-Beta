package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class an implements Utilities.Callback {
    public final int f23477a;
    public final Utilities.Callback f23478b;

    public an(int i10, Utilities.Callback callback) {
        this.f23477a = i10;
        this.f23478b = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f23477a) {
            case 0:
                this.f23478b.run(new eh.e((String) obj));
                return;
            default:
                int[] iArr = (int[]) obj;
                boolean z4 = false;
                if (iArr.length >= 1 && iArr[0] == 0) {
                    z4 = true;
                }
                this.f23478b.run(Boolean.valueOf(z4));
                return;
        }
    }
}
