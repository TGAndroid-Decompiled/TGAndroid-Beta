package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.messenger.q20;
public final class l2 implements q20 {
    public final int f22226a;
    public final ViewGroup f22227b;

    public l2(ViewGroup viewGroup, int i10) {
        this.f22226a = i10;
        this.f22227b = viewGroup;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f22226a) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ((v2) this.f22227b).k0(true);
                return;
            default:
                Object[] objArr2 = (Object[]) obj;
                ((q4) this.f22227b).c(true);
                return;
        }
    }
}
