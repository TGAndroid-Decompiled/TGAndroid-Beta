package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
public final class i2 implements Utilities.Callback {
    public final int f19290a;
    public final ViewGroup f19291b;

    public i2(ViewGroup viewGroup, int i10) {
        this.f19290a = i10;
        this.f19291b = viewGroup;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f19290a) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ((r2) this.f19291b).d0(true);
                return;
            default:
                Object[] objArr2 = (Object[]) obj;
                ((n4) this.f19291b).c(true);
                return;
        }
    }
}
