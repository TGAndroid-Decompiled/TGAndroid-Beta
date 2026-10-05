package org.telegram.ui.Cells;

import android.view.View;
public final class cb implements View.OnLongClickListener {
    public final int f21909a = 0;
    public final int f21910b;
    public final Object f21911c;
    public final Object d;

    public cb(eb ebVar, db dbVar, int i10) {
        this.f21911c = ebVar;
        this.d = dbVar;
        this.f21910b = i10;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f21909a) {
            case 0:
                return ((eb) this.f21911c).b(((db) this.d).h, this.f21910b);
            default:
                ((yh.l5) this.f21911c).f(this.f21910b, true);
                ((Runnable) this.d).run();
                return true;
        }
    }

    public cb(yh.l5 l5Var, int i10, Runnable runnable) {
        this.f21911c = l5Var;
        this.f21910b = i10;
        this.d = runnable;
    }
}
