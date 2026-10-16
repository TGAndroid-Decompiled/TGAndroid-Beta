package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class jq0 extends s4.r0 {
    public final int f26121a;
    public final ir0 f26122b;

    public jq0(ir0 ir0Var, int i10) {
        this.f26121a = i10;
        this.f26122b = ir0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        wb wbVar;
        switch (this.f26121a) {
            case 0:
                if (i11 != 0) {
                    ir0 ir0Var = this.f26122b;
                    ir0.t0(ir0Var);
                    ir0Var.f25759q0 = ir0Var.f25758p0;
                    return;
                }
                return;
            case 1:
                ir0 ir0Var2 = this.f26122b;
                if (i11 != 0) {
                    ir0.t0(ir0Var2);
                    ir0Var2.f25759q0 = ir0Var2.f25758p0;
                }
                sc scVar = sc.f28798w;
                if (scVar != null && (wbVar = scVar.e) != null && (wbVar.getParent() instanceof View) && ((View) sc.f28798w.e.getParent()).getParent() == ir0Var2.f25767w) {
                    sc.e();
                }
                if (Build.VERSION.SDK_INT >= 31 && (fVar = ir0Var2.O0) != null) {
                    fVar.f(i10, i11);
                    ir0.B0(ir0Var2);
                    return;
                }
                return;
            default:
                if (i11 != 0) {
                    ir0 ir0Var3 = this.f26122b;
                    ir0.t0(ir0Var3);
                    ir0Var3.f25759q0 = ir0Var3.f25758p0;
                    return;
                }
                return;
        }
    }
}
