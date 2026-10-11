package org.telegram.ui.Cells;

import android.view.View;
public final class ab implements View.OnLongClickListener {
    public final int f21845a = 0;
    public final int f21846b;
    public final Object f21847c;
    public final Object d;

    public ab(cb cbVar, bb bbVar, int i10) {
        this.f21847c = cbVar;
        this.d = bbVar;
        this.f21846b = i10;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f21845a) {
            case 0:
                return ((cb) this.f21847c).b(((bb) this.d).h, this.f21846b);
            default:
                ((yh.f5) this.f21847c).f(this.f21846b, true);
                ((Runnable) this.d).run();
                return true;
        }
    }

    public ab(yh.f5 f5Var, int i10, Runnable runnable) {
        this.f21847c = f5Var;
        this.f21846b = i10;
        this.d = runnable;
    }
}
