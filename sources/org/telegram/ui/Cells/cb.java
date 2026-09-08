package org.telegram.ui.Cells;

import android.view.View;
public final class cb implements View.OnLongClickListener {
    public final int f21744a = 0;
    public final int f21745b;
    public final Object f21746c;
    public final Object d;

    public cb(eb ebVar, db dbVar, int i10) {
        this.f21746c = ebVar;
        this.d = dbVar;
        this.f21745b = i10;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f21744a) {
            case 0:
                return ((eb) this.f21746c).b(((db) this.d).h, this.f21745b);
            default:
                ((zh.j5) this.f21746c).f(this.f21745b, true);
                ((Runnable) this.d).run();
                return true;
        }
    }

    public cb(zh.j5 j5Var, int i10, Runnable runnable) {
        this.f21746c = j5Var;
        this.f21745b = i10;
        this.d = runnable;
    }
}
