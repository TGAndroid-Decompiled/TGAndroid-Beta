package org.telegram.ui.Cells;

import android.view.View;
public final class cb implements View.OnLongClickListener {
    public final int f21900a = 0;
    public final int f21901b;
    public final Object f21902c;
    public final Object d;

    public cb(eb ebVar, db dbVar, int i10) {
        this.f21902c = ebVar;
        this.d = dbVar;
        this.f21901b = i10;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f21900a) {
            case 0:
                return ((eb) this.f21902c).b(((db) this.d).h, this.f21901b);
            default:
                ((yh.k5) this.f21902c).f(this.f21901b, true);
                ((Runnable) this.d).run();
                return true;
        }
    }

    public cb(yh.k5 k5Var, int i10, Runnable runnable) {
        this.f21902c = k5Var;
        this.f21901b = i10;
        this.d = runnable;
    }
}
