package org.telegram.ui.Cells;

import android.view.View;
public final class sa implements View.OnLongClickListener {
    public final int f30284a = 1;
    public final int f30285b;
    public final Object f30286c;
    public final Object d;

    public sa(bi.v9 v9Var, int i7, Runnable runnable) {
        this.f30286c = v9Var;
        this.f30285b = i7;
        this.d = runnable;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f30284a) {
            case 0:
                return ((ua) this.f30286c).b(((ta) this.d).h, this.f30285b);
            default:
                ((bi.v9) this.f30286c).g(this.f30285b, true);
                ((Runnable) this.d).run();
                return true;
        }
    }

    public sa(ua uaVar, ta taVar, int i7) {
        this.f30286c = uaVar;
        this.d = taVar;
        this.f30285b = i7;
    }
}
