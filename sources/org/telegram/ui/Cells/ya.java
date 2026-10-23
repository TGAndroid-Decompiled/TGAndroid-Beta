package org.telegram.ui.Cells;

import android.view.View;
public final class ya implements View.OnLongClickListener {
    public final int f23861a = 1;
    public final int f23862b;
    public final Object f23863c;
    public final Object d;

    public ya(ai.y9 y9Var, int i10, Runnable runnable) {
        this.f23863c = y9Var;
        this.f23862b = i10;
        this.d = runnable;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f23861a) {
            case 0:
                return ((ab) this.f23863c).b(((za) this.d).h, this.f23862b);
            default:
                ((ai.y9) this.f23863c).g(this.f23862b, true);
                ((Runnable) this.d).run();
                return true;
        }
    }

    public ya(ab abVar, za zaVar, int i10) {
        this.f23863c = abVar;
        this.d = zaVar;
        this.f23862b = i10;
    }
}
