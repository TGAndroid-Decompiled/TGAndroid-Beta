package org.telegram.ui.Cells;

import android.view.View;
public final class cb implements View.OnLongClickListener {
    public final int f20134a = 0;
    public final int f20135b;
    public final Object f20136c;
    public final Object d;

    public cb(eb ebVar, db dbVar, int i10) {
        this.f20136c = ebVar;
        this.d = dbVar;
        this.f20135b = i10;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f20134a) {
            case 0:
                return ((eb) this.f20136c).b(((db) this.d).h, this.f20135b);
            default:
                ((yh.k5) this.f20136c).f(this.f20135b, true);
                ((Runnable) this.d).run();
                return true;
        }
    }

    public cb(yh.k5 k5Var, int i10, Runnable runnable) {
        this.f20136c = k5Var;
        this.f20135b = i10;
        this.d = runnable;
    }
}
