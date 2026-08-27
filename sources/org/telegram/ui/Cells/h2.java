package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.messenger.Utilities;

public final class h2 implements Utilities.Callback {

    public final int f24422a;

    public final ViewGroup f24423b;

    public h2(ViewGroup viewGroup, int i10) {
        this.f24422a = i10;
        this.f24423b = viewGroup;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f24422a) {
            case 0:
                ((p2) this.f24423b).d0(true);
                break;
            default:
                ((k4) this.f24423b).c(true);
                break;
        }
    }
}
