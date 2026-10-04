package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class hs0 implements Utilities.Callback {
    public final int f37166a;
    public final ns0 f37167b;
    public final boolean f37168c;

    public hs0(ns0 ns0Var, boolean z10, int i10) {
        this.f37166a = i10;
        this.f37167b = ns0Var;
        this.f37168c = z10;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f37166a) {
            case 0:
                org.telegram.ui.Components.yc.F(this.f37167b.f39036b.f33895e0, this.f37168c).j();
                return;
            default:
                org.telegram.ui.Components.yc.F(this.f37167b.f39036b.f33895e0, this.f37168c).j();
                return;
        }
    }
}
