package org.telegram.ui.Cells;

import android.view.View;
public final class ab implements View.OnLongClickListener {
    public final int f21581a = 0;
    public final int f21582b;
    public final Object f21583c;
    public final Object d;

    public ab(cb cbVar, bb bbVar, int i10) {
        this.f21583c = cbVar;
        this.d = bbVar;
        this.f21582b = i10;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f21581a) {
            case 0:
                return ((cb) this.f21583c).b(((bb) this.d).h, this.f21582b);
            default:
                ((yh.f5) this.f21583c).f(this.f21582b, true);
                ((Runnable) this.d).run();
                return true;
        }
    }

    public ab(yh.f5 f5Var, int i10, Runnable runnable) {
        this.f21583c = f5Var;
        this.f21582b = i10;
        this.d = runnable;
    }
}
