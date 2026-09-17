package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
public final class i2 implements Utilities.Callback {
    public final int f20236a;
    public final ViewGroup f20237b;

    public i2(ViewGroup viewGroup, int i10) {
        this.f20236a = i10;
        this.f20237b = viewGroup;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f20236a) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ((r2) this.f20237b).d0(true);
                return;
            default:
                Object[] objArr2 = (Object[]) obj;
                ((m4) this.f20237b).c(true);
                return;
        }
    }
}
