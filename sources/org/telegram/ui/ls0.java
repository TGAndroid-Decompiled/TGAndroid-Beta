package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class ls0 implements Utilities.Callback {
    public final int f39756a;
    public final rs0 f39757b;
    public final boolean f39758c;

    public ls0(rs0 rs0Var, boolean z10, int i10) {
        this.f39756a = i10;
        this.f39757b = rs0Var;
        this.f39758c = z10;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f39756a) {
            case 0:
                org.telegram.ui.Components.ad.F(this.f39757b.f41542b.f33966e0, this.f39758c).j();
                return;
            default:
                org.telegram.ui.Components.ad.F(this.f39757b.f41542b.f33966e0, this.f39758c).j();
                return;
        }
    }
}
