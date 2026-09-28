package org.telegram.ui.Cells;

import android.view.View;
public final class cb implements View.OnLongClickListener {
    public final int f20118a = 0;
    public final int f20119b;
    public final Object f20120c;
    public final Object d;

    public cb(eb ebVar, db dbVar, int i10) {
        this.f20120c = ebVar;
        this.d = dbVar;
        this.f20119b = i10;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f20118a) {
            case 0:
                return ((eb) this.f20120c).b(((db) this.d).h, this.f20119b);
            default:
                ((yh.k5) this.f20120c).f(this.f20119b, true);
                ((Runnable) this.d).run();
                return true;
        }
    }

    public cb(yh.k5 k5Var, int i10, Runnable runnable) {
        this.f20120c = k5Var;
        this.f20119b = i10;
        this.d = runnable;
    }
}
