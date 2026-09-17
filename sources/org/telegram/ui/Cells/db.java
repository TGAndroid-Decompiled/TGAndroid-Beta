package org.telegram.ui.Cells;

import android.view.View;
public final class db implements View.OnLongClickListener {
    public final int f19990a = 0;
    public final int f19991b;
    public final Object f19992c;
    public final Object d;

    public db(fb fbVar, eb ebVar, int i10) {
        this.f19992c = fbVar;
        this.d = ebVar;
        this.f19991b = i10;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f19990a) {
            case 0:
                return ((fb) this.f19992c).b(((eb) this.d).h, this.f19991b);
            default:
                ((yh.n5) this.f19992c).f(this.f19991b, true);
                ((Runnable) this.d).run();
                return true;
        }
    }

    public db(yh.n5 n5Var, int i10, Runnable runnable) {
        this.f19992c = n5Var;
        this.f19991b = i10;
        this.d = runnable;
    }
}
