package org.telegram.ui.Cells;

import android.view.View;
public final class ab implements View.OnLongClickListener {
    public final int f21809a = 0;
    public final int f21810b;
    public final Object f21811c;
    public final Object d;

    public ab(cb cbVar, bb bbVar, int i10) {
        this.f21811c = cbVar;
        this.d = bbVar;
        this.f21810b = i10;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f21809a) {
            case 0:
                return ((cb) this.f21811c).b(((bb) this.d).h, this.f21810b);
            default:
                ((yh.f5) this.f21811c).f(this.f21810b, true);
                ((Runnable) this.d).run();
                return true;
        }
    }

    public ab(yh.f5 f5Var, int i10, Runnable runnable) {
        this.f21811c = f5Var;
        this.f21810b = i10;
        this.d = runnable;
    }
}
