package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.messenger.y10;
public final class m2 implements y10 {
    public final int f31081a;
    public final ViewGroup f31082b;

    public m2(ViewGroup viewGroup, int i7) {
        this.f31081a = i7;
        this.f31082b = viewGroup;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f31081a) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ((u2) this.f31082b).k0(true);
                return;
            default:
                Object[] objArr2 = (Object[]) obj;
                ((p4) this.f31082b).c(true);
                return;
        }
    }
}
