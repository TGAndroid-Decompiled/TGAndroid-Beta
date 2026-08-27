package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class ro0 extends f2.b1 {

    public final int f32244a;

    public final sp0 f32245b;

    public ro0(sp0 sp0Var, int i10) {
        this.f32244a = i10;
        this.f32245b = sp0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        jg.e eVar;
        jb jbVar;
        switch (this.f32244a) {
            case 0:
                if (i11 != 0) {
                    sp0 sp0Var = this.f32245b;
                    sp0.s0(sp0Var);
                    sp0Var.m0 = sp0Var.f32534l0;
                }
                break;
            case 1:
                sp0 sp0Var2 = this.f32245b;
                if (i11 != 0) {
                    sp0.s0(sp0Var2);
                    sp0Var2.m0 = sp0Var2.f32534l0;
                }
                ec ecVar = ec.f28012w;
                if (ecVar != null && (jbVar = ecVar.f28016e) != null && (jbVar.getParent() instanceof View) && ((View) ec.f28012w.f28016e.getParent()).getParent() == sp0Var2.f32547w) {
                    ec.e();
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar = sp0Var2.K0) != null) {
                    eVar.f(i10, i11);
                    sp0.A0(sp0Var2);
                    break;
                }
                break;
            default:
                if (i11 != 0) {
                    sp0 sp0Var3 = this.f32245b;
                    sp0.s0(sp0Var3);
                    sp0Var3.m0 = sp0Var3.f32534l0;
                }
                break;
        }
    }
}
