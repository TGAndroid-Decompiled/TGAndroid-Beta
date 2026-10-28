package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
public final class h2 implements Utilities.Callback {
    public final int f24192a;
    public final ViewGroup f24193b;

    public h2(ViewGroup viewGroup, int i10) {
        this.f24192a = i10;
        this.f24193b = viewGroup;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f24192a) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ((p2) this.f24193b).c0(true);
                return;
            default:
                Object[] objArr2 = (Object[]) obj;
                ((r4) this.f24193b).c(true);
                return;
        }
    }
}
