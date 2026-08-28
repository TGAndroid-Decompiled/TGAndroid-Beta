package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
public final class i2 implements Utilities.Callback {
    public final int f24498a;
    public final ViewGroup f24499b;

    public i2(ViewGroup viewGroup, int i9) {
        this.f24498a = i9;
        this.f24499b = viewGroup;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f24498a) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ((r2) this.f24499b).c0(true);
                return;
            default:
                Object[] objArr2 = (Object[]) obj;
                ((n4) this.f24499b).c(true);
                return;
        }
    }
}
