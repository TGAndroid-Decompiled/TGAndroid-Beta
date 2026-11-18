package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.messenger.x10;
public final class m2 implements x10 {
    public final int f31050a;
    public final ViewGroup f31051b;

    public m2(ViewGroup viewGroup, int i7) {
        this.f31050a = i7;
        this.f31051b = viewGroup;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f31050a) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ((u2) this.f31051b).k0(true);
                return;
            default:
                Object[] objArr2 = (Object[]) obj;
                ((p4) this.f31051b).c(true);
                return;
        }
    }
}
