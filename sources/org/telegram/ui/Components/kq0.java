package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class kq0 extends s4.r0 {
    public final int f26780a;
    public final jr0 f26781b;

    public kq0(jr0 jr0Var, int i10) {
        this.f26780a = i10;
        this.f26781b = jr0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        wb wbVar;
        switch (this.f26780a) {
            case 0:
                if (i11 != 0) {
                    jr0 jr0Var = this.f26781b;
                    jr0.t0(jr0Var);
                    jr0Var.f26476q0 = jr0Var.f26475p0;
                    return;
                }
                return;
            case 1:
                jr0 jr0Var2 = this.f26781b;
                if (i11 != 0) {
                    jr0.t0(jr0Var2);
                    jr0Var2.f26476q0 = jr0Var2.f26475p0;
                }
                sc scVar = sc.f29095w;
                if (scVar != null && (wbVar = scVar.e) != null && (wbVar.getParent() instanceof View) && ((View) sc.f29095w.e.getParent()).getParent() == jr0Var2.f26484w) {
                    sc.e();
                }
                if (Build.VERSION.SDK_INT >= 31 && (fVar = jr0Var2.O0) != null) {
                    fVar.f(i10, i11);
                    jr0.B0(jr0Var2);
                    return;
                }
                return;
            default:
                if (i11 != 0) {
                    jr0 jr0Var3 = this.f26781b;
                    jr0.t0(jr0Var3);
                    jr0Var3.f26476q0 = jr0Var3.f26475p0;
                    return;
                }
                return;
        }
    }
}
