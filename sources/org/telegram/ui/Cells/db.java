package org.telegram.ui.Cells;

import android.view.View;
public final class db implements View.OnLongClickListener {
    public final int f19959a = 0;
    public final int f19960b;
    public final Object f19961c;
    public final Object d;

    public db(fb fbVar, eb ebVar, int i10) {
        this.f19961c = fbVar;
        this.d = ebVar;
        this.f19960b = i10;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f19959a) {
            case 0:
                return ((fb) this.f19961c).b(((eb) this.d).h, this.f19960b);
            default:
                ((yh.m5) this.f19961c).f(this.f19960b, true);
                ((Runnable) this.d).run();
                return true;
        }
    }

    public db(yh.m5 m5Var, int i10, Runnable runnable) {
        this.f19961c = m5Var;
        this.f19960b = i10;
        this.d = runnable;
    }
}
