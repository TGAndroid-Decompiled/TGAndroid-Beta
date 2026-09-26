package org.telegram.ui.Cells;

import android.view.View;
public final class cb implements View.OnLongClickListener {
    public final int f20117a = 0;
    public final int f20118b;
    public final Object f20119c;
    public final Object d;

    public cb(eb ebVar, db dbVar, int i10) {
        this.f20119c = ebVar;
        this.d = dbVar;
        this.f20118b = i10;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f20117a) {
            case 0:
                return ((eb) this.f20119c).b(((db) this.d).h, this.f20118b);
            default:
                ((yh.k5) this.f20119c).f(this.f20118b, true);
                ((Runnable) this.d).run();
                return true;
        }
    }

    public cb(yh.k5 k5Var, int i10, Runnable runnable) {
        this.f20119c = k5Var;
        this.f20118b = i10;
        this.d = runnable;
    }
}
