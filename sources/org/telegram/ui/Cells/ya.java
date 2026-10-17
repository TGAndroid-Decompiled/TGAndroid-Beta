package org.telegram.ui.Cells;

import android.view.View;
public final class ya implements View.OnLongClickListener {
    public final int f23853a = 1;
    public final int f23854b;
    public final Object f23855c;
    public final Object d;

    public ya(ai.x9 x9Var, int i10, Runnable runnable) {
        this.f23855c = x9Var;
        this.f23854b = i10;
        this.d = runnable;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f23853a) {
            case 0:
                return ((ab) this.f23855c).b(((za) this.d).h, this.f23854b);
            default:
                ((ai.x9) this.f23855c).g(this.f23854b, true);
                ((Runnable) this.d).run();
                return true;
        }
    }

    public ya(ab abVar, za zaVar, int i10) {
        this.f23855c = abVar;
        this.d = zaVar;
        this.f23854b = i10;
    }
}
