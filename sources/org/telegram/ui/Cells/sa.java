package org.telegram.ui.Cells;

import android.view.View;
public final class sa implements View.OnLongClickListener {
    public final int f30304a = 1;
    public final int f30305b;
    public final Object f30306c;
    public final Object d;

    public sa(bi.v9 v9Var, int i7, Runnable runnable) {
        this.f30306c = v9Var;
        this.f30305b = i7;
        this.d = runnable;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f30304a) {
            case 0:
                return ((ua) this.f30306c).b(((ta) this.d).h, this.f30305b);
            default:
                ((bi.v9) this.f30306c).g(this.f30305b, true);
                ((Runnable) this.d).run();
                return true;
        }
    }

    public sa(ua uaVar, ta taVar, int i7) {
        this.f30306c = uaVar;
        this.d = taVar;
        this.f30305b = i7;
    }
}
