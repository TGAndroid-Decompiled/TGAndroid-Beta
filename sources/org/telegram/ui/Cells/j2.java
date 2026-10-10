package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
public final class j2 implements Utilities.Callback {
    public final int f22298a;
    public final ViewGroup f22299b;

    public j2(ViewGroup viewGroup, int i10) {
        this.f22298a = i10;
        this.f22299b = viewGroup;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f22298a) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ((s2) this.f22299b).d0(true);
                return;
            default:
                Object[] objArr2 = (Object[]) obj;
                ((n4) this.f22299b).c(true);
                return;
        }
    }
}
