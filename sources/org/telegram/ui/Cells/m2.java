package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.messenger.w10;
public final class m2 implements w10 {
    public final int f31126a;
    public final ViewGroup f31127b;

    public m2(ViewGroup viewGroup, int i7) {
        this.f31126a = i7;
        this.f31127b = viewGroup;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f31126a) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ((u2) this.f31127b).m0(true);
                return;
            default:
                Object[] objArr2 = (Object[]) obj;
                ((p4) this.f31127b).c(true);
                return;
        }
    }
}
