package org.telegram.ui.Components;

import android.view.View;
public final class g61 implements gj0, hj0 {
    public final m61 f34013a;

    public g61(m61 m61Var) {
        this.f34013a = m61Var;
    }

    @Override
    public void b(float f10, float f11, int i3, View view) {
        m61 m61Var = this.f34013a;
        l61 l61Var = m61Var.E;
        if (l61Var != null) {
            n61 n61Var = (n61) ((y00) l61Var).f40562a;
            if (n61Var.f36393y || n61Var.I) {
                return;
            }
        }
        k61 k61Var = (k61) view;
        if (i3 != m61Var.G || l61Var == null) {
            org.telegram.messenger.o10 o10Var = m61Var.m0;
            if (o10Var != null && ((Boolean) o10Var.d(Integer.valueOf(k61Var.f35329a.f34971a), Integer.valueOf(i3))).booleanValue()) {
                return;
            }
            m61Var.d(k61Var.f35329a.f34971a, i3);
        }
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public boolean f(int i3, View view) {
        org.telegram.messenger.o10 o10Var = this.f34013a.f36028b;
        if (o10Var == null) {
            return false;
        }
        return ((Boolean) o10Var.d(Integer.valueOf(((k61) view).f35329a.f34971a), view)).booleanValue();
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
