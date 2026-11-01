package org.telegram.ui.Cells;

import android.view.View;
public final class sa implements View.OnLongClickListener {
    public final int f23059a = 0;
    public final int f23060b;
    public final Object f23061c;
    public final Object d;

    public sa(ua uaVar, ta taVar, int i10) {
        this.f23061c = uaVar;
        this.d = taVar;
        this.f23060b = i10;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f23059a) {
            case 0:
                return ((ua) this.f23061c).b(((ta) this.d).h, this.f23060b);
            default:
                ((rh.v5) this.f23061c).g(this.f23060b, true);
                ((Runnable) this.d).run();
                return true;
        }
    }

    public sa(rh.v5 v5Var, int i10, Runnable runnable) {
        this.f23061c = v5Var;
        this.f23060b = i10;
        this.d = runnable;
    }
}
