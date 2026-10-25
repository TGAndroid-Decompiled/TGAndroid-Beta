package org.telegram.ui.Cells;

import android.view.View;
public final class db implements View.OnLongClickListener {
    public final int f24016a = 1;
    public final int f24017b;
    public final Object f24018c;
    public final Object d;

    public db(bi.t9 t9Var, int i10, Runnable runnable) {
        this.f24018c = t9Var;
        this.f24017b = i10;
        this.d = runnable;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f24016a) {
            case 0:
                return ((fb) this.f24018c).b(((eb) this.d).h, this.f24017b);
            default:
                ((bi.t9) this.f24018c).g(this.f24017b, true);
                ((Runnable) this.d).run();
                return true;
        }
    }

    public db(fb fbVar, eb ebVar, int i10) {
        this.f24018c = fbVar;
        this.d = ebVar;
        this.f24017b = i10;
    }
}
