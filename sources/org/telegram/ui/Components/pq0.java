package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class pq0 extends s4.t0 {
    public final int f29818a;
    public final or0 f29819b;

    public pq0(or0 or0Var, int i10) {
        this.f29818a = i10;
        this.f29819b = or0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.h hVar;
        wb wbVar;
        switch (this.f29818a) {
            case 0:
                if (i11 != 0) {
                    or0 or0Var = this.f29819b;
                    or0.t0(or0Var);
                    or0Var.f29495q0 = or0Var.f29494p0;
                    return;
                }
                return;
            case 1:
                or0 or0Var2 = this.f29819b;
                if (i11 != 0) {
                    or0.t0(or0Var2);
                    or0Var2.f29495q0 = or0Var2.f29494p0;
                }
                sc scVar = sc.f30703w;
                if (scVar != null && (wbVar = scVar.f30707e) != null && (wbVar.getParent() instanceof View) && ((View) sc.f30703w.f30707e.getParent()).getParent() == or0Var2.f29503w) {
                    sc.e();
                }
                if (Build.VERSION.SDK_INT >= 31 && (hVar = or0Var2.O0) != null) {
                    hVar.f(i10, i11);
                    or0.B0(or0Var2);
                    return;
                }
                return;
            default:
                if (i11 != 0) {
                    or0 or0Var3 = this.f29819b;
                    or0.t0(or0Var3);
                    or0Var3.f29495q0 = or0Var3.f29494p0;
                    return;
                }
                return;
        }
    }
}
