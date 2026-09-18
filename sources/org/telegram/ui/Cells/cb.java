package org.telegram.ui.Cells;

import android.view.View;
public final class cb implements View.OnLongClickListener {
    public final int f20081a = 0;
    public final int f20082b;
    public final Object f20083c;
    public final Object d;

    public cb(eb ebVar, db dbVar, int i10) {
        this.f20083c = ebVar;
        this.d = dbVar;
        this.f20082b = i10;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f20081a) {
            case 0:
                return ((eb) this.f20083c).b(((db) this.d).h, this.f20082b);
            default:
                ((yh.l5) this.f20083c).f(this.f20082b, true);
                ((Runnable) this.d).run();
                return true;
        }
    }

    public cb(yh.l5 l5Var, int i10, Runnable runnable) {
        this.f20083c = l5Var;
        this.f20082b = i10;
        this.d = runnable;
    }
}
