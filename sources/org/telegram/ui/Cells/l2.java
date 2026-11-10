package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.messenger.c20;
public final class l2 implements c20 {
    public final int f29503a;
    public final ViewGroup f29504b;

    public l2(ViewGroup viewGroup, int i7) {
        this.f29503a = i7;
        this.f29504b = viewGroup;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f29503a) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ((t2) this.f29504b).l0(true);
                return;
            default:
                Object[] objArr2 = (Object[]) obj;
                ((o4) this.f29504b).c(true);
                return;
        }
    }
}
