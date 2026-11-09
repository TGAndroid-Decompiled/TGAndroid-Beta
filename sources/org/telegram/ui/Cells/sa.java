package org.telegram.ui.Cells;

import android.view.View;
public final class sa implements View.OnLongClickListener {
    public final int f30293a = 1;
    public final int f30294b;
    public final Object f30295c;
    public final Object d;

    public sa(bi.v9 v9Var, int i7, Runnable runnable) {
        this.f30295c = v9Var;
        this.f30294b = i7;
        this.d = runnable;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f30293a) {
            case 0:
                return ((ua) this.f30295c).b(((ta) this.d).h, this.f30294b);
            default:
                ((bi.v9) this.f30295c).g(this.f30294b, true);
                ((Runnable) this.d).run();
                return true;
        }
    }

    public sa(ua uaVar, ta taVar, int i7) {
        this.f30295c = uaVar;
        this.d = taVar;
        this.f30294b = i7;
    }
}
