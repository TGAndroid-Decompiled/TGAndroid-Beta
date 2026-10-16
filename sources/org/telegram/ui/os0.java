package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class os0 implements Utilities.Callback {
    public final int f38744a;
    public final ys0 f38745b;

    public os0(ys0 ys0Var, int i10) {
        this.f38744a = i10;
        this.f38745b = ys0Var;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f38744a) {
            case 0:
                new org.telegram.ui.Components.zc(this.f38745b.f41955b.f31928e0, null).m(org.telegram.ui.Components.yc.f31211r, 1, -115203550, -1, null).j();
                return;
            default:
                new org.telegram.ui.Components.zc(this.f38745b.f41955b.f31928e0, null).m(org.telegram.ui.Components.yc.f31211r, 1, -115203550, -1, null).j();
                return;
        }
    }
}
