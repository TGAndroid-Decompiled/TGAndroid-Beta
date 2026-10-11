package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
public final class j2 implements Utilities.Callback {
    public final int f22286a;
    public final ViewGroup f22287b;

    public j2(ViewGroup viewGroup, int i10) {
        this.f22286a = i10;
        this.f22287b = viewGroup;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f22286a) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ((s2) this.f22287b).d0(true);
                return;
            default:
                Object[] objArr2 = (Object[]) obj;
                ((n4) this.f22287b).c(true);
                return;
        }
    }
}
