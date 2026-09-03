package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
public final class h2 implements Utilities.Callback {
    public final int f21129a;
    public final ViewGroup f21130b;

    public h2(ViewGroup viewGroup, int i10) {
        this.f21129a = i10;
        this.f21130b = viewGroup;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f21129a) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ((q2) this.f21130b).d0(true);
                return;
            default:
                Object[] objArr2 = (Object[]) obj;
                ((m4) this.f21130b).c(true);
                return;
        }
    }
}
