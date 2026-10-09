package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class g91 implements fm0, gm0 {
    public final n91 f26638a;

    public g91(n91 n91Var) {
        this.f26638a = n91Var;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        n91 n91Var = this.f26638a;
        m91 m91Var = n91Var.f29122y;
        if (m91Var != null) {
            o91 o91Var = (o91) ((m2.t) m91Var).f15972b;
            if (o91Var.f29435x || o91Var.H) {
                return;
            }
        }
        l91 l91Var = (l91) view;
        if (i10 != n91Var.F || m91Var == null) {
            Utilities.Callback2Return callback2Return = n91Var.f29111l0;
            if (callback2Return != null && ((Boolean) callback2Return.run(Integer.valueOf(l91Var.f28394a.f27909a), Integer.valueOf(i10))).booleanValue()) {
                return;
            }
            n91Var.d(l91Var.f28394a.f27909a, i10);
        }
    }

    @Override
    public boolean d(int i10, View view) {
        Utilities.Callback2Return callback2Return = this.f26638a.f29097b;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((l91) view).f28394a.f27909a), view)).booleanValue();
    }

    @Override
    public void n0(View view, float f7, float f10) {
    }
}
