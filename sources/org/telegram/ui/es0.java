package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class es0 implements Utilities.Callback {
    public final int f33463a;
    public final ks0 f33464b;
    public final boolean f33465c;

    public es0(ks0 ks0Var, boolean z10, int i10) {
        this.f33463a = i10;
        this.f33464b = ks0Var;
        this.f33465c = z10;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f33463a) {
            case 0:
                org.telegram.ui.Components.xc.F(this.f33464b.f35168b.f31224e0, this.f33465c).j();
                return;
            default:
                org.telegram.ui.Components.xc.F(this.f33464b.f35168b.f31224e0, this.f33465c).j();
                return;
        }
    }
}
