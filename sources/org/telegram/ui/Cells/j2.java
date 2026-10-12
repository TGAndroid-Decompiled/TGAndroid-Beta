package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
public final class j2 implements Utilities.Callback {
    public final int f21365a;
    public final ViewGroup f21366b;

    public j2(ViewGroup viewGroup, int i10) {
        this.f21365a = i10;
        this.f21366b = viewGroup;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f21365a) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ((s2) this.f21366b).d0(true);
                return;
            default:
                Object[] objArr2 = (Object[]) obj;
                ((n4) this.f21366b).c(true);
                return;
        }
    }
}
