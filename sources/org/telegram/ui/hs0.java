package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class hs0 implements Utilities.Callback {
    public final int f34277a;
    public final ns0 f34278b;
    public final boolean f34279c;

    public hs0(ns0 ns0Var, boolean z10, int i10) {
        this.f34277a = i10;
        this.f34278b = ns0Var;
        this.f34279c = z10;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f34277a) {
            case 0:
                org.telegram.ui.Components.xc.F(this.f34278b.f36082b.f31225e0, this.f34279c).j();
                return;
            default:
                org.telegram.ui.Components.xc.F(this.f34278b.f36082b.f31225e0, this.f34279c).j();
                return;
        }
    }
}
