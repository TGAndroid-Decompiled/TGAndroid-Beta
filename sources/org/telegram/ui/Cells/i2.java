package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
public final class i2 implements Utilities.Callback {
    public final int f22099a;
    public final ViewGroup f22100b;

    public i2(ViewGroup viewGroup, int i10) {
        this.f22099a = i10;
        this.f22100b = viewGroup;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f22099a) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ((r2) this.f22100b).d0(true);
                return;
            default:
                Object[] objArr2 = (Object[]) obj;
                ((m4) this.f22100b).c(true);
                return;
        }
    }
}
