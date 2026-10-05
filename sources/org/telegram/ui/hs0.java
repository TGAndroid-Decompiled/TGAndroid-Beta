package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class hs0 implements Utilities.Callback {
    public final int f37172a;
    public final ns0 f37173b;
    public final boolean f37174c;

    public hs0(ns0 ns0Var, boolean z10, int i10) {
        this.f37172a = i10;
        this.f37173b = ns0Var;
        this.f37174c = z10;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f37172a) {
            case 0:
                org.telegram.ui.Components.yc.F(this.f37173b.f39030b.f33914e0, this.f37174c).j();
                return;
            default:
                org.telegram.ui.Components.yc.F(this.f37173b.f39030b.f33914e0, this.f37174c).j();
                return;
        }
    }
}
