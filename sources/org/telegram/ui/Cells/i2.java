package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
public final class i2 implements Utilities.Callback {
    public final int f20174a;
    public final ViewGroup f20175b;

    public i2(ViewGroup viewGroup, int i10) {
        this.f20174a = i10;
        this.f20175b = viewGroup;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f20174a) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ((r2) this.f20175b).d0(true);
                return;
            default:
                Object[] objArr2 = (Object[]) obj;
                ((n4) this.f20175b).c(true);
                return;
        }
    }
}
