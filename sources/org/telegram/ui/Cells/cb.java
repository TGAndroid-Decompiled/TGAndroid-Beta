package org.telegram.ui.Cells;

import android.view.View;
public final class cb implements View.OnLongClickListener {
    public final int f21717a = 0;
    public final int f21718b;
    public final Object f21719c;
    public final Object d;

    public cb(eb ebVar, db dbVar, int i10) {
        this.f21719c = ebVar;
        this.d = dbVar;
        this.f21718b = i10;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f21717a) {
            case 0:
                return ((eb) this.f21719c).b(((db) this.d).h, this.f21718b);
            default:
                ((zh.j5) this.f21719c).f(this.f21718b, true);
                ((Runnable) this.d).run();
                return true;
        }
    }

    public cb(zh.j5 j5Var, int i10, Runnable runnable) {
        this.f21719c = j5Var;
        this.f21718b = i10;
        this.d = runnable;
    }
}
