package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
public final class j2 implements Utilities.Callback {
    public final int f22303a;
    public final ViewGroup f22304b;

    public j2(ViewGroup viewGroup, int i10) {
        this.f22303a = i10;
        this.f22304b = viewGroup;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f22303a) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ((s2) this.f22304b).d0(true);
                return;
            default:
                Object[] objArr2 = (Object[]) obj;
                ((n4) this.f22304b).c(true);
                return;
        }
    }
}
