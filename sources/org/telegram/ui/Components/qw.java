package org.telegram.ui.Components;

import android.content.Context;
public final class qw extends ci.p {
    public final int f29815q;
    public final Object f29816r;

    public qw(Object obj, Context context, int i10) {
        super(context, 2);
        this.f29815q = i10;
        this.f29816r = obj;
    }

    @Override
    public void e() {
        switch (this.f29815q) {
            case 0:
                ((vy) this.f29816r).f31952f0 = true;
                return;
            case 3:
                ((org.telegram.ui.g31) this.f29816r).f37341x1 = true;
                return;
            case 5:
                ((vh.c1) this.f29816r).f51036i3 = true;
                return;
            default:
                return;
        }
    }

    @Override
    public final void i() {
        switch (this.f29815q) {
            case 0:
                ((vy) this.f29816r).f31952f0 = false;
                return;
            case 1:
                ((vw) this.f29816r).Q.f31952f0 = false;
                return;
            case 2:
                ((org.telegram.ui.u11) this.f29816r).R.f37341x1 = false;
                return;
            case 3:
                ((org.telegram.ui.g31) this.f29816r).f37341x1 = false;
                return;
            case 4:
                ((org.telegram.ui.u11) this.f29816r).R.f37341x1 = false;
                return;
            default:
                ((vh.c1) this.f29816r).f51036i3 = false;
                return;
        }
    }
}
