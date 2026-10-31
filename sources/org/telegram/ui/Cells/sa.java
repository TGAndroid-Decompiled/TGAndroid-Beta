package org.telegram.ui.Cells;

import android.view.View;
public final class sa implements View.OnLongClickListener {
    public final int f23058a = 0;
    public final int f23059b;
    public final Object f23060c;
    public final Object d;

    public sa(ua uaVar, ta taVar, int i10) {
        this.f23060c = uaVar;
        this.d = taVar;
        this.f23059b = i10;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f23058a) {
            case 0:
                return ((ua) this.f23060c).b(((ta) this.d).h, this.f23059b);
            default:
                ((rh.v5) this.f23060c).g(this.f23059b, true);
                ((Runnable) this.d).run();
                return true;
        }
    }

    public sa(rh.v5 v5Var, int i10, Runnable runnable) {
        this.f23060c = v5Var;
        this.f23059b = i10;
        this.d = runnable;
    }
}
