package org.telegram.ui.Components;

import android.content.Context;
public final class qw extends ci.p {
    public final int f29754q;
    public final Object f29755r;

    public qw(Object obj, Context context, int i10) {
        super(context, 2);
        this.f29754q = i10;
        this.f29755r = obj;
    }

    @Override
    public void e() {
        switch (this.f29754q) {
            case 0:
                ((vy) this.f29755r).f31874f0 = true;
                return;
            case 3:
                ((org.telegram.ui.i31) this.f29755r).f38165x1 = true;
                return;
            case 5:
                ((vh.b1) this.f29755r).f50941i3 = true;
                return;
            default:
                return;
        }
    }

    @Override
    public final void i() {
        switch (this.f29754q) {
            case 0:
                ((vy) this.f29755r).f31874f0 = false;
                return;
            case 1:
                ((vw) this.f29755r).Q.f31874f0 = false;
                return;
            case 2:
                ((org.telegram.ui.w11) this.f29755r).R.f38165x1 = false;
                return;
            case 3:
                ((org.telegram.ui.i31) this.f29755r).f38165x1 = false;
                return;
            case 4:
                ((org.telegram.ui.w11) this.f29755r).R.f38165x1 = false;
                return;
            default:
                ((vh.b1) this.f29755r).f50941i3 = false;
                return;
        }
    }
}
