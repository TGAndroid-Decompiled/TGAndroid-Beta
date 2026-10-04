package org.telegram.ui.Cells;

import android.view.View;
public final class cb implements View.OnLongClickListener {
    public final int f21901a = 0;
    public final int f21902b;
    public final Object f21903c;
    public final Object d;

    public cb(eb ebVar, db dbVar, int i10) {
        this.f21903c = ebVar;
        this.d = dbVar;
        this.f21902b = i10;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f21901a) {
            case 0:
                return ((eb) this.f21903c).b(((db) this.d).h, this.f21902b);
            default:
                ((yh.k5) this.f21903c).f(this.f21902b, true);
                ((Runnable) this.d).run();
                return true;
        }
    }

    public cb(yh.k5 k5Var, int i10, Runnable runnable) {
        this.f21903c = k5Var;
        this.f21902b = i10;
        this.d = runnable;
    }
}
