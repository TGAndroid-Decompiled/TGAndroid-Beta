package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
public final class h2 implements Utilities.Callback {
    public final int f24188a;
    public final ViewGroup f24189b;

    public h2(ViewGroup viewGroup, int i10) {
        this.f24188a = i10;
        this.f24189b = viewGroup;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f24188a) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ((p2) this.f24189b).c0(true);
                return;
            default:
                Object[] objArr2 = (Object[]) obj;
                ((r4) this.f24189b).c(true);
                return;
        }
    }
}
