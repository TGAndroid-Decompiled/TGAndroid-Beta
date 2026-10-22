package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
public final class j2 implements Utilities.Callback {
    public final int f22461a;
    public final ViewGroup f22462b;

    public j2(ViewGroup viewGroup, int i10) {
        this.f22461a = i10;
        this.f22462b = viewGroup;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f22461a) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ((r2) this.f22462b).d0(true);
                return;
            default:
                Object[] objArr2 = (Object[]) obj;
                ((m4) this.f22462b).c(true);
                return;
        }
    }
}
