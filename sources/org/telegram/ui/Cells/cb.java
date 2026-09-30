package org.telegram.ui.Cells;

import android.view.View;
public final class cb implements View.OnLongClickListener {
    public final int f20119a = 0;
    public final int f20120b;
    public final Object f20121c;
    public final Object d;

    public cb(eb ebVar, db dbVar, int i10) {
        this.f20121c = ebVar;
        this.d = dbVar;
        this.f20120b = i10;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f20119a) {
            case 0:
                return ((eb) this.f20121c).b(((db) this.d).h, this.f20120b);
            default:
                ((yh.k5) this.f20121c).f(this.f20120b, true);
                ((Runnable) this.d).run();
                return true;
        }
    }

    public cb(yh.k5 k5Var, int i10, Runnable runnable) {
        this.f20121c = k5Var;
        this.f20120b = i10;
        this.d = runnable;
    }
}
