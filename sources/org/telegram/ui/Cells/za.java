package org.telegram.ui.Cells;

import android.view.View;
public final class za implements View.OnLongClickListener {
    public final int f24031a = 1;
    public final int f24032b;
    public final Object f24033c;
    public final Object d;

    public za(ai.y9 y9Var, int i10, Runnable runnable) {
        this.f24033c = y9Var;
        this.f24032b = i10;
        this.d = runnable;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f24031a) {
            case 0:
                return ((bb) this.f24033c).b(((ab) this.d).h, this.f24032b);
            default:
                ((ai.y9) this.f24033c).g(this.f24032b, true);
                ((Runnable) this.d).run();
                return true;
        }
    }

    public za(bb bbVar, ab abVar, int i10) {
        this.f24033c = bbVar;
        this.d = abVar;
        this.f24032b = i10;
    }
}
