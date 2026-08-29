package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
public final class h2 implements Utilities.Callback {
    public final int f24435a;
    public final ViewGroup f24436b;

    public h2(ViewGroup viewGroup, int i10) {
        this.f24435a = i10;
        this.f24436b = viewGroup;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f24435a) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ((p2) this.f24436b).d0(true);
                return;
            default:
                Object[] objArr2 = (Object[]) obj;
                ((l4) this.f24436b).c(true);
                return;
        }
    }
}
