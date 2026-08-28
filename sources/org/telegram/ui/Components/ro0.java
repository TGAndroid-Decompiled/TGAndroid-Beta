package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class ro0 extends f2.d1 {
    public final int f32237a;
    public final rp0 f32238b;

    public ro0(rp0 rp0Var, int i9) {
        this.f32237a = i9;
        this.f32238b = rp0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        ig.e eVar;
        lb lbVar;
        switch (this.f32237a) {
            case 0:
                if (i10 != 0) {
                    rp0 rp0Var = this.f32238b;
                    rp0.r0(rp0Var);
                    rp0Var.m0 = rp0Var.f32256l0;
                    return;
                }
                return;
            case 1:
                rp0 rp0Var2 = this.f32238b;
                if (i10 != 0) {
                    rp0.r0(rp0Var2);
                    rp0Var2.m0 = rp0Var2.f32256l0;
                }
                gc gcVar = gc.f28729w;
                if (gcVar != null && (lbVar = gcVar.f28733e) != null && (lbVar.getParent() instanceof View) && ((View) gc.f28729w.f28733e.getParent()).getParent() == rp0Var2.f32269w) {
                    gc.e();
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar = rp0Var2.K0) != null) {
                    eVar.f(i9, i10);
                    rp0.z0(rp0Var2);
                    return;
                }
                return;
            default:
                if (i10 != 0) {
                    rp0 rp0Var3 = this.f32238b;
                    rp0.r0(rp0Var3);
                    rp0Var3.m0 = rp0Var3.f32256l0;
                    return;
                }
                return;
        }
    }
}
