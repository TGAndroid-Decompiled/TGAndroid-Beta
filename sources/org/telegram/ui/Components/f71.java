package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class f71 implements nk0, ok0 {
    public final m71 f28322a;

    public f71(m71 m71Var) {
        this.f28322a = m71Var;
    }

    @Override
    public boolean a(int i9, View view) {
        Utilities.Callback2Return callback2Return = this.f28322a.f30738b;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((k71) view).f30022a.f29664a), view)).booleanValue();
    }

    @Override
    public void c(float f10, float f11, int i9, View view) {
        m71 m71Var = this.f28322a;
        l71 l71Var = m71Var.f30759y;
        if (l71Var != null) {
            n71 n71Var = (n71) ((n2.p) l71Var).f18343b;
            if (n71Var.f31041x || n71Var.D) {
                return;
            }
        }
        k71 k71Var = (k71) view;
        if (i9 != m71Var.B || l71Var == null) {
            Utilities.Callback2Return callback2Return = m71Var.f30748h0;
            if (callback2Return != null && ((Boolean) callback2Return.run(Integer.valueOf(k71Var.f30022a.f29664a), Integer.valueOf(i9))).booleanValue()) {
                return;
            }
            m71Var.d(k71Var.f30022a.f29664a, i9);
        }
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void g0(View view, float f10, float f11) {
    }
}
