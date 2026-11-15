package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.messenger.z10;
public final class l2 implements z10 {
    public final int f30606a;
    public final ViewGroup f30607b;

    public l2(ViewGroup viewGroup, int i7) {
        this.f30606a = i7;
        this.f30607b = viewGroup;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f30606a) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ((t2) this.f30607b).m0(true);
                return;
            default:
                Object[] objArr2 = (Object[]) obj;
                ((o4) this.f30607b).c(true);
                return;
        }
    }
}
