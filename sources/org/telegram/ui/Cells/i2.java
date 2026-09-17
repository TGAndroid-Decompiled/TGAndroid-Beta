package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
public final class i2 implements Utilities.Callback {
    public final int f22072a;
    public final ViewGroup f22073b;

    public i2(ViewGroup viewGroup, int i10) {
        this.f22072a = i10;
        this.f22073b = viewGroup;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f22072a) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ((r2) this.f22073b).d0(true);
                return;
            default:
                Object[] objArr2 = (Object[]) obj;
                ((m4) this.f22073b).c(true);
                return;
        }
    }
}
