package org.telegram.ui.Cells;

import android.view.View;
public final class cb implements View.OnLongClickListener {
    public final int f21905a = 0;
    public final int f21906b;
    public final Object f21907c;
    public final Object d;

    public cb(eb ebVar, db dbVar, int i10) {
        this.f21907c = ebVar;
        this.d = dbVar;
        this.f21906b = i10;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f21905a) {
            case 0:
                return ((eb) this.f21907c).b(((db) this.d).h, this.f21906b);
            default:
                ((yh.k5) this.f21907c).f(this.f21906b, true);
                ((Runnable) this.d).run();
                return true;
        }
    }

    public cb(yh.k5 k5Var, int i10, Runnable runnable) {
        this.f21907c = k5Var;
        this.f21906b = i10;
        this.d = runnable;
    }
}
