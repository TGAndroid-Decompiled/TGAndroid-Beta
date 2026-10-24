package org.telegram.ui.Cells;

import android.view.View;
public final class za implements View.OnLongClickListener {
    public final int f24032a = 1;
    public final int f24033b;
    public final Object f24034c;
    public final Object d;

    public za(ai.y9 y9Var, int i10, Runnable runnable) {
        this.f24034c = y9Var;
        this.f24033b = i10;
        this.d = runnable;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f24032a) {
            case 0:
                return ((bb) this.f24034c).b(((ab) this.d).h, this.f24033b);
            default:
                ((ai.y9) this.f24034c).g(this.f24033b, true);
                ((Runnable) this.d).run();
                return true;
        }
    }

    public za(bb bbVar, ab abVar, int i10) {
        this.f24034c = bbVar;
        this.d = abVar;
        this.f24033b = i10;
    }
}
