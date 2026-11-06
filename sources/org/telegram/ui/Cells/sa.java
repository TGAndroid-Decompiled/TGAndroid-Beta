package org.telegram.ui.Cells;

import android.view.View;
public final class sa implements View.OnLongClickListener {
    public final int f30285a = 1;
    public final int f30286b;
    public final Object f30287c;
    public final Object d;

    public sa(bi.v9 v9Var, int i7, Runnable runnable) {
        this.f30287c = v9Var;
        this.f30286b = i7;
        this.d = runnable;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f30285a) {
            case 0:
                return ((ua) this.f30287c).b(((ta) this.d).h, this.f30286b);
            default:
                ((bi.v9) this.f30287c).g(this.f30286b, true);
                ((Runnable) this.d).run();
                return true;
        }
    }

    public sa(ua uaVar, ta taVar, int i7) {
        this.f30287c = uaVar;
        this.d = taVar;
        this.f30286b = i7;
    }
}
