package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
public final class j2 implements Utilities.Callback {
    public final int f22457a;
    public final ViewGroup f22458b;

    public j2(ViewGroup viewGroup, int i10) {
        this.f22457a = i10;
        this.f22458b = viewGroup;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f22457a) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ((r2) this.f22458b).d0(true);
                return;
            default:
                Object[] objArr2 = (Object[]) obj;
                ((m4) this.f22458b).c(true);
                return;
        }
    }
}
