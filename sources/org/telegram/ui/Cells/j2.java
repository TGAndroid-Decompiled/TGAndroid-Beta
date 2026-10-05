package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
public final class j2 implements Utilities.Callback {
    public final int f22312a;
    public final ViewGroup f22313b;

    public j2(ViewGroup viewGroup, int i10) {
        this.f22312a = i10;
        this.f22313b = viewGroup;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f22312a) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ((s2) this.f22313b).d0(true);
                return;
            default:
                Object[] objArr2 = (Object[]) obj;
                ((n4) this.f22313b).c(true);
                return;
        }
    }
}
