package org.telegram.ui.Cells;

import android.view.View;
public final class db implements View.OnLongClickListener {
    public final int f24018a = 1;
    public final int f24019b;
    public final Object f24020c;
    public final Object d;

    public db(bi.t9 t9Var, int i10, Runnable runnable) {
        this.f24020c = t9Var;
        this.f24019b = i10;
        this.d = runnable;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f24018a) {
            case 0:
                return ((fb) this.f24020c).b(((eb) this.d).h, this.f24019b);
            default:
                ((bi.t9) this.f24020c).g(this.f24019b, true);
                ((Runnable) this.d).run();
                return true;
        }
    }

    public db(fb fbVar, eb ebVar, int i10) {
        this.f24020c = fbVar;
        this.d = ebVar;
        this.f24019b = i10;
    }
}
