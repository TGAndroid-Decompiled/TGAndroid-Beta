package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class ls0 implements Utilities.Callback {
    public final int f39722a;
    public final rs0 f39723b;
    public final boolean f39724c;

    public ls0(rs0 rs0Var, boolean z10, int i10) {
        this.f39722a = i10;
        this.f39723b = rs0Var;
        this.f39724c = z10;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f39722a) {
            case 0:
                org.telegram.ui.Components.ad.F(this.f39723b.f41508b.f33932e0, this.f39724c).j();
                return;
            default:
                org.telegram.ui.Components.ad.F(this.f39723b.f41508b.f33932e0, this.f39724c).j();
                return;
        }
    }
}
