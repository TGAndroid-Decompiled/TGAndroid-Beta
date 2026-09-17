package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class ls0 implements Utilities.Callback {
    public final int f38476a;
    public final rs0 f38477b;
    public final boolean f38478c;

    public ls0(rs0 rs0Var, boolean z10, int i10) {
        this.f38476a = i10;
        this.f38477b = rs0Var;
        this.f38478c = z10;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f38476a) {
            case 0:
                org.telegram.ui.Components.yc.F(this.f38477b.f40231b.f33550e0, this.f38478c).j();
                return;
            default:
                org.telegram.ui.Components.yc.F(this.f38477b.f40231b.f33550e0, this.f38478c).j();
                return;
        }
    }
}
