package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class as0 implements Utilities.Callback {
    public final int f32228a;
    public final ks0 f32229b;

    public as0(ks0 ks0Var, int i10) {
        this.f32228a = i10;
        this.f32229b = ks0Var;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f32228a) {
            case 0:
                new org.telegram.ui.Components.xc(this.f32229b.f35167b.f31223e0, null).m(org.telegram.ui.Components.wc.f29960r, 1, -115203550, -1, null).j();
                return;
            default:
                new org.telegram.ui.Components.xc(this.f32229b.f35167b.f31223e0, null).m(org.telegram.ui.Components.wc.f29960r, 1, -115203550, -1, null).j();
                return;
        }
    }
}
