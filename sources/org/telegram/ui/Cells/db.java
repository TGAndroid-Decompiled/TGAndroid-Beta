package org.telegram.ui.Cells;

import android.view.View;
public final class db implements View.OnLongClickListener {
    public final int f19991a = 0;
    public final int f19992b;
    public final Object f19993c;
    public final Object d;

    public db(fb fbVar, eb ebVar, int i10) {
        this.f19993c = fbVar;
        this.d = ebVar;
        this.f19992b = i10;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f19991a) {
            case 0:
                return ((fb) this.f19993c).b(((eb) this.d).h, this.f19992b);
            default:
                ((yh.n5) this.f19993c).f(this.f19992b, true);
                ((Runnable) this.d).run();
                return true;
        }
    }

    public db(yh.n5 n5Var, int i10, Runnable runnable) {
        this.f19993c = n5Var;
        this.f19992b = i10;
        this.d = runnable;
    }
}
