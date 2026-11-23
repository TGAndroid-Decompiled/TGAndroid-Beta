package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.messenger.y10;
public final class m2 implements y10 {
    public final int f31047a;
    public final ViewGroup f31048b;

    public m2(ViewGroup viewGroup, int i7) {
        this.f31047a = i7;
        this.f31048b = viewGroup;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f31047a) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ((u2) this.f31048b).k0(true);
                return;
            default:
                Object[] objArr2 = (Object[]) obj;
                ((p4) this.f31048b).c(true);
                return;
        }
    }
}
