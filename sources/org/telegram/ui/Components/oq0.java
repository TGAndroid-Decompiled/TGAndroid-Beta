package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class oq0 extends s4.t0 {
    public final int f29602a;
    public final nr0 f29603b;

    public oq0(nr0 nr0Var, int i10) {
        this.f29602a = i10;
        this.f29603b = nr0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.h hVar;
        wb wbVar;
        switch (this.f29602a) {
            case 0:
                if (i11 != 0) {
                    nr0 nr0Var = this.f29603b;
                    nr0.t0(nr0Var);
                    nr0Var.f29252q0 = nr0Var.f29251p0;
                    return;
                }
                return;
            case 1:
                nr0 nr0Var2 = this.f29603b;
                if (i11 != 0) {
                    nr0.t0(nr0Var2);
                    nr0Var2.f29252q0 = nr0Var2.f29251p0;
                }
                sc scVar = sc.f30825w;
                if (scVar != null && (wbVar = scVar.f30829e) != null && (wbVar.getParent() instanceof View) && ((View) sc.f30825w.f30829e.getParent()).getParent() == nr0Var2.f29260w) {
                    sc.e();
                }
                if (Build.VERSION.SDK_INT >= 31 && (hVar = nr0Var2.O0) != null) {
                    hVar.f(i10, i11);
                    nr0.B0(nr0Var2);
                    return;
                }
                return;
            default:
                if (i11 != 0) {
                    nr0 nr0Var3 = this.f29603b;
                    nr0.t0(nr0Var3);
                    nr0Var3.f29252q0 = nr0Var3.f29251p0;
                    return;
                }
                return;
        }
    }
}
