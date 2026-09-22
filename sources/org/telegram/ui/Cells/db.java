package org.telegram.ui.Cells;

import android.view.View;
public final class db implements View.OnLongClickListener {
    public final int f20166a = 0;
    public final int f20167b;
    public final Object f20168c;
    public final Object d;

    public db(fb fbVar, eb ebVar, int i10) {
        this.f20168c = fbVar;
        this.d = ebVar;
        this.f20167b = i10;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f20166a) {
            case 0:
                return ((fb) this.f20168c).b(((eb) this.d).h, this.f20167b);
            default:
                ((yh.l5) this.f20168c).f(this.f20167b, true);
                ((Runnable) this.d).run();
                return true;
        }
    }

    public db(yh.l5 l5Var, int i10, Runnable runnable) {
        this.f20168c = l5Var;
        this.f20167b = i10;
        this.d = runnable;
    }
}
