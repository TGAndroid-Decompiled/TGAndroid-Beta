package org.telegram.ui.Components;

import android.view.View;
public final class q71 implements ik0, jk0 {
    public final w71 f29654a;

    public q71(w71 w71Var) {
        this.f29654a = w71Var;
    }

    @Override
    public void b(float f7, float f10, int i10, View view) {
        w71 w71Var = this.f29654a;
        v71 v71Var = w71Var.D;
        if (v71Var != null) {
            x71 x71Var = (x71) ((n2.u) v71Var).f13481b;
            if (x71Var.f32501y || x71Var.H) {
                return;
            }
        }
        u71 u71Var = (u71) view;
        if (i10 != w71Var.F || v71Var == null) {
            org.telegram.messenger.l20 l20Var = w71Var.f32153l0;
            if (l20Var != null && ((Boolean) l20Var.d(Integer.valueOf(u71Var.f30891a.f30548a), Integer.valueOf(i10))).booleanValue()) {
                return;
            }
            w71Var.d(u71Var.f30891a.f30548a, i10);
        }
    }

    @Override
    public boolean f(int i10, View view) {
        org.telegram.messenger.l20 l20Var = this.f29654a.f32140b;
        if (l20Var == null) {
            return false;
        }
        return ((Boolean) l20Var.d(Integer.valueOf(((u71) view).f30891a.f30548a), view)).booleanValue();
    }

    @Override
    public boolean h1(View view) {
        return false;
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }
}
