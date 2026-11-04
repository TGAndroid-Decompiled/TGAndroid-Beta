package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.messenger.u10;
public final class l2 implements u10 {
    public final int f29545a;
    public final ViewGroup f29546b;

    public l2(ViewGroup viewGroup, int i3) {
        this.f29545a = i3;
        this.f29546b = viewGroup;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f29545a) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ((t2) this.f29546b).k0(true);
                return;
            default:
                Object[] objArr2 = (Object[]) obj;
                ((o4) this.f29546b).c(true);
                return;
        }
    }
}
