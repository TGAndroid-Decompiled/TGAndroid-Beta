package org.telegram.ui.Cells;

import android.view.View;
public final class sa implements View.OnLongClickListener {
    public final int f30289a = 1;
    public final int f30290b;
    public final Object f30291c;
    public final Object d;

    public sa(bi.v9 v9Var, int i7, Runnable runnable) {
        this.f30291c = v9Var;
        this.f30290b = i7;
        this.d = runnable;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f30289a) {
            case 0:
                return ((ua) this.f30291c).b(((ta) this.d).h, this.f30290b);
            default:
                ((bi.v9) this.f30291c).g(this.f30290b, true);
                ((Runnable) this.d).run();
                return true;
        }
    }

    public sa(ua uaVar, ta taVar, int i7) {
        this.f30291c = uaVar;
        this.d = taVar;
        this.f30290b = i7;
    }
}
