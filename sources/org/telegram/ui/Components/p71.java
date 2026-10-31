package org.telegram.ui.Components;

import android.view.View;
public final class p71 implements hk0, ik0 {
    public final v71 f29308a;

    public p71(v71 v71Var) {
        this.f29308a = v71Var;
    }

    @Override
    public void b(float f7, float f10, int i10, View view) {
        v71 v71Var = this.f29308a;
        u71 u71Var = v71Var.D;
        if (u71Var != null) {
            w71 w71Var = (w71) ((n2.u) u71Var).f13480b;
            if (w71Var.f32098y || w71Var.H) {
                return;
            }
        }
        t71 t71Var = (t71) view;
        if (i10 != v71Var.F || u71Var == null) {
            org.telegram.messenger.k20 k20Var = v71Var.f31175l0;
            if (k20Var != null && ((Boolean) k20Var.d(Integer.valueOf(t71Var.f30473a.f30173a), Integer.valueOf(i10))).booleanValue()) {
                return;
            }
            v71Var.d(t71Var.f30473a.f30173a, i10);
        }
    }

    @Override
    public boolean f(int i10, View view) {
        org.telegram.messenger.k20 k20Var = this.f29308a.f31162b;
        if (k20Var == null) {
            return false;
        }
        return ((Boolean) k20Var.d(Integer.valueOf(((t71) view).f30473a.f30173a), view)).booleanValue();
    }

    @Override
    public boolean h1(View view) {
        return false;
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }
}
