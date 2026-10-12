package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class tq0 extends s4.t0 {
    public final int f30948a;
    public final sr0 f30949b;

    public tq0(sr0 sr0Var, int i10) {
        this.f30948a = i10;
        this.f30949b = sr0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.h hVar;
        wb wbVar;
        switch (this.f30948a) {
            case 0:
                if (i11 != 0) {
                    sr0 sr0Var = this.f30949b;
                    sr0.t0(sr0Var);
                    sr0Var.f30652q0 = sr0Var.f30651p0;
                    return;
                }
                return;
            case 1:
                sr0 sr0Var2 = this.f30949b;
                if (i11 != 0) {
                    sr0.t0(sr0Var2);
                    sr0Var2.f30652q0 = sr0Var2.f30651p0;
                }
                sc scVar = sc.f30528w;
                if (scVar != null && (wbVar = scVar.f30532e) != null && (wbVar.getParent() instanceof View) && ((View) sc.f30528w.f30532e.getParent()).getParent() == sr0Var2.f30660w) {
                    sc.e();
                }
                if (Build.VERSION.SDK_INT >= 31 && (hVar = sr0Var2.O0) != null) {
                    hVar.f(i10, i11);
                    sr0.B0(sr0Var2);
                    return;
                }
                return;
            default:
                if (i11 != 0) {
                    sr0 sr0Var3 = this.f30949b;
                    sr0.t0(sr0Var3);
                    sr0Var3.f30652q0 = sr0Var3.f30651p0;
                    return;
                }
                return;
        }
    }
}
