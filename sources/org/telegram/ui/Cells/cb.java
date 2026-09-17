package org.telegram.ui.Cells;

import android.view.View;
public final class cb implements View.OnLongClickListener {
    public final int f21745a = 0;
    public final int f21746b;
    public final Object f21747c;
    public final Object d;

    public cb(eb ebVar, db dbVar, int i10) {
        this.f21747c = ebVar;
        this.d = dbVar;
        this.f21746b = i10;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f21745a) {
            case 0:
                return ((eb) this.f21747c).b(((db) this.d).h, this.f21746b);
            default:
                ((zh.j5) this.f21747c).f(this.f21746b, true);
                ((Runnable) this.d).run();
                return true;
        }
    }

    public cb(zh.j5 j5Var, int i10, Runnable runnable) {
        this.f21747c = j5Var;
        this.f21746b = i10;
        this.d = runnable;
    }
}
