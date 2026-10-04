package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class hs0 implements Utilities.Callback {
    public final int f37165a;
    public final ns0 f37166b;
    public final boolean f37167c;

    public hs0(ns0 ns0Var, boolean z10, int i10) {
        this.f37165a = i10;
        this.f37166b = ns0Var;
        this.f37167c = z10;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f37165a) {
            case 0:
                org.telegram.ui.Components.yc.F(this.f37166b.f39035b.f33894e0, this.f37167c).j();
                return;
            default:
                org.telegram.ui.Components.yc.F(this.f37166b.f39035b.f33894e0, this.f37167c).j();
                return;
        }
    }
}
