package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class sn0 extends u4.t0 {
    public final int f38092a;
    public final oo0 f38093b;

    public sn0(oo0 oo0Var, int i3) {
        this.f38092a = i3;
        this.f38093b = oo0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i3, int i10) {
        fb fbVar;
        switch (this.f38092a) {
            case 0:
                oo0 oo0Var = this.f38093b;
                if (i10 != 0) {
                    oo0.I0(oo0Var);
                    oo0Var.f36884j2 = oo0Var.f36882i2;
                }
                ac acVar = ac.f31784w;
                if (acVar != null && (fbVar = acVar.f31788e) != null && (fbVar.getParent() instanceof View) && ((View) ac.f31784w.f31788e.getParent()).getParent() == oo0Var.f36903u1) {
                    ac.e();
                    return;
                }
                return;
            case 1:
                if (i10 != 0) {
                    oo0 oo0Var2 = this.f38093b;
                    oo0.I0(oo0Var2);
                    oo0Var2.f36884j2 = oo0Var2.f36882i2;
                    return;
                }
                return;
            default:
                if (i10 != 0) {
                    oo0 oo0Var3 = this.f38093b;
                    oo0.I0(oo0Var3);
                    oo0Var3.f36884j2 = oo0Var3.f36882i2;
                    return;
                }
                return;
        }
    }
}
