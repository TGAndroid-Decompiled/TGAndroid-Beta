package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
public final class i2 implements Utilities.Callback {
    public final int f20187a;
    public final ViewGroup f20188b;

    public i2(ViewGroup viewGroup, int i10) {
        this.f20187a = i10;
        this.f20188b = viewGroup;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f20187a) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ((r2) this.f20188b).d0(true);
                return;
            default:
                Object[] objArr2 = (Object[]) obj;
                ((n4) this.f20188b).c(true);
                return;
        }
    }
}
