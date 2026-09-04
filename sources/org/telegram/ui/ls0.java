package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class ls0 implements Utilities.Callback {
    public final int f38475a;
    public final rs0 f38476b;
    public final boolean f38477c;

    public ls0(rs0 rs0Var, boolean z10, int i10) {
        this.f38475a = i10;
        this.f38476b = rs0Var;
        this.f38477c = z10;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f38475a) {
            case 0:
                org.telegram.ui.Components.yc.F(this.f38476b.f40230b.f33549e0, this.f38477c).j();
                return;
            default:
                org.telegram.ui.Components.yc.F(this.f38476b.f40230b.f33549e0, this.f38477c).j();
                return;
        }
    }
}
