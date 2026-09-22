package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
public final class j2 implements Utilities.Callback {
    public final int f20475a;
    public final ViewGroup f20476b;

    public j2(ViewGroup viewGroup, int i10) {
        this.f20475a = i10;
        this.f20476b = viewGroup;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f20475a) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ((s2) this.f20476b).d0(true);
                return;
            default:
                Object[] objArr2 = (Object[]) obj;
                ((o4) this.f20476b).c(true);
                return;
        }
    }
}
