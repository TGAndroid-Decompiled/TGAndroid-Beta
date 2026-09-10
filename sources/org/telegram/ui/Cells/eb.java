package org.telegram.ui.Cells;

import android.view.View;
public final class eb implements View.OnLongClickListener {
    public final int f19100a = 0;
    public final int f19101b;
    public final Object f19102c;
    public final Object d;

    public eb(gb gbVar, fb fbVar, int i10) {
        this.f19102c = gbVar;
        this.d = fbVar;
        this.f19101b = i10;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f19100a) {
            case 0:
                return ((gb) this.f19102c).b(((fb) this.d).h, this.f19101b);
            default:
                ((xh.n5) this.f19102c).f(this.f19101b, true);
                ((Runnable) this.d).run();
                return true;
        }
    }

    public eb(xh.n5 n5Var, int i10, Runnable runnable) {
        this.f19102c = n5Var;
        this.f19101b = i10;
        this.d = runnable;
    }
}
