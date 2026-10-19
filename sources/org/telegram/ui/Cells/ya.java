package org.telegram.ui.Cells;

import android.view.View;
public final class ya implements View.OnLongClickListener {
    public final int f23856a = 1;
    public final int f23857b;
    public final Object f23858c;
    public final Object d;

    public ya(ai.y9 y9Var, int i10, Runnable runnable) {
        this.f23858c = y9Var;
        this.f23857b = i10;
        this.d = runnable;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f23856a) {
            case 0:
                return ((ab) this.f23858c).b(((za) this.d).h, this.f23857b);
            default:
                ((ai.y9) this.f23858c).g(this.f23857b, true);
                ((Runnable) this.d).run();
                return true;
        }
    }

    public ya(ab abVar, za zaVar, int i10) {
        this.f23858c = abVar;
        this.d = zaVar;
        this.f23857b = i10;
    }
}
