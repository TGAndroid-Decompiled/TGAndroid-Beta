package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class jq0 extends s4.r0 {
    public final int f27787a;
    public final hr0 f27788b;

    public jq0(hr0 hr0Var, int i10) {
        this.f27787a = i10;
        this.f27788b = hr0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        sb sbVar;
        switch (this.f27787a) {
            case 0:
                if (i11 != 0) {
                    hr0 hr0Var = this.f27788b;
                    hr0.z0(hr0Var);
                    hr0Var.f27142r0 = hr0Var.f27140q0;
                    return;
                }
                return;
            case 1:
                hr0 hr0Var2 = this.f27788b;
                if (i11 != 0) {
                    hr0.z0(hr0Var2);
                    hr0Var2.f27142r0 = hr0Var2.f27140q0;
                }
                oc ocVar = oc.f29196w;
                if (ocVar != null && (sbVar = ocVar.e) != null && (sbVar.getParent() instanceof View) && ((View) oc.f29196w.e.getParent()).getParent() == hr0Var2.f27150x) {
                    oc.e();
                }
                if (Build.VERSION.SDK_INT >= 31 && (fVar = hr0Var2.P0) != null) {
                    fVar.f(i10, i11);
                    hr0.J0(hr0Var2);
                    return;
                }
                return;
            default:
                if (i11 != 0) {
                    hr0 hr0Var3 = this.f27788b;
                    hr0.z0(hr0Var3);
                    hr0Var3.f27142r0 = hr0Var3.f27140q0;
                    return;
                }
                return;
        }
    }
}
