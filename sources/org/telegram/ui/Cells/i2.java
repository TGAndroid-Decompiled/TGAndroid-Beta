package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
public final class i2 implements Utilities.Callback {
    public final int f22954a;
    public final ViewGroup f22955b;

    public i2(ViewGroup viewGroup, int i10) {
        this.f22954a = i10;
        this.f22955b = viewGroup;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f22954a) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ((r2) this.f22955b).d0(true);
                return;
            default:
                Object[] objArr2 = (Object[]) obj;
                ((n4) this.f22955b).c(true);
                return;
        }
    }
}
