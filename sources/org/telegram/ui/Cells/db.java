package org.telegram.ui.Cells;

import android.view.View;
public final class db implements View.OnLongClickListener {
    public final int f20151a = 0;
    public final int f20152b;
    public final Object f20153c;
    public final Object d;

    public db(fb fbVar, eb ebVar, int i10) {
        this.f20153c = fbVar;
        this.d = ebVar;
        this.f20152b = i10;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f20151a) {
            case 0:
                return ((fb) this.f20153c).b(((eb) this.d).h, this.f20152b);
            default:
                ((yh.l5) this.f20153c).f(this.f20152b, true);
                ((Runnable) this.d).run();
                return true;
        }
    }

    public db(yh.l5 l5Var, int i10, Runnable runnable) {
        this.f20153c = l5Var;
        this.f20152b = i10;
        this.d = runnable;
    }
}
