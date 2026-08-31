package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class cn implements Utilities.Callback {
    public final int f26056a;
    public final Utilities.Callback f26057b;

    public cn(int i10, Utilities.Callback callback) {
        this.f26056a = i10;
        this.f26057b = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f26056a) {
            case 0:
                this.f26057b.run(new fh.e((String) obj));
                return;
            default:
                int[] iArr = (int[]) obj;
                boolean z4 = false;
                if (iArr.length >= 1 && iArr[0] == 0) {
                    z4 = true;
                }
                this.f26057b.run(Boolean.valueOf(z4));
                return;
        }
    }
}
