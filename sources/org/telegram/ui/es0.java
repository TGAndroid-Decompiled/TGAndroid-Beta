package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class es0 implements Utilities.Callback {
    public final int f33461a;
    public final ks0 f33462b;
    public final boolean f33463c;

    public es0(ks0 ks0Var, boolean z10, int i10) {
        this.f33461a = i10;
        this.f33462b = ks0Var;
        this.f33463c = z10;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f33461a) {
            case 0:
                org.telegram.ui.Components.xc.F(this.f33462b.f35166b.f31222e0, this.f33463c).j();
                return;
            default:
                org.telegram.ui.Components.xc.F(this.f33462b.f35166b.f31222e0, this.f33463c).j();
                return;
        }
    }
}
