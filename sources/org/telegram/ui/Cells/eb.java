package org.telegram.ui.Cells;

import android.view.View;
public final class eb implements View.OnLongClickListener {
    public final int f20018a = 0;
    public final int f20019b;
    public final Object f20020c;
    public final Object d;

    public eb(gb gbVar, fb fbVar, int i10) {
        this.f20020c = gbVar;
        this.d = fbVar;
        this.f20019b = i10;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f20018a) {
            case 0:
                return ((gb) this.f20020c).b(((fb) this.d).h, this.f20019b);
            default:
                ((yh.l5) this.f20020c).f(this.f20019b, true);
                ((Runnable) this.d).run();
                return true;
        }
    }

    public eb(yh.l5 l5Var, int i10, Runnable runnable) {
        this.f20020c = l5Var;
        this.f20019b = i10;
        this.d = runnable;
    }
}
