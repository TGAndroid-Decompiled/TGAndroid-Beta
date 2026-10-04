package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class hs0 implements Utilities.Callback {
    public final int f37171a;
    public final ns0 f37172b;
    public final boolean f37173c;

    public hs0(ns0 ns0Var, boolean z10, int i10) {
        this.f37171a = i10;
        this.f37172b = ns0Var;
        this.f37173c = z10;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f37171a) {
            case 0:
                org.telegram.ui.Components.yc.F(this.f37172b.f39041b.f33901e0, this.f37173c).j();
                return;
            default:
                org.telegram.ui.Components.yc.F(this.f37172b.f39041b.f33901e0, this.f37173c).j();
                return;
        }
    }
}
