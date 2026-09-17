package org.telegram.ui.Cells;

import android.view.View;
public final class cb implements View.OnLongClickListener {
    public final int f21718a = 0;
    public final int f21719b;
    public final Object f21720c;
    public final Object d;

    public cb(eb ebVar, db dbVar, int i10) {
        this.f21720c = ebVar;
        this.d = dbVar;
        this.f21719b = i10;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f21718a) {
            case 0:
                return ((eb) this.f21720c).b(((db) this.d).h, this.f21719b);
            default:
                ((zh.j5) this.f21720c).f(this.f21719b, true);
                ((Runnable) this.d).run();
                return true;
        }
    }

    public cb(zh.j5 j5Var, int i10, Runnable runnable) {
        this.f21720c = j5Var;
        this.f21719b = i10;
        this.d = runnable;
    }
}
