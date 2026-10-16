package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
public final class j2 implements Utilities.Callback {
    public final int f21080a;
    public final ViewGroup f21081b;

    public j2(ViewGroup viewGroup, int i10) {
        this.f21080a = i10;
        this.f21081b = viewGroup;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f21080a) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ((s2) this.f21081b).d0(true);
                return;
            default:
                Object[] objArr2 = (Object[]) obj;
                ((n4) this.f21081b).c(true);
                return;
        }
    }
}
