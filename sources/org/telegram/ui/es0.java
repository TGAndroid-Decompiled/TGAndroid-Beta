package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class es0 implements Utilities.Callback {
    public final int f33447a;
    public final ks0 f33448b;
    public final boolean f33449c;

    public es0(ks0 ks0Var, boolean z10, int i10) {
        this.f33447a = i10;
        this.f33448b = ks0Var;
        this.f33449c = z10;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f33447a) {
            case 0:
                org.telegram.ui.Components.yc.F(this.f33448b.f35135b.f31209e0, this.f33449c).j();
                return;
            default:
                org.telegram.ui.Components.yc.F(this.f33448b.f35135b.f31209e0, this.f33449c).j();
                return;
        }
    }
}
