package org.telegram.ui.Cells;

import android.view.View;
public final class ab implements View.OnLongClickListener {
    public final int f20625a = 0;
    public final int f20626b;
    public final Object f20627c;
    public final Object d;

    public ab(cb cbVar, bb bbVar, int i10) {
        this.f20627c = cbVar;
        this.d = bbVar;
        this.f20626b = i10;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f20625a) {
            case 0:
                return ((cb) this.f20627c).b(((bb) this.d).h, this.f20626b);
            default:
                ((zh.f5) this.f20627c).f(this.f20626b, true);
                ((Runnable) this.d).run();
                return true;
        }
    }

    public ab(zh.f5 f5Var, int i10, Runnable runnable) {
        this.f20627c = f5Var;
        this.f20626b = i10;
        this.d = runnable;
    }
}
