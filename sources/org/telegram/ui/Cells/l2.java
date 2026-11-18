package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.messenger.x10;
public final class l2 implements x10 {
    public final int f30977a;
    public final ViewGroup f30978b;

    public l2(ViewGroup viewGroup, int i7) {
        this.f30977a = i7;
        this.f30978b = viewGroup;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f30977a) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ((t2) this.f30978b).k0(true);
                return;
            default:
                Object[] objArr2 = (Object[]) obj;
                ((o4) this.f30978b).c(true);
                return;
        }
    }
}
