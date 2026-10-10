package org.telegram.ui.Cells;

import android.view.View;
public final class ab implements View.OnLongClickListener {
    public final int f21821a = 0;
    public final int f21822b;
    public final Object f21823c;
    public final Object d;

    public ab(cb cbVar, bb bbVar, int i10) {
        this.f21823c = cbVar;
        this.d = bbVar;
        this.f21822b = i10;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f21821a) {
            case 0:
                return ((cb) this.f21823c).b(((bb) this.d).h, this.f21822b);
            default:
                ((yh.e5) this.f21823c).f(this.f21822b, true);
                ((Runnable) this.d).run();
                return true;
        }
    }

    public ab(yh.e5 e5Var, int i10, Runnable runnable) {
        this.f21823c = e5Var;
        this.f21822b = i10;
        this.d = runnable;
    }
}
