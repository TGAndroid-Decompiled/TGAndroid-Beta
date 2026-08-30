package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
public final class i2 implements Utilities.Callback {
    public final int f21196a;
    public final ViewGroup f21197b;

    public i2(ViewGroup viewGroup, int i10) {
        this.f21196a = i10;
        this.f21197b = viewGroup;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f21196a) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ((r2) this.f21197b).d0(true);
                return;
            default:
                Object[] objArr2 = (Object[]) obj;
                ((n4) this.f21197b).c(true);
                return;
        }
    }
}
