package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class as0 implements Utilities.Callback {
    public final int f32227a;
    public final ks0 f32228b;

    public as0(ks0 ks0Var, int i10) {
        this.f32227a = i10;
        this.f32228b = ks0Var;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f32227a) {
            case 0:
                new org.telegram.ui.Components.xc(this.f32228b.f35166b.f31222e0, null).m(org.telegram.ui.Components.wc.f29977r, 1, -115203550, -1, null).j();
                return;
            default:
                new org.telegram.ui.Components.xc(this.f32228b.f35166b.f31222e0, null).m(org.telegram.ui.Components.wc.f29977r, 1, -115203550, -1, null).j();
                return;
        }
    }
}
