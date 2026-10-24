package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
public final class i2 implements Utilities.Callback {
    public final int f22487a;
    public final ViewGroup f22488b;

    public i2(ViewGroup viewGroup, int i10) {
        this.f22487a = i10;
        this.f22488b = viewGroup;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f22487a) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ((q2) this.f22488b).c0(true);
                return;
            default:
                Object[] objArr2 = (Object[]) obj;
                ((m4) this.f22488b).c(true);
                return;
        }
    }
}
