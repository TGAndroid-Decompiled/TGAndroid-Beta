package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
public final class j2 implements Utilities.Callback {
    public final int f20452a;
    public final ViewGroup f20453b;

    public j2(ViewGroup viewGroup, int i10) {
        this.f20452a = i10;
        this.f20453b = viewGroup;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f20452a) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ((s2) this.f20453b).d0(true);
                return;
            default:
                Object[] objArr2 = (Object[]) obj;
                ((n4) this.f20453b).c(true);
                return;
        }
    }
}
