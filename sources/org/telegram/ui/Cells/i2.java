package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
public final class i2 implements Utilities.Callback {
    public final int f20226a;
    public final ViewGroup f20227b;

    public i2(ViewGroup viewGroup, int i10) {
        this.f20226a = i10;
        this.f20227b = viewGroup;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f20226a) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ((r2) this.f20227b).d0(true);
                return;
            default:
                Object[] objArr2 = (Object[]) obj;
                ((m4) this.f20227b).c(true);
                return;
        }
    }
}
