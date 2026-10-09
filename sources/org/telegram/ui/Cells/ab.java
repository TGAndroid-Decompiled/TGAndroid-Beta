package org.telegram.ui.Cells;

import android.view.View;
public final class ab implements View.OnLongClickListener {
    public final int f21817a = 0;
    public final int f21818b;
    public final Object f21819c;
    public final Object d;

    public ab(cb cbVar, bb bbVar, int i10) {
        this.f21819c = cbVar;
        this.d = bbVar;
        this.f21818b = i10;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f21817a) {
            case 0:
                return ((cb) this.f21819c).b(((bb) this.d).h, this.f21818b);
            default:
                ((yh.e5) this.f21819c).f(this.f21818b, true);
                ((Runnable) this.d).run();
                return true;
        }
    }

    public ab(yh.e5 e5Var, int i10, Runnable runnable) {
        this.f21819c = e5Var;
        this.f21818b = i10;
        this.d = runnable;
    }
}
