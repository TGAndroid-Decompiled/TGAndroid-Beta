package org.telegram.ui.Cells;

import android.view.View;
public final class db implements View.OnLongClickListener {
    public final int f24020a = 1;
    public final int f24021b;
    public final Object f24022c;
    public final Object d;

    public db(bi.t9 t9Var, int i10, Runnable runnable) {
        this.f24022c = t9Var;
        this.f24021b = i10;
        this.d = runnable;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f24020a) {
            case 0:
                return ((fb) this.f24022c).b(((eb) this.d).h, this.f24021b);
            default:
                ((bi.t9) this.f24022c).g(this.f24021b, true);
                ((Runnable) this.d).run();
                return true;
        }
    }

    public db(fb fbVar, eb ebVar, int i10) {
        this.f24022c = fbVar;
        this.d = ebVar;
        this.f24021b = i10;
    }
}
