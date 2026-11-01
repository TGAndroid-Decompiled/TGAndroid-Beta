package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.messenger.r20;
public final class l2 implements r20 {
    public final int f22227a;
    public final ViewGroup f22228b;

    public l2(ViewGroup viewGroup, int i10) {
        this.f22227a = i10;
        this.f22228b = viewGroup;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f22227a) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ((v2) this.f22228b).k0(true);
                return;
            default:
                Object[] objArr2 = (Object[]) obj;
                ((q4) this.f22228b).c(true);
                return;
        }
    }
}
