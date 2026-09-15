package org.telegram.ui.Cells;

import android.view.View;
public final class db implements View.OnLongClickListener {
    public final int f19980a = 0;
    public final int f19981b;
    public final Object f19982c;
    public final Object d;

    public db(fb fbVar, eb ebVar, int i10) {
        this.f19982c = fbVar;
        this.d = ebVar;
        this.f19981b = i10;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f19980a) {
            case 0:
                return ((fb) this.f19982c).b(((eb) this.d).h, this.f19981b);
            default:
                ((yh.n5) this.f19982c).f(this.f19981b, true);
                ((Runnable) this.d).run();
                return true;
        }
    }

    public db(yh.n5 n5Var, int i10, Runnable runnable) {
        this.f19982c = n5Var;
        this.f19981b = i10;
        this.d = runnable;
    }
}
