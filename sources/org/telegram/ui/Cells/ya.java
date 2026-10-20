package org.telegram.ui.Cells;

import android.view.View;
public final class ya implements View.OnLongClickListener {
    public final int f23857a = 1;
    public final int f23858b;
    public final Object f23859c;
    public final Object d;

    public ya(ai.y9 y9Var, int i10, Runnable runnable) {
        this.f23859c = y9Var;
        this.f23858b = i10;
        this.d = runnable;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f23857a) {
            case 0:
                return ((ab) this.f23859c).b(((za) this.d).h, this.f23858b);
            default:
                ((ai.y9) this.f23859c).g(this.f23858b, true);
                ((Runnable) this.d).run();
                return true;
        }
    }

    public ya(ab abVar, za zaVar, int i10) {
        this.f23859c = abVar;
        this.d = zaVar;
        this.f23858b = i10;
    }
}
