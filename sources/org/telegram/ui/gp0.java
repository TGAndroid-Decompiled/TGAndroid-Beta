package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class gp0 extends s4.s0 {
    public final int f34126a;
    public final mp0 f34127b;

    public gp0(mp0 mp0Var, int i10) {
        this.f34127b = mp0Var;
        this.f34126a = i10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        yh.k5 k5Var;
        ah.h hVar;
        mp0 mp0Var = this.f34127b;
        sp0 sp0Var = mp0Var.f35751p0;
        if (i11 != 0) {
            sp0Var.D0(1);
        }
        if (Build.VERSION.SDK_INT >= 31 && (hVar = sp0Var.f37944f0) != null) {
            hVar.f(i10, i11);
        }
        mp0Var.h();
        if (mp0Var.K != null) {
            if (mp0Var.J != null && mp0Var.c()) {
                mp0Var.J.g(false);
                return;
            }
            return;
        }
        if (this.f34126a == 1) {
            k5Var = sp0Var.f37939c;
        } else {
            k5Var = sp0Var.f37937b;
        }
        if (k5Var != null && mp0Var.c()) {
            k5Var.a();
        }
    }
}
