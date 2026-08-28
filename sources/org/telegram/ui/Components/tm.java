package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class tm implements Utilities.Callback {
    public final int f32722a;
    public final Utilities.Callback f32723b;

    public tm(int i9, Utilities.Callback callback) {
        this.f32722a = i9;
        this.f32723b = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f32722a) {
            case 0:
                this.f32723b.run(new zg.e((String) obj));
                return;
            default:
                int[] iArr = (int[]) obj;
                boolean z10 = false;
                if (iArr.length >= 1 && iArr[0] == 0) {
                    z10 = true;
                }
                this.f32723b.run(Boolean.valueOf(z10));
                return;
        }
    }
}
