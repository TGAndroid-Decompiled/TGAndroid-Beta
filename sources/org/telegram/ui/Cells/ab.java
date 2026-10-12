package org.telegram.ui.Cells;

import android.view.View;
public final class ab implements View.OnLongClickListener {
    public final int f21582a = 0;
    public final int f21583b;
    public final Object f21584c;
    public final Object d;

    public ab(cb cbVar, bb bbVar, int i10) {
        this.f21584c = cbVar;
        this.d = bbVar;
        this.f21583b = i10;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f21582a) {
            case 0:
                return ((cb) this.f21584c).b(((bb) this.d).h, this.f21583b);
            default:
                ((yh.f5) this.f21584c).f(this.f21583b, true);
                ((Runnable) this.d).run();
                return true;
        }
    }

    public ab(yh.f5 f5Var, int i10, Runnable runnable) {
        this.f21584c = f5Var;
        this.f21583b = i10;
        this.d = runnable;
    }
}
