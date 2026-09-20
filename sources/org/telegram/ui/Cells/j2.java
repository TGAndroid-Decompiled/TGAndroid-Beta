package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
public final class j2 implements Utilities.Callback {
    public final int f20460a;
    public final ViewGroup f20461b;

    public j2(ViewGroup viewGroup, int i10) {
        this.f20460a = i10;
        this.f20461b = viewGroup;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f20460a) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ((s2) this.f20461b).d0(true);
                return;
            default:
                Object[] objArr2 = (Object[]) obj;
                ((o4) this.f20461b).c(true);
                return;
        }
    }
}
