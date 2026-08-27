package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

public final class rm implements Utilities.Callback {

    public final int f32205a;

    public final Utilities.Callback f32206b;

    public rm(int i10, Utilities.Callback callback) {
        this.f32205a = i10;
        this.f32206b = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f32205a) {
            case 0:
                this.f32206b.run(new ah.e((String) obj));
                break;
            default:
                int[] iArr = (int[]) obj;
                boolean z10 = false;
                if (iArr.length >= 1 && iArr[0] == 0) {
                    z10 = true;
                }
                this.f32206b.run(Boolean.valueOf(z10));
                break;
        }
    }
}
