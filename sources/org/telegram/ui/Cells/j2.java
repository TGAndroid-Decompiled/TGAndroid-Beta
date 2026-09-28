package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
public final class j2 implements Utilities.Callback {
    public final int f20489a;
    public final ViewGroup f20490b;

    public j2(ViewGroup viewGroup, int i10) {
        this.f20489a = i10;
        this.f20490b = viewGroup;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f20489a) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ((s2) this.f20490b).d0(true);
                return;
            default:
                Object[] objArr2 = (Object[]) obj;
                ((n4) this.f20490b).c(true);
                return;
        }
    }
}
