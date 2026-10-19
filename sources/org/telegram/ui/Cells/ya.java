package org.telegram.ui.Cells;

import android.view.View;
public final class ya implements View.OnLongClickListener {
    public final int f23854a = 1;
    public final int f23855b;
    public final Object f23856c;
    public final Object d;

    public ya(ai.y9 y9Var, int i10, Runnable runnable) {
        this.f23856c = y9Var;
        this.f23855b = i10;
        this.d = runnable;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f23854a) {
            case 0:
                return ((ab) this.f23856c).b(((za) this.d).h, this.f23855b);
            default:
                ((ai.y9) this.f23856c).g(this.f23855b, true);
                ((Runnable) this.d).run();
                return true;
        }
    }

    public ya(ab abVar, za zaVar, int i10) {
        this.f23856c = abVar;
        this.d = zaVar;
        this.f23855b = i10;
    }
}
