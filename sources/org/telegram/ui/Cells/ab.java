package org.telegram.ui.Cells;

import android.view.View;
public final class ab implements View.OnLongClickListener {
    public final int f20928a = 0;
    public final int f20929b;
    public final Object f20930c;
    public final Object d;

    public ab(cb cbVar, bb bbVar, int i10) {
        this.f20930c = cbVar;
        this.d = bbVar;
        this.f20929b = i10;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f20928a) {
            case 0:
                return ((cb) this.f20930c).b(((bb) this.d).h, this.f20929b);
            default:
                ((zh.f5) this.f20930c).f(this.f20929b, true);
                ((Runnable) this.d).run();
                return true;
        }
    }

    public ab(zh.f5 f5Var, int i10, Runnable runnable) {
        this.f20930c = f5Var;
        this.f20929b = i10;
        this.d = runnable;
    }
}
