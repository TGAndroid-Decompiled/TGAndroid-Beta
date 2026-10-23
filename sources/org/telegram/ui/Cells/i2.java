package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
public final class i2 implements Utilities.Callback {
    public final int f22486a;
    public final ViewGroup f22487b;

    public i2(ViewGroup viewGroup, int i10) {
        this.f22486a = i10;
        this.f22487b = viewGroup;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f22486a) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ((q2) this.f22487b).c0(true);
                return;
            default:
                Object[] objArr2 = (Object[]) obj;
                ((m4) this.f22487b).c(true);
                return;
        }
    }
}
