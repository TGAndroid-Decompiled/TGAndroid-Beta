package org.telegram.ui.Cells;

import android.view.View;
public final class cb implements View.OnLongClickListener {
    public final int f20103a = 0;
    public final int f20104b;
    public final Object f20105c;
    public final Object d;

    public cb(eb ebVar, db dbVar, int i10) {
        this.f20105c = ebVar;
        this.d = dbVar;
        this.f20104b = i10;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f20103a) {
            case 0:
                return ((eb) this.f20105c).b(((db) this.d).h, this.f20104b);
            default:
                ((yh.k5) this.f20105c).f(this.f20104b, true);
                ((Runnable) this.d).run();
                return true;
        }
    }

    public cb(yh.k5 k5Var, int i10, Runnable runnable) {
        this.f20105c = k5Var;
        this.f20104b = i10;
        this.d = runnable;
    }
}
